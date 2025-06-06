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
package controlador;

import interfaces.Fuentes;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import vista.VistaNodoInfo;

/**
 *
 * @author Francisco Oliva
 */
public class ControladorVistaNodoInfo implements MouseListener, MouseMotionListener, Fuentes{
    private VistaNodoInfo VNI;
    int x,y;

    public ControladorVistaNodoInfo(VistaNodoInfo VNI) {
        this.VNI = VNI;
        oyentes();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==VNI.LblTrash){
            if(VNI.i!=0 && VNI.i!=VNI.ListaNodos.size()-1){ //Nodo Intermedio
                VNI.ListaNodos.get(VNI.i-1).LblLigaDer.setText(VNI.ListaNodos.get(VNI.i).LblLigaDer.getText());
            }else if(VNI.i==VNI.ListaNodos.size()-1 && VNI.ListaNodos.size()!=1){//Es el último nodo y hay más
                VNI.ListaNodos.get(VNI.ListaNodos.size()-2).LblLigaDer.setText("null");
            }else if(VNI.i==0 && VNI.ListaNodos.size()-1>0){//Es el primer nodo y hay más
                VNI.ListaNodos.get(1).LblLigaIzq.setText("null");
            }
            VNI.ListaNodos.remove(VNI.i); //Ellimina el Nodo seleccionado
            VNI.dispose();
        }
        if(e.getSource()==VNI.BtnCancelar){
            int opc = JOptionPane.showConfirmDialog(VNI,"¿Salir sin hacer cambios?","Cancelar", 2);
            if(opc==0){
                VNI.dispose();
            }
        }
        if(e.getSource()==VNI.BtnOk){
            int opc = JOptionPane.showConfirmDialog(VNI,"¿Guardar cambios?","Guardar", 2);
            if(opc==0){
                //Si la dirección de Memoria no tiene el # se lo agrega
                if(VNI.TxtDirMem.getText().charAt(0)=='#'){
                    VNI.ModeloNodo.LblDirMemoria.setText(VNI.TxtDirMem.getText());
                }else{
                    VNI.ModeloNodo.LblDirMemoria.setText("#"+VNI.TxtDirMem.getText().toUpperCase());
                }
                
                VNI.ModeloNodo.LblInfo.setText(VNI.TxtInfo.getText());
                
                //Guarda la Información de la Liga Derecha
                if(!VNI.TxtLigaDer.getText().equalsIgnoreCase("null")){ //Si el nodo no es null en Der
                    if(VNI.TxtLigaDer.getText().charAt(0)=='#'){
                        VNI.ModeloNodo.LblLigaDer.setText(VNI.TxtLigaDer.getText().toUpperCase());
                    }else{
                        VNI.ModeloNodo.LblLigaDer.setText("#"+VNI.TxtLigaDer.getText().toUpperCase());
                    }
                    VNI.ModeloNodo.LblLigaDer.setFont(FONT_LB_LIGAS_MN);
                }else{ //null
                    VNI.ModeloNodo.LblLigaDer.setFont(FONT_LB_LIGA_NULL_MN);
                    VNI.ModeloNodo.LblLigaDer.setText(VNI.TxtLigaDer.getText().toLowerCase());
                }
 
                //Guarda la Información de la Liga Izquierda
                if(!VNI.TxtLigaIzq.getText().equalsIgnoreCase("null")){ //Si el nodo no es null en Der
                    if(VNI.TxtLigaIzq.getText().charAt(0)=='#'){
                        VNI.ModeloNodo.LblLigaIzq.setText(VNI.TxtLigaIzq.getText().toUpperCase());
                    }else{
                        VNI.ModeloNodo.LblLigaIzq.setText("#"+VNI.TxtLigaIzq.getText().toUpperCase());
                    }
                    VNI.ModeloNodo.LblLigaIzq.setFont(FONT_LB_LIGAS_MN);
                }else{ //null
                    VNI.ModeloNodo.LblLigaIzq.setFont(FONT_LB_LIGA_NULL_MN);
                    VNI.ModeloNodo.LblLigaIzq.setText(VNI.TxtLigaIzq.getText().toLowerCase());
                }
                
                
                VNI.dispose(); 
            }
            else{
                VNI.dispose();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==VNI){
            x = e.getX();
            y = e.getY();
        }
        if(e.getSource()==VNI.LblMoverCursor){
            x = e.getX();
            y = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==VNI){
            VNI.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        }
        if(e.getSource()==VNI.BtnOk){
            VNI.BtnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        if(e.getSource()==VNI.BtnCancelar){
            VNI.BtnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        if(e.getSource()==VNI.LblTrash){
            VNI.LblTrash.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            VNI.LblTrash.setIcon(VNI.Imtrash2);
        }
        
        if(e.getSource()==VNI.LblMoverCursor){
            VNI.LblMoverCursor.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            VNI.LblMoverCursor.setIcon(VNI.ImMoveCursor2);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==VNI.LblTrash){
            VNI.LblTrash.setIcon(VNI.Imtrash1);
        }
        if(e.getSource()==VNI.LblMoverCursor){
            VNI.LblMoverCursor.setIcon(VNI.ImMoveCursor1);
        }        
    }

    private void oyentes() {
        //Oyentes MouseListener
        VNI.BtnOk.addMouseListener(this);
        VNI.BtnCancelar.addMouseListener(this);
        VNI.BtnCerrar.addMouseListener(this);
        VNI.TxtInfo.addMouseListener(this);
        VNI.TxtDirMem.addMouseListener(this);
        VNI.TxtLigaDer.addMouseListener(this);
        VNI.LblMoverCursor.addMouseListener(this);
        VNI.LblTrash.addMouseListener(this);
        VNI.addMouseListener(this);
        
        //Oyentes MouseMotionListener
        VNI.addMouseMotionListener(this);
        VNI.LblMoverCursor.addMouseMotionListener(this);
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource()==VNI){
            VNI.setLocation(VNI.getLocation().x + e.getX()-x,
                            VNI.getLocation().getLocation().y + e.getY()-y);
        }
        if(e.getSource()==VNI.LblMoverCursor){
            VNI.setLocation(VNI.getLocation().x + e.getX()-x,
                            VNI.getLocation().getLocation().y + e.getY()-y);
        }        
    }
        
    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
    
}
