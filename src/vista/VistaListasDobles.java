// SPDX-License-Identifier: GPL-3.0-or-later
/*
 * Copyright (C) 2025
 * Francisco Eduardo Oliva Ibarra (Ameca, Jalisco, México), francisco.oliva@academicos.udg.mx
 * César Calderón Mayorga (Ameca, Jalisco, México), cesarcm@academicos.udg.mx
 * David Guillermo Pasillas Banda (Ameca, Jalisco, México), david.pasillas@academicos.udg.mx
 * Horacio Gómez Rodríguez (Tepatitlán de Morelos, Jalisco, México), horacio.gomez@cualtos.udg.mx
 * César Eduardo Aceves Aldrete (Tepatitlán de Morelos, Jalisco, México), caceves@cualtos.udg.mx
 * Marco Antonio Gómez Herrera (Ameca, Jalisco, México), mgomez@academicos.udg.mx
 * Miguel Ángel Ramírez Torres (Ameca, Jalisco, México), miguela.ramirezt@academicos.udg.mx
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package vista;

/**
 *
 * @author David.Pasillas
 */
public class VistaListasDobles extends javax.swing.JFrame {
    public VistaListasDobles() {
        initComponents();              
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblPrimero = new javax.swing.JLabel();
        LblNuevo = new javax.swing.JLabel();
        LblAux = new javax.swing.JLabel();
        LblAnt = new javax.swing.JLabel();
        LblPos = new javax.swing.JLabel();
        LblUltimo = new javax.swing.JLabel();
        TxtPos = new javax.swing.JTextField();
        TxtUltimo = new javax.swing.JTextField();
        TxtAnt = new javax.swing.JTextField();
        TxtAux = new javax.swing.JTextField();
        TxtNuevo = new javax.swing.JTextField();
        TxtPrimero = new javax.swing.JTextField();
        LblPPrimero = new javax.swing.JLabel();
        LblPNuevo = new javax.swing.JLabel();
        LblPAnt = new javax.swing.JLabel();
        LblPAux = new javax.swing.JLabel();
        LblPPos = new javax.swing.JLabel();
        LblPUltimo = new javax.swing.JLabel();
        PanelHerramientas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnFlechaDer3 = new javax.swing.JButton();
        BtnFlechaDer2 = new javax.swing.JButton();
        BtnFlechaDer1 = new javax.swing.JButton();
        BtnLineaVertical = new javax.swing.JButton();
        BtnFlechaIzq1 = new javax.swing.JButton();
        BtnFlechaIzq2 = new javax.swing.JButton();
        BtnFlechaIzq3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Spinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        BtnNodo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtDB = new javax.swing.JTextField();
        TxtDI = new javax.swing.JTextField();
        BtnOrdenar = new javax.swing.JButton();
        BtnBasura = new javax.swing.JButton();
        PanelLista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Listas Doblemente Enlazadas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Primero.png"))); // NOI18N
        jPanel1.add(LblPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        LblNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        jPanel1.add(LblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        LblAux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auxiliar.png"))); // NOI18N
        jPanel1.add(LblAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        LblAnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Anterior.png"))); // NOI18N
        jPanel1.add(LblAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        LblPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Posterior.png"))); // NOI18N
        jPanel1.add(LblPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        LblUltimo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        LblUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ultimo.png"))); // NOI18N
        jPanel1.add(LblUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, -1));

        TxtPos.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtPos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPos.setText("null");
        TxtPos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 150, -1));

        TxtUltimo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtUltimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUltimo.setText("null");
        TxtUltimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 150, -1));

        TxtAnt.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtAnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAnt.setText("null");
        TxtAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, -1));

        TxtAux.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtAux.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAux.setText("null");
        TxtAux.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 150, -1));

        TxtNuevo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtNuevo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNuevo.setText("null");
        TxtNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, -1));

        TxtPrimero.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TxtPrimero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrimero.setText("null");
        TxtPrimero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, -1));

        LblPPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPPrimero.setToolTipText("Agrega una flecha al primer nodo");
        jPanel1.add(LblPPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        LblPNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPNuevo.setToolTipText("Agrega una flecha al nuevo nodo");
        jPanel1.add(LblPNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        LblPAnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPAnt.setToolTipText("Agrega una flecha al nodo Anterior");
        jPanel1.add(LblPAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        LblPAux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPAux.setToolTipText("Agrega una flecha al nodo Aux");
        jPanel1.add(LblPAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        LblPPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPPos.setToolTipText("Agrega una flecha al nodo Posterior");
        jPanel1.add(LblPPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, -1));

        LblPUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pNuevo.png"))); // NOI18N
        LblPUltimo.setToolTipText("Agrega una flecha al nodo Ultimo");
        jPanel1.add(LblPUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, -1, -1));

        PanelHerramientas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        BtnFlechaDer3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaDer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_der_3.png"))); // NOI18N
        BtnFlechaDer3.setToolTipText("Flecha larga izquierda");
        jPanel2.add(BtnFlechaDer3);

        BtnFlechaDer2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaDer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_der_2.png"))); // NOI18N
        BtnFlechaDer2.setToolTipText("Flecha mediana izquierda");
        jPanel2.add(BtnFlechaDer2);

        BtnFlechaDer1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaDer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_der_1.png"))); // NOI18N
        BtnFlechaDer1.setToolTipText("Flecha corta izquierda");
        jPanel2.add(BtnFlechaDer1);

        BtnLineaVertical.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnLineaVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_arr.png"))); // NOI18N
        BtnLineaVertical.setToolTipText("Flecha Vertical");
        jPanel2.add(BtnLineaVertical);

        BtnFlechaIzq1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaIzq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_1.png"))); // NOI18N
        BtnFlechaIzq1.setToolTipText("Flecha corta derecha");
        jPanel2.add(BtnFlechaIzq1);

        BtnFlechaIzq2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaIzq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_2.png"))); // NOI18N
        BtnFlechaIzq2.setToolTipText("Flecha mediana derecha");
        jPanel2.add(BtnFlechaIzq2);

        BtnFlechaIzq3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnFlechaIzq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_3.png"))); // NOI18N
        BtnFlechaIzq3.setToolTipText("Flecha larga derecha");
        jPanel2.add(BtnFlechaIzq3);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Dato Insertar:");

        Spinner.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 6, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Listas Doblemente Ligadas");

        BtnNodo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtnNodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NodoNuevo.png"))); // NOI18N
        BtnNodo.setToolTipText("Insertar nuevo nodo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("No. de Nodos:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Dato Buscar:");

        TxtDB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TxtDB.setForeground(new java.awt.Color(255, 0, 51));
        TxtDB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtDI.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TxtDI.setForeground(new java.awt.Color(255, 0, 51));
        TxtDI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnOrdenar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BtnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenar.png"))); // NOI18N
        BtnOrdenar.setText("Actualizar");
        BtnOrdenar.setToolTipText("Actualiza la vista de la lista");
        BtnOrdenar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        BtnBasura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash5.png"))); // NOI18N
        BtnBasura.setToolTipText("Elimina el Nodo que contenga el Dato a Buscar");

        javax.swing.GroupLayout PanelHerramientasLayout = new javax.swing.GroupLayout(PanelHerramientas);
        PanelHerramientas.setLayout(PanelHerramientasLayout);
        PanelHerramientasLayout.setHorizontalGroup(
            PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHerramientasLayout.createSequentialGroup()
                .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDI, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnOrdenar)
                        .addGap(50, 50, 50)
                        .addComponent(BtnNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(BtnBasura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        PanelHerramientasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtDB, TxtDI});

        PanelHerramientasLayout.setVerticalGroup(
            PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHerramientasLayout.createSequentialGroup()
                .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnNodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnBasura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TxtDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        PanelHerramientasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtDB, TxtDI});

        PanelLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelLista.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHerramientas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnBasura;
    public javax.swing.JButton BtnFlechaDer1;
    public javax.swing.JButton BtnFlechaDer2;
    public javax.swing.JButton BtnFlechaDer3;
    public javax.swing.JButton BtnFlechaIzq1;
    public javax.swing.JButton BtnFlechaIzq2;
    public javax.swing.JButton BtnFlechaIzq3;
    public javax.swing.JButton BtnLineaVertical;
    public javax.swing.JButton BtnNodo;
    public javax.swing.JButton BtnOrdenar;
    public javax.swing.JLabel LblAnt;
    public javax.swing.JLabel LblAux;
    public javax.swing.JLabel LblNuevo;
    public javax.swing.JLabel LblPAnt;
    public javax.swing.JLabel LblPAux;
    public javax.swing.JLabel LblPNuevo;
    public javax.swing.JLabel LblPPos;
    public javax.swing.JLabel LblPPrimero;
    public javax.swing.JLabel LblPUltimo;
    public javax.swing.JLabel LblPos;
    public javax.swing.JLabel LblPrimero;
    public javax.swing.JLabel LblUltimo;
    public javax.swing.JPanel PanelHerramientas;
    public javax.swing.JPanel PanelLista;
    public javax.swing.JSpinner Spinner;
    public javax.swing.JTextField TxtAnt;
    public javax.swing.JTextField TxtAux;
    public javax.swing.JTextField TxtDB;
    public javax.swing.JTextField TxtDI;
    public javax.swing.JTextField TxtNuevo;
    public javax.swing.JTextField TxtPos;
    public javax.swing.JTextField TxtPrimero;
    public javax.swing.JTextField TxtUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
