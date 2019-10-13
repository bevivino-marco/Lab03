package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {
	private Dictionary model;
	private List <String> InputTxtList;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> boxLingua;

    @FXML
    private TextArea txtPhrase;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtWrongWords;

    @FXML
    private Label lblError;

    @FXML
    private Button btcClear;

    @FXML
    private Label lblPerformance;
	private List <String> listaW;

    @FXML
    void doClearText(ActionEvent event) {
    	txtPhrase.clear();
    	txtWrongWords.clear();
    	//model.Reset();

    }

    @FXML
    void doSelect(ActionEvent event) {
    	if ((boxLingua.getValue()!=null)) {
    		txtWrongWords.clear();
    		txtPhrase.clear();
    	}else {
    		txtPhrase.appendText("selezionare una lingua !\n");
    	}

    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	listaW = new LinkedList <String>();
    	if (boxLingua.getValue()==null) {
    		txtPhrase.appendText("selezionare una lingua !\n");
    	}
    	if (txtPhrase.getText() == null) {
    		txtPhrase.appendText("scrivere una frase da tradurre !\n");
    	}
    	String stringa = txtPhrase.getText();
    	stringa.replaceAll("[.,\\/#!$%\\*;:{}=\\-_`~()\\[\\]\"]", "");
    	stringa.replaceAll("\n"," ");
		StringTokenizer st = new StringTokenizer(stringa, " ");
	    if (!st.hasMoreElements()) {
	    	throw new InvalidParameterException ("inserire una frase");
	    }
	    while (st.hasMoreTokens()) {
	    	listaW.add(st.nextToken());
	    }
	    model.spellCheckText(listaW);
	    model.getParoleErrate(model.spellCheckText(listaW));
	    

    }

    @FXML
    void initialize() {
        assert boxLingua != null : "fx:id=\"boxLingua\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtPhrase != null : "fx:id=\"txtPhrase\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtWrongWords != null : "fx:id=\"txtWrongWords\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btcClear != null : "fx:id=\"btcClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblPerformance != null : "fx:id=\"lblPerformance\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }


		public void setModel(Dictionary model) {
			// TODO Auto-generated method stub
			boxLingua.getItems().addAll("English", "Italian");
			this.model= model;
			
		}
	}

	

