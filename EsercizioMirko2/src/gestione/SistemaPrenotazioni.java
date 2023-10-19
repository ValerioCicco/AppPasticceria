package gestione;

import java.util.ArrayList;
import java.util.HashMap;

import Entities.Cliente;
import Entities.Prodotto;


public class SistemaPrenotazioni {
	// Cliente pk: ["nomeProdotto:qtaPrenotata", "nomeProdotto:qtaPrenotata"]
    private HashMap<Cliente, ArrayList<String>> clientiPrenotazioni = new HashMap<>();
    // ["nomeProdotto:qtaPrenotataTotale", ... ]
    private ArrayList<String> prodottiQta = new ArrayList<>();

    public SistemaPrenotazioni() {

    }

    public HashMap<Cliente, ArrayList<String>> getClientiPrenotazioni() {
        return clientiPrenotazioni;
    }
    public void setClientiPrenotazioni(HashMap<Cliente, ArrayList<String>> clientiPrenotazioni) {
        this.clientiPrenotazioni = clientiPrenotazioni;
    }
    public ArrayList<String> getProdottiQta() {
        return prodottiQta;
    }
    public void setProdottiQta(ArrayList<String> prodottiQta) {
        this.prodottiQta = prodottiQta;
    }
    
    public void aggiungiPrenotazioneACliente(String prodQta, Cliente c) {
    	
    	//ArrayList<String> values = clientiPrenotazioni.get(c);
    }
}