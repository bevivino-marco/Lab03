package it.polito.tdp.spellchecker.model;

import java.io.*;
import java.security.InvalidParameterException;
import java.util.*;

public class Dictionary {
	//private static final String String = null;
	private List <RichWord> dizionario;
	//private List <String> parole;
	//private List <RichWord> lp;
	RichWord rW ;
	
	
	public Dictionary() {
		
		dizionario = new LinkedList <RichWord>();
		//parole = new LinkedList <String>();
		//lp = new LinkedList <RichWord>();
	}


	public void loadDictionary(String dizionarioFile) {
		dizionario.clear();
		try { FileReader fr = new FileReader ( "rsc/dicionarioFile");
		      BufferedReader br = new BufferedReader (fr);
		      String word ;
		      while ((word = br.readLine())!=null) {
		    	  //dizionario.add(word);
		    	  rW = new RichWord(word);
		    	  dizionario.add(rW);
		    	  
		      }
		      br.close();
			
		}catch(Exception e){
			System.out.println("errore nella lettura del file");
		}
		
	}
	/*public List <String> creaParole (String txt) {
		txt.replaceAll("[.,\\/#!$%\\*;:{}=\\-_`~()\\[\\]\"]", "");
		StringTokenizer st = new StringTokenizer(txt, " ");
	    if (!st.hasMoreElements()) {
	    	throw new InvalidParameterException ("inserire una frase");
	    }
	    String p = " ";
	    while (p!=null) {
	    	p = st.nextToken();
	    	RichWord w = new RichWord (p);
	    	lp.add(w);
	    	parole.add(w.getParola());
	    	
	    }
	    return parole;
		
	}*/
	
	
	public List <RichWord> spellCheckText(List <String> listaW){
		List <RichWord> paroleErrate = new LinkedList <RichWord>();
		RichWord w;

		for (String p : listaW) {
			w = new RichWord (p);
			if (!dizionario.contains(w)) {
				paroleErrate.add(w);
			}
		}
		return paroleErrate;
	
	}
	public String getParoleErrate (List <RichWord> paroleErrate) {
		String stringa = "";
		for (RichWord w : paroleErrate) {
			stringa+= w.getParola()+"\n";
			
		}
		return stringa;
	}


	/*public List<String> getDizionario() {
		return dizionario;
	}


	public void setDizionario(List<String> dizionario) {
		this.dizionario = dizionario;
	}


	public List<RichWord> getLp() {
		return lp;
	}


	public void setLp(List<RichWord> lp) {
		this.lp = lp;
	}*/

	
	

}
