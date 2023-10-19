package Entities;

import java.util.Date;

public class Dipendente {
	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private Date dataAssunzione;
	private String ruolo;
	
	public Dipendente(String nome, String cognome, Date dataDiNascita, Date dataAssunzione, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.dataAssunzione = dataAssunzione;
		this.ruolo = ruolo;
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

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public void lavora() {
		System.out.println("Il dipendente sta lavorando come " + ruolo);
	}
}
