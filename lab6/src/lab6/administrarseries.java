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
public class administrarseries {
    private ArrayList<series> listaseries = new ArrayList();
    private File archivo = null;

    public administrarseries(String path) {
        archivo = new File(path);
    }

    public ArrayList<series> getListaseries() {
        return listaseries;
    }

    public void setListaseries(ArrayList<series> listaseries) {
        this.listaseries = listaseries;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setseries(series p) {
        this.listaseries.add(p);
    }

    public void escribirarchivos() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (series h : listaseries) {
                    bw.write(h.getID()+",");
                    bw.write(h.getNombre()+",");
                    bw.write(h.getCategoria()+",");
                    bw.write(h.getDuracion()+",");
                    bw.write(h.getRating()+",");
                    bw.write(h.getProductora()+",");
                    bw.write(h.getDirector()+",");
                }
        } catch (Exception e) {
            
        }
    }
    public void cargararchivos() {
        Scanner sc = null;
        listaseries = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String I,N,C,P,D;
                    int Du,R;
                    ArrayList<series> series=new ArrayList();
                    I=sc.next();
                    N=sc.next();
                    C=sc.next();
                    Du=sc.nextInt();
                    R=sc.nextInt();
                    P=sc.next();
                    D=sc.next();
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
