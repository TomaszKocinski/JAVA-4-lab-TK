/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium4;

/**
 *
 * @author Kot
 */
public class NiedomiarException extends DzialanieException {

    /**
     * Creates a new instance of <code>NiedomiarException</code> without detail
     * message.
     */
    public NiedomiarException() {
    }

    /**
     * Constructs an instance of <code>NiedomiarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NiedomiarException(String msg) {
        super(msg);
    }
}
