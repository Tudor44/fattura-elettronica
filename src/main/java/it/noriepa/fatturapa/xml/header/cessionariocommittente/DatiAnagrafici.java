package it.noriepa.fatturapa.xml.header.cessionariocommittente;

import it.noriepa.fatturapa.jaxb.DatiAnagraficiCessionarioType;
import it.noriepa.fatturapa.jaxb.RegimeFiscaleType;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.Anagrafica;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.IdFiscaleIVA;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Optional;

public class DatiAnagrafici {

    private Optional<IdFiscaleIVA> idFiscaleIVA;
    private Optional<String> codiceFiscale;
    private Anagrafica anagrafica;
    private RegimeFiscaleType regimeFiscale;
    public DatiAnagrafici(){}

    public DatiAnagrafici(Optional<IdFiscaleIVA> idFiscaleIVA, Optional<String> codiceFiscale, Anagrafica anagrafica, Optional<String> alboProfessionale, Optional<String> provinciaAlbo, Optional<String> numeroIscrizioneAlbo, Optional<XMLGregorianCalendar> dataIscrizioneAlbo, RegimeFiscaleType regimeFiscale) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.codiceFiscale = codiceFiscale;
        this.anagrafica = anagrafica;
    }

    public DatiAnagrafici(Optional<IdFiscaleIVA> idFiscaleIVA, Anagrafica anagrafica) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.anagrafica = anagrafica;
    }

    public Optional<IdFiscaleIVA> getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(Optional<IdFiscaleIVA> idFiscaleIVA) {
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


    public DatiAnagraficiCessionarioType creaDatiAnagraficiCessionario(){
        DatiAnagraficiCessionarioType datiAnagraficiCessionarioType = new DatiAnagraficiCessionarioType();
        if(Optional.ofNullable(idFiscaleIVA).isPresent()) {
            datiAnagraficiCessionarioType.setIdFiscaleIVA(idFiscaleIVA.get().creaIdFiscaleIVA());
        }
        datiAnagraficiCessionarioType.setAnagrafica(anagrafica.creaAnagrafica());
        if(Optional.ofNullable(codiceFiscale).isPresent()) {
            datiAnagraficiCessionarioType.setCodiceFiscale(codiceFiscale.get());
        }

        return datiAnagraficiCessionarioType;

    }
}
