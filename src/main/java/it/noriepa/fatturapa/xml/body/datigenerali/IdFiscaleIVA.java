package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.IdFiscaleType;

public class IdFiscaleIVA {

    private String idPaese;
    private String idCodice;

    public IdFiscaleIVA(){}

    public IdFiscaleIVA(String idPaese, String idCodice) {
        this.idPaese = idPaese;
        this.idCodice = idCodice;
    }

    public String getIdPaese() {
        return idPaese;
    }

    public void setIdPaese(String idPaese) {
        this.idPaese = idPaese;
    }

    public String getIdCodice() {
        return idCodice;
    }

    public void setIdCodice(String idCodice) {
        this.idCodice = idCodice;
    }

    public IdFiscaleType creaIdFiscaleIVA(){
        IdFiscaleType idFiscaleType = new IdFiscaleType();
        idFiscaleType.setIdCodice(idCodice);
        idFiscaleType.setIdPaese(idPaese);
        return idFiscaleType;
    }
}
