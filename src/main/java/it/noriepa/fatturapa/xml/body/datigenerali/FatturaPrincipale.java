package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.FatturaPrincipaleType;

import javax.xml.datatype.XMLGregorianCalendar;

public class FatturaPrincipale {

    private String numeroFatturaPrincipale;
    private XMLGregorianCalendar dataFatturaPrincipale;

    public FatturaPrincipale(){}

    public FatturaPrincipale(String numeroFatturaPrincipale, XMLGregorianCalendar dataFatturaPrincipale) {
        this.numeroFatturaPrincipale = numeroFatturaPrincipale;
        this.dataFatturaPrincipale = dataFatturaPrincipale;
    }

    public String getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    public void setNumeroFatturaPrincipale(String numeroFatturaPrincipale) {
        this.numeroFatturaPrincipale = numeroFatturaPrincipale;
    }

    public XMLGregorianCalendar getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

    public void setDataFatturaPrincipale(XMLGregorianCalendar dataFatturaPrincipale) {
        this.dataFatturaPrincipale = dataFatturaPrincipale;
    }

    public FatturaPrincipaleType creaFatturaPrincipale(){
        FatturaPrincipaleType fatturaPrincipaleType = new FatturaPrincipaleType();
        fatturaPrincipaleType.setNumeroFatturaPrincipale(numeroFatturaPrincipale);
        fatturaPrincipaleType.setDataFatturaPrincipale(dataFatturaPrincipale);
        return fatturaPrincipaleType;
    }

}
