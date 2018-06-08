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
    private String fnacimiento;
    private ArrayList<peliculas> p=new ArrayList();
    private ArrayList<series> s=new ArrayList();
    private String tarjeta;
    private String contra;

    public usuarios() {
    }

    public usuarios(String correo, String fnacimiento, String tarjeta, String contra) {
        this.correo = correo;
        this.fnacimiento = fnacimiento;
        this.tarjeta = tarjeta;
        this.contra = contra;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public ArrayList<peliculas> getP() {
        return p;
    }

    public void setP(ArrayList<peliculas> p) {
        this.p = p;
    }

    public ArrayList<series> getS() {
        return s;
    }

    public void setS(ArrayList<series> s) {
        this.s = s;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }   
}