package it.noriepa.fatturapa.xml.body.datibeniservizi;

import it.noriepa.fatturapa.jaxb.DettaglioLineeType;
import it.noriepa.fatturapa.jaxb.NaturaType;
import it.noriepa.fatturapa.jaxb.RitenutaType;
import it.noriepa.fatturapa.jaxb.TipoCessionePrestazioneType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class DettaglioLinee {

    private Integer numeroLinea;
    private Optional<String> tipoCessionePrestazione;
    private Optional<List<CodiceArticolo>> codiceArticolo;
    private String descrizione;
    private Optional<BigDecimal> quantita;
    private Optional<String> unitaMisura;
    private Optional<XMLGregorianCalendar> dataInizioPeriodo;
    private Optional<XMLGregorianCalendar> dataFinePeriodo;
    private BigDecimal prezzoUnitario;
    private Optional<List<ScontoMaggiorazione>> scontoMaggiorazione;
    private BigDecimal prezzoTotale;
    private BigDecimal aliquotaIVA;
    private Optional<String> ritenuta;
    private Optional<String> natura;
    private Optional<String> riferimentoAmministrazione;
    private Optional<List<AltriDatiGestionali>> altriDatiGestionali;

    public DettaglioLinee(){}

    public DettaglioLinee(Integer numeroLinea, String descrizione, BigDecimal prezzoUnitario, BigDecimal prezzoTotale,  BigDecimal aliquotaIVA) {
        this.numeroLinea = numeroLinea;
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
        this.prezzoTotale = prezzoTotale;
        this.aliquotaIVA = aliquotaIVA;
    }

    public DettaglioLinee(Integer numeroLinea, Optional<String> tipoCessionePrestazione, Optional<List<CodiceArticolo>> codiceArticolo, String descrizione, Optional<BigDecimal> quantita, Optional<String> unitaMisura, Optional<XMLGregorianCalendar> dataInizioPeriodo, Optional<XMLGregorianCalendar> dataFinePeriodo, BigDecimal prezzoUnitario, Optional<List<ScontoMaggiorazione>> scontoMaggiorazione, BigDecimal prezzoTotale, BigDecimal aliquotaIVA, Optional<String> ritenuta, Optional<String> natura, Optional<String> riferimentoAmministrazione, Optional<List<AltriDatiGestionali>> altriDatiGestionali) {
        this.numeroLinea = numeroLinea;
        this.tipoCessionePrestazione = tipoCessionePrestazione;
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.unitaMisura = unitaMisura;
        this.dataInizioPeriodo = dataInizioPeriodo;
        this.dataFinePeriodo = dataFinePeriodo;
        this.prezzoUnitario = prezzoUnitario;
        this.scontoMaggiorazione = scontoMaggiorazione;
        this.prezzoTotale = prezzoTotale;
        this.aliquotaIVA = aliquotaIVA;
        this.ritenuta = ritenuta;
        this.natura = natura;
        this.riferimentoAmministrazione = riferimentoAmministrazione;
        this.altriDatiGestionali = altriDatiGestionali;
    }

    public Integer getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(Integer numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public Optional<String> getTipoCessionePrestazione() {
        return tipoCessionePrestazione;
    }

    public void setTipoCessionePrestazione(Optional<String> tipoCessionePrestazione) {
        this.tipoCessionePrestazione = tipoCessionePrestazione;
    }

    public Optional<List<CodiceArticolo>> getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(Optional<List<CodiceArticolo>> codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Optional<BigDecimal> getQuantita() {
        return quantita;
    }

    public void setQuantita(Optional<BigDecimal> quantita) {
        this.quantita = quantita;
    }

    public Optional<String> getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(Optional<String> unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public Optional<XMLGregorianCalendar> getDataInizioPeriodo() {
        return dataInizioPeriodo;
    }

    public void setDataInizioPeriodo(Optional<XMLGregorianCalendar> dataInizioPeriodo) {
        this.dataInizioPeriodo = dataInizioPeriodo;
    }

    public Optional<XMLGregorianCalendar> getDataFinePeriodo() {
        return dataFinePeriodo;
    }

    public void setDataFinePeriodo(Optional<XMLGregorianCalendar> dataFinePeriodo) {
        this.dataFinePeriodo = dataFinePeriodo;
    }

    public BigDecimal getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public Optional<List<ScontoMaggiorazione>> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    public void setScontoMaggiorazione(Optional<List<ScontoMaggiorazione>> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public BigDecimal getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(BigDecimal prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }

    public BigDecimal getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(BigDecimal aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public Optional<String> getRitenuta() {
        return ritenuta;
    }

    public void setRitenuta(Optional<String> ritenuta) {
        this.ritenuta = ritenuta;
    }

    public Optional<String> getNatura() {
        return natura;
    }

    public void setNatura(Optional<String> natura) {
        this.natura = natura;
    }

    public Optional<String> getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    public void setRiferimentoAmministrazione(Optional<String> riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

    public Optional<List<AltriDatiGestionali>> getAltriDatiGestionali() {
        return altriDatiGestionali;
    }

    public void setAltriDatiGestionali(Optional<List<AltriDatiGestionali>> altriDatiGestionali) {
        this.altriDatiGestionali = altriDatiGestionali;
    }

    public DettaglioLineeType creaDettaglioLinee(){
        DettaglioLineeType dettaglioLineeType = new DettaglioLineeType();
        dettaglioLineeType.setNumeroLinea(numeroLinea);
        dettaglioLineeType.setDescrizione(descrizione);
        dettaglioLineeType.setPrezzoTotale(prezzoTotale);
        dettaglioLineeType.setPrezzoUnitario(prezzoUnitario);
        dettaglioLineeType.setAliquotaIVA(aliquotaIVA);
        if(Optional.ofNullable(tipoCessionePrestazione).isPresent()) {
            dettaglioLineeType.setTipoCessionePrestazione(TipoCessionePrestazioneType.fromValue(tipoCessionePrestazione.get()));
        }
        if(Optional.ofNullable(codiceArticolo).isPresent()) {
            for(CodiceArticolo cd : codiceArticolo.get()) {
                dettaglioLineeType.getCodiceArticolo().add(cd.creaCodiceArticolo());
            }
        }
        if(Optional.ofNullable(quantita).isPresent()) {
            dettaglioLineeType.setQuantita(quantita.get());
        }
        if(Optional.ofNullable(unitaMisura).isPresent()) {
            dettaglioLineeType.setUnitaMisura(unitaMisura.get());
        }
        if(Optional.ofNullable(dataInizioPeriodo).isPresent()) {
            dettaglioLineeType.setDataInizioPeriodo(dataInizioPeriodo.get());
        }
        if(Optional.ofNullable(dataFinePeriodo).isPresent()) {
            dettaglioLineeType.setDataFinePeriodo(dataFinePeriodo.get());
        }
        if(Optional.ofNullable(scontoMaggiorazione).isPresent()) {
            for(ScontoMaggiorazione sm : scontoMaggiorazione.get()) {
                dettaglioLineeType.getScontoMaggiorazione().add(sm.creaScontoMaggiorazione());
            }
        }
        if(Optional.ofNullable(ritenuta).isPresent()) {
            dettaglioLineeType.setRitenuta(RitenutaType.fromValue(ritenuta.get()));
        }
        if(Optional.ofNullable(natura).isPresent()) {
            dettaglioLineeType.setNatura(NaturaType.fromValue(natura.get()));
        }
        if(Optional.ofNullable(riferimentoAmministrazione).isPresent()) {
            dettaglioLineeType.setRiferimentoAmministrazione(riferimentoAmministrazione.get());
        }
        if(Optional.ofNullable(altriDatiGestionali).isPresent()) {
            for(AltriDatiGestionali altri : altriDatiGestionali.get()) {
                dettaglioLineeType.getAltriDatiGestionali().add(altri.creaAltriDatiGestionali());
            }
        }
        return dettaglioLineeType;
    }
}
