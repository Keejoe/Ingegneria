package view;

import java.util.*;

import controller.Paziente;
import controller.TOperatore;
import model.Model;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Operatore {

	protected Terminal terminal;
	protected Model model;
    /**
     * Default constructor
     */
    public Operatore(TOperatore tipo) {
    	this.tipo = tipo;
    	terminal = new Terminal(this, tipo);
    	model = new Model(terminal);
    	terminal.restart();
    	
    }

    /**
     * 
     */
    private TOperatore tipo;
    
    public Terminal getTerminal(){
    	return terminal;
    }
    
    public void esaminaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

	public String getName() {
		// TODO Auto-generated method stub
		return "OPERATORE";
	}
}