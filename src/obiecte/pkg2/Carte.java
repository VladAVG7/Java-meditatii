
package obiecte.pkg2;

import java.util.ArrayList;


public class Carte {
    private String denumire;
    private String editura;
    private double pret;
    
    private ArrayList<Persoana> listaAutori = new ArrayList<Persoana>();
    
    public Carte() {
        
    }
    
    public Carte(String denumire , String editura , double pret) {
        this.denumire = denumire;
        this.editura = editura;
        this.pret = pret;
    }
    
    public void adaugareAutor(Persoana a) {
        this.listaAutori.add(a);
    }
    
    public void stergereAutor(Persoana a) {
        this.listaAutori.remove(a);
    }

    public String getDenumire() {
        return denumire;
    }

    public String getEditura() {
        return editura;
    }

    public double getPret() {
        return pret;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    
    public ArrayList<Persoana> getListaAutori() {
        return listaAutori;
    }

    @Override
    public String toString() {
        return "Carte{" + "denumire=" + denumire + ", editura=" + editura + ", pret=" + pret +'}';
    }
    
    
}
