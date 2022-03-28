package it.noriepa.fatturapa.xml.header.cessionariocommittente;

import it.noriepa.fatturapa.jaxb.IndirizzoType;

import java.util.Optional;

public class Sede {

    private String indirizzo;
    private Optional<String> numeroCivico;
    private String cap;
    private String comune;
    private Optional<String> provincia;
    private String nazione;

    public Sede(){}

    public Sede(String indirizzo, String cap, String comune, String nazione) {
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.comune = comune;
        this.nazione = nazione;
    }

    public Sede(String indirizzo, Optional<String> numeroCivico, String cap, String comune, Optional<String> provincia, String nazione) {
        this.indirizzo = indirizzo;
        this.numeroCivico = numeroCivico;
        this.cap = cap;
        this.comune = comune;
        this.provincia = provincia;
        this.nazione = nazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Optional<String> getNumeroCivico() {
        return numeroCivico;
    }

    public void setNumeroCivico(Optional<String> numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public Optional<String> getProvincia() {
        return provincia;
    }

    public void setProvincia(Optional<String> provincia) {
        this.provincia = provincia;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public IndirizzoType creaSede(){
        IndirizzoType indirizzoType = new IndirizzoType();
        if(Optional.ofNullable(numeroCivico).isPresent()) {
            indirizzoType.setNumeroCivico(numeroCivico.get());
        }
        indirizzoType.setIndirizzo(indirizzo);
        indirizzoType.setCAP(cap);
        indirizzoType.setComune(comune);
        if(Optional.ofNullable(provincia).isPresent()) {
            indirizzoType.setProvincia(provincia.get());
        }
        indirizzoType.setNazione(nazione);
        return indirizzoType;
    }
}
