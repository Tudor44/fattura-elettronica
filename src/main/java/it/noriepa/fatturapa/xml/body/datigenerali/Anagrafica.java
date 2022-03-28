package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.AnagraficaType;

import java.util.Optional;

public class Anagrafica {

    private Optional<String> denominazione;
    private Optional<String> nome;
    private Optional<String> cognome;
    private Optional<String> titolo;
    private Optional<String> codEORI;

    public Anagrafica(){}

    public Anagrafica(Optional<String> denominazione, Optional<String> nome, Optional<String> cognome, Optional<String> titolo, Optional<String> codEORI) {
        this.denominazione = denominazione;
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = titolo;
        this.codEORI = codEORI;
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

    public Optional<String> getTitolo() {
        return titolo;
    }

    public void setTitolo(Optional<String> titolo) {
        this.titolo = titolo;
    }

    public Optional<String> getCodEORI() {
        return codEORI;
    }

    public void setCodEORI(Optional<String> codEORI) {
        this.codEORI = codEORI;
    }

    public AnagraficaType creaAnagrafica(){
        AnagraficaType anagraficaType = new AnagraficaType();
        if(Optional.ofNullable(denominazione).isPresent()) {
            anagraficaType.setDenominazione(denominazione.get());
        }
        if(Optional.ofNullable(nome).isPresent()) {
            anagraficaType.setNome(nome.get());
        }
        if(Optional.ofNullable(cognome).isPresent()) {
            anagraficaType.setCognome(cognome.get());
        }
        if(Optional.ofNullable(titolo).isPresent()) {
            anagraficaType.setTitolo(titolo.get());
        }
        if(Optional.ofNullable(codEORI).isPresent()) {
            anagraficaType.setCodEORI(codEORI.get());
        }
        return anagraficaType;

    }
}
