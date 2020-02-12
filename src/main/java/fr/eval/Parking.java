package fr.eval;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Parking
 */
public class Parking {

    private int maxPlace;
    private ArrayList<String> véhiculeAutorisé = new ArrayList<String>(); // ArrayList car on va devoir parcourir rapidement la liste
    private LinkedList<String> véhiculeStationné = new LinkedList<String>(); // LinkedList car la liste va beaucoup changer

    public Parking(){
        véhiculeAutorisé.clear(); 
        véhiculeStationné.clear();
    }

    public void ajouterImmatriculationAutorisé(String immatriculation){

        véhiculeAutorisé.add(immatriculation); // On ajoute dans la liste la plaque passé en param
    }
    
}