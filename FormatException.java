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
public class FormatException extends RuntimeException  {

    /**
     * Creates a new instance of <code>FormatException</code> without detail
     * message.
     */
    public FormatException() {
    }

    /**
     * Constructs an instance of <code>FormatException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FormatException(String msg) {
        super(msg);
    }
}
