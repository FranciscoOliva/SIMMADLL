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
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Cesar.Calderon
 */
public class ModeloFlechaSetBounds {
    ImageIcon ImFlecha;
    int tamx,tamy,posx,posy;

    public ModeloFlechaSetBounds(ImageIcon ImFlecha, int posx, int posy, int tamx, int tamy) {
        this.posx = posx;
        this.posy = posy;
        this.ImFlecha = ImFlecha;
        this.tamx = tamx;
        this.tamy = tamy;
    }

    public ImageIcon getImFlecha() {
        return ImFlecha;
    }

    public void setImFlecha(ImageIcon ImFlecha) {
        this.ImFlecha = ImFlecha;
    }

    public int getTamx() {
        return tamx;
    }

    public void setTamx(int tamx) {
        this.tamx = tamx;
    }

    public int getTamy() {
        return tamy;
    }

    public void setTamy(int tamy) {
        this.tamy = tamy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
}
