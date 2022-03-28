package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.BolloVirtualeType;
import it.noriepa.fatturapa.jaxb.DatiBolloType;

import java.math.BigDecimal;
import java.util.Optional;

public class DatiBollo {

    private String bolloVirtuale;
    private Optional<BigDecimal> importoBollo;

    public DatiBollo(){}

    public DatiBollo(String bolloVirtuale) {
        this.bolloVirtuale = bolloVirtuale;
    }
    public DatiBollo(String bolloVirtuale, Optional<BigDecimal> importoBollo) {
        this.bolloVirtuale = bolloVirtuale;
        this.importoBollo = importoBollo;
    }

    public String getBolloVirtuale() {
        return bolloVirtuale;
    }

    public void setDatiBollo(String bolloVirtuale) {
        this.bolloVirtuale = bolloVirtuale;
    }

    public Optional<BigDecimal> getImportoBollo() {
        return importoBollo;
    }

    public void setImportoBollo(Optional<BigDecimal> importoBollo) {
        this.importoBollo = importoBollo;
    }

    public DatiBolloType creaDatiBollo(){
        DatiBolloType datiBollo = new DatiBolloType();
        datiBollo.setBolloVirtuale(BolloVirtualeType.fromValue(bolloVirtuale));
        if(Optional.ofNullable(importoBollo).isPresent()) {
            datiBollo.setImportoBollo(importoBollo.get());
        }
        return datiBollo;
    }
}
