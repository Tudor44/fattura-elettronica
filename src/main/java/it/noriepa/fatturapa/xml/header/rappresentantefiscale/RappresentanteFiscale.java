package it.noriepa.fatturapa.xml.header.rappresentantefiscale;

import it.noriepa.fatturapa.jaxb.RappresentanteFiscaleType;

public class RappresentanteFiscale {

    private DatiAnagrafici datiAnagrafici;

    public RappresentanteFiscale(){}

    public RappresentanteFiscale(DatiAnagrafici datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public DatiAnagrafici getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public RappresentanteFiscaleType creaRappresentanteFiscale(){
        RappresentanteFiscaleType rappresentanteFiscaleType = new RappresentanteFiscaleType();
        rappresentanteFiscaleType.setDatiAnagrafici(datiAnagrafici.creaDatiAnagraficiRappresentante());
        return rappresentanteFiscaleType;
    }
}
