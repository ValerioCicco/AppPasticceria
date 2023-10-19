package Entities;

import java.util.ArrayList;
import java.util.List;

import gestione.SistemaPrenotazioni;

public class Cliente {
	private String nome;
	private String cognome;
	private String indirizzo;
	private ArrayList<String> carrello;
	
	public Cliente(String nome, String cognome, String indirizzo, ArrayList<String> carrello) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.carrello = carrello;
	}
	
	public Cliente(String nome, String cognome, String indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.carrello = new ArrayList<String>();
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<String> getCarrello() {
		return carrello;
	}

	public void setCarrello(ArrayList<String> carrello) {
		this.carrello = carrello;
	}

	public void aggiungiAlCarrello(Prodotto p, int qtaAcquistata) {
        carrello.add(p.getNome() + ":" + qtaAcquistata);
    }

    public void effettuaOrdine(ArrayList<Prodotto> prodotti) {
        // se carrello vuoto ?
        if (carrello.isEmpty())
            System.out.println("Il carrello è vuoto!");
        else {
            for (String nomeQta : carrello) {
                String[] array = nomeQta.split(":");
                String nome = array[0];
                int qtaAcquistata = Integer.parseInt(array[1]);
                System.out.println(qtaAcquistata);

                for (Prodotto p : prodotti) {
                    if (nome.equals(p.getNome())) {
                        System.out.println(p.getQtaDisponibile());
                        if (p.getQtaDisponibile() - qtaAcquistata >= 0) {
                            p.vendi(qtaAcquistata);
                            System.out.println("Acquisto avvenuto con successo!");
                        }
                    }
                }
            }
        }
        // altrimenti lo liberiamo

        carrello.clear();
    }
    
    public void prenotaProdotto(Prodotto p, int qtaPrenotata, SistemaPrenotazioni s) {
    	//CHECK DA FARE SUL SISTEMA PRENOTAZIONI
    	String nomeProdotto = p.getNome();
    	String prodQta = p.getNome() + ":" + qtaPrenotata;
    }
    
    public String toString() {
		return "Cliente: " +
				"Nome: " + nome + " - " +
				"Cognome: " + cognome + " - " +
				"Indirizzo: " + indirizzo + " - " +
				"Carrello: " + carrello;
	}
}
