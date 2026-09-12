/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Hamza et Zakaria
 */
public class Joueur {
  


    private String pseudo;
    private Color couleur;
    private double solde;
    private ImageIcon photo;

    public String getPseudo() { return this.pseudo;  }
    public Color getCouleur() { return this.couleur; }
    public double getSolde() { return this.solde; }
    public ImageIcon getPhoto() { return this.photo;}
      
    public void setPseudo(String p) { this.pseudo=p; }
    public void setCouleur(Color c) { this.couleur = c; }
    public void setPhoto(ImageIcon p) { this.photo = p; }
    public void setSolde(double s) { this.solde = s; }
  
   public Joueur() {
        this.pseudo = "";
        this.couleur=Color.gray;
        this.solde = 20;
        this.photo = new ImageIcon(getClass().getResource("/joueurDefaut.png")); 
    }
   
   public Joueur(String p) {
        this.pseudo = p;
        this.couleur=Color.gray;
        this.solde = 20;
        this.photo = new ImageIcon(getClass().getResource("/joueurDefaut.png"));
    }
   
    @Override
    public String toString() {
        String res= "\nJoueur " + this.pseudo;
        res+= "\nCouleur " + this.couleur;
        res+= "\nSolde " + this.solde;
        return res;
    }  
}

    

