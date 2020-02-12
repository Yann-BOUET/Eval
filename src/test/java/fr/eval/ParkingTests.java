package fr.eval;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ParkingTests {
    /**
     * Rigorous Test.
     */
    @Test
    public void vérificationMethodes() {
        Parking parking1 = new Parking();

        String plaqueImmatriculation = "BONJOUR";

        Parking.ajouterImmatriculationAutorisé(plaqueImmatriculation);

        boolean isSucess = Parking.nouveauStationnement(plaqueImmatriculation);

        boolean isSucess = Parking.sortieStationnement(plaqueImmatriculation);

        boolean present = Parking.présenceVéhicule(plaqueImmatriculation);

        boolean complet = Parking.parkingComplet(plaqueImmatriculation);

    }
}
