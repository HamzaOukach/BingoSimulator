
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamza
 */
public class LesJoueurs {
    private ArrayList<Joueur> lstJ;
    
    public LesJoueurs() {
        lstJ = new ArrayList<Joueur>();
    }
    
    public Joueur getJoueur(int i) {
        if (i >= 0 && i < lstJ.size()) {
            return lstJ.get(i);
        }
        else {
            return null;
        }
    }
    
    public int getNbJoueur() {
        return lstJ.size();
    }
    
    public void ajouteJoueur(Joueur j) {
        lstJ.add(j);
    }
    
    public void supprimeJoueur(Joueur j) {
        lstJ.remove(j);
    }
    
   public Joueur rechJoueur(String ps) {
    for(int i = 0; i < lstJ.size(); i++) {
        if(lstJ.get(i).getPseudo().equals(ps)) {
            return lstJ.get(i);
        }
    }
    return null;
}

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Joueur j : lstJ) {
            sb.append(j.toString()).append("\n");
        }
        return sb.toString();
    }
}

