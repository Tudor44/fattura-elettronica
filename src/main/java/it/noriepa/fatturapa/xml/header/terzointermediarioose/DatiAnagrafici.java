package it.noriepa.fatturapa.xml.header.terzointermediarioose;

import it.noriepa.fatturapa.jaxb.DatiAnagraficiTerzoIntermediarioType;
import it.noriepa.fatturapa.jaxb.RegimeFiscaleType;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.Anagrafica;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.IdFiscaleIVA;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Optional;

public class DatiAnagrafici {

    private IdFiscaleIVA idFiscaleIVA;
    private Optional<String> codiceFiscale;
    private Anagrafica anagrafica;


    public DatiAnagrafici(){}

    public DatiAnagrafici(IdFiscaleIVA idFiscaleIVA, Optional<String> codiceFiscale, Anagrafica anagrafica, Optional<String> alboProfessionale, Optional<String> provinciaAlbo, Optional<String> numeroIscrizioneAlbo, Optional<XMLGregorianCalendar> dataIscrizioneAlbo, RegimeFiscaleType regimeFiscale) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.codiceFiscale = codiceFiscale;
        this.anagrafica = anagrafica;
    }

    public DatiAnagrafici(IdFiscaleIVA idFiscaleIVA, Anagrafica anagrafica) {
        this.idFiscaleIVA = idFiscaleIVA;
        this.anagrafica = anagrafica;
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

    public DatiAnagraficiTerzoIntermediarioType creaDatiAnagraficiTerzoIntermediario(){
        DatiAnagraficiTerzoIntermediarioType datiAnagraficiTerzoIntermediarioType = new DatiAnagraficiTerzoIntermediarioType();
        datiAnagraficiTerzoIntermediarioType.setIdFiscaleIVA(idFiscaleIVA.creaIdFiscaleIVA());
        datiAnagraficiTerzoIntermediarioType.setAnagrafica(anagrafica.creaAnagrafica());
        if(Optional.ofNullable(codiceFiscale).isPresent()) {
            datiAnagraficiTerzoIntermediarioType.setCodiceFiscale(codiceFiscale.get());
        }
        return datiAnagraficiTerzoIntermediarioType;

    }
}
