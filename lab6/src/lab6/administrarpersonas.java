/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author david
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class administrarpersonas {

    private ArrayList<usuarios> listapersonas = new ArrayList();
    private File archivo = null;

    public administrarpersonas(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuarios> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<usuarios> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listar ppersonas= " + listapersonas;
    }

    public void setpersonas(usuarios p) {
        this.listapersonas.add(p);
    }

    public void escribirarchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (usuarios t : listapersonas) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getFnacimiento() + ";");
                bw.write(t.getTarjeta() + ";");
                bw.write(t.getContra()+";");
                for (peliculas h : t.getP()) {
                    bw.write(h.getID()+",");
                    bw.write(h.getNombre()+",");
                    bw.write(h.getCategoria()+",");
                    bw.write(h.getDuracion()+",");
                    bw.write(h.getRating()+",");
                    bw.write(h.getProductora()+",");
                    bw.write(h.getDirector()+",");
                }
                for (series s : t.getS()) {
                    bw.write(s.getID()+".");
                    bw.write(s.getNombre()+".");
                    bw.write(s.getNtemporadas()+".");
                    bw.write(s.getCategoria()+".");
                    bw.write(s.getDuracion()+".");
                    bw.write(s.getRating()+".");
                    bw.write(s.getProductora()+".");
                    bw.write(s.getDirector()+".");
                }
            } 

            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargararchivo() {
        Scanner sc = null;
        listapersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String c, f, t,cs;
                    ArrayList<peliculas> temp=new ArrayList();
                    ArrayList<series> temps=new ArrayList();
                    c=sc.next();
                    f=sc.next();
                    t=sc.next();
                    cs=sc.next();
                    Scanner s2 =new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp.add(new peliculas(s2.next(), s2.next(), s2.next(),s2.nextInt(),s2.nextInt(),s2.next(),s2.next()));
                    }
                    Scanner s3=new Scanner(sc.next());
                    s3.useDelimiter(".");
                    while (s3.hasNext()) {
                        temps.add(new series(s3.next(), s3.next(),s3.nextInt(), s3.next(),s3.next(),s3.nextInt(),s3.next(),s3.next()));
                    }
                    listapersonas.add(new usuarios(c, f, t,cs));
                    listapersonas.get(listapersonas.size()-1).setP(temp);
                    listapersonas.get(listapersonas.size()-1).setS(temps);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
