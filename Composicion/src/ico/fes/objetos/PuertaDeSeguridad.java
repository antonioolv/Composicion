/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;


/**
 *
 * @author Antonio Olvera
 */
public class PuertaDeSeguridad extends Puerta {
    private String mecanismo;
    private String contrasenia; 

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String mecanismo, String contrasenia) {
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public PuertaDeSeguridad(String mecanismo, String contrasenia, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return super.toString()+ "PuertaDeSeguridad{" + "mecanismo=" + mecanismo + ", contrasenia=" + contrasenia + '}';
    }
    
public void verificar(){
    System.out.println("Verificando...");
}
    
    
}
