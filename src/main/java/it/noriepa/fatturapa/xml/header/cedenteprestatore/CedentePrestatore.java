package it.noriepa.fatturapa.xml.header.cedenteprestatore;

import it.noriepa.fatturapa.jaxb.CedentePrestatoreType;

import java.util.Optional;

public class CedentePrestatore {

    private DatiAnagrafici datiAnagrafici;
    private Sede sede;
    private Optional<StabileOrganizzazione> stabileOrganizzazione;
    private Optional<IscrizioneREA> iscrizioneREA;
    private Optional<Contatti> contatti;
    private Optional<String> riferimentoAmministrazione;

    public CedentePrestatore(DatiAnagrafici datiAnagrafici, Sede sede) {
        this.datiAnagrafici = datiAnagrafici;
        this.sede = sede;
    }

    public CedentePrestatore(DatiAnagrafici datiAnagrafici, Sede sede, Optional<StabileOrganizzazione> stabileOrganizzazione, Optional<IscrizioneREA> iscrizioneREA, Optional<Contatti> contatti, Optional<String> riferimentoAmministrazione) {
        this.datiAnagrafici = datiAnagrafici;
        this.sede = sede;
        this.stabileOrganizzazione = stabileOrganizzazione;
        this.iscrizioneREA = iscrizioneREA;
        this.contatti = contatti;
        this.riferimentoAmministrazione = riferimentoAmministrazione;
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

    public Optional<IscrizioneREA> getIscrizioneREA() {
        return iscrizioneREA;
    }

    public void setIscrizioneREA(Optional<IscrizioneREA> iscrizioneREA) {
        this.iscrizioneREA = iscrizioneREA;
    }

    public Optional<Contatti> getContatti() {
        return contatti;
    }

    public void setContatti(Optional<Contatti> contatti) {
        this.contatti = contatti;
    }

    public CedentePrestatoreType creaCedentePrestatore(){
        CedentePrestatoreType cedentePrestatoreType = new CedentePrestatoreType();
        cedentePrestatoreType.setDatiAnagrafici(datiAnagrafici.creaDatiAnagrafici());
        cedentePrestatoreType.setSede(sede.creaSede());
        if(Optional.ofNullable(stabileOrganizzazione).isPresent()) {
            cedentePrestatoreType.setStabileOrganizzazione(stabileOrganizzazione.get().creaStabileOrganizzazione());
        }
        if(Optional.ofNullable(iscrizioneREA).isPresent()) {
            cedentePrestatoreType.setIscrizioneREA(iscrizioneREA.get().creaIscrizioneREA());
        }
        if(Optional.ofNullable(contatti).isPresent()) {
            cedentePrestatoreType.setContatti(contatti.get().creaContatti());
        }
        if(Optional.ofNullable(riferimentoAmministrazione).isPresent()) {
            cedentePrestatoreType.setRiferimentoAmministrazione(riferimentoAmministrazione.get());
        }
        return cedentePrestatoreType;
    }
}
