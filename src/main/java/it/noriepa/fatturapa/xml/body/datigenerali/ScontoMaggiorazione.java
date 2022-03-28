package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.ScontoMaggiorazioneType;
import it.noriepa.fatturapa.jaxb.TipoScontoMaggiorazioneType;

import java.math.BigDecimal;
import java.util.Optional;

public class ScontoMaggiorazione {

    private String tipo;
    private Optional<BigDecimal> percentuale;
    private Optional<BigDecimal> importo;

    public ScontoMaggiorazione(){}

    public ScontoMaggiorazione(String tipo) {
        this.tipo = tipo;
    }

    public ScontoMaggiorazione(String tipo, Optional<BigDecimal> percentuale, Optional<BigDecimal> importo) {
        this.tipo = tipo;
        this.percentuale = percentuale;
        this.importo = importo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Optional<BigDecimal> getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(Optional<BigDecimal> percentuale) {
        this.percentuale = percentuale;
    }

    public Optional<BigDecimal> getImporto() {
        return importo;
    }

    public void setImporto(Optional<BigDecimal> importo) {
        this.importo = importo;
    }

    public ScontoMaggiorazioneType creaScontoMaggiorazione(){
        ScontoMaggiorazioneType scontoMaggiorazioneType = new ScontoMaggiorazioneType();
        scontoMaggiorazioneType.setTipo(TipoScontoMaggiorazioneType.fromValue(tipo));
        if(Optional.ofNullable(percentuale).isPresent()){
            scontoMaggiorazioneType.setPercentuale(percentuale.get());
        }
        if(Optional.ofNullable(importo).isPresent()){
            scontoMaggiorazioneType.setPercentuale(importo.get());
        }
        return scontoMaggiorazioneType;
    }
}
