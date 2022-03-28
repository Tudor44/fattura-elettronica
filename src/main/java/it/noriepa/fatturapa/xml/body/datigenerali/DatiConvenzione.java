package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiDocumentiCorrelatiType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.Optional;

public class DatiConvenzione {

    private Optional<List<Integer>> riferimentoNumeroLinea;
    private String idDocumento;
    private Optional<XMLGregorianCalendar> data;
    private Optional<String> numItem;
    private Optional<String> codiceCommessaConvenzione;
    private Optional<String> codiceCUP;
    private Optional<String> codiceCIG;

    public DatiConvenzione(){}

    public DatiConvenzione(Optional<List<Integer>> riferimentoNumeroLinea, String idDocumento, Optional<XMLGregorianCalendar> data, Optional<String> numItem, Optional<String> codiceCommessaConvenzione, Optional<String> codiceCUP, Optional<String> codiceCIG) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
        this.idDocumento = idDocumento;
        this.data = data;
        this.numItem = numItem;
        this.codiceCommessaConvenzione = codiceCommessaConvenzione;
        this.codiceCUP = codiceCUP;
        this.codiceCIG = codiceCIG;
    }

    public DatiConvenzione(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Optional<List<Integer>> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    public void setRiferimentoNumeroLinea(Optional<List<Integer>> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Optional<XMLGregorianCalendar> getData() {
        return data;
    }

    public void setData(Optional<XMLGregorianCalendar> data) {
        this.data = data;
    }

    public Optional<String> getNumItem() {
        return numItem;
    }

    public void setNumItem(Optional<String> numItem) {
        this.numItem = numItem;
    }

    public Optional<String> getCodiceCommessaConvenzione() {
        return codiceCommessaConvenzione;
    }

    public void setCodiceCommessaConvenzione(Optional<String> codiceCommessaConvenzione) {
        this.codiceCommessaConvenzione = codiceCommessaConvenzione;
    }

    public Optional<String> getCodiceCUP() {
        return codiceCUP;
    }

    public void setCodiceCUP(Optional<String> codiceCUP) {
        this.codiceCUP = codiceCUP;
    }

    public Optional<String> getCodiceCIG() {
        return codiceCIG;
    }

    public void setCodiceCIG(Optional<String> codiceCIG) {
        this.codiceCIG = codiceCIG;
    }

    public DatiDocumentiCorrelatiType creaDatiConvenzione(){
        DatiDocumentiCorrelatiType datiDocumentiCorrelatiType = new DatiDocumentiCorrelatiType();
        datiDocumentiCorrelatiType.setIdDocumento(idDocumento);
        if(Optional.ofNullable(riferimentoNumeroLinea).isPresent()){
            for(Integer rifNum : riferimentoNumeroLinea.get())
                datiDocumentiCorrelatiType.getRiferimentoNumeroLinea().add(rifNum);
        }
        if(Optional.ofNullable(data).isPresent()){
            datiDocumentiCorrelatiType.setData(data.get());
        }
        if(Optional.ofNullable(numItem).isPresent()){
            datiDocumentiCorrelatiType.setNumItem(numItem.get());
        }
        if(Optional.ofNullable(codiceCommessaConvenzione).isPresent()){
            datiDocumentiCorrelatiType.setCodiceCommessaConvenzione(codiceCommessaConvenzione.get());
        }
        if(Optional.ofNullable(codiceCUP).isPresent()){
            datiDocumentiCorrelatiType.setCodiceCUP(codiceCUP.get());
        }
        if(Optional.ofNullable(codiceCIG).isPresent()){
            datiDocumentiCorrelatiType.setCodiceCIG(codiceCIG.get());
        }
        return datiDocumentiCorrelatiType;
    }
}
