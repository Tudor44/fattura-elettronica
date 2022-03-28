package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiCassaPrevidenzialeType;
import it.noriepa.fatturapa.jaxb.NaturaType;
import it.noriepa.fatturapa.jaxb.TipoCassaType;

import java.math.BigDecimal;
import java.util.Optional;

public class DatiCassaPrevidenziale {

    private String tipoCassa;
    private BigDecimal aliCassa;
    private BigDecimal importoContributoCassa;
    private Optional<BigDecimal> imponibileCassa;
    private BigDecimal aliquotaIVA;
    private Optional<String> ritenuta;
    private Optional<String> natura;
    private Optional<String> riferimentoAmministrazione;

    public DatiCassaPrevidenziale(){}

    public DatiCassaPrevidenziale(String tipoCassa, BigDecimal aliCassa, BigDecimal importoContributoCassa, BigDecimal aliquotaIVA) {
        this.tipoCassa = tipoCassa;
        this.aliCassa = aliCassa;
        this.importoContributoCassa = importoContributoCassa;
        this.aliquotaIVA = aliquotaIVA;
    }

    public DatiCassaPrevidenziale(String tipoCassa, BigDecimal aliCassa, BigDecimal importoContributoCassa, Optional<BigDecimal> imponibileCassa, BigDecimal aliquotaIVA, Optional<String> ritenuta, Optional<String> natura, Optional<String> riferimentoAmministrazione) {
        this.tipoCassa = tipoCassa;
        this.aliCassa = aliCassa;
        this.importoContributoCassa = importoContributoCassa;
        this.imponibileCassa = imponibileCassa;
        this.aliquotaIVA = aliquotaIVA;
        this.ritenuta = ritenuta;
        this.natura = natura;
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

    public String getTipoCassa() {
        return tipoCassa;
    }

    public void setTipoCassa(String tipoCassa) {
        this.tipoCassa = tipoCassa;
    }

    public BigDecimal getAliCassa() {
        return aliCassa;
    }

    public void setAliCassa(BigDecimal aliCassa) {
        this.aliCassa = aliCassa;
    }

    public BigDecimal getImportoContributoCassa() {
        return importoContributoCassa;
    }

    public void setImportoContributoCassa(BigDecimal importoContributoCassa) {
        this.importoContributoCassa = importoContributoCassa;
    }

    public Optional<BigDecimal> getImponibileCassa() {
        return imponibileCassa;
    }

    public void setImponibileCassa(Optional<BigDecimal> imponibileCassa) {
        this.imponibileCassa = imponibileCassa;
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

    public DatiCassaPrevidenzialeType creaDatiCassaPrevidenziale(){
        DatiCassaPrevidenzialeType datiCassaPrevidenzialeType = new DatiCassaPrevidenzialeType();
        datiCassaPrevidenzialeType.setTipoCassa(TipoCassaType.fromValue(tipoCassa));
        datiCassaPrevidenzialeType.setAlCassa(aliCassa);
        datiCassaPrevidenzialeType.setImportoContributoCassa(importoContributoCassa);
        if(Optional.ofNullable(imponibileCassa).isPresent()) {
            datiCassaPrevidenzialeType.setImponibileCassa(imponibileCassa.get());
        }
        if(Optional.ofNullable(natura).isPresent()) {
            datiCassaPrevidenzialeType.setNatura(NaturaType.valueOf(natura.get()));
        }
        if(Optional.ofNullable(riferimentoAmministrazione).isPresent()) {
            datiCassaPrevidenzialeType.setRiferimentoAmministrazione(riferimentoAmministrazione.get());
        }
        return datiCassaPrevidenzialeType;
    }
}
