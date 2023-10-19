package main;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Entities.Cliente;
import Entities.Dipendente;
import Entities.Manager;
import Entities.Prodotto;

public class Pasticceria {
    private ArrayList<Prodotto> prodotti;

    public Pasticceria() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto p) {
        prodotti.add(p);
    }

    public void rimuoviProdotto(Prodotto p) {
        prodotti.remove(p);
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public static void main(String[] args) {
    	
    	//TEST PRODOTTI E CLIENTI
        Pasticceria pasticceria = new Pasticceria();

        Prodotto prod1 = new Prodotto("Torta cioccolato", 20f, new ArrayList<String>(List.of("Cioccolato", "Farina")), "Torta al cioccolato", 10);
        System.out.println(prod1);

        pasticceria.aggiungiProdotto(prod1);
        System.out.println(pasticceria.getProdotti());

        Cliente cliente1 = new Cliente("Valerio", "Cicco", "Via Pia, 21");
        System.out.println(cliente1);
        cliente1.aggiungiAlCarrello(prod1, 8);

        System.out.println(cliente1.getCarrello());

        cliente1.effettuaOrdine(pasticceria.getProdotti());

        System.out.println(cliente1.getCarrello());

        System.out.println(pasticceria.getProdotti());
        
        //TEST DIPENDENTI E MANAGER
        //CREAZIONE DIPENDENTI
        ArrayList<Dipendente> dipendenti = new ArrayList<>();
        
        Date dataNascitaDipendente1 = new Date(40, 0, 1);
        Date dataAssunzioneDipendente1 = new Date(95, 2, 12);
        Date dataNascitaDipendente2 = new Date(41, 1, 2);
        Date dataAssunzioneDipendente2 = new Date(96, 5, 17);
        Date dataNascitaDipendente3 = new Date(42, 2, 13);
        Date dataAssunzioneDipendente3 = new Date(97, 6, 21);
        
        Dipendente dipendente1 = new Dipendente("Mario", "Rossi", dataNascitaDipendente1 , dataAssunzioneDipendente1, "Pasticciere");
        Dipendente dipendente2 = new Dipendente("Luca", "Bianchi", dataNascitaDipendente2, dataAssunzioneDipendente2, "Cassiere");
        Dipendente dipendente3 = new Dipendente("Giovanni", "Verdi", dataNascitaDipendente3, dataAssunzioneDipendente3, "Pasticciere");
        dipendenti.add(dipendente1);
        dipendenti.add(dipendente2);
        dipendenti.add(dipendente3);
        
        //CREAZIONE MANAGER 
        Date dataNascitaManager = new Date(50, 5, 15);
        Date dataAssunzioneManager = new Date(90, 5, 15);
        
        Manager manager = new Manager("Luigi", "Verdi", dataNascitaManager, dataAssunzioneManager, "Manager");
        manager.setDipendenti(dipendenti);
        manager.stampaDipendenti();
        
        
        
    }
}
