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
package principal;

import controlador.ControladorVistaListasDobles;

import vista.VistaListasDobles;

/**
 *
 * @author francisco.oliva
 */
public class SimuladorListasDobles {
    public static void main(String[] args) {
       VistaListasDobles vistaListasSimples = new VistaListasDobles();     
       ControladorVistaListasDobles CVS = new ControladorVistaListasDobles(vistaListasSimples);
    }
}
