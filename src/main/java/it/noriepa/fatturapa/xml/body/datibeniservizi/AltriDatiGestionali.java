package it.noriepa.fatturapa.xml.body.datibeniservizi;

import it.noriepa.fatturapa.jaxb.AltriDatiGestionaliType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Optional;

public class AltriDatiGestionali {

    private String tipoDato;
    private Optional<String> riferimentoTesto;
    private Optional<BigDecimal> riferimentoNumero;
    private Optional<XMLGregorianCalendar> riferimentoData;

    public AltriDatiGestionali(){}

    public AltriDatiGestionali(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public AltriDatiGestionali(String tipoDato, Optional<String> riferimentoTesto, Optional<BigDecimal> riferimentoNumero, Optional<XMLGregorianCalendar> riferimentoData) {
        this.tipoDato = tipoDato;
        this.riferimentoTesto = riferimentoTesto;
        this.riferimentoNumero = riferimentoNumero;
        this.riferimentoData = riferimentoData;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Optional<String> getRiferimentoTesto() {
        return riferimentoTesto;
    }

    public void setRiferimentoTesto(Optional<String> riferimentoTesto) {
        this.riferimentoTesto = riferimentoTesto;
    }

    public Optional<BigDecimal> getRiferimentoNumero() {
        return riferimentoNumero;
    }

    public void setRiferimentoNumero(Optional<BigDecimal> riferimentoNumero) {
        this.riferimentoNumero = riferimentoNumero;
    }

    public Optional<XMLGregorianCalendar> getRiferimentoData() {
        return riferimentoData;
    }

    public void setRiferimentoData(Optional<XMLGregorianCalendar> riferimentoData) {
        this.riferimentoData = riferimentoData;
    }

    public AltriDatiGestionaliType creaAltriDatiGestionali(){
        AltriDatiGestionaliType altriDatiGestionaliType = new AltriDatiGestionaliType();
        altriDatiGestionaliType.setTipoDato(tipoDato);
        if(Optional.ofNullable(riferimentoTesto).isPresent()){
            altriDatiGestionaliType.setRiferimentoTesto(riferimentoTesto.get());
        }
        if(Optional.ofNullable(riferimentoNumero).isPresent()){
            altriDatiGestionaliType.setRiferimentoNumero(riferimentoNumero.get());
        }
        if(Optional.ofNullable(riferimentoData).isPresent()){
             altriDatiGestionaliType.setRiferimentoData(riferimentoData.get());
        }
        return altriDatiGestionaliType;
    }
}
