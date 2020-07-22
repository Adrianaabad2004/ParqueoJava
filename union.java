/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueo;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author Adriana Abad
 */
public class union extends Puntos {
   
    public void CrearPdf(String dest, JTextField uno, JTextField dos, String fechaHora) {
        
        Registro instancia_registro = new Registro();
        
        PdfWriter writer = null;
        try {
            writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            document.add(new Paragraph ("Recibo Parqueadero"));
            document.add(new Paragraph ("Placa vehiculo: "+instancia_registro. ));
            document.add(new Paragraph ("Nombre del propietario: "+jpropietario2.getText()));
            document.add(new Paragraph ("Hora de ingreso: "+fechaHora)); 
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(union.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }
    
    

    @Override
    public void CrearPdf(String dest, JTextField unoo, Date date, Double valorAPagar) {
        PdfWriter writer = null;
        try {
            writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            document.add(new Paragraph ("Salida de vehiculo"));
            document.add(new Paragraph ("Placa vehiculo: "+jplaca1.getText()));
            document.add(new Paragraph ("Hora de salida: "+date));
            document.add(new Paragraph ("Monto a pagar: "+valorAPagar)); 
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(union.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
 
}


 