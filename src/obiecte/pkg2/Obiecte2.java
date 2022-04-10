
package obiecte.pkg2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.function.Consumer;

public class Obiecte2 {
    
    public static void afisareDate(Persoana p) {
        System.out.println(p.getPrenume());
        System.out.println(p.getNume());
        System.out.println("CNP: " + p.getCnp());
        if(p.isGen()) {
            System.out.println("gen: f");
        }
        else {
            System.out.println("gen: m");
        }
    }

    public static void main(String[] args) {
        //public
        //protected - acces prin lantul de mostenire
        //private - acces doar in interiorul clasei
        //default - acces la nivel de pachet
        
        Calendar cal1 = Calendar.getInstance();
        int anCurent = cal1.get(Calendar.YEAR);
        
        Persoana p1 = new Persoana("Trifoi" , "Marinel" , 123123414 , false);
        Persoana p2 = new Persoana("Gaguta" , "Marius" , 123123413 , false);
        Persoana p3 = new Persoana("Dinca" , "Marinela" , 231413513 , true);
        Persoana p4 = new Persoana("Amza" , "Eufrosina" , 1314324213 , true);
        Persoana p5 = new Persoana("Lata" , "Stanescu" , 69696969 , false);
        
        Carte c1 = new Carte("Arta Porno" , "Aramis" , 6.99);
        Carte c2 = new Carte("Cum sa furi banii de la elevi in 3 pasi simpli" , "Dinca" , 200);
        Carte c3 = new Carte("Chimie clasa a XI-a" , "Art" , 13.99);
        
        
        c1.adaugareAutor(p5);
        c2.adaugareAutor(p4);
        c3.adaugareAutor(p3);
        
        //afisareDate(p1);
        //System.out.println();
        //afisareDate(p2);
        //System.out.println(p1.equals(p2))
        
        ArrayList <Persoana> listaPersoane = new ArrayList<Persoana>();
        
        listaPersoane.add(p1);
        listaPersoane.add(p2);
        listaPersoane.add(p3);
        listaPersoane.add(p4);
        listaPersoane.add(p5);
        
        //Carte : denumire , editura , lista de autori , pret
        //Persoana are o lista de carti
        
        p1.addCarte(c1);
        p1.addCarte(c2);
        p2.addCarte(c3);
        p2.addCarte(c1);
        
        //Metoda 1
        /*
        listaPersoane.forEach((p)->{
            System.out.println(p);
        });
        
        //Metoda 2
        int index=0;
        for(Persoana p:listaPersoane){
            System.out.println(p);
            index++;
        }
        */
        //Metoda 3  
//        for(int i=0;i<listaPersoane.size();i++){
//            System.out.println(listaPersoane.get(i));
//        }
        
        p2.carteDinLista(0);
    }
    
}
