/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.objetos.Muro;
import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
import ico.fes.objetos.Ventana;
import java.awt.Color;

/**
 *
 * @author Antonio olvera 
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muro m1 = new Muro(2.5f, 4.5f, 3.5f, Color.gray, null, new Puerta("Madera", Color.white, false));
        System.out.println(m1.getAlto() + " mts. de alto");
        System.out.println(m1.getPuerta().getMaterial());
        System.out.println(m1);
        
        System.out.println("----------------------------");
        
        m1.getPuerta().setMaterial("Aluminio");
        m1.getPuerta().setColor(Color.blue);
        Ventana ventanas[] = new Ventana[1];
        ventanas[0] = new Ventana("Aluminio ", Color.blue, 0.5f, 1.0f);
        m1.setVentanas(ventanas);
        System.out.println(m1);
        System.out.println(m1.getVentanas()[0]);
        
        System.out.println(".-.-.-.-.-. Herencia -.-.-.-.-.");
        PuertaDeSeguridad Puerta1=new PuertaDeSeguridad();
        Puerta1.setColor(Color.yellow);
        Puerta1.cerrar();
        System.out.println(Puerta1);
    }

}
