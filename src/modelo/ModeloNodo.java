// SPDX-License-Identifier: GPL-3.0-or-later
/*
 * Copyright (C) 2025
 * Francisco Eduardo Oliva Ibarra (Ameca, Jalisco, México), francisco.oliva@academicos.udg.mx
 * César Calderón Mayorga (Ameca, Jalisco, México), cesarcm@academicos.udg.mx
 * David Guillermo Pasillas Banda (Ameca, Jalisco, México), david.pasillas@academicos.udg.mx
 * Horacio Gómez Rodríguez (Tepatitlán de Morelos, Jalisco, México), horacio.gomez@cualtos.udg.mx
 * César Eduardo Aceves Aldrete (Tepatitlán de Morelos, Jalisco, México), caceves@cualtos.udg.mx
 * Marco Antonio Gómez Herrera (Ameca, Jalisco, México), mgomez@academicos.udg.mx
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
package modelo;

/**
 *
 * @author Cesar.Calderon
 */
import interfaces.Colores;
import interfaces.Fuentes;
import java.awt.BorderLayout;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModeloNodo extends JPanel implements Colores, Fuentes{
    ImageIcon ImListaS = new ImageIcon(getClass().getResource("/imagenes/NodoDoble.png"));
    public JLabel LblInfo; //Etiqueta para el campo Info
    public JLabel LblLigaDer; //Etiqueta para el campo liga Derecha
    public JLabel LblLigaIzq; //Etiqueta para el campo liga Izquierda
    public JLabel LblNodo; //Imagen de Nodo
    public static int cuantosNodos = 0; //total de nodos en TDA lista
    public JLabel LblDirMemoria = new JLabel(); //Etiqueta Dirección Memoria
    JPanel PanelNodo; //Panel para Simular un Nodo del TDA Lista Doble
    private static Random random = new Random();
    public static ArrayList<String> Hexadecimales = new ArrayList<>();
    public static ArrayList<String> Decimales = new ArrayList<>();
   
    public ModeloNodo() {       
        agregarPanelNodo();
        agregarElementosToPanelNodo();
        agregarLayededPane();
        cuantosNodos++; //Contabiliza el total de Nodos Generados
    }

    private void agregarPanelNodo() {
        PanelNodo = new JPanel();      
        PanelNodo.setLayout(new BorderLayout());
        this.add(PanelNodo,BorderLayout.CENTER);
    }
    
    private void agregarElementosToPanelNodo() {  
        //-----------NODO------------//
        LblNodo = new JLabel (ImListaS);
        PanelNodo.add(LblNodo,BorderLayout.CENTER);
        
        //---------Dirección de memoria----------------//
        LblDirMemoria.setFont(FONT_LB_DIRMEM_MN);
        LblDirMemoria.setText(generarNumeroHexadecimal()) ;
        LblDirMemoria.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        PanelNodo.add(LblDirMemoria,BorderLayout.SOUTH);
    }        

    private void agregarLayededPane() {
        JLayeredPane LayeredPane = new JLayeredPane();
        LayeredPane.setPreferredSize(new Dimension(228,85));
        // --------------------- PANEL NODO ---------------------------
        PanelNodo.setOpaque(true);
        PanelNodo.setBounds(0, 0, 230,87);
        PanelNodo.setPreferredSize(new Dimension(230,87));              
        // --------------------- INFO  -----------------------
        LblInfo = new JLabel(generarNumeroDecimal());
        LblInfo.setOpaque(true);
        LblInfo.setFont(FONT_LBL_INFO_MN);
        LblInfo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        LblInfo.setBounds(90, 20, 50, 22);
        LblInfo.setPreferredSize(new Dimension(50,22));
        // --------------------- LIGA DER  -----------------------
        LblLigaDer = new JLabel();
        LblLigaDer.setOpaque(true);
        //LblLigaDer.setBackground(Color.green);
        LblLigaDer.setForeground(COLOR_LIGA_DER);
        LblLigaDer.setFont(FONT_LB_LIGAS_MN);
        LblLigaDer.setBounds(174,29,55,22);
        LblLigaDer.setPreferredSize(new Dimension(55,22));
       // --------------------- LIGA IZQ -----------------------
        LblLigaIzq = new JLabel();
        LblLigaIzq.setOpaque(true);
        //LblLigaIzq.setBackground(Color.blue);
        LblLigaIzq.setForeground(COLOR_LIGA_IZQ);
        LblLigaIzq.setFont(FONT_LB_LIGAS_MN);
        LblLigaIzq.setBounds(0,15,59,22);
        LblLigaIzq.setPreferredSize(new Dimension(59,22));        
        // Agregar componentes al JLayeredPane en diferentes capas
        LayeredPane.add(PanelNodo, Integer.valueOf(1));
        LayeredPane.add(LblInfo, Integer.valueOf(2));
        LayeredPane.add(LblLigaDer, Integer.valueOf(3));
        LayeredPane.add(LblLigaIzq, Integer.valueOf(4));
                
        this.add(LayeredPane,BorderLayout.CENTER);
    }    
    
    public static String generarNumeroHexadecimal() {
        String HexString;
        do {
            int randomNum = random.nextInt(0x10000); //núm entre 0x0000 y 0xFFFF          
            HexString = String.format("%04X", randomNum); //4 Dig Hex
        } while (Hexadecimales.contains(HexString));
        Hexadecimales.add(HexString);
        return "#"+HexString;
    }  
   
    public static String generarNumeroDecimal() {
        String NumeroDecimalString;
        do {
            int randomNumber = random.nextInt(100) + 1; //núm entre 0x0000 y 0xFFFF          
            NumeroDecimalString = String.valueOf(randomNumber);
        } while (Decimales.contains(NumeroDecimalString));
        Decimales.add(NumeroDecimalString);
        return NumeroDecimalString;
    }  

    public JLabel getLblInfo() {
        return LblInfo;
    }

    public void setLblInfo(JLabel LblInfo) {
        this.LblInfo = LblInfo;
    }

    public JLabel getLblLiga() {
        return LblLigaDer;
    }

    public void setLblLiga(JLabel LblLiga) {
        this.LblLigaDer = LblLiga;
    }

    public JLabel getLblNodo() {
        return LblNodo;
    }

    public void setLblNodo(JLabel LblNodo) {
        this.LblNodo = LblNodo;
    }

    public static int getCuantosNodos() {
        return cuantosNodos;
    }

    public static void setCuantosNodos(int cuantosNodos) {
        ModeloNodo.cuantosNodos = cuantosNodos;
    }

    public JLabel getLblDirMemoria() {
        return LblDirMemoria;
    }

    public void setLblDirMemoria(JLabel LblDirMemoria) {
        this.LblDirMemoria = LblDirMemoria;
    }

    public static ArrayList<String> getHexadecimales() {
        return Hexadecimales;
    }

    public static void setHexadecimales(ArrayList<String> Hexadecimales) {
        ModeloNodo.Hexadecimales = Hexadecimales;
    }
    
    
}
