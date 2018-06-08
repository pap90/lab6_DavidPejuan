/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class usuarios {
    private String correo;
    private String nusuario;
    private String fnacimiento;
    private ArrayList<peliculas> p=new ArrayList();
    private ArrayList<series> s=new ArrayList();
    private String tarjeta;

    public usuarios() {
    }

    public usuarios(String correo, String nusuario, String fnacimiento, String tarjeta) {
        this.correo = correo;
        this.nusuario = nusuario;
        this.fnacimiento = fnacimiento;
        this.tarjeta = tarjeta;
    }
    
}
