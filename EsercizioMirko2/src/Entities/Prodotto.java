package Entities;

import java.util.List;

public class Prodotto {
	private String nome;
	private float prezzo;
	private List<String> ingredienti;
	private String descrizione;
	private int qtaDisponibile;
	
	public Prodotto(String nome, float prezzo, List<String> ingredienti, String descrizione, int qtaDisponibile) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.descrizione = descrizione;
		this.qtaDisponibile = qtaDisponibile;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public List<String> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<String> ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQtaDisponibile() {
		return qtaDisponibile;
	}

	public void setQtaDisponibile(int qtaDisponibile) {
		this.qtaDisponibile = qtaDisponibile;
	}

	public void vendi(int qta) {
		if(qta <= qtaDisponibile) {
			qtaDisponibile -= qta;
			System.out.println("Sono rimaste " + qtaDisponibile);
		} else {
			System.out.println("Quantità non disponibile.");
		}
	}
	
	public String toString() {
		return "Prodotto: " +
				"Nome: " + nome + " - " +
				"Prezzo: " + prezzo + " - " +
				"Ingredienti: " + ingredienti + " - " +
				"Descrizione: " + descrizione + " - " +
				"qtaDisponibile: " + qtaDisponibile;
	}
}
