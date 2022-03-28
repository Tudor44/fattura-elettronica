package it.noriepa.fatturapa.xml.body.datipagamento;

import it.noriepa.fatturapa.jaxb.DettaglioPagamentoType;
import it.noriepa.fatturapa.jaxb.ModalitaPagamentoType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Optional;

public class DettaglioPagamento {

    private String beneficiario;
    private Optional<String> modalitaPagamento;
    private Optional<XMLGregorianCalendar> dataRiferimentoTerminiPagamento;
    private Optional<Integer> giorniTerminiPagamento;
    private Optional<XMLGregorianCalendar> dataScadenzaPagamento;
    private BigDecimal importoPagamento;
    private Optional<String> codUfficioPostale;
    private Optional<String> cognomeQuietanzante;
    private Optional<String> nomeQuietanzante;
    private Optional<String> cfQuietanzante;
    private Optional<String> titoloQuietanzante;
    private Optional<String> isititutoFinanziario;
    private Optional<String> iban;
    private Optional<String> abi;
    private Optional<String> cab;
    private Optional<String> bic;
    private Optional<BigDecimal> scontoPagamentoAnticipato;
    private Optional<XMLGregorianCalendar> dataLimitePagamentoAnticipato;
    private Optional<BigDecimal> penalitaPagamentiRitardati;
    private Optional<XMLGregorianCalendar> dataDecorrenzaPenale;
    private Optional<String> codicePagamento;

    public DettaglioPagamento(){}

    public DettaglioPagamento(String beneficiario, BigDecimal importoPagamento) {
        this.beneficiario = beneficiario;
        this.importoPagamento = importoPagamento;
    }

    public DettaglioPagamento(String beneficiario, Optional<String> modalitaPagamento, Optional<XMLGregorianCalendar> dataRiferimentoTerminiPagamento, Optional<Integer> giorniTerminiPagamento, Optional<XMLGregorianCalendar> dataScadenzaPagamento, BigDecimal importoPagamento, Optional<String> codUfficioPostale, Optional<String> cognomeQuietanzante, Optional<String> nomeQuietanzante, Optional<String> cfQuietanzante, Optional<String> titoloQuietanzante, Optional<String> isititutoFinanziario, Optional<String> iban, Optional<String> abi, Optional<String> cab, Optional<String> bic, Optional<BigDecimal> scontoPagamentoAnticipato, Optional<XMLGregorianCalendar> dataLimitePagamentoAnticipato, Optional<BigDecimal> penalitaPagamentiRitardati, Optional<XMLGregorianCalendar> dataDecorrenzaPenale, Optional<String> codicePagamento) {
        this.beneficiario = beneficiario;
        this.modalitaPagamento = modalitaPagamento;
        this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
        this.giorniTerminiPagamento = giorniTerminiPagamento;
        this.dataScadenzaPagamento = dataScadenzaPagamento;
        this.importoPagamento = importoPagamento;
        this.codUfficioPostale = codUfficioPostale;
        this.cognomeQuietanzante = cognomeQuietanzante;
        this.nomeQuietanzante = nomeQuietanzante;
        this.cfQuietanzante = cfQuietanzante;
        this.titoloQuietanzante = titoloQuietanzante;
        this.isititutoFinanziario = isititutoFinanziario;
        this.iban = iban;
        this.abi = abi;
        this.cab = cab;
        this.bic = bic;
        this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
        this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
        this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
        this.dataDecorrenzaPenale = dataDecorrenzaPenale;
        this.codicePagamento = codicePagamento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Optional<String> getModalitaPagamento() {
        return modalitaPagamento;
    }

    public void setModalitaPagamento(Optional<String> modalitaPagamento) {
        this.modalitaPagamento = modalitaPagamento;
    }

    public Optional<XMLGregorianCalendar> getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    public void setDataRiferimentoTerminiPagamento(Optional<XMLGregorianCalendar> dataRiferimentoTerminiPagamento) {
        this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
    }

    public Optional<Integer> getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    public void setGiorniTerminiPagamento(Optional<Integer> giorniTerminiPagamento) {
        this.giorniTerminiPagamento = giorniTerminiPagamento;
    }

    public Optional<XMLGregorianCalendar> getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    public void setDataScadenzaPagamento(Optional<XMLGregorianCalendar> dataScadenzaPagamento) {
        this.dataScadenzaPagamento = dataScadenzaPagamento;
    }

    public BigDecimal getImportoPagamento() {
        return importoPagamento;
    }

    public void setImportoPagamento(BigDecimal importoPagamento) {
        this.importoPagamento = importoPagamento;
    }

    public Optional<String> getCodUfficioPostale() {
        return codUfficioPostale;
    }

    public void setCodUfficioPostale(Optional<String> codUfficioPostale) {
        this.codUfficioPostale = codUfficioPostale;
    }

    public Optional<String> getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    public void setCognomeQuietanzante(Optional<String> cognomeQuietanzante) {
        this.cognomeQuietanzante = cognomeQuietanzante;
    }

    public Optional<String> getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    public void setNomeQuietanzante(Optional<String> nomeQuietanzante) {
        this.nomeQuietanzante = nomeQuietanzante;
    }

    public Optional<String> getCfQuietanzante() {
        return cfQuietanzante;
    }

    public void setCfQuietanzante(Optional<String> cfQuietanzante) {
        this.cfQuietanzante = cfQuietanzante;
    }

    public Optional<String> getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    public void setTitoloQuietanzante(Optional<String> titoloQuietanzante) {
        this.titoloQuietanzante = titoloQuietanzante;
    }

    public Optional<String> getIsititutoFinanziario() {
        return isititutoFinanziario;
    }

    public void setIsititutoFinanziario(Optional<String> isititutoFinanziario) {
        this.isititutoFinanziario = isititutoFinanziario;
    }

    public Optional<String> getIban() {
        return iban;
    }

    public void setIban(Optional<String> iban) {
        this.iban = iban;
    }

    public Optional<String> getAbi() {
        return abi;
    }

    public void setAbi(Optional<String> abi) {
        this.abi = abi;
    }

    public Optional<String> getCab() {
        return cab;
    }

    public void setCab(Optional<String> cab) {
        this.cab = cab;
    }

    public Optional<String> getBic() {
        return bic;
    }

    public void setBic(Optional<String> bic) {
        this.bic = bic;
    }

    public Optional<BigDecimal> getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    public void setScontoPagamentoAnticipato(Optional<BigDecimal> scontoPagamentoAnticipato) {
        this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
    }

    public Optional<XMLGregorianCalendar> getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    public void setDataLimitePagamentoAnticipato(Optional<XMLGregorianCalendar> dataLimitePagamentoAnticipato) {
        this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
    }

    public Optional<BigDecimal> getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    public void setPenalitaPagamentiRitardati(Optional<BigDecimal> penalitaPagamentiRitardati) {
        this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
    }

    public Optional<XMLGregorianCalendar> getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    public void setDataDecorrenzaPenale(Optional<XMLGregorianCalendar> dataDecorrenzaPenale) {
        this.dataDecorrenzaPenale = dataDecorrenzaPenale;
    }

    public Optional<String> getCodicePagamento() {
        return codicePagamento;
    }

    public void setCodicePagamento(Optional<String> codicePagamento) {
        this.codicePagamento = codicePagamento;
    }

    public DettaglioPagamentoType creaDettaglioPagamento(){
        DettaglioPagamentoType dettaglioPagamentoType = new DettaglioPagamentoType();
        dettaglioPagamentoType.setBeneficiario(beneficiario);
        dettaglioPagamentoType.setImportoPagamento(importoPagamento);
        if(Optional.ofNullable(modalitaPagamento).isPresent()) {
            dettaglioPagamentoType.setModalitaPagamento(ModalitaPagamentoType.fromValue(modalitaPagamento.get()));
        }
        if(Optional.ofNullable(dataRiferimentoTerminiPagamento).isPresent()) {
            dettaglioPagamentoType.setDataRiferimentoTerminiPagamento(dataRiferimentoTerminiPagamento.get());
        }
        if(Optional.ofNullable(giorniTerminiPagamento).isPresent()) {
            dettaglioPagamentoType.setGiorniTerminiPagamento(giorniTerminiPagamento.get());
        }
        if(Optional.ofNullable(dataScadenzaPagamento).isPresent()) {
            dettaglioPagamentoType.setDataScadenzaPagamento(dataScadenzaPagamento.get());
        }
        if(Optional.ofNullable(codUfficioPostale).isPresent()) {
            dettaglioPagamentoType.setCodUfficioPostale(codUfficioPostale.get());
        }
        if(Optional.ofNullable(cognomeQuietanzante).isPresent()) {
            dettaglioPagamentoType.setCognomeQuietanzante(cognomeQuietanzante.get());
        }
        if(Optional.ofNullable(nomeQuietanzante).isPresent()) {
            dettaglioPagamentoType.setNomeQuietanzante(nomeQuietanzante.get());
        }
        if(Optional.ofNullable(cfQuietanzante).isPresent()) {
            dettaglioPagamentoType.setCFQuietanzante(cfQuietanzante.get());
        }
        if(Optional.ofNullable(titoloQuietanzante).isPresent()) {
            dettaglioPagamentoType.setTitoloQuietanzante(titoloQuietanzante.get());
        }
        if(Optional.ofNullable(isititutoFinanziario).isPresent()) {
            dettaglioPagamentoType.setIstitutoFinanziario(isititutoFinanziario.get());
        }
        if(Optional.ofNullable(iban).isPresent()) {
            dettaglioPagamentoType.setIBAN(iban.get());
        }
        if(Optional.ofNullable(abi).isPresent()) {
            dettaglioPagamentoType.setABI(abi.get());
        }
        if(Optional.ofNullable(cab).isPresent()) {
            dettaglioPagamentoType.setCAB(cab.get());
        }
        if(Optional.ofNullable(bic).isPresent()) {
            dettaglioPagamentoType.setBIC(bic.get());
        }
        if(Optional.ofNullable(scontoPagamentoAnticipato).isPresent()) {
            dettaglioPagamentoType.setScontoPagamentoAnticipato(scontoPagamentoAnticipato.get());
        }
        if(Optional.ofNullable(dataLimitePagamentoAnticipato).isPresent()) {
            dettaglioPagamentoType.setDataLimitePagamentoAnticipato(dataLimitePagamentoAnticipato.get());
        }
        if(Optional.ofNullable(penalitaPagamentiRitardati).isPresent()) {
            dettaglioPagamentoType.setPenalitaPagamentiRitardati(penalitaPagamentiRitardati.get());
        }
        if(Optional.ofNullable(dataDecorrenzaPenale).isPresent()) {
            dettaglioPagamentoType.setDataDecorrenzaPenale(dataDecorrenzaPenale.get());
        }
        if(Optional.ofNullable(codicePagamento).isPresent()) {
            dettaglioPagamentoType.setCodicePagamento(codicePagamento.get());
        }
        return dettaglioPagamentoType;
    }
}
