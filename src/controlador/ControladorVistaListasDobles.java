// SPDX-License-Identifier: GPL-3.0-or-later
/*
 * Copyright (C) 2025
 * Francisco Eduardo Oliva Ibarra (Ameca, Jalisco, México), francisco.oliva@academicos.udg.mx
 * César Calderón Mayorga (Ameca, Jalisco, México), cesarcm@academicos.udg.mx
 * David Guillermo Pasillas Banda (Ameca, Jalisco, México), david.pasillas@academicos.udg.mx
 * Horacio Gómez Rodríguez (Tepatitlán de Morelos, Jalisco, México), horacio.gomez@cualtos.udg.mx
 * César Eduardo Aceves Aldrete (Tepatitlán de Morelos, Jalisco, México), caceves@cualtos.udg.mx
 * Marco Antonio Gómez Herrera (Ameca, Jalisco, México), mgomez@academicos.udg.mx
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
package controlador;

import interfaces.Colores;
import interfaces.Fuentes;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import vista.VistaListasDobles;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.ModeloFlechaSetBounds;
import modelo.ModeloNodo;
import vista.VistaNodoInfo;

/**
 *
 * @author francisco.oliva
 */
public class ControladorVistaListasDobles implements MouseListener, ChangeListener, MouseMotionListener,Colores, Fuentes{
    ImageIcon ImListaS = new ImageIcon(getClass().getResource("/imagenes/NodoDoble.png"));

    //Imágenes de Flechas de botones
    ImageIcon ImLineaVertical = new ImageIcon(getClass().getResource("/imagenes/b_flecha_arr.png"));
    ImageIcon Im_b_flecha_der_1 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_1.png"));
    ImageIcon Im_b_flecha_der_2 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_2.png"));
    ImageIcon Im_b_flecha_der_3 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_3.png"));
    ImageIcon Im_b_flecha_izq_1 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_1.png"));
    ImageIcon Im_b_flecha_izq_2 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_2.png"));
    ImageIcon Im_b_flecha_izq_3 = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_3.png"));
    ImageIcon ImLineaVertical_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_arr_g.png"));
    ImageIcon Im_b_flecha_der_1_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_1_g.png"));
    ImageIcon Im_b_flecha_der_2_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_2_g.png"));
    ImageIcon Im_b_flecha_der_3_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_der_3_g.png"));
    ImageIcon Im_b_flecha_izq_1_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_1_g.png"));
    ImageIcon Im_b_flecha_izq_2_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_2_g.png"));
    ImageIcon Im_b_flecha_izq_3_G = new ImageIcon(getClass().getResource("/imagenes/b_flecha_izq_3_g.png"));
    //Set Imágenes de flechas de Botones
     ArrayList<JLabel> ListaFlechasBotones = new ArrayList<>();    

    
    //Set de Imágenes para Nuevo 
     private ArrayList<ModeloFlechaSetBounds> ImageIconsNuevo = new ArrayList<>();
    ImageIcon ImFlechaNuevo = new ImageIcon(getClass().getResource("/imagenes/flechaNuevo.png"));
     
    //Set de Imagenes para Primero
    private ArrayList<ModeloFlechaSetBounds> ImageIconsPrimero = new ArrayList<>();
    ImageIcon ImPrimero1 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero1.png"));
    ImageIcon ImPrimero2 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero2.png"));
    ImageIcon ImPrimero3 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero3.png"));
    ImageIcon ImPrimero4 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero4.png"));
    ImageIcon ImPrimero5 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero5.png"));
    ImageIcon ImPrimero6 = new ImageIcon(getClass().getResource("/imagenes/flechaPrimero6.png"));

    //Set de Imagenes para Ultimo
    private ArrayList<ModeloFlechaSetBounds> ImageIconsUltimo = new ArrayList<>();
    ImageIcon ImUltimo1 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo1.png"));
    ImageIcon ImUltimo2 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo2.png"));
    ImageIcon ImUltimo3 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo3.png"));
    ImageIcon ImUltimo4 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo4.png"));
    ImageIcon ImUltimo5 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo5.png"));
    ImageIcon ImUltimo6 = new ImageIcon(getClass().getResource("/imagenes/flechaUltimo6.png"));    
 
    //Set de Imagenes para Aux
    private ArrayList<ModeloFlechaSetBounds> ImageIconsAux = new ArrayList<>();
    ImageIcon ImAux1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux1.png"));
    ImageIcon ImAux2 = new ImageIcon(getClass().getResource("/imagenes/flechaAux2.png"));
    ImageIcon ImAux2_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux2_1.png"));
    
    ImageIcon ImAux3 = new ImageIcon(getClass().getResource("/imagenes/flechaAux3.png"));
    ImageIcon ImAux3_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux3_1.png"));
    ImageIcon ImAux3_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAux3_2.png"));
    
    ImageIcon ImAux4 = new ImageIcon(getClass().getResource("/imagenes/flechaAux4.png"));
    ImageIcon ImAux4_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux4_1.png"));
    ImageIcon ImAux4_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAux4_2.png"));
    ImageIcon ImAux4_3 = new ImageIcon(getClass().getResource("/imagenes/flechaAux4_3.png"));
    
    ImageIcon ImAux5 = new ImageIcon(getClass().getResource("/imagenes/flechaAux5.png"));
    ImageIcon ImAux5_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux5_1.png"));
    ImageIcon ImAux5_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAux5_2.png"));
    ImageIcon ImAux5_4 = new ImageIcon(getClass().getResource("/imagenes/flechaAux5_4.png"));
    ImageIcon ImAux5_5 = new ImageIcon(getClass().getResource("/imagenes/flechaAux5_5.png"));
    
    ImageIcon ImAux6 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6.png"));
    ImageIcon ImAux6_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_1.png"));
    ImageIcon ImAux6_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_2.png"));
    ImageIcon ImAux6_3 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_3.png"));
    ImageIcon ImAux6_4 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_4.png"));
    ImageIcon ImAux6_5 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_5.png"));
    ImageIcon ImAux6_6 = new ImageIcon(getClass().getResource("/imagenes/flechaAux6_6.png"));
    
    //Set de Imagenes para Ant
    private ArrayList<ModeloFlechaSetBounds> ImageIconsAnt = new ArrayList<>();    
    ImageIcon ImAnt1 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt1.png"));
    ImageIcon ImAnt2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt2.png"));
    ImageIcon ImAnt2_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt2_2.png"));
    ImageIcon ImAnt3 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt3.png"));
    ImageIcon ImAnt3_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt3_2.png"));
    ImageIcon ImAnt3_3 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt3_3.png"));
    ImageIcon ImAnt4 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt4.png")); //Origen
    ImageIcon ImAnt4_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt4_2.png"));
    ImageIcon ImAnt4_3 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt4_3.png"));
    ImageIcon ImAnt4_4 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt4_4.png"));
    ImageIcon ImAnt5 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt5.png"));
    ImageIcon ImAnt5_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt5_2.png"));
    ImageIcon ImAnt5_3 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt5_3.png"));
    ImageIcon ImAnt5_4 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt5_4.png"));
    ImageIcon ImAnt5_5 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt5_5.png"));
    ImageIcon ImAnt6 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6.png")); //Origen
    ImageIcon ImAnt6_1 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6_1.png"));
    ImageIcon ImAnt6_2 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6_2.png"));
    ImageIcon ImAnt6_4 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6_4.png"));
    ImageIcon ImAnt6_5 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6_5.png"));
    ImageIcon ImAnt6_6 = new ImageIcon(getClass().getResource("/imagenes/flechaAnt6_6.png"));

    //Set de Imagenes para Pos
    private ArrayList<ModeloFlechaSetBounds> ImageIconsPos = new ArrayList<>();    
    ImageIcon ImPos1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos1.png")); //Origen
    ImageIcon ImPos2 = new ImageIcon(getClass().getResource("/imagenes/flechaPos2.png")); //Origen
    ImageIcon ImPos2_1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos2_1.png"));
    ImageIcon ImPos3 = new ImageIcon(getClass().getResource("/imagenes/flechaPos3.png")); //Origen
    ImageIcon ImPos3_1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos3_1.png"));
    ImageIcon ImPos3_2 = new ImageIcon(getClass().getResource("/imagenes/flechaPos3_2.png"));
    ImageIcon ImPos4 = new ImageIcon(getClass().getResource("/imagenes/flechaPos4.png")); //Origen
    ImageIcon ImPos4_1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos4_1.png")); 
    ImageIcon ImPos4_2 = new ImageIcon(getClass().getResource("/imagenes/flechaPos4_2.png")); 
    ImageIcon ImPos4_3 = new ImageIcon(getClass().getResource("/imagenes/flechaPos4_3.png")); 
    ImageIcon ImPos5 = new ImageIcon(getClass().getResource("/imagenes/flechaPos5.png")); 
    ImageIcon ImPos5_1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos5_1.png")); 
    ImageIcon ImPos5_2 = new ImageIcon(getClass().getResource("/imagenes/flechaPos5_2.png")); 
    ImageIcon ImPos5_3 = new ImageIcon(getClass().getResource("/imagenes/flechaPos5_3.png")); 
    ImageIcon ImPos5_4 = new ImageIcon(getClass().getResource("/imagenes/flechaPos5_4.png")); 
    ImageIcon ImPos6 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6.png")); 
    ImageIcon ImPos6_1 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6_1.png"));
    ImageIcon ImPos6_2 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6_2.png")); //FlechaAux6_2 checarla
    ImageIcon ImPos6_3 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6_3.png")); 
    ImageIcon ImPos6_4 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6_4.png")); 
    ImageIcon ImPos6_6 = new ImageIcon(getClass().getResource("/imagenes/flechaPos6_6.png")); 
     
    VistaListasDobles VistaListasSimples;
    ArrayList<ModeloNodo> ListaNodos = new ArrayList<>();
    ArrayList<ModeloNodo> ListaNodosTemp = new ArrayList<>();
    
    ArrayList<JLabel> ListaLineas = new ArrayList<>();
    ArrayList<JLabel> ListaNulls = new ArrayList<>();
    ArrayList<JLabel> Lista45Izq = new ArrayList<>();
    ArrayList<JLabel> Lista45Der = new ArrayList<>();
    ArrayList<JLabel> Lista45xxxIzq = new ArrayList<>();
    ArrayList<JLabel> Lista45xxxDer = new ArrayList<>();
    ArrayList<JLabel> Lista45xxIzq = new ArrayList<>();
    ArrayList<JLabel> Lista45xxDer = new ArrayList<>();
    
    //Listas de Punteros
    ArrayList<JLabel> ListaFlechaNuevo = new ArrayList<>();
    ArrayList<JLabel> ListaFlechaPrimero = new ArrayList<>();
    ArrayList<JLabel> ListaFlechaUltimo = new ArrayList<>();
    ArrayList<JLabel> ListaFlechaAux = new ArrayList<>();
    ArrayList<JLabel> ListaFlechaAnt = new ArrayList<>();
    ArrayList<JLabel> ListaFlechaPos = new ArrayList<>();

    ArrayList<JLabel> ListaFlechaVertical = new ArrayList<>();
    
    int x,y;
    
    //TexfFields
    String StringDB = new String("null");
    String StringDI = new String("null");
    
    //Texto de punteros
    String StringDirMem = new String("null");
    String StringLiga = new String("null");
    String StringInfo = new String("null");
    
    //Texto de punteros
    String SPrimero = new String("null");
    String SUltimo = new String("null");
    String SNuevo = new String("null");
    String SAux = new String("null");
    String SAnt = new String("null");
    String SPos = new String("null");
    String DirPuntero = new String("null");
    

    public ControladorVistaListasDobles(VistaListasDobles vistaListasSimples) {
        this.VistaListasSimples = vistaListasSimples;
        this.VistaListasSimples.setVisible(true);          
        oyentes();
        arrayDeImagenesPrimero();
        arrayDeImagenesUltimo();
        arrayDeImagenesNuevo();
        arrayDeImagenesAux();
        arrayDeImagenesAnt();
        arrayDeImagenesPos();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==VistaListasSimples.BtnLineaVertical){
            agregarFlechasDeBotones(VistaListasSimples.BtnLineaVertical);
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaDer1){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaDer1);    
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaDer2){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaDer2);   
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaDer3){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaDer3);  
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaIzq3){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaIzq3);
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaIzq2){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaIzq2);
        }
        if(e.getSource()==VistaListasSimples.BtnFlechaIzq1){
            agregarFlechasDeBotones(VistaListasSimples.BtnFlechaIzq1);
        }
        if(e.getSource()==VistaListasSimples.BtnNodo){
            agregarNodoNull();
        }
        if(e.getSource()==VistaListasSimples.BtnBasura){
            BotonBasura();
        }
        
        if(e.getSource()==VistaListasSimples.BtnOrdenar){
            BotonOrdenar();
        }
        //--------------------------PUNTEROS DE LA LISTA -------------------------------------
        if(e.getSource()==VistaListasSimples.LblPNuevo){
            if(ListaNodos.isEmpty())
                return;
            agregarFlechaNuevo();
            if(ListaNodos.get(ListaNodos.size()-1).LblInfo.getText().equalsIgnoreCase("?")){
               VistaListasSimples.TxtNuevo.setText(ListaNodos.get(ListaNodos.size()-1).LblDirMemoria.getText());
            }
        }
        if(e.getSource()==VistaListasSimples.LblPPrimero){
            if(ListaNodos.isEmpty())
                return;
            agregarFlechaPrimero();
            VistaListasSimples.TxtPrimero.setText(ListaNodos.get(0).LblDirMemoria.getText());
        }        
        if(e.getSource()==VistaListasSimples.LblPUltimo){
            if(ListaNodos.isEmpty())
                return;
            agregarFlechaUltimo();
            VistaListasSimples.TxtUltimo.setText(ListaNodos.get(ListaNodos.size()-1).LblDirMemoria.getText());
        }        
        if(e.getSource()==VistaListasSimples.LblPAux){
            agregarFlechaAuxiliar();
        }        
        if(e.getSource()==VistaListasSimples.LblPAnt){
            agregarFlechaAnterior();
        }        
        if(e.getSource()==VistaListasSimples.LblPPos){
            agregarFlechaPosterior();
        }                
        
        if(ListaNodos!=null){ //"DOble Clic en un nodo
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(e.getSource()==ListaNodos.get(i)){ //Nodo Completo
                    if(e.getClickCount() == 2){ //Doble Clic
                        VistaNodoInfo VNI = new VistaNodoInfo(new JFrame(), true, ListaNodos.get(i),ListaNodos,i);
                        ControladorVistaNodoInfo CVI = new ControladorVistaNodoInfo(VNI);
                        VNI.setVisible(true);
                    }                                          
                }
            }                               
        }
        
        if(e.getSource()==VistaListasSimples.TxtDB){
            if(e.getButton() == 3){ //Boton Derecho
                StringDB = VistaListasSimples.TxtDB.getText();                
            }
            if(e.getClickCount() == 2){ //Doble Clic
                VistaListasSimples.TxtDB.setText(StringInfo);                
            }
        }
        if(e.getSource()==VistaListasSimples.TxtDI){
            if(e.getButton() == 3){ //Boton Derecho
                StringDI = VistaListasSimples.TxtDI.getText(); 
            }
        }
        ///////////////////////// PUNTEROS ///////////////////////////
        if(e.getSource()==VistaListasSimples.LblPrimero){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtPrimero.setText(StringDirMem);                
            }
        }
        if(e.getSource()==VistaListasSimples.LblUltimo){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtUltimo.setText(StringDirMem);                
            }
        }        
        if(e.getSource()==VistaListasSimples.LblNuevo){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtNuevo.setText(StringDirMem);                
            }
        }                
        if(e.getSource()==VistaListasSimples.LblAux){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtAux.setText(StringDirMem);                
            }
        }                
        if(e.getSource()==VistaListasSimples.LblAnt){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtAnt.setText(StringDirMem);                
            }
        }        
        if(e.getSource()==VistaListasSimples.LblPos){
            if(e.getClickCount() == 2){ //Boton Derecho
                VistaListasSimples.TxtPos.setText(StringDirMem);                
            }
        }                

        if(ListaLineas!=null){ //"Clic derecho");
            for (int i = 0; i < ListaLineas.size(); i++) {
                if(e.getSource()==ListaLineas.get(i)){
                    if(e.getButton() == 3){ //Clic derecho

                    }
                }
            }                               
        }
        
//        if(Lista45Izq!=null){ //"Clic derecho");
//            for (int i = 0; i < Lista45Izq.size(); i++) {
//                if(e.getSource()==Lista45Izq.get(i)){
//                    if(e.getButton() == 3){ //Clic derecho
//
//                    }
//                }
//            }                               
//        }
//        if(Lista45Der!=null){ //"Clic derecho");
//            for (int i = 0; i < Lista45Der.size(); i++) {
//                if(e.getSource()==Lista45Der.get(i)){
//                    if(e.getButton() == 3){//Clic derecho
//
//                    }
//                }
//            }                               
//        }   
//        if(Lista45xxxIzq!=null){ //"Clic derecho");
//            for (int i = 0; i < Lista45xxxIzq.size(); i++) {
//                if(e.getSource()==Lista45xxxIzq.get(i)){
//                    if(e.getButton() == 3){//Clic derecho
//
//                    }
//                }
//            }                               
//        }  
//        if(Lista45xxxDer!=null){ //"Clic derecho");
//            for (int i = 0; i < Lista45xxxDer.size(); i++) {
//                if(e.getSource()==Lista45xxxDer.get(i)){
//                    if(e.getButton() == 3){//Clic derecho
//
//                    }
//                }
//            }                               
//        } 
  
        ///////////////////// FLechas de PUNTEROS 
        if(ListaFlechaNuevo!=null){ //"Clic derecho");
            for (int i = 0; i < ListaFlechaNuevo.size(); i++) {
                if(e.getSource()==ListaFlechaNuevo.get(i)){
                    if(e.getButton() == 3){//Clic derecho
                        ListaFlechaNuevo.get(i).setIcon(ImFlechaNuevo);
                    }
                }
            }                               
        }    
        if(ListaFlechaPrimero!=null){ //"Clic derecho");
            for (int i = 0; i < ListaFlechaPrimero.size(); i++) {
                if(e.getSource()==ListaFlechaPrimero.get(i)){
                    if(e.getButton() == 3){//Clic derecho
                        //ListaFlechaPrimero.get(i).setIcon(ImFlechaPrimero);
                    }
                }
            }                               
        }     
        
        if(ListaFlechaAux!=null){ //"Clic derecho Flecha Aux Derecha o Izquierda");
            for (int i = 0; i < ListaFlechaAux.size(); i++) {
                if(e.getSource()==ListaFlechaAux.get(i)){  
                      //Doble Clic Flecha Auxiliar
                    if(e.getClickCount() == 2){ //Doble Clic
                        int nodos = ListaNodos.size();
                        switch (nodos) { 
                            case 2://Con 2 nodos doble clic
                                   ListaFlechaAux.get(i).setLocation(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy()); 
                                   ListaFlechaAux.get(i).setIcon(ImAux2);  
                                   VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   break;
                            case 3: //Con 3 nodos doble clic
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){ //si esta en el Origen
                                        ListaFlechaAux.get(i).setBounds(509,322, ImAux3_1.getIconWidth(),ImAux3_1.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux3_1);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   }else{//Cambiar a Posición Original
                                         ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux3.getIconWidth(),ImAux3.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux3);            
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }
                                   break;
                            case 4: //Con 4 nodos doble clic
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//si esta en el Origen
                                        ListaFlechaAux.get(i).setBounds(605,322, ImAux4_2.getIconWidth(),ImAux4_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4_2);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==605){ //esta en el 2o nodo
                                        ListaFlechaAux.get(i).setBounds(400,322, ImAux4_1.getIconWidth(),ImAux4_1.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4_1);          
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   }                                   
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux4.getIconWidth(),ImAux4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4);            
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }
                                   break;    
                            case 5: //Con 5 nodos doble clic
                                   if(ListaFlechaAux.get(i).getX()==830){//Nodo 5 al nodo 4
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux5_4.getIconWidth(),ImAux5_4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_4);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen y va al 2o nodo
                                        ListaFlechaAux.get(i).setBounds(535,322, ImAux5_2.getIconWidth(),ImAux5_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_2);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==535){ //esta en el 2o Nodo y va al 1er nodo
                                        ListaFlechaAux.get(i).setBounds(292,322, ImAux5_1.getIconWidth(),ImAux5_1.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_1);          
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   }                                     
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux5.getIconWidth(),ImAux5.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5);            
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }
                                   break;      
                            case 6: //Con 6 nodos doble clic
                                   if(ListaFlechaAux.get(i).getX()==825){//Nodo 6 al nodo 5
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux6_5.getIconWidth(),ImAux6_5.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_5);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==827){//Nodo 5 al nodo Origen 4
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),322, ImAux6_4.getIconWidth(),ImAux6_4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_4);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen 4 al nodo 3                                       
                                        ListaFlechaAux.get(i).setBounds(629,322, ImAux6_3.getIconWidth(),ImAux6_3.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_3);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==629){//Nodo 3 y va al 2o nodo
                                        ListaFlechaAux.get(i).setBounds(387,322, ImAux6_2.getIconWidth(),ImAux6_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_2);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==387){ //esta en el 2o Nodo y va al 1er nodo
                                        ListaFlechaAux.get(i).setBounds(154,322, ImAux6_1.getIconWidth(),ImAux6_1.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_1);            
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   }                                     
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux6.getIconWidth(),ImAux6.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6); 
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }
                                   break;                                      

                        }
                    }                                          
                    //Clic derecho para Flecha Auxiliar
                    if(e.getButton() == 3){//Clic derecho
                        int nodos = ListaNodos.size();
                        switch (nodos) {
                            case 1:
                                 VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                 break;
                            case 2: //Con 2 nodos clic derecho
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen
                                        ListaFlechaAux.get(i).setLocation(760,322);                                     
                                        ListaFlechaAux.get(i).setIcon(ImAux2_1); 
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }
                                   break;
                            case 3: //Con 3 nodos clic derecho
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux3_2.getIconWidth(),ImAux3_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux3_2);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux3.getIconWidth(),ImAux3.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux3);                   
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }
                                   break;
                            case 4: //Con 4 nodos clic derecho
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux4_3.getIconWidth(),ImAux4_3.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4_3);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==400){ //esta en el 1er Nodo
                                        ListaFlechaAux.get(i).setBounds(605,322, ImAux4_2.getIconWidth(),ImAux4_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4_2);          
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }                                     
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux4.getIconWidth(),ImAux4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux4);                                     
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }
                                   break;    
                            case 5: //Con 5 nodos clic derecho
                                   if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux5_4.getIconWidth(),ImAux5_4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_4);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==827){ //esta en el 4o Nodo y va al 5o nodo
                                        ListaFlechaAux.get(i).setBounds(830,322, ImAux5_5.getIconWidth(),ImAux5_5.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_5);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==292){ //esta en el 1o Nodo y va al 2o nodo
                                        ListaFlechaAux.get(i).setBounds(535,322, ImAux5_2.getIconWidth(),ImAux5_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5_2);          
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }        
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux5.getIconWidth(),ImAux5.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux5);                       
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   }
                                   break;      
                            case 6: //Con 6 nodos clic derecho
                                   if(ListaFlechaAux.get(i).getX()==154){ //esta en el 1o Nodo y va al 2o nodo
                                        ListaFlechaAux.get(i).setBounds(387,322, ImAux6_2.getIconWidth(),ImAux6_2.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_2); 
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==387){// 2 al 3er nodo
                                        ListaFlechaAux.get(i).setBounds(629,322, ImAux6_3.getIconWidth(),ImAux6_3.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_3);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                   } else if(ListaFlechaAux.get(i).getX()==629){// 3 a 4o nodo Origen
                                        ListaFlechaAux.get(i).setBounds(826,322, ImAux6_4.getIconWidth(),ImAux6_4.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_4);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==ImageIconsAux.get(nodos-1).getPosx()){//Origen 4 a 5o nodo
                                        ListaFlechaAux.get(i).setBounds(827,322, ImAux6_5.getIconWidth(),ImAux6_5.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_5);
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                   }else if(ListaFlechaAux.get(i).getX()==827){ //esta en el 5o Nodo y va al 6o nodo
                                        ListaFlechaAux.get(i).setBounds(825,322, ImAux6_6.getIconWidth(),ImAux6_6.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6_6);          
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(5).LblDirMemoria.getText());
                                   }       
                                   else{ //Cambiar a Posición original
                                        ListaFlechaAux.get(i).setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                                                                        ImAux6.getIconWidth(),ImAux6.getIconHeight());
                                        ListaFlechaAux.get(i).setIcon(ImAux6);   
                                        VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                   }
                                   break;                                       
                        }

                    }
                }
            }                               
        }             
        if(ListaFlechaAnt!=null){ //"Clic Flecha Ant Derecha o Izquierda");
            for (int i = 0; i < ListaFlechaAnt.size(); i++) {
                if(e.getSource()==ListaFlechaAnt.get(i)){  
                      //Doble Clic Flecha Aut
                    if(e.getClickCount() == 2){ //Doble Clic Izquierdo
                        int nodos = ListaNodos.size();
                        switch (nodos) { 
                            case 2://Con 2 nodos doble clic Izquierdo
                                   ListaFlechaAnt.get(i).setIcon(ImAnt2);   
                                   ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                                   ImageIconsAnt.get(nodos-1).getTamx(),ImageIconsAnt.get(nodos-1).getTamy());                                    
                                   VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   break;
                            case 3: //Con 3 nodos doble clic
                                   if(ListaFlechaAnt.get(i).getX()==594){ //del 3_3 al 3_2
                                        ListaFlechaAnt.get(i).setIcon(ImAnt3_2);
                                        ListaFlechaAnt.get(i).setBounds(597,322, ImAnt3_2.getIconWidth(),ImAnt3_2.getIconHeight());    
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }
                                   else if(ListaFlechaAnt.get(i).getX()==597){ //del 3_2 al 3 (original)
                                        ListaFlechaAnt.get(i).setIcon(ImAnt3);
                                        ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                                        ImAnt3.getIconWidth(),ImAnt3.getIconHeight()); 
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   }
                                   break;
                            case 4: //Con 4 nodos doble clic Izquierdo
                                switch (ListaFlechaAnt.get(i).getX()) {
                                    case 598:
                                        //4 al 3
                                        ListaFlechaAnt.get(i).setIcon(ImAnt4_3);
                                        ListaFlechaAnt.get(i).setBounds(597,322, ImAnt4_3.getIconWidth(),ImAnt4_3.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 597:
                                        //3 al 2
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt4_2.getIconWidth(),ImAnt4_2.getIconHeight());
                                        ListaFlechaAnt.get(i).setIcon(ImAnt4_2);
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;
                                    default: //Cambiar a Posición original Nodo 1
                                        ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                ImAnt4.getIconWidth(),ImAnt4.getIconHeight());
                                        ListaFlechaAnt.get(i).setIcon(ImAnt4);
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;
                                }
                                break;        
                            case 5: //Con 5 nodos doble clic IZquierdo
                                switch (ListaFlechaAnt.get(i).getX()) {
                                    case 596: //Nodo 5 al nodo 4
                                        ListaFlechaAnt.get(i).setIcon(ImAnt5_4);
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt5_4.getIconWidth(),ImAnt5_4.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 594: //Nodo 4 al nodo 3
                                        ListaFlechaAnt.get(i).setIcon(ImAnt5_3);
                                        ListaFlechaAnt.get(i).setBounds(593,322, ImAnt5_3.getIconWidth(),ImAnt5_3.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 593: //Nodo 3 al 2
                                        ListaFlechaAnt.get(i).setIcon(ImAnt5_2);
                                        ListaFlechaAnt.get(i).setBounds(488,322, ImAnt5_2.getIconWidth(),ImAnt5_2.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;
                                    case 488: //esta en el 2o Nodo y va al 1er nodo
                                        ListaFlechaAnt.get(i).setIcon(ImAnt5);
                                        ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                ImAnt5.getIconWidth(),ImAnt5.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;
                                    default: //del 2 al 1 original
                                        ListaFlechaAnt.get(i).setIcon(ImAnt5);
                                        ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                ImAnt5.getIconWidth(),ImAnt5.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;
                                }    
                                break; 
                            case 6: //Con 6 nodos doble clic Izquierdo
                                switch (ListaFlechaAnt.get(i).getX()) {
                                    case 598: //Nodo 6 al nodo 5
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_5);
                                        ListaFlechaAnt.get(i).setBounds(597,322, ImAnt6_5.getIconWidth(),ImAnt6_5.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                    case 597: //Nodo 5 al nodo Origen 4
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_4);
                                        ListaFlechaAnt.get(i).setBounds(596,322, ImAnt6_4.getIconWidth(),ImAnt6_4.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 596: //Nodo 4 al nodo 3 Origen
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6);                                        
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt6.getIconWidth(),ImAnt6.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 594: //Nodo 3 Origen al nodo 2
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_2);
                                        ListaFlechaAnt.get(i).setBounds(377,322, ImAnt6_2.getIconWidth(),ImAnt6_2.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;   
                                    case 377: //Nodo 2 Origen al nodo 1
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_1);
                                        ListaFlechaAnt.get(i).setBounds(119,322, ImAnt6_1.getIconWidth(),ImAnt6_1.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;                                         
                                    default:
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6);                                        
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt6.getIconWidth(),ImAnt6.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                } //switch 6 nodos
                                break; 
                        }//switch grande
                    } //Doble clic Izquierdo
                                                      
                    //Clic derecho para Flecha Ant
                    if(e.getButton() == 3){//Clic derecho
                        int nodos = ListaNodos.size();
                        switch (nodos) {
                            case 2: //Con 2 nodos clic derecho
                                   if(ListaFlechaAnt.get(i).getX()==ImageIconsAnt.get(nodos-1).getPosx()){//Origen
                                       ListaFlechaAnt.get(i).setIcon(ImAnt2_2);
                                       ListaFlechaAnt.get(i).setBounds(600,322,ImAnt2_2.getIconWidth(),ImAnt2_2.getIconHeight());  
                                       VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());                                       
                                   }
                                   break;
                            case 3: //Con 3 nodos clic derecho
                                    switch (ListaFlechaAnt.get(i).getX()) {
                                        case 490: //Origen 1 al 2
                                            ListaFlechaAnt.get(i).setIcon(ImAnt3_2);
                                            ListaFlechaAnt.get(i).setBounds(597,322, ImAnt3_2.getIconWidth(),ImAnt3_2.getIconHeight());                                            
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 597: //Origen 2 al 3
                                            ListaFlechaAnt.get(i).setIcon(ImAnt3_3);
                                            ListaFlechaAnt.get(i).setBounds(594,322, ImAnt3_3.getIconWidth(),ImAnt3_3.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        default: //Cambiar a Posición original Nodo 1
                                            ListaFlechaAnt.get(i).setIcon(ImAnt3);
                                            ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                    ImAnt3.getIconWidth(),ImAnt3.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                            break;
                                    }
                                    break;
                            case 4: //Con 4 nodos clic derecho
                                    switch (ListaFlechaAnt.get(i).getX()) {
                                        case 373: //Origen Nodo 1 al 2
                                            ListaFlechaAnt.get(i).setIcon(ImAnt4_2);
                                            ListaFlechaAnt.get(i).setBounds(594,322, ImAnt4_2.getIconWidth(),ImAnt4_2.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 594: // del Nodo 2 al nodo 3
                                            ListaFlechaAnt.get(i).setIcon(ImAnt4_3);
                                            ListaFlechaAnt.get(i).setBounds(597,322, ImAnt4_3.getIconWidth(),ImAnt4_3.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        case 597: // del Nodo 3 al nodo 4
                                            ListaFlechaAnt.get(i).setIcon(ImAnt4_4);
                                            ListaFlechaAnt.get(i).setBounds(598,322, ImAnt4_4.getIconWidth(),ImAnt4_4.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                            break;
                                        default: //Cambiar a Posición original
                                            ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                    ImAnt4.getIconWidth(),ImAnt4.getIconHeight());
                                            ListaFlechaAnt.get(i).setIcon(ImAnt4);
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                            break;
                                    }
                                    break;        
                            case 5: //Con 5 nodos clic derecho
                                    switch (ListaFlechaAnt.get(i).getX()) {
                                        case 295:
                                            //Origen 1 hacia el 2
                                            ListaFlechaAnt.get(i).setIcon(ImAnt5_2);
                                            ListaFlechaAnt.get(i).setBounds(488,322, ImAnt5_2.getIconWidth(),ImAnt5_2.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 488:
                                            // Nodo 2 al 3 nodo
                                            ListaFlechaAnt.get(i).setIcon(ImAnt5_3);
                                            ListaFlechaAnt.get(i).setBounds(594,322, ImAnt5_3.getIconWidth(),ImAnt5_3.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        case 594:
                                            //Nodo 3 al 4
                                            ListaFlechaAnt.get(i).setIcon(ImAnt5_4);
                                            ListaFlechaAnt.get(i).setBounds(595,322, ImAnt5_4.getIconWidth(),ImAnt5_4.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                            break;
                                        case 595:
                                            //Nodo 4 al 5
                                            ListaFlechaAnt.get(i).setIcon(ImAnt5_5);
                                            ListaFlechaAnt.get(i).setBounds(596,322, ImAnt5_5.getIconWidth(),ImAnt5_5.getIconHeight());
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                            break;
                                        default:
                                            //Cambiar a Posición original
                                            ListaFlechaAnt.get(i).setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                                                    ImAnt5.getIconWidth(),ImAnt5.getIconHeight());
                                            ListaFlechaAnt.get(i).setIcon(ImAnt5);
                                            VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                            break;
                                    }
                                   break;            
                            case 6: //Con 6 nodos clic derecho Ant
                                switch (ListaFlechaAnt.get(i).getX()) {
                                    case 119: // Nodo 1 a 2
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_2);
                                        ListaFlechaAnt.get(i).setBounds(377,322, ImAnt6_2.getIconWidth(),ImAnt6_2.getIconHeight());                                
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;                                    
                                    case 377: // Nodo 2 Origen a 3
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6);
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt6.getIconWidth(),ImAnt6.getIconHeight());                                
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 594: // Nodo 3 Origen al 4
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_4);
                                        ListaFlechaAnt.get(i).setBounds(596,322, ImAnt6_4.getIconWidth(),ImAnt6_4.getIconHeight());                                
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 596: // 4 al 5
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_5);
                                        ListaFlechaAnt.get(i).setBounds(597,322, ImAnt6_5.getIconWidth(),ImAnt6_5.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                    case 597: // 5 a 6
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6_6);
                                        ListaFlechaAnt.get(i).setBounds(598,322, ImAnt6_6.getIconWidth(),ImAnt6_6.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(5).LblDirMemoria.getText());
                                        break;
                                    default:
                                        ListaFlechaAnt.get(i).setIcon(ImAnt6);
                                        ListaFlechaAnt.get(i).setBounds(594,322, ImAnt6.getIconWidth(),ImAnt6.getIconHeight());
                                        VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                }
                        break;                                                                              
                        }

                    }
                }
            }                               
        }  //Clic Izq Derecho Ant      
        
  
        if(ListaFlechaPos!=null){ //"Clic Flecha Pos Derecha o Izquierda");
            for (int i = 0; i < ListaFlechaPos.size(); i++) {
                if(e.getSource()==ListaFlechaPos.get(i)){  
                      //Doble Clic Flecha Aut
                    if(e.getClickCount() == 2){ //Doble Clic Izquierdo Pos
                        int nodos = ListaNodos.size();
                        switch (nodos) { 
                            case 2://Con 2 nodos doble clic Izquierdo
                                   ListaFlechaPos.get(i).setIcon(ImPos2_1);   
                                   ListaFlechaPos.get(i).setBounds(625,322,ImPos2_1.getIconWidth(),ImPos2_1.getIconHeight()); 
                                   VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                   break;
                            case 3: //Con 3 nodos doble clic
                                switch (ListaFlechaPos.get(i).getX()) {
                                    case 990: //del 3 Origen al 3_2
                                        ListaFlechaPos.get(i).setIcon(ImPos3_2);
                                        ListaFlechaPos.get(i).setBounds(759,322, ImPos3_2.getIconWidth(),ImPos3_2.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;
                                    case 759: //del 3_2 al 3_1
                                        ListaFlechaPos.get(i).setIcon(ImPos3_1);
                                        ListaFlechaPos.get(i).setBounds(495,322,ImPos3_1.getIconWidth(),ImPos3_1.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;
                                    default: //Origen
                                        ListaFlechaPos.get(i).setIcon(ImPos3); //Origen
                                        ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                        ImPos3.getIconWidth(),ImPos3.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                }
                                break;
                            case 4: //Con 4 nodos doble clic Izquierdo
                                switch (ListaFlechaPos.get(i).getX()) {
                                    case 1065: //Origen 4 al 3
                                        ListaFlechaPos.get(i).setIcon(ImPos4_3);
                                        ListaFlechaPos.get(i).setBounds(876,322, ImPos4_3.getIconWidth(),ImPos4_3.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 876: //3 al 2
                                        ListaFlechaPos.get(i).setBounds(662,322, ImPos4_2.getIconWidth(),ImPos4_2.getIconHeight());
                                        ListaFlechaPos.get(i).setIcon(ImPos4_2);
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;
                                    case 662: //2 al 1
                                        ListaFlechaPos.get(i).setBounds(406,322, ImPos4_1.getIconWidth(),ImPos4_1.getIconHeight());
                                        ListaFlechaPos.get(i).setIcon(ImPos4_1);
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;                                        
                                    default: //Cambiar a Posición original Nodo 4
                                        ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                ImPos4.getIconWidth(),ImPos4.getIconHeight());
                                        ListaFlechaPos.get(i).setIcon(ImPos4);
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                }
                                break;        
                            case 5: //Con 5 nodos doble clic Izquierdo
                                switch (ListaFlechaPos.get(i).getX()) {
                                    case 1066: //Origen 5  al nodo 4
                                        ListaFlechaPos.get(i).setIcon(ImPos5_4);
                                        ListaFlechaPos.get(i).setBounds(960,322, ImPos5_4.getIconWidth(),ImPos5_4.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 960: //Nodo 4 al nodo 3
                                        ListaFlechaPos.get(i).setIcon(ImPos5_3);
                                        ListaFlechaPos.get(i).setBounds(749,322, ImPos5_3.getIconWidth(),ImPos5_3.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 749: //Nodo 3 al 2
                                        ListaFlechaPos.get(i).setIcon(ImPos5_2);
                                        ListaFlechaPos.get(i).setBounds(543,322, ImPos5_2.getIconWidth(),ImPos5_2.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;
                                    case 543: //de 2 al 1
                                        ListaFlechaPos.get(i).setIcon(ImPos5_1);
                                        ListaFlechaPos.get(i).setBounds(255,322, ImPos5_1.getIconWidth(),ImPos5_1.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;
                                    default: //Origen Nodo 5
                                        ListaFlechaPos.get(i).setIcon(ImPos5);
                                        ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                        ImPos5.getIconWidth(),ImPos5.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                }    
                                break; 
                            case 6: //Con 6 nodos doble clic Izquierdo
                                switch (ListaFlechaPos.get(i).getX()) {
                                    case 598: //Nodo 6 al nodo 5 //Equivale al Default
                                        ListaFlechaPos.get(i).setIcon(ImPos6);                                        
                                        ListaFlechaPos.get(i).setBounds(1064,322, ImPos6.getIconWidth(),ImPos6.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                    case 1064: //Nodo 5 al nodo Origen 4
                                        ListaFlechaPos.get(i).setIcon(ImPos6_4);
                                        ListaFlechaPos.get(i).setBounds(871,322, ImPos6_4.getIconWidth(),ImPos6_4.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 871: //Nodo 4 al nodo 3 Origen
                                        ListaFlechaPos.get(i).setIcon(ImPos6_3);                                        
                                        ListaFlechaPos.get(i).setBounds(610,322, ImPos6_3.getIconWidth(),ImPos6_3.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 610: //Nodo 3 Origen al nodo 2
                                        ListaFlechaPos.get(i).setIcon(ImPos6_2);
                                        ListaFlechaPos.get(i).setBounds(410,322, ImPos6_2.getIconWidth(),ImPos6_2.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;   
                                    case 410: //Nodo 2 Origen al nodo 1
                                        ListaFlechaPos.get(i).setIcon(ImPos6_1);
                                        ListaFlechaPos.get(i).setBounds(137,322, ImPos6_1.getIconWidth(),ImPos6_1.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText());
                                        break;                                         
                                    default: //Origen 5
                                        ListaFlechaPos.get(i).setIcon(ImPos6);                                        
                                        ListaFlechaPos.get(i).setBounds(1064,322, ImPos6.getIconWidth(),ImPos6.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                } //switch 6 nodos
                                break; 
                        }//switch grande
                    } //Doble clic Izquierdo
                                                      
                    //Clic derecho para Flecha Pos
                    if(e.getButton() == 3){//Clic derecho
                        int nodos = ListaNodos.size();
                        switch (nodos) {
                            case 2: //Con 2 nodos clic derecho
                                   if(ListaFlechaPos.get(i).getX()==625){//Origen 2 al 1
                                       ListaFlechaPos.get(i).setIcon(ImPos2);
                                       ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                                       ImPos2.getIconWidth(),ImPos2.getIconHeight()); 
                                       VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }else{ //Origen
                                       ListaFlechaPos.get(i).setIcon(ImPos2); 
                                       ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                                       ImPos2.getIconWidth(),ImPos2.getIconHeight()); 
                                       VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                   }
                                   break;
                            case 3: //Con 3 nodos clic derecho
                                    switch (ListaFlechaPos.get(i).getX()) {
                                        case 495: //Origen 1 al 2
                                            ListaFlechaPos.get(i).setIcon(ImPos3_2);
                                            ListaFlechaPos.get(i).setBounds(759,322, ImPos3_2.getIconWidth(),ImPos3_2.getIconHeight());                                            
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 759: //2 al 3 (Origen)
                                            ListaFlechaPos.get(i).setIcon(ImPos3);
                                            ListaFlechaPos.get(i).setBounds(990,322, ImPos3.getIconWidth(),ImPos3.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        default: // ORigen Nodo 3
                                            ListaFlechaPos.get(i).setIcon(ImPos3);
                                            ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                    ImPos3.getIconWidth(),ImPos3.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                    }
                                    break;
                            case 4: //Con 4 nodos clic derecho
                                    switch (ListaFlechaPos.get(i).getX()) {
                                        case 406: //Origen Nodo 1 al 2
                                            ListaFlechaPos.get(i).setIcon(ImPos4_2);
                                            ListaFlechaPos.get(i).setBounds(662,322, ImPos4_2.getIconWidth(),ImPos4_2.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 662: // del Nodo 2 al nodo 3
                                            ListaFlechaPos.get(i).setIcon(ImPos4_3);
                                            ListaFlechaPos.get(i).setBounds(876,322, ImPos4_3.getIconWidth(),ImPos4_3.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        case 876: // del Nodo 3 al 4 (origen)
                                            ListaFlechaPos.get(i).setIcon(ImPos4);                                            
                                            ListaFlechaPos.get(i).setBounds(1065,322, ImPos4.getIconWidth(),ImPos4.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                            break;
                                        default: //Cambiar a Posición original 4
                                            ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                    ImPos4.getIconWidth(),ImPos4.getIconHeight());
                                            ListaFlechaPos.get(i).setIcon(ImPos4);
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                            break;
                                    }
                                    break;        
                            case 5: //Con 5 nodos clic derecho
                                    switch (ListaFlechaPos.get(i).getX()) {
                                        case 255: //Origen 1 hacia el 2
                                            ListaFlechaPos.get(i).setIcon(ImPos5_2);
                                            ListaFlechaPos.get(i).setBounds(543,322, ImPos5_2.getIconWidth(),ImPos5_2.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                            break;
                                        case 543: // Nodo 2 al 3 nodo
                                            ListaFlechaPos.get(i).setIcon(ImPos5_3);
                                            ListaFlechaPos.get(i).setBounds(749,322, ImPos5_3.getIconWidth(),ImPos5_3.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                            break;
                                        case 749: //Nodo 3 al 4
                                            ListaFlechaPos.get(i).setIcon(ImPos5_4);
                                            ListaFlechaPos.get(i).setBounds(960,322, ImPos5_4.getIconWidth(),ImPos5_4.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                            break;
                                        case 960: //Nodo 4 al 5 Original
                                            ListaFlechaPos.get(i).setIcon(ImPos5);
                                            ListaFlechaPos.get(i).setBounds(1066,322, ImPos5.getIconWidth(),ImPos5.getIconHeight());
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                            break;
                                        default: //Original 5
                                            ListaFlechaPos.get(i).setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                                                    ImPos5.getIconWidth(),ImPos5.getIconHeight());
                                            ListaFlechaPos.get(i).setIcon(ImPos5);
                                            VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                            break;
                                    }
                                    break;            
                            case 6: //Con 6 nodos clic derecho Ant
                                switch (ListaFlechaPos.get(i).getX()) {
                                    case 137: // Nodo 1 a 2
                                        ListaFlechaPos.get(i).setIcon(ImPos6_2);
                                        ListaFlechaPos.get(i).setBounds(410,322, ImPos6_2.getIconWidth(),ImPos6_2.getIconHeight());                                
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText());
                                        break;                                    
                                    case 410: // Nodo 2 Origen a 3
                                        ListaFlechaPos.get(i).setIcon(ImPos6_3);
                                        ListaFlechaPos.get(i).setBounds(610,322, ImPos6_3.getIconWidth(),ImPos6_3.getIconHeight());                                
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText());
                                        break;
                                    case 610: // Nodo 3 Origen al 4
                                        ListaFlechaPos.get(i).setIcon(ImPos6_4);
                                        ListaFlechaPos.get(i).setBounds(871,322, ImPos6_4.getIconWidth(),ImPos6_4.getIconHeight());                                
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText());
                                        break;
                                    case 871: // 4 al 5 Origen
                                        ListaFlechaPos.get(i).setIcon(ImPos6);
                                        ListaFlechaPos.get(i).setBounds(1064,322, ImPos6.getIconWidth(),ImPos6.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                    case 1064: // 5 a 6
                                        ListaFlechaPos.get(i).setIcon(ImPos6_6);
                                        ListaFlechaPos.get(i).setBounds(1065,322, ImPos6_6.getIconWidth(),ImPos6_6.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(5).LblDirMemoria.getText());
                                        break;
                                    default:
                                        ListaFlechaPos.get(i).setIcon(ImPos6);                                        
                                        ListaFlechaPos.get(i).setBounds(1064,322, ImPos6.getIconWidth(),ImPos6.getIconHeight());
                                        VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText());
                                        break;
                                }
                        break;                                                                              
                        }

                    }
                }
            }                               
        }  //Clic Izq Derecho Pos
        
        if(ListaFlechasBotones!=null){ //"Doble Clic Flechas de Botones");
            for (int i = 0; i < ListaFlechasBotones.size(); i++) {
                if(e.getSource()==ListaFlechasBotones.get(i)){                      
                    if(e.getClickCount() == 2  || e.getButton() == 3){ 
                        String Imagen = ListaFlechasBotones.get(i).getIcon().toString();
                        String[] parts = Imagen.split("\\/"); 
                        switch (parts[parts.length-1]) {
                            case "b_flecha_arr.png":
                                  ListaFlechasBotones.get(i).setIcon(ImLineaVertical_G);
                                break;
                            case "b_flecha_arr_g.png":
                                  ListaFlechasBotones.get(i).setIcon(ImLineaVertical);
                                break;   
                            case "b_flecha_der_1.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_1_G);
                                break;   
                            case "b_flecha_der_1_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_1);
                                break;  
                            case "b_flecha_der_2.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_2_G);
                                break;   
                            case "b_flecha_der_2_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_2);
                                break;     
                             case "b_flecha_der_3.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_3_G);
                                break;   
                            case "b_flecha_der_3_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_der_3);
                                break;          
                           case "b_flecha_izq_1.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_1_G);
                                break;   
                            case "b_flecha_izq_1_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_1);
                                break;  
                            case "b_flecha_izq_2.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_2_G);
                                break;   
                            case "b_flecha_izq_2_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_2);
                                break;     
                             case "b_flecha_izq_3.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_3_G);
                                break;   
                            case "b_flecha_izq_3_g.png":
                                  ListaFlechasBotones.get(i).setIcon(Im_b_flecha_izq_3);
                                break;                                            
                            default:

                        }
                    }
                }
            }
        }
    }

    private void copiarAlPortapapeles(String Texto){
        // Obtener el portapapeles del sistema
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccion = new StringSelection(Texto);
        clipboard.setContents(seleccion, null);
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        //Clic derecho a un Nodo
        if(ListaNodos!=null){ //"Clic derecho");
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(e.getSource()==ListaNodos.get(i)){ //Nodo Completo
                    if(e.getButton() == 3){ //Clic derecho
                        StringDirMem = ListaNodos.get(i).LblDirMemoria.getText();
                        StringLiga = ListaNodos.get(i).LblLigaDer.getText();   
                        copiarAlPortapapeles(StringLiga);
                        StringInfo = ListaNodos.get(i).LblInfo.getText();  
                        colorEtiquetaRoja(ListaNodos.get(i));
                    }
                }
            }                               
        }
        
        //Clic derecho a los punteros Primero
        if(e.getSource()==VistaListasSimples.LblPrimero){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtPrimero.getText();                
                VistaListasSimples.TxtPrimero.setForeground(Color.red);                          
            }                                                
        }
        //Clic derecho a los punteros Ultimo
        if(e.getSource()==VistaListasSimples.LblUltimo){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtUltimo.getText();                
                VistaListasSimples.TxtUltimo.setForeground(Color.red);                          
            }                                                
        }
        //Clic derecho a los punteros Nuevo
        if(e.getSource()==VistaListasSimples.LblNuevo){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtNuevo.getText();                
                VistaListasSimples.TxtNuevo.setForeground(Color.red);                          
            }                                                
        }        
         //Clic derecho a los punteros Aux
        if(e.getSource()==VistaListasSimples.LblAux){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtAux.getText();                
                VistaListasSimples.TxtAux.setForeground(Color.red);                          
            }                                                
        }
        //Clic derecho a los punteros Ant
        if(e.getSource()==VistaListasSimples.LblAnt){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtAnt.getText();                
                VistaListasSimples.TxtAnt.setForeground(Color.red);                          
            }                                                
        }
        //Clic derecho a los punteros Pos
        if(e.getSource()==VistaListasSimples.LblPos){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtPos.getText();                
                VistaListasSimples.TxtPos.setForeground(Color.red);                          
            }                                                
        }            
        
        if(ListaNodos!=null){//Coordenadas de posiciones de Nodos
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(e.getSource()==ListaNodos.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }
        if(ListaLineas!=null){ //Coordenadas de posiciones de lineas
            for (int i = 0; i < ListaLineas.size(); i++) {
                if(e.getSource()==ListaLineas.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }
        if(ListaNulls!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < ListaNulls.size(); i++) {
                if(e.getSource()==ListaNulls.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }
        
        if(Lista45Izq!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45Izq.size(); i++) {
                if(e.getSource()==Lista45Izq.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }
        if(Lista45Der!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45Der.size(); i++) {
                if(e.getSource()==Lista45Der.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }   
        if(Lista45xxxIzq!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45xxxIzq.size(); i++) {
                if(e.getSource()==Lista45xxxIzq.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(Lista45xxxDer!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45xxxDer.size(); i++) {
                if(e.getSource()==Lista45xxxDer.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        } 
        if(Lista45xxIzq!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45xxIzq.size(); i++) {
                if(e.getSource()==Lista45xxIzq.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(Lista45xxDer!=null){ //Coordenadas de posiciones de los nulls
            for (int i = 0; i < Lista45xxDer.size(); i++) {
                if(e.getSource()==Lista45xxDer.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }
        
        /// Posiciones de Flechas de punteros
        if(ListaFlechaNuevo!=null){ //Coordenadas de posiciones FlechaNuevo
            for (int i = 0; i < ListaFlechaNuevo.size(); i++) {
                if(e.getSource()==ListaFlechaNuevo.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(ListaFlechaPrimero!=null){ //Coordenadas de posiciones FlechaPrimero
            for (int i = 0; i < ListaFlechaPrimero.size(); i++) {
                if(e.getSource()==ListaFlechaPrimero.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(ListaFlechaUltimo!=null){ //Coordenadas de posiciones FlechaUltimo
            for (int i = 0; i < ListaFlechaUltimo.size(); i++) {
                if(e.getSource()==ListaFlechaUltimo.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(ListaFlechaAux!=null){ //Coordenadas de posiciones FlechaAux
            for (int i = 0; i < ListaFlechaAux.size(); i++) {
                if(e.getSource()==ListaFlechaAux.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        } 
        if(ListaFlechaVertical!=null){ //Coordenadas de posiciones FlechaVertical
            for (int i = 0; i < ListaFlechaVertical.size(); i++) {
                if(e.getSource()==ListaFlechaVertical.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }    
        
        if(ListaFlechasBotones!=null){ //Coordenadas de posiciones FlechaVertical
            for (int i = 0; i < ListaFlechasBotones.size(); i++) {
                if(e.getSource()==ListaFlechasBotones.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        
        if(ListaFlechaAnt!=null){ //Coordenadas de posiciones FlechaAnt
            for (int i = 0; i < ListaFlechaAnt.size(); i++) {
                if(e.getSource()==ListaFlechaAnt.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }  
        if(ListaFlechaPos!=null){ //Coordenadas de posiciones FlechaPos
            for (int i = 0; i < ListaFlechaPos.size(); i++) {
                if(e.getSource()==ListaFlechaPos.get(i)){
                    x = e.getX();
                    y = e.getY();
                }
            }                               
        }          
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //soltar el botón derecho del ratón
        if(ListaNodos!=null){ //"Clic derecho");
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(e.getSource()==ListaNodos.get(i)){ //Nodo Completo
                    if (SwingUtilities.isRightMouseButton(e)) {
                        colorEtiquetaNormal(ListaNodos.get(i));
                    }                                            
                }
            }                               
        }
        //Soltar Clic derecho a los punteros Primero
        if(e.getSource()==VistaListasSimples.LblPrimero){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtPrimero.getText();                
                VistaListasSimples.TxtPrimero.setForeground(null);                          
            }                                                
        }
        //Soltar Clic derecho a los punteros Ultimo
        if(e.getSource()==VistaListasSimples.LblUltimo){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtUltimo.getText();                
                VistaListasSimples.TxtUltimo.setForeground(null);                          
            }                                                
        }
        //Soltar Clic derecho a los punteros Nuevo
        if(e.getSource()==VistaListasSimples.LblNuevo){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtNuevo.getText();                
                VistaListasSimples.TxtNuevo.setForeground(null);                          
            }                                                
        }
        //Soltar Clic derecho a los punteros Aux
        if(e.getSource()==VistaListasSimples.LblAux){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtAux.getText();                
                VistaListasSimples.TxtAux.setForeground(null);                          
            }                                                
        }
        //Soltar Clic derecho a los punteros Ant
        if(e.getSource()==VistaListasSimples.LblAnt){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtAnt.getText();                
                VistaListasSimples.TxtAnt.setForeground(null);                          
            }                                                
        }
        //Soltar Clic derecho a los punteros Pos
        if(e.getSource()==VistaListasSimples.LblPos){
            if(e.getButton() == 3){ //Clic derecho
                DirPuntero = VistaListasSimples.TxtPos.getText();                
                VistaListasSimples.TxtPos.setForeground(null);                          
            }                                                
        }
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(ListaNodos!=null){
            for (int i = 0; i < ListaNodos.size(); i++) { //Cursor a los nodos
                if(e.getSource()==ListaNodos.get(i)){
                    ListaNodos.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }
            
            for (int i = 0; i < ListaLineas.size(); i++) {//Cursor a las listas
                if(e.getSource()==ListaLineas.get(i)){
                    ListaLineas.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }
            
            for (int i = 0; i < ListaNulls.size(); i++) {//Cursor a las nulls
                if(e.getSource()==ListaNulls.get(i)){
                    ListaNulls.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }   

            //Cursor para Boton Nuevo
            if(e.getSource()==VistaListasSimples.BtnNodo){
                VistaListasSimples.BtnNodo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }               

            //Cursor para Boton Nuevo
            if(e.getSource()==VistaListasSimples.BtnOrdenar){
                VistaListasSimples.BtnOrdenar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            //Cursor para Boton Nuevo
            if(e.getSource()==VistaListasSimples.BtnBasura){
                VistaListasSimples.BtnBasura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }            
            
            //------------------Cursor para Botones de Flechas-------------------------
            if(e.getSource()==VistaListasSimples.BtnFlechaDer1){
                VistaListasSimples.BtnFlechaDer1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.BtnFlechaDer2){
                VistaListasSimples.BtnFlechaDer2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }            
            if(e.getSource()==VistaListasSimples.BtnFlechaDer3){
                VistaListasSimples.BtnFlechaDer3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }              
            if(e.getSource()==VistaListasSimples.BtnLineaVertical){
                VistaListasSimples.BtnLineaVertical.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }             
            if(e.getSource()==VistaListasSimples.BtnFlechaIzq3){
                VistaListasSimples.BtnFlechaIzq3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }   
            if(e.getSource()==VistaListasSimples.BtnFlechaIzq2){
                VistaListasSimples.BtnFlechaIzq2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }  
            if(e.getSource()==VistaListasSimples.BtnFlechaIzq1){
                VistaListasSimples.BtnFlechaIzq1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }              
            
            for (int i = 0; i < Lista45Izq.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45Izq.get(i)){
                    Lista45Izq.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }  
            
            for (int i = 0; i < Lista45Der.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45Der.get(i)){
                    Lista45Der.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }              
            for (int i = 0; i < Lista45xxxIzq.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45xxxIzq.get(i)){
                    Lista45xxxIzq.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }   
            for (int i = 0; i < Lista45xxxDer.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45xxxDer.get(i)){
                    Lista45xxxDer.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }  
            for (int i = 0; i < Lista45xxIzq.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45xxIzq.get(i)){
                    Lista45xxIzq.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }   
            for (int i = 0; i < Lista45xxDer.size(); i++) {//Cursor a las nulls
                if(e.getSource()==Lista45xxDer.get(i)){
                    Lista45xxDer.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }    
            // CURSOR Para las Flechas individuales de punteros
            for (int i = 0; i < ListaFlechaNuevo.size(); i++) {//Cursor FlechaNUEVO
                if(e.getSource()==ListaFlechaNuevo.get(i)){
                    ListaFlechaNuevo.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            } 
            for (int i = 0; i < ListaFlechaPrimero.size(); i++) {//Cursor FlechaPRimero
                if(e.getSource()==ListaFlechaPrimero.get(i)){
                    ListaFlechaPrimero.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }        
            for (int i = 0; i < ListaFlechaUltimo.size(); i++) {//Cursor FlechaUltimo
                if(e.getSource()==ListaFlechaUltimo.get(i)){
                    ListaFlechaUltimo.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }       
            for (int i = 0; i < ListaFlechaAux.size(); i++) {//Cursor FlechaAux
                if(e.getSource()==ListaFlechaAux.get(i)){
                    ListaFlechaAux.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }  
            for (int i = 0; i < ListaFlechaVertical.size(); i++) {//Cursor FlechaVertical
                if(e.getSource()==ListaFlechaVertical.get(i)){
                    ListaFlechaVertical.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }  
            for (int i = 0; i < ListaFlechasBotones.size(); i++) {//Cursor Flechas Botones
                if(e.getSource()==ListaFlechasBotones.get(i)){
                    ListaFlechasBotones.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }             
            for (int i = 0; i < ListaFlechaAnt.size(); i++) {//Cursor Flechaant
                if(e.getSource()==ListaFlechaAnt.get(i)){
                    ListaFlechaAnt.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }    
            for (int i = 0; i < ListaFlechaPos.size(); i++) {//Cursor FlechaPos
                if(e.getSource()==ListaFlechaPos.get(i)){
                    ListaFlechaPos.get(i).setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
            }                
            
            //----------------------------- PUNTEROS DE LA LISTA ---------------------------------------------
            if(e.getSource()==VistaListasSimples.LblPNuevo){
                VistaListasSimples.LblPNuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.LblPPrimero){
                VistaListasSimples.LblPPrimero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.LblPUltimo){
                VistaListasSimples.LblPUltimo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.LblPAux){
                VistaListasSimples.LblPAux.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.LblPAnt){
                VistaListasSimples.LblPAnt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            if(e.getSource()==VistaListasSimples.LblPPos){
                VistaListasSimples.LblPPos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }            
             
        }    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(ListaNodos!=null){ //"Clic derecho");
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(e.getSource()==ListaNodos.get(i)){ //Nodo Completo                    
                        colorEtiquetaNormal(ListaNodos.get(i));
                }
            }                               
        }
    }

    private void oyentes() {
        //Acciones del MouseListener
        VistaListasSimples.PanelLista.addMouseListener(this);
        VistaListasSimples.Spinner.addMouseListener(this);
        VistaListasSimples.BtnNodo.addMouseListener(this);
        VistaListasSimples.BtnOrdenar.addMouseListener(this);
        VistaListasSimples.BtnBasura.addMouseListener(this);
        VistaListasSimples.TxtDB.addMouseListener(this);
        VistaListasSimples.TxtDI.addMouseListener(this);
        VistaListasSimples.LblPrimero.addMouseListener(this);
        VistaListasSimples.LblUltimo.addMouseListener(this);
        VistaListasSimples.LblNuevo.addMouseListener(this);
        VistaListasSimples.LblAux.addMouseListener(this);
        VistaListasSimples.LblAnt.addMouseListener(this);
        VistaListasSimples.LblPos.addMouseListener(this);
        
        //Botones de Flechas
        VistaListasSimples.BtnLineaVertical.addMouseListener(this);
        VistaListasSimples.BtnFlechaDer1.addMouseListener(this);
        VistaListasSimples.BtnFlechaDer2.addMouseListener(this);
        VistaListasSimples.BtnFlechaDer3.addMouseListener(this);
        VistaListasSimples.BtnFlechaIzq1.addMouseListener(this);
        VistaListasSimples.BtnFlechaIzq2.addMouseListener(this);
        VistaListasSimples.BtnFlechaIzq3.addMouseListener(this);
        
        //Punteros de la lista
        VistaListasSimples.LblPNuevo.addMouseListener(this);
        VistaListasSimples.LblPPrimero.addMouseListener(this);
        VistaListasSimples.LblPUltimo.addMouseListener(this);
        VistaListasSimples.LblPAux.addMouseListener(this);
        VistaListasSimples.LblPAnt.addMouseListener(this);
        VistaListasSimples.LblPPos.addMouseListener(this);
        
        //Acciones ChangeListener
        VistaListasSimples.Spinner.addChangeListener(this);
    }
    

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==VistaListasSimples.Spinner){
            int Nodos = (Integer)VistaListasSimples.Spinner.getValue();

            if(Nodos>0){ //SI hay nodos creados
                agregarNodoFrente(Nodos); //Agrega n nodos del Spinner   
            }else{
                limpiarPanelListas();
            }            
        }
    }  
    
    private void limpiarPanelListas() {
        VistaListasSimples.PanelLista.removeAll();
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint();

        ListaNodos = new ArrayList<ModeloNodo>();

        ListaFlechaAnt = new ArrayList<>();
        ListaFlechaAux = new ArrayList<>();
        ListaFlechaNuevo = new ArrayList<>();
        ListaFlechaPos = new ArrayList<>();
        ListaFlechaPrimero = new ArrayList<>();
        ListaFlechaUltimo = new ArrayList<>();
        ListaFlechasBotones = new ArrayList<>();
        
        VistaListasSimples.TxtAnt.setText("null");
        VistaListasSimples.TxtAux.setText("null");
        VistaListasSimples.TxtNuevo.setText("null");
        VistaListasSimples.TxtPrimero.setText("null");
        VistaListasSimples.TxtUltimo.setText("null");
        VistaListasSimples.TxtPos.setText("null");
        
        VistaListasSimples.TxtDB.setText("");
        VistaListasSimples.TxtDI.setText("");

        ModeloNodo.Hexadecimales.clear();
        ModeloNodo.Decimales.clear();
        ModeloNodo.cuantosNodos = 0;
    }
    private void limpiarPanelListasActualizar() {
        VistaListasSimples.PanelLista.removeAll();
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint();

        ListaLineas = new ArrayList<JLabel>();

        ListaFlechaAnt = new ArrayList<>();
        ListaFlechaAux = new ArrayList<>();
        ListaFlechaNuevo = new ArrayList<>();
        ListaFlechaPos = new ArrayList<>();
        ListaFlechaPrimero = new ArrayList<>();
        ListaFlechaUltimo = new ArrayList<>();
        ListaFlechasBotones = new ArrayList<>();
        
        VistaListasSimples.TxtAnt.setText("null");
        VistaListasSimples.TxtAux.setText("null");
        VistaListasSimples.TxtNuevo.setText("null");
        VistaListasSimples.TxtPrimero.setText("null");
        VistaListasSimples.TxtUltimo.setText("null");
        VistaListasSimples.TxtPos.setText("null");
        
        VistaListasSimples.TxtDB.setText("");
        VistaListasSimples.TxtDI.setText("");
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        for (int i = 0; i < ListaNodos.size(); i++) {
            if(e.getSource()==ListaNodos.get(i)){
                ListaNodos.get(i).setLocation(ListaNodos.get(i).getLocation().x + e.getX()-x,
                                                      ListaNodos.get(i).getLocation().y + e.getY()-y);
            }
        }
        
        for (int i = 0; i < ListaLineas.size(); i++) {
            if(e.getSource()==ListaLineas.get(i)){
                ListaLineas.get(i).setLocation(ListaLineas.get(i).getLocation().x + e.getX()-x,
                                               ListaLineas.get(i).getLocation().y + e.getY()-y);
            }
        } 
        
        for (int i = 0; i < ListaNulls.size(); i++) {
            if(e.getSource()==ListaNulls.get(i)){
                ListaNulls.get(i).setLocation(ListaNulls.get(i).getLocation().x + e.getX()-x,
                                              ListaNulls.get(i).getLocation().y + e.getY()-y);
            }
        }
 
        for (int i = 0; i < Lista45Izq.size(); i++) {
            if(e.getSource()==Lista45Izq.get(i)){
                Lista45Izq.get(i).setLocation(Lista45Izq.get(i).getLocation().x + e.getX()-x,
                                              Lista45Izq.get(i).getLocation().y + e.getY()-y);
            }
        }

        for (int i = 0; i < Lista45Der.size(); i++) {
            if(e.getSource()==Lista45Der.get(i)){
                Lista45Der.get(i).setLocation(Lista45Der.get(i).getLocation().x + e.getX()-x,
                                              Lista45Der.get(i).getLocation().y + e.getY()-y);
            }
        }
        for (int i = 0; i < Lista45xxxIzq.size(); i++) {
            if(e.getSource()==Lista45xxxIzq.get(i)){
                Lista45xxxIzq.get(i).setLocation(Lista45xxxIzq.get(i).getLocation().x + e.getX()-x,
                                              Lista45xxxIzq.get(i).getLocation().y + e.getY()-y);
            }
        }
        for (int i = 0; i < Lista45xxxDer.size(); i++) {
            if(e.getSource()==Lista45xxxDer.get(i)){
                Lista45xxxDer.get(i).setLocation(Lista45xxxDer.get(i).getLocation().x + e.getX()-x,
                                              Lista45xxxDer.get(i).getLocation().y + e.getY()-y);
            }
        }
        for (int i = 0; i < Lista45xxIzq.size(); i++) {
            if(e.getSource()==Lista45xxIzq.get(i)){
                Lista45xxIzq.get(i).setLocation(Lista45xxIzq.get(i).getLocation().x + e.getX()-x,
                                              Lista45xxIzq.get(i).getLocation().y + e.getY()-y);
            }
        }
        for (int i = 0; i < Lista45xxDer.size(); i++) {
            if(e.getSource()==Lista45xxDer.get(i)){
                Lista45xxDer.get(i).setLocation(Lista45xxDer.get(i).getLocation().x + e.getX()-x,
                                              Lista45xxDer.get(i).getLocation().y + e.getY()-y);
            }
        }   
        //---------------- MOVER Flechas de punteros individuales--------------------
        for (int i = 0; i < ListaFlechaNuevo.size(); i++) { //Flecha puntero Nuevo
            if(e.getSource()==ListaFlechaNuevo.get(i)){
                ListaFlechaNuevo.get(i).setLocation(ListaFlechaNuevo.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaNuevo.get(i).getLocation().y + e.getY()-y);
            }
        }       
        for (int i = 0; i < ListaFlechaPrimero.size(); i++) { //Flecha puntero Primero
            if(e.getSource()==ListaFlechaPrimero.get(i)){
                ListaFlechaPrimero.get(i).setLocation(ListaFlechaPrimero.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaPrimero.get(i).getLocation().y + e.getY()-y);
            }
        }  
        for (int i = 0; i < ListaFlechaUltimo.size(); i++) { //Flecha puntero Ultimo
            if(e.getSource()==ListaFlechaUltimo.get(i)){
                ListaFlechaUltimo.get(i).setLocation(ListaFlechaUltimo.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaUltimo.get(i).getLocation().y + e.getY()-y);
            }
        }  
        for (int i = 0; i < ListaFlechaAux.size(); i++) { //Flecha puntero Aux
            if(e.getSource()==ListaFlechaAux.get(i)){
                ListaFlechaAux.get(i).setLocation(ListaFlechaAux.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaAux.get(i).getLocation().y + e.getY()-y);
            }
        }  
        for (int i = 0; i < ListaFlechaVertical.size(); i++) { //Flecha Vertical Mover
            if(e.getSource()==ListaFlechaVertical.get(i)){
                ListaFlechaVertical.get(i).setLocation(ListaFlechaVertical.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaVertical.get(i).getLocation().y + e.getY()-y);
            }
        }  
        for (int i = 0; i < ListaFlechasBotones.size(); i++) { //Flecha Botones Mover
            if(e.getSource()==ListaFlechasBotones.get(i)){
                ListaFlechasBotones.get(i).setLocation(ListaFlechasBotones.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechasBotones.get(i).getLocation().y + e.getY()-y);
            }
        }         
        for (int i = 0; i < ListaFlechaAnt.size(); i++) { //Flecha puntero Ant
            if(e.getSource()==ListaFlechaAnt.get(i)){
                ListaFlechaAnt.get(i).setLocation(ListaFlechaAnt.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaAnt.get(i).getLocation().y + e.getY()-y);
            }
        }  
        for (int i = 0; i < ListaFlechaPos.size(); i++) { //Flecha puntero Pos
            if(e.getSource()==ListaFlechaPos.get(i)){
                ListaFlechaPos.get(i).setLocation(ListaFlechaPos.get(i).getLocation().x + e.getX()-x,
                                              ListaFlechaPos.get(i).getLocation().y + e.getY()-y);
            }
        }          
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    private void oyenteDinamico(JLabel PI) {
        PI.addMouseMotionListener(this);
        PI.addMouseListener(this);    
    }

    private void oyenteDinamicoNodo(ModeloNodo PI) {
        //Oyente para MouseListener
        PI.addMouseListener(this); 
        //Oyente para MouseMotion
        PI.addMouseMotionListener(this);
        
    }
    
    public  ArrayList<ModeloNodo> ordenarLista(ArrayList<ModeloNodo> listaDesordenada) {
        ArrayList<ModeloNodo> listaOrdenada = new ArrayList<>();
        // Encuentra el nodo inicial (el que no tiene ningún nodo que lo apunte)
        Integer indiceActual = encontrarNodoInicial(listaDesordenada);
        //System.out.println("Indece inicial retornado: "+indiceActual);
        if(indiceActual ==null){
            JOptionPane.showMessageDialog(VistaListasSimples.PanelLista,"No se encontró al nodo inicial, verifica de nuevo la lista");
            if(ListaNodos.isEmpty()){
                limpiarPanelListas();
                VistaListasSimples.PanelLista.setLayout(new GridBagLayout());  
                
                // Revalidar y repintar el panel para reflejar los cambios
                VistaListasSimples.PanelLista.revalidate();
                VistaListasSimples.PanelLista.repaint();  
                VistaListasSimples.Spinner.setValue(0);     
            }
        }else if(indiceActual<0){ //el numero despues del - es el numero de nodos sin predecesor
            JOptionPane.showMessageDialog(VistaListasSimples.PanelLista, "Hay "+indiceActual*-1+" Nodos sin predecesor o sin antecesor, \nverifica de nuevo la lista");
        }else{ //Se encontró el primer nodo
            JOptionPane.showMessageDialog(VistaListasSimples.PanelLista,"El primer nodo es el nodo:"
                                               +(indiceActual+1)+" con dirección "+listaDesordenada.get(indiceActual).LblDirMemoria.getText());
            listaOrdenada.add(listaDesordenada.get(indiceActual));
            ModeloNodo NodoActual = listaDesordenada.get(indiceActual);
            while(!NodoActual.LblLigaDer.getText().equalsIgnoreCase("null")){
                for (int i = 0; i < listaDesordenada.size(); i++) {
                    if(listaDesordenada.get(i).LblDirMemoria.getText().equals(NodoActual.LblLigaDer.getText())){
                       NodoActual = listaDesordenada.get(i);
                       listaOrdenada.add(NodoActual);
                       break;
                    }
                }
                //System.out.println("dentro "+NodoActual.LblInfo.getText()+ " Liga: "+NodoActual.LblLiga.getText()); 
            }
              
            //System.out.println("Lista Desordenada:");
//        for (ModeloNodo nodo : ListaNodos) {
//            System.out.println(nodo.LblInfo.getText());
//        }
//
//        System.out.println("\nLista Ordenada:");
//        for (ModeloNodo nodo : listaOrdenada) {
//            System.out.println(nodo.LblInfo.getText());
//        }
            return listaOrdenada;    
        }       
        return null;
    }
    
    
    public Integer encontrarNodoInicial(ArrayList<ModeloNodo> listaDesordenada) {
        boolean[] tienePredecesor = new boolean[listaDesordenada.size()]; //Falsos todos
        boolean[] tieneAntecesor = new boolean[listaDesordenada.size()]; //Falsos todos
        
        Integer noApuntadosPred = 0;
        Integer noApuntadosAnte = 0;

        //Verificar nodos no apuntados por nadie y detectar el primero (1 sin predecesor Primero)
        for (int i = 0; i < listaDesordenada.size(); i++) {
            String Dir = listaDesordenada.get(i).LblDirMemoria.getText();
            for (int j = 0; j < listaDesordenada.size(); j++) {
                if(listaDesordenada.get(j).LblLigaDer.getText().equalsIgnoreCase(Dir)){
                    tienePredecesor[i] = true;
                }
            }
        }
        
        //Verificar nodos no apuntados por nadie y detectar el primero (1 sin Antecesor Ultimo)
        for (int i =listaDesordenada.size()-1; i >=0 ; i--) {
            String Dir = listaDesordenada.get(i).LblDirMemoria.getText();
            for (int j = 0; j < listaDesordenada.size(); j++)  {
                if(listaDesordenada.get(j).LblLigaIzq.getText().equalsIgnoreCase(Dir)){
                    tieneAntecesor[i] = true;
                }
            }
        }
        
        System.out.println("Predecesor: ");
        for (int i = 0; i < tienePredecesor.length; i++) {
            System.out.print(listaDesordenada.get(i).LblInfo.getText()+": "+tienePredecesor[i]+" - ");
        }
        System.out.println("");
        System.out.println("Antecesor: ");
        for (int i = 0; i < tieneAntecesor.length; i++) {
            System.out.print(listaDesordenada.get(i).LblInfo.getText()+": "+tieneAntecesor[i]+" - ");
        }        
        System.out.println("");
        
        //Cuenta a los no apuntados sin Predcesor
        for (int i = 0; i < tienePredecesor.length; i++) {
            if(!(tienePredecesor[i])){
                noApuntadosPred++;
            }
        }
        //Cuenta a los no apuntados sin Antecesor
        for (int i = 0; i < tieneAntecesor.length; i++) {
            if(!(tieneAntecesor[i])){
                noApuntadosAnte++;
            }
        }
        System.out.println("No apunt PRE= "+noApuntadosPred +" - NO apunt ANT= "+noApuntadosAnte);
        if(noApuntadosPred>1 || noApuntadosAnte>1 ){ //Mas de un nodo sin apuntar
            if(noApuntadosPred>1){
                noApuntadosPred+=-1;
            }
            if(noApuntadosAnte>1){
                noApuntadosAnte+=-1;
            }
            return (noApuntadosPred+noApuntadosAnte)*(-1);
        }
        else if(noApuntadosPred==1 && noApuntadosAnte==1){ //Encontro al Primer Nodo      
            for (int i = 0; i < listaDesordenada.size(); i++) {
               if (!tienePredecesor[i]) {
                    return i;
                }
            }
        }
        return null; // Si no se encuentra el nodo inicial
    }

    private void agregarNodoFrente(int cuantas) {       
        limpiarPanelListas();
        VistaListasSimples.PanelLista.setLayout(new GridBagLayout());  

        for (int i = 0; i < cuantas; i++) {    
              ModeloNodo Nodo = new ModeloNodo();   
              ListaNodos.add(Nodo);
              oyenteDinamicoNodo(Nodo);             
              VistaListasSimples.PanelLista.add(Nodo);  
        }   
        if(cuantas==1){//Llena todas las ligas de los nodos 
            ListaNodos.get(0).LblLigaDer.setFont(FONT_LB_LIGA_NULL_MN);
            ListaNodos.get(0).LblLigaDer.setText("null");
            ListaNodos.get(0).LblLigaIzq.setFont(FONT_LB_LIGA_NULL_MN);
            ListaNodos.get(0).LblLigaIzq.setText("null");
        }else{
            for (int i = 0; i < cuantas-1; i++) { //Ajusta las ligas derechas con su respectiva dir
                ListaNodos.get(i).LblLigaDer.setText(ListaNodos.get(i+1).LblDirMemoria.getText());
            }
 
            for (int i = cuantas-1; i >0 ; i--) { //Ajusta las ligas Izq con su respectiva dir
                ListaNodos.get(i).LblLigaIzq.setText(ListaNodos.get(i-1).LblDirMemoria.getText());
            }
            
            
            ListaNodos.get(ListaNodos.size()-1).LblLigaDer.setFont(FONT_LB_LIGA_NULL_MN);
            ListaNodos.get(ListaNodos.size()-1).LblLigaDer.setText("null");
            
            ListaNodos.get(0).LblLigaIzq.setFont(FONT_LB_LIGA_NULL_MN);
            ListaNodos.get(0).LblLigaIzq.setText("null");
        }


        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint();
    }    
 
    public void agregarNodosDeLista() {   
        if (ListaNodos.isEmpty())
            return;
        limpiarPanelListasActualizar();
        VistaListasSimples.PanelLista.setLayout(new GridBagLayout());  

        for (int i = 0; i < ListaNodos.size(); i++) {                 
              VistaListasSimples.PanelLista.add(ListaNodos.get(i));  
        }   

        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint();
    }   

    private void colorEtiquetaRoja(ModeloNodo Nodo) {
        Nodo.LblDirMemoria.setForeground(COLOR_RESALTAR);
        Nodo.LblInfo.setForeground(COLOR_RESALTAR);
        Nodo.LblLigaDer.setForeground(COLOR_RESALTAR);
        Nodo.LblLigaIzq.setForeground(COLOR_RESALTAR);
    }

    private void colorEtiquetaNormal(ModeloNodo Nodo) {
        Nodo.LblDirMemoria.setForeground(null);
        Nodo.LblInfo.setForeground(null);
        Nodo.LblLigaDer.setForeground(COLOR_LIGA_DER);
        Nodo.LblLigaIzq.setForeground(COLOR_LIGA_IZQ);
    }
    
    private void agregarNodoNull(){
        if (ListaNodos.size()==6){
            JOptionPane.showMessageDialog(null,"Hay más de 6 nodos en el simulador"
                                             + "\nSolo se permiten 6 nodos como máximo...");
            return;
        }
        VistaListasSimples.PanelLista.setLayout(null);
        
        ModeloNodo Nodo = new ModeloNodo();          
        oyenteDinamicoNodo(Nodo);
        ListaNodos.add(Nodo);
        Nodo.LblLigaDer.setFont(FONT_LB_LIGA_NULL_MN);
        Nodo.LblLigaDer.setText("null");
        Nodo.LblLigaIzq.setFont(FONT_LB_LIGA_NULL_MN);
        Nodo.LblLigaIzq.setText("null");
        Nodo.LblInfo.setFont(FONT_LBL_INFO_MN);
        Nodo.LblInfo.setText("?");
        Nodo.setBounds(660,60, 230,87);       
        VistaListasSimples.PanelLista.add(Nodo); 
        
        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint();
    }
    
    private void BotonBasura() {
        if(ListaNodos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe de haber al menos algún Nodo para usar la herramienta Basura");
            return;
        }
        if(VistaListasSimples.TxtDB.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debes de Ingresar en el Cuadro de Texto \"Dato a Buscar\" la Información del Nodo a Buscar"
                    + "\npara poderlo eliminar");
        }else{ //Si hay dato a Buscar en el cuadro de texto Dato a Buscar:
            int cuantos = 0;
            boolean encontrado[] = new boolean[ListaNodos.size()];
            for (int i = 0; i < ListaNodos.size(); i++) {
                if(ListaNodos.get(i).LblInfo.getText().equalsIgnoreCase(VistaListasSimples.TxtDB.getText())){
                    encontrado[i] = true;
                    cuantos++;
                }
            }
            if(cuantos==0){
                JOptionPane.showMessageDialog(null,"No se encontró esa información en ningún Nodo de la Lista");
            }else{ //Si se encontró el dato buscado
                if(cuantos==1){
                   int opc = JOptionPane.showConfirmDialog(null,"Deseas eliminar el Nodo cuya información es "+
                           VistaListasSimples.TxtDB.getText(), "Eliminar", 2);
                   if(opc==0){
                       for (int i = 0; i < encontrado.length; i++) {
                           if(encontrado[i])
                             ListaNodos.remove(i);
                       }
                   }
                }
                
                if(cuantos>1){
                   int opc = JOptionPane.showConfirmDialog(null,"Se encontraron "+cuantos+ "Nodos que contienen "
                           +VistaListasSimples.TxtDB.getText()+"n¿Deseas eliminar todos los nodos?", "Eliminar", 2);
                   if(opc==0){
                       for (int i = 0; i < encontrado.length; i++) {
                           if(encontrado[i])
                             ListaNodos.remove(i);
                       }
                   }
                }
            }
        }
    }
    private void BotonOrdenar() {
        if(ListaNodos.size()==7){
            JOptionPane.showMessageDialog(null,"En esta versión no se pueden utilizar más de 7 nodos,"
                    + " se eliminará el nuevo nodo a insertar...");
            ListaNodos.remove(ListaNodos.get(ListaNodos.size()-1));
            agregarNodosDeLista();
            return;
        }

        ArrayList<ModeloNodo> ListaNodoTemporal = ordenarLista(ListaNodos);

        if(ListaNodoTemporal!=null){
            ListaNodos = ListaNodoTemporal; //Actualiza la lista de nodos
            agregarNodosDeLista();   
        }
    }
    

    private void agregarFlechaNuevo() {
        if (ListaNodos.isEmpty())
            return;
        VistaListasSimples.PanelLista.setLayout(null);
         
        
        JLabel LblFlechaNuevo = new JLabel(ImFlechaNuevo);
        ListaFlechaNuevo.add(LblFlechaNuevo);
        oyenteDinamico(LblFlechaNuevo);           
        LblFlechaNuevo.setBounds(373,160,ImFlechaNuevo.getIconWidth(),ImFlechaNuevo.getIconHeight());
        VistaListasSimples.PanelLista.add(LblFlechaNuevo); 
         
         
        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }
    
    private void agregarFlechaPrimero() {
        if (ListaNodos.isEmpty())
            return;
        //Cambiar el layout a FreeLayout() o null
        VistaListasSimples.PanelLista.setLayout(null);    
        
        int nodos = ListaNodos.size();
        if(nodos>6)
            return;
        JLabel LblFlechaPrimero = new JLabel(ImageIconsPrimero.get(nodos-1).getImFlecha());
        LblFlechaPrimero.setBounds(ImageIconsPrimero.get(nodos-1).getPosx(),ImageIconsPrimero.get(nodos-1).getPosy(),
                                   ImageIconsPrimero.get(nodos-1).getTamx(),ImageIconsPrimero.get(nodos-1).getTamy());
      
        ListaFlechaPrimero.add(LblFlechaPrimero);
        oyenteDinamico(LblFlechaPrimero);           
        VistaListasSimples.PanelLista.add(LblFlechaPrimero);  

        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }
    
    private void agregarFlechaUltimo() {
        if (ListaNodos.isEmpty())
            return;
        VistaListasSimples.PanelLista.setLayout(null);

        int nodos = ListaNodos.size();
        JLabel LblFlechaUltimo = new JLabel(ImageIconsUltimo.get(nodos-1).getImFlecha());
        LblFlechaUltimo.setBounds(ImageIconsUltimo.get(nodos-1).getPosx(),ImageIconsUltimo.get(nodos-1).getPosy(),
                                  ImageIconsUltimo.get(nodos-1).getTamx(),ImageIconsUltimo.get(nodos-1).getTamy());
      
        ListaFlechaUltimo.add(LblFlechaUltimo);
        oyenteDinamico(LblFlechaUltimo);           
        VistaListasSimples.PanelLista.add(LblFlechaUltimo);  

        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }
    private void agregarFlechaAuxiliar() {
        if (ListaNodos.isEmpty())
            return;
        VistaListasSimples.PanelLista.setLayout(null);
         
        int nodos = ListaNodos.size();
        JLabel LblFlechaAux = new JLabel(ImageIconsAux.get(nodos-1).getImFlecha());
        LblFlechaAux.setBounds(ImageIconsAux.get(nodos-1).getPosx(),ImageIconsAux.get(nodos-1).getPosy(),
                               ImageIconsAux.get(nodos-1).getTamx(),ImageIconsAux.get(nodos-1).getTamy());
        ListaFlechaAux.add(LblFlechaAux);
        oyenteDinamico(LblFlechaAux);           
        VistaListasSimples.PanelLista.add(LblFlechaAux);   

        //Actualiza direcciones de Punteros de Aux
        switch (nodos) {
            case 1:VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;
            case 2:VistaListasSimples.TxtAux.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;                
            case 3:VistaListasSimples.TxtAux.setText(ListaNodos.get(1).LblDirMemoria.getText()); //set Dir del puntero
                break;   
            case 4:VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 5:VistaListasSimples.TxtAux.setText(ListaNodos.get(2).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 6:VistaListasSimples.TxtAux.setText(ListaNodos.get(3).LblDirMemoria.getText()); //set Dir del puntero
                break;                    
            default:
        }
         
        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }  
    
    private void agregarFlechaAnterior() {
        if (ListaNodos.isEmpty())
            return;
        VistaListasSimples.PanelLista.setLayout(null);
         
        int nodos = ListaNodos.size();
        JLabel LblFlechaAnt = new JLabel(ImageIconsAnt.get(nodos-1).getImFlecha());
        LblFlechaAnt.setBounds(ImageIconsAnt.get(nodos-1).getPosx(),ImageIconsAnt.get(nodos-1).getPosy(),
                               ImageIconsAnt.get(nodos-1).getTamx(),ImageIconsAnt.get(nodos-1).getTamy());
        ListaFlechaAnt.add(LblFlechaAnt);
        oyenteDinamico(LblFlechaAnt);           
        VistaListasSimples.PanelLista.add(LblFlechaAnt);         
        
         //Actualiza direcciones de Punteros de Aux
        switch (nodos) {
            case 1:VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;
            case 2:VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;                
            case 3:VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;   
            case 4:VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 5:VistaListasSimples.TxtAnt.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 6:VistaListasSimples.TxtAnt.setText(ListaNodos.get(2).LblDirMemoria.getText()); //set Dir del puntero
                break;                    
            default:
        }

        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }  
    
    private void agregarFlechaPosterior() {
        if (ListaNodos.isEmpty())
            return;
        VistaListasSimples.PanelLista.setLayout(null);
         
        int nodos = ListaNodos.size();
        JLabel LblFlechaPos = new JLabel(ImageIconsPos.get(nodos-1).getImFlecha());
        LblFlechaPos.setBounds(ImageIconsPos.get(nodos-1).getPosx(),ImageIconsPos.get(nodos-1).getPosy(),
                               ImageIconsPos.get(nodos-1).getTamx(),ImageIconsPos.get(nodos-1).getTamy());
        ListaFlechaPos.add(LblFlechaPos);
        oyenteDinamico(LblFlechaPos);           
        VistaListasSimples.PanelLista.add(LblFlechaPos);       
        
        
        //Actualiza direcciones de Punteros de Pos
        switch (nodos) {
            case 1:VistaListasSimples.TxtPos.setText(ListaNodos.get(0).LblDirMemoria.getText()); //set Dir del puntero
                break;
            case 2:VistaListasSimples.TxtPos.setText(ListaNodos.get(1).LblDirMemoria.getText()); //set Dir del puntero
                break;                
            case 3:VistaListasSimples.TxtPos.setText(ListaNodos.get(2).LblDirMemoria.getText()); //set Dir del puntero
                break;   
            case 4:VistaListasSimples.TxtPos.setText(ListaNodos.get(3).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 5:VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText()); //set Dir del puntero
                break;      
            case 6:VistaListasSimples.TxtPos.setText(ListaNodos.get(4).LblDirMemoria.getText()); //set Dir del puntero
                break;                    
            default:
        }

        // Revalidar y repintar el panel para reflejar los cambios
        VistaListasSimples.PanelLista.revalidate();
        VistaListasSimples.PanelLista.repaint(); 
    }      

     
    private void agregarFlechasDeBotones(JButton BotonFlecha) {
        if(!ListaNodos.isEmpty()){
            VistaListasSimples.PanelLista.setLayout(null);

            JLabel LblFlechaBot = new JLabel(BotonFlecha.getIcon());
            
            x = (int)VistaListasSimples.PanelLista.getSize().getWidth()/2; //En el centro
            
            LblFlechaBot.setBounds(x,20,BotonFlecha.getIcon().getIconWidth(),BotonFlecha.getIcon().getIconHeight());
            ListaFlechasBotones.add(LblFlechaBot);
            oyenteDinamico(LblFlechaBot);           
            VistaListasSimples.PanelLista.add(LblFlechaBot);   

            // Revalidar y repintar el panel para reflejar los cambios
            VistaListasSimples.PanelLista.revalidate();
            VistaListasSimples.PanelLista.repaint();           
        }
    } 
     
    private void arrayDeImagenesPrimero() {        
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero1,138,320, ImPrimero1.getIconWidth(),ImPrimero1.getIconHeight()));
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero2,138,320, ImPrimero2.getIconWidth(),ImPrimero2.getIconHeight()));
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero3,138,320, ImPrimero3.getIconWidth(),ImPrimero3.getIconHeight()));
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero4,138,320, ImPrimero4.getIconWidth(),ImPrimero4.getIconHeight()));
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero5,138,320, ImPrimero5.getIconWidth(),ImPrimero5.getIconHeight()));
        ImageIconsPrimero.add(new ModeloFlechaSetBounds(ImPrimero6,130,320, ImPrimero6.getIconWidth(),ImPrimero6.getIconHeight()));        
    }

    private void arrayDeImagenesUltimo() {
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo1,790,322, ImUltimo1.getIconWidth(),ImUltimo1.getIconHeight()));
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo2,910,322, ImUltimo2.getIconWidth(),ImUltimo2.getIconHeight()));
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo3,1015,320, ImUltimo3.getIconWidth(),ImUltimo3.getIconHeight()));
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo4,1115,320, ImUltimo4.getIconWidth(),ImUltimo4.getIconHeight()));
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo5,1204,320, ImUltimo5.getIconWidth(),ImUltimo5.getIconHeight()));
        ImageIconsUltimo.add(new ModeloFlechaSetBounds(ImUltimo6,1310,320, ImUltimo6.getIconWidth(),ImUltimo6.getIconHeight()));        
    }

    private void arrayDeImagenesNuevo() {
        ImageIconsNuevo.add(new ModeloFlechaSetBounds(ImFlechaNuevo,740,322, ImFlechaNuevo.getIconWidth(),ImFlechaNuevo.getIconHeight()));
      
    }

    private void arrayDeImagenesAux() {
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux1,740,322, ImAux1.getIconWidth(),ImAux1.getIconHeight()));
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux2,656,322, ImAux2.getIconWidth(),ImAux2.getIconHeight()));
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux3,760,322, ImAux3.getIconWidth(),ImAux3.getIconHeight()));
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux4,825,322, ImAux4.getIconWidth(),ImAux4.getIconHeight()));
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux5,743,322, ImAux5.getIconWidth(),ImAux5.getIconHeight()));
        ImageIconsAux.add(new ModeloFlechaSetBounds(ImAux6,826,322, ImAux6.getIconWidth(),ImAux6.getIconHeight()));
        
    }

    private void arrayDeImagenesAnt() {
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt1,595,322, ImAnt1.getIconWidth(),ImAnt1.getIconHeight()));
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt2,596,322, ImAnt2.getIconWidth(),ImAnt2.getIconHeight()));
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt3,490,322, ImAnt3.getIconWidth(),ImAnt3.getIconHeight()));
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt4,373,322, ImAnt4.getIconWidth(),ImAnt4.getIconHeight()));
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt5,295,322, ImAnt5.getIconWidth(),ImAnt5.getIconHeight()));
        ImageIconsAnt.add(new ModeloFlechaSetBounds(ImAnt6,594,322, ImAnt6.getIconWidth(),ImAnt6.getIconHeight()));        
      
    }

    private void arrayDeImagenesPos() {
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos1,756,322, ImPos1.getIconWidth(),ImPos1.getIconHeight()));
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos2,850,322, ImPos2.getIconWidth(),ImPos2.getIconHeight()));
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos3,990,322, ImPos3.getIconWidth(),ImPos3.getIconHeight()));
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos4,1065,322, ImPos4.getIconWidth(),ImPos4.getIconHeight()));
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos5,1066,322, ImPos5.getIconWidth(),ImPos5.getIconHeight()));
        ImageIconsPos.add(new ModeloFlechaSetBounds(ImPos6,1064,322, ImPos6.getIconWidth(),ImPos6.getIconHeight()));
    }
}
