/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pkacz_000
 */
public class Szyferka {

    public long str_long;
    public Szyferka(long str_long) {
        this.str_long=str_long;
    }
    public Szyferka(String str_long) throws FormatException{
        char[] allowed = new char[]{' ', '.', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Boolean isAllowed = false;

        char char_t;
        for (int i = str_long.length() - 1; i > -1; i--) {
            char_t = str_long.charAt(i);

            for (int j = 0; j < allowed.length; j++) {
                if (char_t == allowed[j]) {
                    isAllowed = true;
                }
            }
            if (!isAllowed) {
                throw new FormatException("dsada");
            } 

            if (char_t == ' ') {
                char_t = '0';
            }
            else if (char_t == '.') {
                char_t = '1';
            }
            else if (char_t == 'A' || char_t == 'B' || char_t == 'C') {
                char_t = '2';
            }
            else if (char_t == 'D' || char_t == 'E' || char_t == 'F') {
                char_t = '3';
            }
            else if (char_t == 'G' || char_t == 'H' || char_t == 'I') {
                char_t = '4';
            }
            else if (char_t == 'J' || char_t == 'K' || char_t == 'L') {
                char_t = '5';
            }
            else if (char_t == 'M' || char_t == 'N' || char_t == 'O') {
                char_t = '6';
            }
            else if (char_t == 'P' || char_t == 'Q' || char_t == 'R' || char_t == 'S') {
                char_t = '7';
            }
            else if (char_t == 'T' || char_t == 'U' || char_t == 'V') {
                char_t = '8';
            }
            else if (char_t == 'W' || char_t == 'X' || char_t == 'Y' || char_t == 'Z') {
                char_t = '9';
            }
            this.str_long += (char_t - '0') * Math.pow(10, Math.abs(i - str_long.length() + 1));
        }
    }

    @Override
    public String toString() {
        String temp = Long.toString(str_long);
        String wynik = "";
        char char_t;

        for (int i = 0; i < temp.length(); i++) {
            char_t = temp.charAt(i);
            if (char_t == '0') {
                wynik += ' ';
            }
            if (char_t == '1') {
                wynik += '.';
            }
            if (char_t == '2') {
                wynik += 'A';
            }
            if (char_t == '3') {
                wynik += 'D';
            }
            if (char_t == '4') {
                wynik += 'G';
            }
            if (char_t == '5') {
                wynik += 'J';
            }
            if (char_t == '6') {
                wynik += 'M';
            }
            if (char_t == '7') {
                wynik += 'P';
            }
            if (char_t == '8') {
                wynik += 'T';
            }
            if (char_t == '9') {
                wynik += 'Z';
            }

            //this.str_long += (char_t-'0') * Math.pow(10, Math.abs(i-str_long.length()+1));
        }

        return wynik; //To change body of generated methods, choose Tools | Templates.
    }
    public Szyferka dodaj(Szyferka arg) throws DzialanieException, NadmiarException{
        long temp=str_long+arg.str_long;
        if(temp>10000000) throw new NadmiarException("nadmiar, str_long wieksze od 10^7");
        return new Szyferka(temp);
        
    }
    public Szyferka odejmij(Szyferka arg) throws DzialanieException, NadmiarException{
        long temp=str_long-arg.str_long;
        if(temp<0) throw new NiedomiarException("niedomiar, str_long mniejsze od 0");
        return new Szyferka(temp);
    }
    public Szyferka dodaj(String arg) throws FormatException, DzialanieException, NadmiarException {
        try {
            Szyferka szyf_temp = new Szyferka(arg);
            return dodaj(szyf_temp);
        } catch (FormatException e) {
            return this;
        } catch (NadmiarException e) {
            return new Szyferka(10000000);
        }

    }
    public Szyferka odejmij(String arg) throws FormatException,DzialanieException, NadmiarException{
        try {
            Szyferka szyf_temp = new Szyferka(arg);
            return odejmij(szyf_temp);
        } catch (FormatException e) {
            return this;
        } catch (NiedomiarException e) {
            return new Szyferka(0);
        }

    }
    
    
    
    
    public long getWartosc() {
        return str_long;
    }

    public static void main(String[] args) throws DzialanieException{
        Szyferka s = new Szyferka("ABC. D");
        long x = s.getWartosc(); // pod x podstawiona zostanie warto´s´c 222103
        System.out.println(x);
        String a;
        a = s.toString();
        System.out.println(a);
    }

}
