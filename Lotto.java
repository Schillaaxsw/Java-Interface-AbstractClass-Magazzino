/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

/**
 *
 * @author schillaci.gabriel
 */
public class Lotto implements NFCLeggibile {

    private int fornitore;
    private int prodotto;
    private int quantita;
    private int metriQuadri;

    public int getPrezzo() {
        int Prezzo = 0;
        return Prezzo;
    }

    @Override
    public int getld() {
        return 0;
     
    }

    @Override
    public int getPosizione() {
        return 0;
       
    }

}
