package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiAnagraficiVettoreType;

import java.util.Optional;

public class DatiAnagraficiVettore {

    private IdFiscaleIVA idFiscaleIVA;
    private Optional<String> codiceFiscale;
    private Anagrafica anagrafica;
    private Optional<String> numeroLicenzaGuida;

    public DatiAnagraficiVettore(){}

    public DatiAnagraficiVettore(IdFiscaleIVA idFiscaleIVA, Anagrafica anagrafica) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.anagrafica = anagrafica;
    }

    public DatiAnagraficiVettore(IdFiscaleIVA idFiscaleIVA, Optional<String> codiceFiscale, Anagrafica anagrafica, Optional<String> numeroLicenzaGuida) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.codiceFiscale = codiceFiscale;
        this.anagrafica = anagrafica;
        this.numeroLicenzaGuida = numeroLicenzaGuida;
    }

    public IdFiscaleIVA getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleIVA idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public Optional<String> getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(Optional<String> codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public Optional<String> getNumeroLicenzaGuida() {
        return numeroLicenzaGuida;
    }

    public void setNumeroLicenzaGuida(Optional<String> numeroLicenzaGuida) {
        this.numeroLicenzaGuida = numeroLicenzaGuida;
    }

    public DatiAnagraficiVettoreType creaDatiAnagraficiVettore(){
        DatiAnagraficiVettoreType datiAnagraficiVettoreType = new DatiAnagraficiVettoreType();
        datiAnagraficiVettoreType.setIdFiscaleIVA(idFiscaleIVA.creaIdFiscaleIVA());
        datiAnagraficiVettoreType.setAnagrafica(anagrafica.creaAnagrafica());
        if(Optional.ofNullable(codiceFiscale).isPresent()){
            datiAnagraficiVettoreType.setCodiceFiscale(codiceFiscale.get());
        }
        if(Optional.ofNullable(numeroLicenzaGuida).isPresent()){
            datiAnagraficiVettoreType.setCodiceFiscale(numeroLicenzaGuida.get());
        }
        return datiAnagraficiVettoreType;

    }
}
