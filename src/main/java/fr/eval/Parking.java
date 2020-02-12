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
        maxPlace = 200;
    }

    public void ajouterImmatriculationAutorisé(String immatriculation){

        if (véhiculeAutorisé.contains(immatriculation)){
            System.out.println("Ce véhicule est déjà autorisé");
        }
        else{
            véhiculeAutorisé.add(immatriculation); // On ajoute dans la liste la plaque passé en param
            System.out.println("Votre plaque a bien été ajouté");
        }
        
    }

    public boolean nouveauStationnement(String immatriculation) {
        boolean isSuccess;
        // On vérifie qu'il reste de la place sur le parking
        if (véhiculeStationné.size() <= maxPlace){
            // On vérifie que le véhicule est bien autorisé à stationner
            if (véhiculeAutorisé.contains(immatriculation)){
                // On ajoute le véhicule sur le parking
                véhiculeStationné.add(immatriculation); 

                isSuccess = true;
            }
            else{
                isSuccess = false;
            }
        }
        else{
            isSuccess = false;
        }

        return isSuccess;
    }
    
    public boolean sortieStationnement(String immatriculation) {
        boolean isSuccess;
        // On vérifie que le véhicule était bien enregistré sur le parking
        if (véhiculeStationné.contains(immatriculation)){
            // On retire la plaque pour signifier le départ du véhicule
            véhiculeStationné.remove(immatriculation);

            isSuccess = true;
        }
        else{
            System.out.println("Le véhicule n'était pas enregistré sur le parking");

            isSuccess = false;
        }
        return isSuccess ;
    }

    public boolean présenceVéhicule(String immatriculation) {
        boolean present;
        // On vérifie si le véhicule est présent sur le parking
        if (véhiculeStationné.contains(immatriculation)){
            present = true;
        }
        else{
            present = false;
        }

        return present;
    }

    public boolean parkingComplet() {
        boolean complet;

        if (véhiculeStationné.size() >= maxPlace) {
            complet = true;
        }
        else{
            complet = false;
        }

        return complet;
    }

    public int nbVéhiculeStationné() {
        int nbVéhicule;
        nbVéhicule = véhiculeStationné.size();

        return nbVéhicule;
    }

    public LinkedList<String> getVéhiculeStationnés() {
        return véhiculeStationné;
    }

    public void afficherVéhiculeStationnés() {
        System.out.println(véhiculeStationné);
    }

    public ArrayList<String> getVéhiculeAutorisé() {
        return véhiculeAutorisé;
    }

    public void afficherVéhiculeAutorisé(){
        System.out.println(véhiculeAutorisé);
    }

    public float getTauxRemplissageParking() {
        float tauxRemplissage = 0;
        // Calcul du poucentage de remplissage du parking
        tauxRemplissage = véhiculeStationné.size() * 100 / maxPlace;

        return tauxRemplissage;
    }

    public void afficherTauxRemplissage() {
        // Cette methode appelle la précédente et affiche le résultat en console
        System.out.println(getTauxRemplissageParking());
    }
}