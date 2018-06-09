/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class administrarpeliculas {

    private ArrayList<peliculas> listapeliculas = new ArrayList();
    private File archivo = null;

    public administrarpeliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<peliculas> getListapeliculas() {
        return listapeliculas;
    }

    public void setListapeliculas(ArrayList<peliculas> listapeliculas) {
        this.listapeliculas = listapeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setpeliculas(peliculas p) {
        this.listapeliculas.add(p);
    }

    public void escribirarchivop() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (peliculas h : listapeliculas) {
                    bw.write(h.getID()+",");
                    bw.write(h.getNombre()+",");
                    bw.write(h.getCategoria()+",");
                    bw.write(h.getDuracion()+",");
                    bw.write(h.getRating()+",");
                    bw.write(h.getProductora()+",");
                    bw.write(h.getDirector()+",");
                }
            bw.flush();
        } catch (Exception e) {
            
        }
    }
    public void cargararchivop() {
        Scanner sc = null;
        listapeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String I,N,C,P,D;
                    int Du,R;
                    ArrayList<peliculas> pelis=new ArrayList();
                    I=sc.next();
                    N=sc.next();
                    C=sc.next();
                    Du=sc.nextInt();
                    R=sc.nextInt();
                    P=sc.next();
                    D=sc.next();
                    listapeliculas.add(new peliculas(I, N, C, Du, R, P, D));
                    
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    } 
}