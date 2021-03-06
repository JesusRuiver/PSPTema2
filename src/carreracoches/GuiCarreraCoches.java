/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracoches;

import java.awt.Color;
import javax.swing.DefaultListModel;

/**
 *
 * @author usuario
 */
public class GuiCarreraCoches extends javax.swing.JFrame {

    private Thread coche1, coche2, coche3, coche4;

    /**
     * Creates new form Gui
     */
    public static void main(String[] args) {
        GuiCarreraCoches carrera = new GuiCarreraCoches();
        carrera.setVisible(true);
    }

    public GuiCarreraCoches() {
        initComponents();
        coche1 = new Thread(new Coche(this, 1, "Coche1", 5000));
        coche2 = new Thread(new Coche(this, 2, "Coche2", 2000));
        coche3 = new Thread(new Coche(this, 3, "Coche3", 1000));
        coche4 = new Thread(new Coche(this, 4, "Coche4", 3000));

        jList1.setModel(new DefaultListModel<String>());
        jList2.setModel(new DefaultListModel<String>());
        jList3.setModel(new DefaultListModel<String>());
        jList4.setModel(new DefaultListModel<String>());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jPanelListas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jPanelBotones = new javax.swing.JPanel();
        jButtonComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContenedor.setLayout(new java.awt.BorderLayout());

        jPanelListas.setMinimumSize(new java.awt.Dimension(56, 56));
        jPanelListas.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanelListas.add(jScrollPane1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanelListas.add(jScrollPane2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanelListas.add(jScrollPane3);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jPanelListas.add(jScrollPane4);

        jPanelContenedor.add(jPanelListas, java.awt.BorderLayout.CENTER);

        jButtonComenzar.setText("Comenzar");
        jButtonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComenzarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonComenzar);

        jPanelContenedor.add(jPanelBotones, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComenzarActionPerformed
        coche1.start();
        coche2.start();
        coche3.start();
        coche4.start();
    }//GEN-LAST:event_jButtonComenzarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComenzar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelListas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    void setMensaje(int numeroCoche, String mensaje) {
        switch (numeroCoche) {
            case 1:
                ((DefaultListModel) (jList1.getModel())).addElement(mensaje);
                break;
            case 2:
                ((DefaultListModel) (jList2.getModel())).addElement(mensaje);
                break;
            case 3:
                ((DefaultListModel) (jList3.getModel())).addElement(mensaje);
                break;
            case 4:
                ((DefaultListModel) (jList4.getModel())).addElement(mensaje);
        }
    }

    void estableceVencedor(int numeroCoche) {

        switch (numeroCoche) {
            case 1:
                jList1.setBackground(Color.red);
                break;
            case 2:
                jList2.setBackground(Color.red);
                break;
            case 3:
                jList3.setBackground(Color.red);
                break;
            case 4:
                jList4.setBackground(Color.red);
        }
    }

}
