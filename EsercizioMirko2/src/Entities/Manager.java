package Entities;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Manager extends Dipendente {
	
	public ArrayList<Dipendente> dipendenti;

	public Manager(String nome, String cognome, Date dataDiNascita, Date dataAssunzione, String ruolo) {
		super(nome, cognome, dataDiNascita, dataAssunzione, ruolo);
	}
	
	
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}



	public void setDipendenti(ArrayList<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}



	public void assumi(Dipendente dipendente) {
		dipendenti.add(dipendente);
	}
	
	public void licenzia(Dipendente dipendente) {
		dipendenti.remove(dipendente);
	}
	
	//Utilizzo il metodo privato perché lo utilizzerò solo all'interno del toString
		private String parseDate(Date date) {   
	        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
	        String formattedDate = dateFormat.format(date);
	        return formattedDate;
		}
	
	//INFO SUI DIPENDENTI
	public void stampaDipendenti() {
		for(Dipendente d : dipendenti) {
			System.out.println("Nome dipendente: " + d.getNome());
			System.out.println("Cognome dipendente: " + d.getCognome());
			System.out.println("Data di nascita: " + parseDate(d.getDataDiNascita()));
			System.out.println("Data di assunzione: " + parseDate(d.getDataAssunzione()));
			d.lavora();
			System.out.println(" ----------------------- ");
		}
	}
}
