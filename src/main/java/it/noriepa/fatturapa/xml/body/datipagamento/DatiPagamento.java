package it.noriepa.fatturapa.xml.body.datipagamento;

import it.noriepa.fatturapa.jaxb.CondizioniPagamentoType;
import it.noriepa.fatturapa.jaxb.DatiPagamentoType;

import java.util.List;

public class DatiPagamento {

    private String condizioniPagamento;
    private List<DettaglioPagamento> dettaglioPagamento;

    public DatiPagamento(){}

    public DatiPagamento(String condizioniPagamento, List<DettaglioPagamento> dettaglioPagamento) {
        this.condizioniPagamento = condizioniPagamento;
        this.dettaglioPagamento = dettaglioPagamento;
    }

    public String getCondizioniPagamento() {
        return condizioniPagamento;
    }

    public void setCondizioniPagamento(String condizioniPagamento) {
        this.condizioniPagamento = condizioniPagamento;
    }

    public List<DettaglioPagamento> getDettaglioPagamento() {
        return dettaglioPagamento;
    }

    public void setDettaglioPagamento(List<DettaglioPagamento> dettaglioPagamento) {
        this.dettaglioPagamento = dettaglioPagamento;
    }

    public DatiPagamentoType creaDatiPagamento(){
        DatiPagamentoType datiPagamentoType = new DatiPagamentoType();
        datiPagamentoType.setCondizioniPagamento(CondizioniPagamentoType.fromValue(condizioniPagamento));
        for(DettaglioPagamento dettaglio : dettaglioPagamento)
            datiPagamentoType.getDettaglioPagamento().add(dettaglio.creaDettaglioPagamento());
        return datiPagamentoType;
    }

}
