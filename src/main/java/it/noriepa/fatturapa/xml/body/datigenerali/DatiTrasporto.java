package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiTrasportoType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Optional;

public class DatiTrasporto {

    private Optional<DatiAnagraficiVettore> datiAnagraficiVettore;
    private Optional<String> mezzoTrasporto;
    private Optional<String> causaleTraporto;
    private Optional<Integer> numeroColli;
    private Optional<String> descrizione;
    private Optional<String> unitaMisuraPeso;
    private Optional<BigDecimal> pesoLordo;
    private Optional<BigDecimal> pesoNetto;
    private Optional<XMLGregorianCalendar> dataOraRitiro;
    private Optional<XMLGregorianCalendar> dataInizioTrasporto;
    private Optional<String> tipoResa;
    private Optional<IndirizzoResa> indirizzoResa;
    private Optional<XMLGregorianCalendar> dataOraConsegna;

    public DatiTrasporto(){}

    public DatiTrasporto(Optional<DatiAnagraficiVettore> datiAnagraficiVettore, Optional<String> mezzoTrasporto, Optional<String> causaleTraporto, Optional<Integer> numeroColli, Optional<String> descrizione, Optional<String> unitaMisuraPeso, Optional<BigDecimal> pesoLordo, Optional<BigDecimal> pesoNetto, Optional<XMLGregorianCalendar> dataOraRitiro, Optional<XMLGregorianCalendar> dataInizioTrasporto, Optional<String> tipoResa, Optional<IndirizzoResa> indirizzoResa, Optional<XMLGregorianCalendar> dataOraConsegna) {
        this.datiAnagraficiVettore = datiAnagraficiVettore;
        this.mezzoTrasporto = mezzoTrasporto;
        this.causaleTraporto = causaleTraporto;
        this.numeroColli = numeroColli;
        this.descrizione = descrizione;
        this.unitaMisuraPeso = unitaMisuraPeso;
        this.pesoLordo = pesoLordo;
        this.pesoNetto = pesoNetto;
        this.dataOraRitiro = dataOraRitiro;
        this.dataInizioTrasporto = dataInizioTrasporto;
        this.tipoResa = tipoResa;
        this.indirizzoResa = indirizzoResa;
        this.dataOraConsegna = dataOraConsegna;
    }

    public Optional<DatiAnagraficiVettore> getDatiAnagraficiVettore() {
        return datiAnagraficiVettore;
    }

    public void setDatiAnagraficiVettore(Optional<DatiAnagraficiVettore> datiAnagraficiVettore) {
        this.datiAnagraficiVettore = datiAnagraficiVettore;
    }

    public Optional<String> getMezzoTrasporto() {
        return mezzoTrasporto;
    }

    public void setMezzoTrasporto(Optional<String> mezzoTrasporto) {
        this.mezzoTrasporto = mezzoTrasporto;
    }

    public Optional<String> getCausaleTraporto() {
        return causaleTraporto;
    }

    public void setCausaleTraporto(Optional<String> causaleTraporto) {
        this.causaleTraporto = causaleTraporto;
    }

    public Optional<Integer> getNumeroColli() {
        return numeroColli;
    }

    public void setNumeroColli(Optional<Integer> numeroColli) {
        this.numeroColli = numeroColli;
    }

    public Optional<String> getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(Optional<String> descrizione) {
        this.descrizione = descrizione;
    }

    public Optional<String> getUnitaMisuraPeso() {
        return unitaMisuraPeso;
    }

    public void setUnitaMisuraPeso(Optional<String> unitaMisuraPeso) {
        this.unitaMisuraPeso = unitaMisuraPeso;
    }

    public Optional<BigDecimal> getPesoLordo() {
        return pesoLordo;
    }

    public void setPesoLordo(Optional<BigDecimal> pesoLordo) {
        this.pesoLordo = pesoLordo;
    }

    public Optional<BigDecimal> getPesoNetto() {
        return pesoNetto;
    }

    public void setPesoNetto(Optional<BigDecimal> pesoNetto) {
        this.pesoNetto = pesoNetto;
    }

    public Optional<XMLGregorianCalendar> getDataOraRitiro() {
        return dataOraRitiro;
    }

    public void setDataOraRitiro(Optional<XMLGregorianCalendar> dataOraRitiro) {
        this.dataOraRitiro = dataOraRitiro;
    }

    public Optional<XMLGregorianCalendar> getDataInizioTrasporto() {
        return dataInizioTrasporto;
    }

    public void setDataInizioTrasporto(Optional<XMLGregorianCalendar> dataInizioTrasporto) {
        this.dataInizioTrasporto = dataInizioTrasporto;
    }

    public Optional<String> getTipoResa() {
        return tipoResa;
    }

    public void setTipoResa(Optional<String> tipoResa) {
        this.tipoResa = tipoResa;
    }

    public Optional<IndirizzoResa> getIndirizzoResa() {
        return indirizzoResa;
    }

    public void setIndirizzoResa(Optional<IndirizzoResa> indirizzoResa) {
        this.indirizzoResa = indirizzoResa;
    }

    public Optional<XMLGregorianCalendar> getDataOraConsegna() {
        return dataOraConsegna;
    }

    public void setDataOraConsegna(Optional<XMLGregorianCalendar> dataOraConsegna) {
        this.dataOraConsegna = dataOraConsegna;
    }

    public DatiTrasportoType creaDatiTrasporto(){
        DatiTrasportoType datiTrasportoType = new DatiTrasportoType();
        if(Optional.ofNullable(datiAnagraficiVettore).isPresent()){
            datiTrasportoType.setDatiAnagraficiVettore(datiAnagraficiVettore.get().creaDatiAnagraficiVettore());
        }
        if(Optional.ofNullable(mezzoTrasporto).isPresent()){
            datiTrasportoType.setMezzoTrasporto(mezzoTrasporto.get());
        }
        if(Optional.ofNullable(causaleTraporto).isPresent()){
            datiTrasportoType.setCausaleTrasporto(causaleTraporto.get());
        }
        if(Optional.ofNullable(numeroColli).isPresent()){
            datiTrasportoType.setNumeroColli(numeroColli.get());
        }
        if(Optional.ofNullable(descrizione).isPresent()){
            datiTrasportoType.setDescrizione(descrizione.get());
        }
        if(Optional.ofNullable(pesoLordo).isPresent()){
            datiTrasportoType.setPesoLordo(pesoLordo.get());
        }
        if(Optional.ofNullable(pesoNetto).isPresent()){
            datiTrasportoType.setPesoNetto(pesoNetto.get());
        }
        if(Optional.ofNullable(dataOraRitiro).isPresent()){
            datiTrasportoType.setDataOraRitiro(dataOraRitiro.get());
        }
        if(Optional.ofNullable(dataInizioTrasporto).isPresent()){
            datiTrasportoType.setDataInizioTrasporto(dataInizioTrasporto.get());
        }
        if(Optional.ofNullable(tipoResa).isPresent()){
            datiTrasportoType.setTipoResa(tipoResa.get());
        }
        if(Optional.ofNullable(dataOraConsegna).isPresent()){
            datiTrasportoType.setDataOraConsegna(dataOraConsegna.get());
        }
        return datiTrasportoType;
    }
}
