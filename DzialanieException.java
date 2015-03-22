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
public class DzialanieException extends Exception {

    /**
     * Creates a new instance of <code>DzialanieExeption</code> without detail
     * message.
     */
    public DzialanieException() {
    }

    /**
     * Constructs an instance of <code>DzialanieExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DzialanieException(String msg) {
        super(msg);
    }
}
