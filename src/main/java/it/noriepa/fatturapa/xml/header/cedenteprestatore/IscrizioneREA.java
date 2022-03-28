package it.noriepa.fatturapa.xml.header.cedenteprestatore;

import it.noriepa.fatturapa.jaxb.IscrizioneREAType;
import it.noriepa.fatturapa.jaxb.SocioUnicoType;
import it.noriepa.fatturapa.jaxb.StatoLiquidazioneType;

import java.math.BigDecimal;
import java.util.Optional;

public class IscrizioneREA {

    private String ufficio;
    private String numeroREA;
    private Optional<BigDecimal> capitaleSociale;
    private Optional<String> socioUnico;
    private String statoLiquidazione;


    public IscrizioneREA(){}
    public IscrizioneREA(String ufficio, String numeroREA, String statoLiquidazione) {
        this.ufficio = ufficio;
        this.numeroREA = numeroREA;
        this.statoLiquidazione = statoLiquidazione;
    }

    public IscrizioneREA(String ufficio, String numeroREA, Optional<BigDecimal> capitaleSociale, Optional<String> socioUnico, String statoLiquidazione) {
        this.ufficio = ufficio;
        this.numeroREA = numeroREA;
        this.capitaleSociale = capitaleSociale;
        this.socioUnico = socioUnico;
        this.statoLiquidazione = statoLiquidazione;
    }

    public String getUfficio() {
        return ufficio;
    }

    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    public String getNumeroREA() {
        return numeroREA;
    }

    public void setNumeroREA(String numeroREA) {
        this.numeroREA = numeroREA;
    }

    public Optional<BigDecimal> getCapitaleSociale() {
        return capitaleSociale;
    }

    public void setCapitaleSociale(Optional<BigDecimal> capitaleSociale) {
        this.capitaleSociale = capitaleSociale;
    }

    public Optional<String> getSocioUnico() {
        return socioUnico;
    }

    public void setSocioUnico(Optional<String> socioUnico) {
        this.socioUnico = socioUnico;
    }

    public String getStatoLiquidazione() {
        return statoLiquidazione;
    }

    public void setStatoLiquidazione(String statoLiquidazione) {
        this.statoLiquidazione = statoLiquidazione;
    }

    public IscrizioneREAType creaIscrizioneREA(){
        IscrizioneREAType iscrizioneREAType = new IscrizioneREAType();
        iscrizioneREAType.setStatoLiquidazione(StatoLiquidazioneType.fromValue(statoLiquidazione));
        iscrizioneREAType.setUfficio(ufficio);
        iscrizioneREAType.setNumeroREA(numeroREA);
        if(Optional.ofNullable(capitaleSociale).isPresent()) {
            iscrizioneREAType.setCapitaleSociale(capitaleSociale.get());
        }
        if(Optional.ofNullable(socioUnico).isPresent()) {
            iscrizioneREAType.setSocioUnico(SocioUnicoType.fromValue(socioUnico.get()));
        }
        return iscrizioneREAType;
    }
}
