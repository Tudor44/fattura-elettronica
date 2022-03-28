package it.noriepa.fatturapa.xml.header.cessionariocommittente;

import it.noriepa.fatturapa.jaxb.RappresentanteFiscaleCessionarioType;

import java.util.Optional;

public class RappresentanteFiscale {

    private IdFiscaleIVA idFiscaleIVA;
    private Optional<String> denominazione;
    private Optional<String> nome;
    private Optional<String> cognome;

    public RappresentanteFiscale(){}

    public RappresentanteFiscale(IdFiscaleIVA idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public RappresentanteFiscale(IdFiscaleIVA idFiscaleIVA, Optional<String> denominazione, Optional<String> nome, Optional<String> cognome) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.denominazione = denominazione;
        this.nome = nome;
        this.cognome = cognome;
    }

    public IdFiscaleIVA getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleIVA idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public Optional<String> getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(Optional<String> denominazione) {
        this.denominazione = denominazione;
    }

    public Optional<String> getNome() {
        return nome;
    }

    public void setNome(Optional<String> nome) {
        this.nome = nome;
    }

    public Optional<String> getCognome() {
        return cognome;
    }

    public void setCognome(Optional<String> cognome) {
        this.cognome = cognome;
    }

    public RappresentanteFiscaleCessionarioType creaRappresentanteFiscaleCessionario(){
        RappresentanteFiscaleCessionarioType rappresentanteFiscaleCessionarioType = new RappresentanteFiscaleCessionarioType();
        rappresentanteFiscaleCessionarioType.setIdFiscaleIVA(idFiscaleIVA.creaIdFiscaleIVA());
        if(Optional.ofNullable(denominazione).isPresent()) {
            rappresentanteFiscaleCessionarioType.setDenominazione(denominazione.get());
        }
        if(Optional.ofNullable(nome).isPresent()) {
            rappresentanteFiscaleCessionarioType.setNome(nome.get());
        }
        if(Optional.ofNullable(cognome).isPresent()) {
            rappresentanteFiscaleCessionarioType.setCognome(cognome.get());
        }
        return rappresentanteFiscaleCessionarioType;

    }
}
