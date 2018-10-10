/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author rubenfilipe
 */
public class Data implements Serializable{
    private Calendar calendar;

    public Data(int dia, int mes, int ano) {
           
        calendar = new GregorianCalendar(ano, mes-1, dia);
   
        if (dia != calendar.get(Calendar.DATE) || mes-1 != calendar.get(Calendar.MONTH) || ano != calendar.get(Calendar.YEAR)) {
            throw new IllegalArgumentException("5");
        }
       
    }
    
    public static Data parse (String data) {
        String[] partes = data.split("/"); 
        if (partes.length != 3) {
            throw new IllegalArgumentException("4");
        }
        
        return new Data(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", calendar.get(Calendar.DATE), (calendar.get(Calendar.MONTH ) + 1), calendar.get(calendar.YEAR));
    }
    
}
