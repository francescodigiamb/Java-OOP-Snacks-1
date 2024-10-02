package org.lessons.java.snack;

public class Studente {
	
	private String nome;
	private String cognome;
	private int età;


	Studente (String nome, String cognome, int età) {
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
	}
	
	String getNomeCognomeEtà () {
		String conc =  this.nome + " " + this.cognome + ", " + this.età + " anni";
		return conc;
	
	}
}
