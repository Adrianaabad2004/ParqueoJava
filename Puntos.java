/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueo;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Adriana Abad
 */
public abstract class Puntos {
    

    public abstract void CrearPdf( String dest, JTextField uno, JTextField dos, String fechaHora);
    public abstract void CrearPdf(String dest, JTextField unoo, Date date, Double valorAPagar);
    
}
