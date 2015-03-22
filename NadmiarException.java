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
public class NadmiarException extends DzialanieException {

    /**
     * Creates a new instance of <code>NadmiarException</code> without detail
     * message.
     */
    public NadmiarException() {
    }

    /**
     * Constructs an instance of <code>NadmiarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NadmiarException(String msg) {
        super(msg);
    }
}
