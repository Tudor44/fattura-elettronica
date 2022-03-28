package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiSALType;

public class DatiSAL {

    private Integer riferimentoFase;

    public DatiSAL(){}

    public Integer getRiferimentoFase() {
        return riferimentoFase;
    }

    public void setRiferimentoFase(Integer riferimentoFase) {
        this.riferimentoFase = riferimentoFase;
    }

    public DatiSALType creaDatiSAL(){
        DatiSALType datiSALType = new DatiSALType();
        datiSALType.setRiferimentoFase(riferimentoFase);
        return datiSALType;
    }
}
