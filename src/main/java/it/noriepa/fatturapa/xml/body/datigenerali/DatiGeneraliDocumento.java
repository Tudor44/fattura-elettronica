package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.Art73Type;
import it.noriepa.fatturapa.jaxb.DatiGeneraliDocumentoType;
import it.noriepa.fatturapa.jaxb.TipoDocumentoType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class DatiGeneraliDocumento {

    private String tipoDocumento;
    private String divisa;
    private XMLGregorianCalendar data;
    private String numero;
    private Optional<List<DatiRitenuta>> datiRitenuta;
    private Optional<DatiBollo> datiBollo;
    private Optional<List<DatiCassaPrevidenziale>> datiCassaPrevidenziale;
    private Optional<List<ScontoMaggiorazione>> scontoMaggiorazione;
    private Optional<BigDecimal> importoTotaleDocumento;
    private Optional<BigDecimal> arrotondamento;
    private Optional<List<String>> causale;
    private Optional<String> art73;

    public DatiGeneraliDocumento(){}

    public DatiGeneraliDocumento(String tipoDocumento, String divisa, XMLGregorianCalendar data, String numero, Optional<List<DatiRitenuta>> datiRitenuta, Optional<DatiBollo> datiBollo, Optional<List<DatiCassaPrevidenziale>> datiCassaPrevidenziale, Optional<List<ScontoMaggiorazione>> scontoMaggiorazione, Optional<BigDecimal> importoTotaleDocumento, Optional<BigDecimal> arrotondamento, Optional<List<String>> causale, Optional<String> art73) {
        this.tipoDocumento = tipoDocumento;
        this.divisa = divisa;
        this.data = data;
        this.numero = numero;
        this.datiRitenuta = datiRitenuta;
        this.datiBollo = datiBollo;
        this.datiCassaPrevidenziale = datiCassaPrevidenziale;
        this.scontoMaggiorazione = scontoMaggiorazione;
        this.importoTotaleDocumento = importoTotaleDocumento;
        this.arrotondamento = arrotondamento;
        this.causale = causale;
        this.art73 = art73;
    }

    public DatiGeneraliDocumento(String tipoDocumento, String divisa, XMLGregorianCalendar data, String numero) {
        this.tipoDocumento = tipoDocumento;
        this.divisa = divisa;
        this.data = data;
        this.numero = numero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public XMLGregorianCalendar getData() {
        return data;
    }

    public void setData(XMLGregorianCalendar data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Optional<List<DatiRitenuta>> getDatiRitenuta() {
        return datiRitenuta;
    }

    public void setDatiRitenuta(Optional<List<DatiRitenuta>> datiRitenuta) {
        this.datiRitenuta = datiRitenuta;
    }

    public Optional<DatiBollo> getDatiBollo() {
        return datiBollo;
    }

    public void setDatiBollo(Optional<DatiBollo> datiBollo) {
        this.datiBollo = datiBollo;
    }

    public Optional<List<DatiCassaPrevidenziale>> getDatiCassaPrevidenziale() {
        return datiCassaPrevidenziale;
    }

    public void setDatiCassaPrevidenziale(Optional<List<DatiCassaPrevidenziale>> datiCassaPrevidenziale) {
        this.datiCassaPrevidenziale = datiCassaPrevidenziale;
    }

    public Optional<List<ScontoMaggiorazione>> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    public void setScontoMaggiorazione(Optional<List<ScontoMaggiorazione>> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public Optional<BigDecimal> getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    public void setImportoTotaleDocumento(Optional<BigDecimal> importoTotaleDocumento) {
        this.importoTotaleDocumento = importoTotaleDocumento;
    }

    public Optional<BigDecimal> getArrotondamento() {
        return arrotondamento;
    }

    public void setArrotondamento(Optional<BigDecimal> arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public Optional<List<String>> getCausale() {
        return causale;
    }

    public void setCausale(Optional<List<String>> causale) {
        this.causale = causale;
    }

    public Optional<String> getArt73() {
        return art73;
    }

    public void setArt73(Optional<String> art73) {
        this.art73 = art73;
    }

    public DatiGeneraliDocumentoType creaDatiGeneraliDocumento(){
        DatiGeneraliDocumentoType datiGeneraliDocumentoType = new DatiGeneraliDocumentoType();
        datiGeneraliDocumentoType.setTipoDocumento(TipoDocumentoType.fromValue(tipoDocumento));
        datiGeneraliDocumentoType.setData(data);
        datiGeneraliDocumentoType.setDivisa(divisa);
        datiGeneraliDocumentoType.setNumero(numero);
        if(Optional.ofNullable(datiRitenuta).isPresent()){
            for(DatiRitenuta dato : datiRitenuta.get())
                 datiGeneraliDocumentoType.getDatiRitenuta().add(dato.creaDatiRitenuta());
        }
        if(Optional.ofNullable(datiBollo).isPresent()){
                datiGeneraliDocumentoType.setDatiBollo(datiBollo.get().creaDatiBollo());
        }
        if(Optional.ofNullable(datiCassaPrevidenziale).isPresent()){
            for(DatiCassaPrevidenziale dato : datiCassaPrevidenziale.get())
                datiGeneraliDocumentoType.getDatiCassaPrevidenziale().add(dato.creaDatiCassaPrevidenziale());
        }
        if(Optional.ofNullable(scontoMaggiorazione).isPresent()){
            for(ScontoMaggiorazione sm : scontoMaggiorazione.get())
                datiGeneraliDocumentoType.getScontoMaggiorazione().add(sm.creaScontoMaggiorazione());
        }
        if(Optional.ofNullable(importoTotaleDocumento).isPresent()){
                datiGeneraliDocumentoType.setImportoTotaleDocumento(importoTotaleDocumento.get());
        }
        if(Optional.ofNullable(arrotondamento).isPresent()){
            datiGeneraliDocumentoType.setArrotondamento(arrotondamento.get());
        }
        if(Optional.ofNullable(causale).isPresent()){
            for(String c : causale.get())
                datiGeneraliDocumentoType.getCausale().add(c);
        }
        if(Optional.ofNullable(art73).isPresent()){
            datiGeneraliDocumentoType.setArt73(Art73Type.fromValue(art73.get()));
        }
        return datiGeneraliDocumentoType;
    }
}
