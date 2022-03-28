package it.noriepa.fatturapa.xml.body.datigenerali;

import it.noriepa.fatturapa.jaxb.DatiGeneraliType;

import java.util.List;
import java.util.Optional;

public class DatiGenerali {

    private DatiGeneraliDocumento datiGeneraliDocumento;
    private Optional<List<DatiOrdineAcquisto>> datiOrdineAcquisto;
    private Optional<List<DatiContratto>> datiContratto;
    private Optional<List<DatiConvenzione>> datiConvenzione;
    private Optional<List<DatiRicezione>> datiRicezione;
    private Optional<List<DatiFattureCollegate>> datiFattureCollegate;
    private Optional<List<DatiSAL>> datiSAL;
    private Optional<List<DatiDDT>> datiDDT;
    private Optional<DatiTrasporto> datiTrasporto;
    private Optional<FatturaPrincipale> fatturaPrincipale;

    public DatiGenerali(){}

    public DatiGenerali(DatiGeneraliDocumento datiGeneraliDocumento) {
        this.datiGeneraliDocumento = datiGeneraliDocumento;
    }

    public DatiGenerali(DatiGeneraliDocumento datiGeneraliDocumento, Optional<List<DatiOrdineAcquisto>> datiOrdineAcquisto, Optional<List<DatiContratto>> datiContratto, Optional<List<DatiConvenzione>> datiConvenzione, Optional<List<DatiRicezione>> datiRicezione, Optional<List<DatiFattureCollegate>> datiFattureCollegate, Optional<List<DatiSAL>> datiSAL, Optional<List<DatiDDT>> datiDDT, Optional<DatiTrasporto> datiTrasporto, Optional<FatturaPrincipale> fatturaPrincipale) {
        this.datiGeneraliDocumento = datiGeneraliDocumento;
        this.datiOrdineAcquisto = datiOrdineAcquisto;
        this.datiContratto = datiContratto;
        this.datiConvenzione = datiConvenzione;
        this.datiRicezione = datiRicezione;
        this.datiFattureCollegate = datiFattureCollegate;
        this.datiSAL = datiSAL;
        this.datiDDT = datiDDT;
        this.datiTrasporto = datiTrasporto;
        this.fatturaPrincipale = fatturaPrincipale;
    }

    public DatiGeneraliDocumento getDatiGeneraliDocumento() {
        return datiGeneraliDocumento;
    }

    public void setDatiGeneraliDocumento(DatiGeneraliDocumento datiGeneraliDocumento) {
        this.datiGeneraliDocumento = datiGeneraliDocumento;
    }

    public Optional<List<DatiOrdineAcquisto>> getDatiOrdineAcquisto() {
        return datiOrdineAcquisto;
    }

    public void setDatiOrdineAcquisto(Optional<List<DatiOrdineAcquisto>> datiOrdineAcquisto) {
        this.datiOrdineAcquisto = datiOrdineAcquisto;
    }

    public Optional<List<DatiContratto>> getDatiContratto() {
        return datiContratto;
    }

    public void setDatiContratto(Optional<List<DatiContratto>> datiContratto) {
        this.datiContratto = datiContratto;
    }

    public Optional<List<DatiConvenzione>> getDatiConvenzione() {
        return datiConvenzione;
    }

    public void setDatiConvenzione(Optional<List<DatiConvenzione>> datiConvenzione) {
        this.datiConvenzione = datiConvenzione;
    }

    public Optional<List<DatiRicezione>> getDatiRicezione() {
        return datiRicezione;
    }

    public void setDatiRicezione(Optional<List<DatiRicezione>> datiRicezione) {
        this.datiRicezione = datiRicezione;
    }

    public Optional<List<DatiFattureCollegate>> getDatiFattureCollegate() {
        return datiFattureCollegate;
    }

    public void setDatiFattureCollegate(Optional<List<DatiFattureCollegate>> datiFattureCollegate) {
        this.datiFattureCollegate = datiFattureCollegate;
    }

    public Optional<List<DatiSAL>> getDatiSAL() {
        return datiSAL;
    }

    public void setDatiSAL(Optional<List<DatiSAL>> datiSAL) {
        this.datiSAL = datiSAL;
    }

    public Optional<List<DatiDDT>> getDatiDDT() {
        return datiDDT;
    }

    public void setDatiDDT(Optional<List<DatiDDT>> datiDDT) {
        this.datiDDT = datiDDT;
    }

    public Optional<DatiTrasporto> getDatiTrasporto() {
        return datiTrasporto;
    }

    public void setDatiTrasporto(Optional<DatiTrasporto> datiTrasporto) {
        this.datiTrasporto = datiTrasporto;
    }

    public Optional<FatturaPrincipale> getFatturaPrincipale() {
        return fatturaPrincipale;
    }

    public void setFatturaPrincipale(Optional<FatturaPrincipale> fatturaPrincipale) {
        this.fatturaPrincipale = fatturaPrincipale;
    }

    public DatiGeneraliType creaDatiGenerali(){
        DatiGeneraliType datiGeneraliType = new DatiGeneraliType();
        datiGeneraliType.setDatiGeneraliDocumento(datiGeneraliDocumento.creaDatiGeneraliDocumento());
        if(Optional.ofNullable(datiOrdineAcquisto).isPresent()){
            for(DatiOrdineAcquisto dato : datiOrdineAcquisto.get())
                datiGeneraliType.getDatiOrdineAcquisto().add(dato.creaDatiOrdineAcquisto());
        }
        if(Optional.ofNullable(datiContratto).isPresent()){
            for(DatiContratto dato : datiContratto.get())
                datiGeneraliType.getDatiContratto().add(dato.creaDatiContratto());
        }
        if(Optional.ofNullable(datiConvenzione).isPresent()){
            for(DatiConvenzione dato : datiConvenzione.get())
                datiGeneraliType.getDatiConvenzione().add(dato.creaDatiConvenzione());
        }
        if(Optional.ofNullable(datiRicezione).isPresent()){
            for(DatiRicezione dato : datiRicezione.get())
                datiGeneraliType.getDatiRicezione().add(dato.creaDatiRicezione());
        }
        if(Optional.ofNullable(datiFattureCollegate).isPresent()){
            for(DatiFattureCollegate dato : datiFattureCollegate.get())
                datiGeneraliType.getDatiFattureCollegate().add(dato.creaDatiFattureCollegate());
        }
        if(Optional.ofNullable(datiSAL).isPresent()){
            for(DatiSAL dato : datiSAL.get())
                datiGeneraliType.getDatiSAL().add(dato.creaDatiSAL());
        }
        if(Optional.ofNullable(datiDDT).isPresent()){
            for(DatiDDT dato : datiDDT.get())
                datiGeneraliType.getDatiDDT().add(dato.creaDatiDDT());
        }
        if(Optional.ofNullable(datiTrasporto).isPresent()){
            datiGeneraliType.setDatiTrasporto(datiTrasporto.get().creaDatiTrasporto());
        }
        if(Optional.ofNullable(fatturaPrincipale).isPresent()){
            datiGeneraliType.setFatturaPrincipale(fatturaPrincipale.get().creaFatturaPrincipale());
        }
        return datiGeneraliType;
    }
}
