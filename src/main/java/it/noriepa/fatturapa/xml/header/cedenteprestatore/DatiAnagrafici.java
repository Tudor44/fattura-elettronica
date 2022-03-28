package it.noriepa.fatturapa.xml.header.cedenteprestatore;

import it.noriepa.fatturapa.jaxb.DatiAnagraficiCedenteType;
import it.noriepa.fatturapa.jaxb.RegimeFiscaleType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Optional;

public class DatiAnagrafici {
    private IdFiscaleIVA idFiscaleIVA;
    private Optional<String> codiceFiscale;
    private Anagrafica anagrafica;
    private Optional<String> alboProfessionale;
    private Optional<String> provinciaAlbo;
    private Optional<String> numeroIscrizioneAlbo;
    private Optional<XMLGregorianCalendar> dataIscrizioneAlbo;
    private RegimeFiscaleType regimeFiscale;

    public DatiAnagrafici(){}

    public DatiAnagrafici(IdFiscaleIVA idFiscaleIVA, Optional<String> codiceFiscale, Anagrafica anagrafica, Optional<String> alboProfessionale, Optional<String> provinciaAlbo, Optional<String> numeroIscrizioneAlbo, Optional<XMLGregorianCalendar> dataIscrizioneAlbo, RegimeFiscaleType regimeFiscale) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.codiceFiscale = codiceFiscale;
        this.anagrafica = anagrafica;
        this.alboProfessionale = alboProfessionale;
        this.provinciaAlbo = provinciaAlbo;
        this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
        this.dataIscrizioneAlbo = dataIscrizioneAlbo;
        this.regimeFiscale = regimeFiscale;
    }

    public DatiAnagrafici(IdFiscaleIVA idFiscaleIVA, Anagrafica anagrafica, RegimeFiscaleType regimeFiscale) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.anagrafica = anagrafica;
        this.regimeFiscale = regimeFiscale;
    }

    public IdFiscaleIVA getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleIVA idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public Optional<String> getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(Optional<String> codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public Optional<String> getAlboProfessionale() {
        return alboProfessionale;
    }

    public void setAlboProfessionale(Optional<String> alboProfessionale) {
        this.alboProfessionale = alboProfessionale;
    }

    public Optional<String> getProvinciaAlbo() {
        return provinciaAlbo;
    }

    public void setProvinciaAlbo(Optional<String> provinciaAlbo) {
        this.provinciaAlbo = provinciaAlbo;
    }

    public Optional<String> getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    public void setNumeroIscrizioneAlbo(Optional<String> numeroIscrizioneAlbo) {
        this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
    }

    public Optional<XMLGregorianCalendar> getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    public void setDataIscrizioneAlbo(Optional<XMLGregorianCalendar> dataIscrizioneAlbo) {
        this.dataIscrizioneAlbo = dataIscrizioneAlbo;
    }

    public RegimeFiscaleType getRegimeFiscale() {
        return regimeFiscale;
    }

    public void setRegimeFiscale(RegimeFiscaleType regimeFiscale) {
        this.regimeFiscale = regimeFiscale;
    }

    public DatiAnagraficiCedenteType creaDatiAnagrafici(){
        DatiAnagraficiCedenteType datiAnagraficiCedenteType = new DatiAnagraficiCedenteType();
        datiAnagraficiCedenteType.setIdFiscaleIVA(idFiscaleIVA.creaIdFiscaleIVA());
        datiAnagraficiCedenteType.setAnagrafica(anagrafica.creaAnagrafica());
        datiAnagraficiCedenteType.setRegimeFiscale(regimeFiscale);
        if(Optional.ofNullable(codiceFiscale).isPresent()) {
            datiAnagraficiCedenteType.setCodiceFiscale(codiceFiscale.get());
        }
        if(Optional.ofNullable(dataIscrizioneAlbo).isPresent()) {
            datiAnagraficiCedenteType.setDataIscrizioneAlbo(dataIscrizioneAlbo.get());
        }
        if(Optional.ofNullable(numeroIscrizioneAlbo).isPresent()) {
            datiAnagraficiCedenteType.setNumeroIscrizioneAlbo(numeroIscrizioneAlbo.get());
        }
        if(Optional.ofNullable(alboProfessionale).isPresent()) {
            datiAnagraficiCedenteType.setAlboProfessionale(alboProfessionale.get());
        }
        if(Optional.ofNullable(provinciaAlbo).isPresent()) {
            datiAnagraficiCedenteType.setProvinciaAlbo(provinciaAlbo.get());
        }
        return datiAnagraficiCedenteType;

    }
}
