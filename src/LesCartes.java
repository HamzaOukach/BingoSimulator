
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamza et Zakaria
 */
public class LesCartes {
    private ArrayList<CarteLoto> lst;
     public LesCartes() {
        lst = new ArrayList<CarteLoto>();
    }
    public int getTaille(){
        return this.lst.size();
    }
    public CarteLoto getCarte(int i){
        return lst.get(i);
    }
    public void ajouteCarte(CarteLoto c){
        this.lst.add(c);
    }
     public void retireCarte(CarteLoto c){
        this.lst.remove(c);
    }
     public void retireCartes() {
    this.lst.clear();
}

     public void initLesCartes(int n, int nbcol, int nbval) {
    for (int i = 0; i < n; i++) {
        CarteLoto c = new CarteLoto( nbcol, nbval);
        ajouteCarte(c);
    }
}
    @Override
     public String toString() {
    String result = "";
    for (int i = 0; i < lst.size(); i++) {
        result += "Carte " + (i + 1) + ":\n" + lst.get(i).toString() + "\n";
    }
    return result;
}


    
}
