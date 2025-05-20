// SPDX-License-Identifier: GPL-3.0-or-later
/*
 * Copyright (C) 2025
 * Francisco Eduardo Oliva Ibarra (Universidad de Guadalajara, Centro Universitario de los Valles, Ameca, Jalisco, México)
 * César Calderón Mayorga (Universidad de Guadalajara, Centro Universitario de los Valles, Ameca, Jalisco, México)
 * David Guillermo Pasillas Banda (Universidad de Guadalajara, Centro Universitario de los Valles, Ameca, Jalisco, México)
 * Horacio Gómez Rodríguez (Universidad de Guadalajara, Centro Universitario de los Altos, Tepatitlán de Morelos, Jalisco, México)
 * César Eduardo Aceves Aldrete (Universidad de Guadalajara, Centro Universitario de los Altos, Tepatitlán de Morelos, Jalisco, México)
 * Marco Antonio Gómez Herrera (Universidad de Guadalajara, Centro Universitario de los Valles, Ameca, Jalisco, México)
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

import interfaces.Colores;
import interfaces.Fuentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.ModeloNodo;

/**
 *
 * @author David.Pasillas
 */
public class VistaNodoInfo extends JDialog implements Colores, Fuentes{
    ImageIcon ImBasura1 = new ImageIcon(getClass().getResource("/imagenes/b_basura1.png"));
    public ImageIcon ImMoveCursor1 = new ImageIcon(getClass().getResource("/imagenes/move_cursor1.png"));
    public ImageIcon ImMoveCursor2 = new ImageIcon(getClass().getResource("/imagenes/move_cursor2.png"));
    public ImageIcon Imtrash1 = new ImageIcon(getClass().getResource("/imagenes/trash4.png"));
    public ImageIcon Imtrash2 = new ImageIcon(getClass().getResource("/imagenes/trash5.png"));
    private JLabel LblMemoria = new JLabel("Dir Mem: ");
    private JLabel LblInfo = new JLabel("Info: ");
    private JLabel LblLigaDer = new JLabel("Liga der: ");
    private JLabel LblLigaIzq = new JLabel("Liga izq: ");
    public JTextField TxtDirMem = new JTextField();
    public JTextField TxtInfo = new JTextField();
    public JTextField TxtLigaDer = new JTextField();
    public JTextField TxtLigaIzq = new JTextField();
    public ModeloNodo ModeloNodo;
    public JButton BtnOk = new JButton("Aceptar");
    public JButton BtnCancelar = new JButton("Cancelar");            
    public JButton BtnCerrar = new JButton("Cerrar");     
    public JButton BtnEliminar = new JButton(ImBasura1);   
    public JLabel LblMoverCursor= new JLabel(ImMoveCursor1);
    public JLabel LblTrash= new JLabel(Imtrash1);
    public int i; //El nodo i de la lista
    public ArrayList<ModeloNodo> ListaNodos;
    
    public VistaNodoInfo(Frame owner, boolean modal, ModeloNodo ModeloNodo,ArrayList<ModeloNodo> ListaNodos, int i) {
        super(owner, modal);
        this.ListaNodos = ListaNodos;
        this.i = i;
        this.ModeloNodo = ModeloNodo;
        TxtDirMem.setText(this.ModeloNodo.LblDirMemoria.getText());
        TxtInfo.setText(this.ModeloNodo.LblInfo.getText());
        TxtLigaDer.setText(this.ModeloNodo.LblLigaDer.getText());
        TxtLigaIzq.setText(this.ModeloNodo.LblLigaIzq.getText());
        config();
        agregarComponentes();
        tooltips();
    }
    
    private void config() {        
        this.setSize(180,170);
        this.setLocationRelativeTo(ModeloNodo);
        this.setLayout(new GridLayout(6,2));
        this.setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.RED));
        
    }

    private void agregarComponentes() {
        LblInfo.setFont(FONT_LBL_VD);
        TxtInfo.setFont(FONT_TXT_VD);
        
        LblMemoria.setFont(FONT_LBL_VD);
        TxtDirMem.setFont(FONT_TXT_VD); 
        
        LblLigaDer.setFont(FONT_LBL_VD);
        LblLigaDer.setForeground(COLOR_LIGA_DER);
        TxtLigaDer.setFont(FONT_TXT_VD);
        TxtLigaDer.setForeground(COLOR_LIGA_DER);
        
        LblLigaIzq.setFont(FONT_LBL_VD);
        LblLigaIzq.setForeground(COLOR_LIGA_IZQ); 
        TxtLigaIzq.setFont(FONT_TXT_VD);
        TxtLigaIzq.setForeground(COLOR_LIGA_IZQ);
 
        BtnOk.setFont(FONT_BTN_VD);
        BtnCancelar.setFont(FONT_BTN_VD);
        
        this.add(LblMoverCursor);this.add(LblTrash);
        this.add(LblInfo); this.add(TxtInfo);
        this.add(LblMemoria); this.add(TxtDirMem);
        this.add(LblLigaIzq); this.add(TxtLigaIzq);
        this.add(LblLigaDer); this.add(TxtLigaDer);
        this.add(BtnOk);this.add(BtnCancelar); 

    }

    private void tooltips() {
        LblTrash.setToolTipText("Eliminar Nodo");
        LblMoverCursor.setToolTipText("Mover Ventana");
    }
    
}
