package it.noriepa.fatturapa.xml.header;

import it.noriepa.fatturapa.jaxb.FatturaElettronicaHeaderType;
import it.noriepa.fatturapa.jaxb.SoggettoEmittenteType;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.CedentePrestatore;
import it.noriepa.fatturapa.xml.header.cessionariocommittente.CessionarioCommittente;
import it.noriepa.fatturapa.xml.header.datitrasmissione.DatiTrasmissione;
import it.noriepa.fatturapa.xml.header.rappresentantefiscale.RappresentanteFiscale;
import it.noriepa.fatturapa.xml.header.terzointermediarioose.TerzoIntermediarioOSoggettoEmittente;

import java.util.Optional;

public class FatturaElettronicaHeader {

    private DatiTrasmissione datiTrasmissione;
    private CedentePrestatore cedentePrestatore;
    private CessionarioCommittente cessionarioCommittente;
    private Optional<RappresentanteFiscale> rappresentanteFiscale;
    private Optional<TerzoIntermediarioOSoggettoEmittente> terzoIntermediarioOSoggettoEmittente;
    private Optional<String> soggettoEmittente;

    public FatturaElettronicaHeader(){}

    public FatturaElettronicaHeader(DatiTrasmissione datiTrasmissione, CedentePrestatore cedentePrestatore, CessionarioCommittente cessionarioCommittente) {
        this.datiTrasmissione = datiTrasmissione;
        this.cedentePrestatore = cedentePrestatore;
        this.cessionarioCommittente = cessionarioCommittente;
    }

    public FatturaElettronicaHeader(DatiTrasmissione datiTrasmissione, CedentePrestatore cedentePrestatore, CessionarioCommittente cessionarioCommittente, Optional<RappresentanteFiscale> rappresentanteFiscale, Optional<TerzoIntermediarioOSoggettoEmittente> terzoIntermediarioOSoggettoEmittente, Optional<String> soggettoEmittente) {
        this.datiTrasmissione = datiTrasmissione;
        this.cedentePrestatore = cedentePrestatore;
        this.cessionarioCommittente = cessionarioCommittente;
        this.rappresentanteFiscale = rappresentanteFiscale;
        this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
        this.soggettoEmittente = soggettoEmittente;
    }

    public DatiTrasmissione getDatiTrasmissione() {
        return datiTrasmissione;
    }

    public void setDatiTrasmissione(DatiTrasmissione datiTrasmissione) {
        this.datiTrasmissione = datiTrasmissione;
    }

    public CedentePrestatore getCedentePrestatore() {
        return cedentePrestatore;
    }

    public void setCedentePrestatore(CedentePrestatore cedentePrestatore) {
        this.cedentePrestatore = cedentePrestatore;
    }

    public CessionarioCommittente getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    public void setCessionarioCommittente(CessionarioCommittente cessionarioCommittente) {
        this.cessionarioCommittente = cessionarioCommittente;
    }

    public Optional<RappresentanteFiscale> getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    public void setRappresentanteFiscale(Optional<RappresentanteFiscale> rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

    public Optional<TerzoIntermediarioOSoggettoEmittente> getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    public void setTerzoIntermediarioOSoggettoEmittente(Optional<TerzoIntermediarioOSoggettoEmittente> terzoIntermediarioOSoggettoEmittente) {
        this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
    }

    public Optional<String> getSoggettoEmittente() {
        return soggettoEmittente;
    }

    public void setSoggettoEmittente(Optional<String> soggettoEmittente) {
        this.soggettoEmittente = soggettoEmittente;
    }

    public FatturaElettronicaHeaderType creaFatturaElettronicaHeader(){
        FatturaElettronicaHeaderType fatturaElettronicaHeaderType = new FatturaElettronicaHeaderType();
        fatturaElettronicaHeaderType.setDatiTrasmissione(datiTrasmissione.creaDatiTrasmissione());
        fatturaElettronicaHeaderType.setCedentePrestatore(cedentePrestatore.creaCedentePrestatore());
        fatturaElettronicaHeaderType.setCessionarioCommittente(cessionarioCommittente.creaCessionarioCommittente());
        if(Optional.ofNullable(rappresentanteFiscale).isPresent()) {
            fatturaElettronicaHeaderType.setRappresentanteFiscale(rappresentanteFiscale.get().creaRappresentanteFiscale());
        }
        if(Optional.ofNullable(terzoIntermediarioOSoggettoEmittente).isPresent()) {
            fatturaElettronicaHeaderType.setTerzoIntermediarioOSoggettoEmittente(terzoIntermediarioOSoggettoEmittente.get().creaTerzoIntermediarioOSoggettoEmmittente());
        }
        if(Optional.ofNullable(soggettoEmittente).isPresent()) {
            fatturaElettronicaHeaderType.setSoggettoEmittente(SoggettoEmittenteType.valueOf(soggettoEmittente.get()));
        }
        return fatturaElettronicaHeaderType;
    }
}
