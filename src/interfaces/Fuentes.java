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
package interfaces;

import java.awt.Font;

/**
 *
 * @author Francisco Oliva
 */
public interface Fuentes {
    //Fuentes Ventana de Dialogo
    Font FONT_TXT_VD = new Font("Times new Roman",0,20);
    Font FONT_LBL_VD = new Font("Times new Roman",0,21);
    Font FONT_BTN_VD = new Font("Times new Roman",0,16);
    
    //Fuente ModeloNodo
    Font FONT_LBL_INFO_MN = new Font("Times new Roman",0,30);
    Font FONT_LB_LIGAS_MN = new Font("Times new Roman",0,18);
    Font FONT_LB_DIRMEM_MN = new Font("Times new Roman",0,18);
    Font FONT_LB_LIGA_NULL_MN = new Font("Times new Roman",0,23);
    
    
}
