package obiecte.pkg2;

import java.util.ArrayList;

public class Persoana {

    private String nume;
    private String prenume;
    private boolean gen;
    private int cnp;
    
    private ArrayList<Carte> listaCarti = new ArrayList<Carte>();

    public Persoana() {
        
    }

    public Persoana(String nume, String prenume, int cnp, boolean gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.gen = gen;
    }

    public boolean isGen() {
        return gen;
    }

    public String getNume() {
        return nume;
    }

    public int getCnp() {
        return cnp;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public ArrayList<Carte> getListaCarti() {
        return listaCarti;
    }
    
    public void carteDinLista(int i) {
       if(listaCarti.isEmpty()) {
           System.out.println("Persoana nu are carti in lista");
       }else {
           System.out.println(listaCarti.get(i));
       }
        System.out.println("Autori:");
        System.out.println(this.listaCarti.get(i).getListaAutori());
        
    }
    
    public void addCarte(Carte c) {
        this.listaCarti.add(c);
    }
    
    public void removeCarte(Carte c) {
        this.listaCarti.remove(c);
    }

    @Override
    public String toString() {
        return "Persoana{" + "nume=" + nume + ", prenume=" + prenume + ", gen=" + gen + ", cnp=" + cnp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persoana other = (Persoana) obj;
        return this.cnp == other.cnp;
    }
    
    //final - declaram o variabila constanta
    
    //TEMA editare carte si autor
    //Data viitoare - relatii intre obiecte

}
