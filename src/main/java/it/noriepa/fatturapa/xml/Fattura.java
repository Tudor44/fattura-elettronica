package it.noriepa.fatturapa.xml;

import it.noriepa.fatturapa.jaxb.FatturaElettronicaType;
import it.noriepa.fatturapa.jaxb.FormatoTrasmissioneType;
import it.noriepa.fatturapa.xml.body.FatturaElettronicaBody;
import it.noriepa.fatturapa.xml.header.FatturaElettronicaHeader;
import it.noriepa.fatturapa.xml.signature.Signature;

import java.util.Optional;

public class Fattura {

    private FatturaElettronicaHeader fatturaElettronicaHeader;
    private FatturaElettronicaBody fatturaElettronicaBody;
    private String versione;
    private Optional<Signature> signature;
    private Optional<String> sistemaEmittente;

    public Fattura(){}

    public Fattura(FatturaElettronicaHeader fatturaElettronicaHeader, FatturaElettronicaBody fatturaElettronicaBody, String versione, Optional<Signature> signature, Optional<String> sistemaEmittente) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
        this.fatturaElettronicaBody = fatturaElettronicaBody;
        this.versione = versione;
        this.signature = signature;
        this.sistemaEmittente = sistemaEmittente;
    }

    public Fattura(FatturaElettronicaHeader fatturaElettronicaHeader, FatturaElettronicaBody fatturaElettronicaBody, String versione) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
        this.fatturaElettronicaBody = fatturaElettronicaBody;
        this.versione = versione;
    }

    public FatturaElettronicaHeader getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    public void setFatturaElettronicaHeader(FatturaElettronicaHeader fatturaElettronicaHeader) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
    }

    public FatturaElettronicaBody getFatturaElettronicaBody() {
        return fatturaElettronicaBody;
    }

    public void setFatturaElettronicaBody(FatturaElettronicaBody fatturaElettronicaBody) {
        this.fatturaElettronicaBody = fatturaElettronicaBody;
    }

    public Optional<Signature> getSignature() {
        return signature;
    }

    public void setSignature(Optional<Signature> signature) {
        this.signature = signature;
    }

    public Optional<String> getSistemaEmittente() {
        return sistemaEmittente;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public void setSistemaEmittente(Optional<String> sistemaEmittente) {
        this.sistemaEmittente = sistemaEmittente;
    }

    public FatturaElettronicaType creaFatturaElettronica(){
        FatturaElettronicaType fatturaElettronicaType = new FatturaElettronicaType();
        fatturaElettronicaType.setFatturaElettronicaHeader(fatturaElettronicaHeader.creaFatturaElettronicaHeader());
        fatturaElettronicaType.getFatturaElettronicaBody().add(fatturaElettronicaBody.creaFatturaElettronicaBody());
        fatturaElettronicaType.setVersione(FormatoTrasmissioneType.fromValue(versione));
        /*if(Optional.ofNullable(signature).isPresent()) {
            fatturaElettronicaType.setSignature(signature.get().);
        }*/
        if(Optional.ofNullable(sistemaEmittente).isPresent()) {
            fatturaElettronicaType.setSistemaEmittente(sistemaEmittente.get());
        }
        return fatturaElettronicaType;
    }
}
