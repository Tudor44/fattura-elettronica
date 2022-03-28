package it.noriepa.fatturapa.xml.header.cessionariocommittente;

import it.noriepa.fatturapa.jaxb.CessionarioCommittenteType;


import java.util.Optional;

public class CessionarioCommittente {

    private DatiAnagrafici datiAnagrafici;
    private Sede sede;
    private Optional<StabileOrganizzazione> stabileOrganizzazione;
    private Optional<RappresentanteFiscale> rappresentanteFiscale;

    public CessionarioCommittente(){}

    public CessionarioCommittente(DatiAnagrafici datiAnagrafici, Sede sede) {
        this.datiAnagrafici = datiAnagrafici;
        this.sede = sede;
    }

    public CessionarioCommittente(DatiAnagrafici datiAnagrafici, Sede sede, Optional<StabileOrganizzazione> stabileOrganizzazione, Optional<RappresentanteFiscale> rappresentanteFiscale) {
        this.datiAnagrafici = datiAnagrafici;
        this.sede = sede;
        this.stabileOrganizzazione = stabileOrganizzazione;
        this.rappresentanteFiscale = rappresentanteFiscale;
    }


    public DatiAnagrafici getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Optional<StabileOrganizzazione> getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    public void setStabileOrganizzazione(Optional<StabileOrganizzazione> stabileOrganizzazione) {
        this.stabileOrganizzazione = stabileOrganizzazione;
    }

    public Optional<RappresentanteFiscale> getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    public void setRappresentanteFiscale(Optional<RappresentanteFiscale> rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

    public CessionarioCommittenteType creaCessionarioCommittente(){
        CessionarioCommittenteType cessionarioCommittenteType = new CessionarioCommittenteType();
        cessionarioCommittenteType.setDatiAnagrafici(datiAnagrafici.creaDatiAnagraficiCessionario());
        cessionarioCommittenteType.setSede(sede.creaSede());
        if(Optional.ofNullable(stabileOrganizzazione).isPresent()) {
            cessionarioCommittenteType.setStabileOrganizzazione(stabileOrganizzazione.get().creaStabileOrganizzazione());
        }
        if(Optional.ofNullable(rappresentanteFiscale).isPresent()) {
            cessionarioCommittenteType.setRappresentanteFiscale(rappresentanteFiscale.get().creaRappresentanteFiscaleCessionario());
        }
        return cessionarioCommittenteType;
    }
}
