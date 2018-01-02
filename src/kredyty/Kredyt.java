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
public class Kredyt {

    double kwota;
    int grupaRyzyka;
    int wiek;
    int iloscMiesiecy;
    Typy typ;
    
    public Kredyt(double kwota, int grupaRyzyka, int wiek, int iloscMiesiecy, Typy typ){
        this.kwota=kwota;
        this.grupaRyzyka=grupaRyzyka;
        this.wiek=wiek;
        this.iloscMiesiecy=iloscMiesiecy;
        this.typ=typ;
    }
    
    public Kredyt(int a, Typy t, int b, int c){
        this.iloscMiesiecy=a;
        this.typ=t;
        this.kwota=b;
        this.grupaRyzyka=c;
        this.wiek=0;
    } 
    public Kredyt(int a, Typy t, int c){
        this(a,c,0,0,t);
    }
 
    public Kredyt(int a, Typy t){
        this(0,0,0,a,t);
    }
    
    int liczOprocentowanie()
    {
        if(typ == Typy.CHWILOWKA)
            return (int) (kwota*2-grupaRyzyka*0.3/wiek-iloscMiesiecy);
        else if(typ==Typy.HIPOTECZNY)
            return (int) (kwota*2-grupaRyzyka*0.6/wiek+iloscMiesiecy);
        else
           return (int) (kwota*5-grupaRyzyka*0.1/wiek-iloscMiesiecy);
                
    }
}
