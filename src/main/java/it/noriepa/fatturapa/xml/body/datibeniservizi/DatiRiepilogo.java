package it.noriepa.fatturapa.xml.body.datibeniservizi;

import it.noriepa.fatturapa.jaxb.DatiRiepilogoType;
import it.noriepa.fatturapa.jaxb.EsigibilitaIVAType;
import it.noriepa.fatturapa.jaxb.NaturaType;

import java.math.BigDecimal;
import java.util.Optional;

public class DatiRiepilogo {

    private BigDecimal aliquotaIVA;
    private Optional<String> natura;
    private Optional<BigDecimal> speseAccessorie;
    private Optional<BigDecimal> arrotondamento;
    private BigDecimal imponibileImporto;
    private BigDecimal imposta;
    private Optional<String> esigibilitaIVA;
    private Optional<String> riferimentoNormativo;

    public DatiRiepilogo(){}

    public DatiRiepilogo(BigDecimal aliquotaIVA, BigDecimal imponibileImporto, BigDecimal imposta) {
        this.aliquotaIVA = aliquotaIVA;
        this.imponibileImporto = imponibileImporto;
        this.imposta = imposta;
    }

    public DatiRiepilogo(BigDecimal aliquotaIVA, Optional<String> natura, Optional<BigDecimal> speseAccessorie, Optional<BigDecimal> arrotondamento, BigDecimal imponibileImporto, BigDecimal imposta, Optional<String> esigibilitaIVA, Optional<String> riferimentoNormativo) {
        this.aliquotaIVA = aliquotaIVA;
        this.natura = natura;
        this.speseAccessorie = speseAccessorie;
        this.arrotondamento = arrotondamento;
        this.imponibileImporto = imponibileImporto;
        this.imposta = imposta;
        this.esigibilitaIVA = esigibilitaIVA;
        this.riferimentoNormativo = riferimentoNormativo;
    }

    public BigDecimal getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(BigDecimal aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public Optional<String> getNatura() {
        return natura;
    }

    public void setNatura(Optional<String> natura) {
        this.natura = natura;
    }

    public Optional<BigDecimal> getSpeseAccessorie() {
        return speseAccessorie;
    }

    public void setSpeseAccessorie(Optional<BigDecimal> speseAccessorie) {
        this.speseAccessorie = speseAccessorie;
    }

    public Optional<BigDecimal> getArrotondamento() {
        return arrotondamento;
    }

    public void setArrotondamento(Optional<BigDecimal> arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public BigDecimal getImponibileImporto() {
        return imponibileImporto;
    }

    public void setImponibileImporto(BigDecimal imponibileImporto) {
        this.imponibileImporto = imponibileImporto;
    }

    public BigDecimal getImposta() {
        return imposta;
    }

    public void setImposta(BigDecimal imposta) {
        this.imposta = imposta;
    }

    public Optional<String> getEsigibilitaIVA() {
        return esigibilitaIVA;
    }

    public void setEsigibilitaIVA(Optional<String> esigibilitaIVA) {
        this.esigibilitaIVA = esigibilitaIVA;
    }

    public Optional<String> getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    public void setRiferimentoNormativo(Optional<String> riferimentoNormativo) {
        this.riferimentoNormativo = riferimentoNormativo;
    }

    public DatiRiepilogoType creaDatiRiepilogo(){
        DatiRiepilogoType datiRiepilogoType = new DatiRiepilogoType();
        datiRiepilogoType.setAliquotaIVA(aliquotaIVA);
        datiRiepilogoType.setImposta(imposta);
        datiRiepilogoType.setImponibileImporto(imponibileImporto);
        if(Optional.ofNullable(natura).isPresent()) {
            datiRiepilogoType.setNatura(NaturaType.fromValue(natura.get()));
        }
        if(Optional.ofNullable(speseAccessorie).isPresent()) {
            datiRiepilogoType.setSpeseAccessorie(speseAccessorie.get());
        }
        if(Optional.ofNullable(arrotondamento).isPresent()) {
            datiRiepilogoType.setArrotondamento(arrotondamento.get());
        }
        if(Optional.ofNullable(esigibilitaIVA).isPresent()) {
            datiRiepilogoType.setEsigibilitaIVA(EsigibilitaIVAType.fromValue(esigibilitaIVA.get()));
        }
        if(Optional.ofNullable(riferimentoNormativo).isPresent()) {
            datiRiepilogoType.setRiferimentoNormativo(riferimentoNormativo.get());
        }
        return datiRiepilogoType;
    }
}
