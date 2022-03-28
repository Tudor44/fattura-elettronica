package it.noriepa.fatturapa.xml.header.terzointermediarioose;

import it.noriepa.fatturapa.jaxb.TerzoIntermediarioSoggettoEmittenteType;

public class TerzoIntermediarioOSoggettoEmittente {

    private DatiAnagrafici datiAnagrafici;

    public TerzoIntermediarioOSoggettoEmittente(){}

    public TerzoIntermediarioOSoggettoEmittente(DatiAnagrafici datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public DatiAnagrafici getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public TerzoIntermediarioSoggettoEmittenteType creaTerzoIntermediarioOSoggettoEmmittente(){
        TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioSoggettoEmittenteType = new TerzoIntermediarioSoggettoEmittenteType();
        terzoIntermediarioSoggettoEmittenteType.setDatiAnagrafici(datiAnagrafici.creaDatiAnagraficiTerzoIntermediario());
        return terzoIntermediarioSoggettoEmittenteType;
    }
}
