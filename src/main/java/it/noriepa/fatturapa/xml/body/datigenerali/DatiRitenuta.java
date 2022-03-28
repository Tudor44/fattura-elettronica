package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.CausalePagamentoType;
import it.noriepa.fatturapa.jaxb.DatiRitenutaType;
import it.noriepa.fatturapa.jaxb.TipoRitenutaType;

import java.math.BigDecimal;

public class DatiRitenuta {

    private String tipoRitenuta;
    private BigDecimal importoRitenuta;
    private BigDecimal aliquotaRitenuta;
    private String casualePagamento;

    public DatiRitenuta(){}

    public DatiRitenuta(String tipoRitenuta, BigDecimal importoRitenuta, BigDecimal aliquotaRitenuta, String casualePagamento) {
        this.tipoRitenuta = tipoRitenuta;
        this.importoRitenuta = importoRitenuta;
        this.aliquotaRitenuta = aliquotaRitenuta;
        this.casualePagamento = casualePagamento;
    }

    public String getTipoRitenuta() {
        return tipoRitenuta;
    }

    public void setTipoRitenuta(String tipoRitenuta) {
        this.tipoRitenuta = tipoRitenuta;
    }

    public BigDecimal getImportoRitenuta() {
        return importoRitenuta;
    }

    public void setImportoRitenuta(BigDecimal importoRitenuta) {
        this.importoRitenuta = importoRitenuta;
    }

    public BigDecimal getAliquotaRitenuta() {
        return aliquotaRitenuta;
    }

    public void setAliquotaRitenuta(BigDecimal aliquotaRitenuta) {
        this.aliquotaRitenuta = aliquotaRitenuta;
    }

    public String getCasualePagamento() {
        return casualePagamento;
    }

    public void setCasualePagamento(String casualePagamento) {
        this.casualePagamento = casualePagamento;
    }

    public DatiRitenutaType creaDatiRitenuta(){
        DatiRitenutaType datiRitenutaType = new DatiRitenutaType();
        datiRitenutaType.setTipoRitenuta(TipoRitenutaType.fromValue(tipoRitenuta));
        datiRitenutaType.setImportoRitenuta(importoRitenuta);
        datiRitenutaType.setAliquotaRitenuta(aliquotaRitenuta);
        datiRitenutaType.setCausalePagamento(CausalePagamentoType.fromValue(casualePagamento));
        return datiRitenutaType;
    }
}
