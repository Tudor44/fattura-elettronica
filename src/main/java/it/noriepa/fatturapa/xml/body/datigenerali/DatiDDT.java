package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiDDTType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.Optional;

public class DatiDDT {

    private String numeroDDT;
    private XMLGregorianCalendar dataDDT;
    private Optional<List<Integer>> riferimentoNumeroLinea;

    public DatiDDT(String numeroDDT, XMLGregorianCalendar dataDDT, Optional<List<Integer>> riferimentoNumeroLinea) {
        this.numeroDDT = numeroDDT;
        this.dataDDT = dataDDT;
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

    public DatiDDT(String numeroDDT, XMLGregorianCalendar dataDDT) {
        this.numeroDDT = numeroDDT;
        this.dataDDT = dataDDT;
    }

    public DatiDDT(){}

    public String getNumeroDDT() {
        return numeroDDT;
    }

    public void setNumeroDDT(String numeroDDT) {
        this.numeroDDT = numeroDDT;
    }

    public XMLGregorianCalendar getDataDDT() {
        return dataDDT;
    }

    public void setDataDDT(XMLGregorianCalendar dataDDT) {
        this.dataDDT = dataDDT;
    }

    public Optional<List<Integer>> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    public void setRiferimentoNumeroLinea(Optional<List<Integer>> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

    public DatiDDTType creaDatiDDT(){
        DatiDDTType datiDDTType = new DatiDDTType();
        datiDDTType.setNumeroDDT(numeroDDT);
        datiDDTType.setDataDDT(dataDDT);
        if(Optional.ofNullable(riferimentoNumeroLinea).isPresent()){
            for (Integer rifNum : riferimentoNumeroLinea.get()) {
                datiDDTType.getRiferimentoNumeroLinea().add(rifNum);
            }
        }
        return datiDDTType;

    }


}
