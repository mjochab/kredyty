/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kredyty;

/**
 *
 * @author defrag
 */
public class Kredyty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kwota = 1000;
        int grupaRyzyka = 0;
        int wiek = 30;
        int iloscMiesiecy=24;
        Typy typ = Typy.ODNAWIALNY;
        
        Kredyt kredycik = new Kredyt(kwota,grupaRyzyka,wiek,iloscMiesiecy,typ);
        Kredyt kredycik2 = new Kredyt(3,Typy.ODNAWIALNY, 1000);
        Kredyt kredycik3 = new Kredyt(3,Typy.ODNAWIALNY);
        Kredyt kredycik4 = new Kredyt(3,Typy.ODNAWIALNY,23,1000);

        
        System.out.println(kredycik.liczOprocentowanie());
        System.out.println(kredycik2.liczOprocentowanie());

    }
    
}
