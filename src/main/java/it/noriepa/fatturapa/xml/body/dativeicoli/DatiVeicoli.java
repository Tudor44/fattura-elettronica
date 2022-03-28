package it.noriepa.fatturapa.xml.body.dativeicoli;

import it.noriepa.fatturapa.jaxb.DatiVeicoliType;

import javax.xml.datatype.XMLGregorianCalendar;

public class DatiVeicoli {

    private XMLGregorianCalendar data;
    private String totalePercorso;

    public DatiVeicoli(){}

    public DatiVeicoli(XMLGregorianCalendar data, String totalePercorso) {
        this.data = data;
        this.totalePercorso = totalePercorso;
    }

    public XMLGregorianCalendar getData() {
        return data;
    }

    public void setData(XMLGregorianCalendar data) {
        this.data = data;
    }

    public String getTotalePercorso() {
        return totalePercorso;
    }

    public void setTotalePercorso(String totalePercorso) {
        this.totalePercorso = totalePercorso;
    }

    public DatiVeicoliType creaDatiVeicoliType(){
        DatiVeicoliType datiVeicoliType = new DatiVeicoliType();
        datiVeicoliType.setData(data);
        datiVeicoliType.setTotalePercorso(totalePercorso);
        return datiVeicoliType;
    }
}
