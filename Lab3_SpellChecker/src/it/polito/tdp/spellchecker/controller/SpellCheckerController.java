package it.polito.tdp.spellchecker.controller;



    import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;

	public class SpellCheckerController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ComboBox<?> boxLingua;

	    @FXML
	    private Button btnCheck;

	    @FXML
	    private Label lblError;

	    @FXML
	    private Button btcClear;

	    @FXML
	    private Label lblPerformance;

	    @FXML
	    void doClearText(ActionEvent event) {

	    }

	    @FXML
	    void doSelect(ActionEvent event) {

	    }

	    @FXML
	    void doSpellCheck(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert boxLingua != null : "fx:id=\"boxLingua\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btcClear != null : "fx:id=\"btcClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert lblPerformance != null : "fx:id=\"lblPerformance\" was not injected: check your FXML file 'SpellChecker.fxml'.";

	    }
	}

	

