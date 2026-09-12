/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamza et Zakaria
 */
public class CarteLoto {
    
 private int tab[ ] [ ];
 private int jetons[ ] [ ];
 private int nbCol;
 private int nbLig;
 private int nbNumeros;
 private double prix;
 private final int valMax=90;
 

 public CarteLoto( )
 { this.nbNumeros=10;
 this.nbCol = 5;
 this.nbLig=3;
 this.tab = new int[nbLig][nbCol];
 this.jetons = new int[nbLig][nbCol];
 this.prix=5;
 initValeursCarte( ) ;
 }
 public CarteLoto(int nbc, int nbVal)
 { this. nbNumeros =nbVal;
 this.nbCol = nbc;
 this.nbLig=3;
 this.tab = new int[nbLig][nbCol];
 this.jetons = new int[nbLig][nbCol];
 this.prix=5;
 initValeursCarte();
}
 private boolean estdans(int n) {
    for (int i = 0; i < this.nbLig; i++) {
        for (int j = 0; j < this.nbCol; j++) {
            if (this.tab[i][j] == n) {
                return true;
            }
        }
    }
    return false;
}


 public double getPrix() { return this.prix; }
 public double getnbNumeros() { return this.nbNumeros; }
 public double getnbCol() { return this.nbCol; }
 public double getnbLig() { return this.nbLig; }
 
    public int[][] getTab() {
        int[][] copy = new int[this.nbLig][this.nbCol];
        for (int i = 0; i < this.nbLig; i++) {
            for (int j = 0; j < this.nbCol; j++) {
                copy[i][j] = this.tab[i][j];
            }
        }
        return copy;
    }
 
 
 @Override
 public String toString( )
 { String res="";
 for(int i=0; i<this.nbLig; i++)
 {for(int j=0; j<this.nbCol; j++)
 res+=" "+tab[i][j];
 res+="\n";
 }
 return res;
 }
private void initValeursCarte() {
    int i,j,k,n;
    for(i = 0; i < this.nbLig; i++)
        for(j = 0; j < this.nbCol; j++) {
            this.tab[i][j] = 0;
            this.jetons[i][j] = 0;
        }
    i=0;
    for( k = 0; k < this.nbNumeros; k++) {
        do {
            j = (int)(Math.random() * this.nbCol);
        } while(this.tab[i][j] != 0);
  
    do {
        n = (int) (Math.random() * this.valMax + 1);
    } while (estdans(n));
    this.tab[i][j] = n;
        if(i == this.nbLig - 1) i = 0;
        else i++;
    }
}


}
    

