package it.noriepa.fatturapa.xml.body.datibeniservizi;

import it.noriepa.fatturapa.jaxb.CodiceArticoloType;

public class CodiceArticolo {

    private String codiceTipo;
    private String codiceValore;

    public CodiceArticolo(){}

    public CodiceArticolo(String codiceTipo, String codiceValore) {
        this.codiceTipo = codiceTipo;
        this.codiceValore = codiceValore;
    }

    public String getCodiceTipo() {
        return codiceTipo;
    }

    public void setCodiceTipo(String codiceTipo) {
        this.codiceTipo = codiceTipo;
    }

    public String getCodiceValore() {
        return codiceValore;
    }

    public void setCodiceValore(String codiceValore) {
        this.codiceValore = codiceValore;
    }

    public CodiceArticoloType creaCodiceArticolo(){
        CodiceArticoloType codiceArticoloType = new CodiceArticoloType();
        codiceArticoloType.setCodiceTipo(codiceTipo);
        codiceArticoloType.setCodiceValore(codiceValore);
        return codiceArticoloType;
    }
}
