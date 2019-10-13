package it.polito.tdp.spellchecker.model;

public class RichWord {
	private String parola;
	

	public RichWord(String parola) {
		
		this.parola = parola;
	}
	/*public boolean isCorrect() {
		Dictionary d = new Dictionary();
		if (d.getDizionario().contains(this))
			return true;
		return false;
		
	}*/
	public String getParola() {
		return parola;
	}
	
	

}
