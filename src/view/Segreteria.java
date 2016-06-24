package view;
import java.util.*;

import controller.Paziente;
import controller.TSegreteria;
import model.Model;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Segreteria {
	
	protected Terminal terminal;
	protected Model model;

    /**
     * Default constructor
     */
    public Segreteria(TSegreteria tipo) {
    	
    	this.tipo = tipo;
    	terminal = new Terminal(this, tipo);
    	model = new Model(terminal);
    	terminal.restart();
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private TSegreteria tipo;



    /**
     * @param paziente
     */
    public void esaminaCartella(Paziente paziente) {
        // TODO implement here
    }
    
    public Terminal getTerminal(){
    	return terminal;
    }

    /**
     * @return 
     * 
     */

    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

	public String getName() {
		// TODO Auto-generated method stub
		return "SEGRETERIA";
	}

}