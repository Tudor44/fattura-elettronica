package it.noriepa.fatturapa.xml.body.datibeniservizi;

import it.noriepa.fatturapa.jaxb.DatiBeniServiziType;

import java.util.List;

public class DatiBeniServizi {

    private List<DettaglioLinee> dettaglioLinee;
    private List<DatiRiepilogo> datiRiepilogo;

    public DatiBeniServizi(){}

    public DatiBeniServizi(List<DettaglioLinee> dettaglioLinee, List<DatiRiepilogo> datiRiepilogo) {
        this.dettaglioLinee = dettaglioLinee;
        this.datiRiepilogo = datiRiepilogo;
    }

    public List<DettaglioLinee> getDettaglioLinee() {
        return dettaglioLinee;
    }

    public void setDettaglioLinee(List<DettaglioLinee> dettaglioLinee) {
        this.dettaglioLinee = dettaglioLinee;
    }

    public List<DatiRiepilogo> getDatiRiepilogo() {
        return datiRiepilogo;
    }

    public void setDatiRiepilogo(List<DatiRiepilogo> datiRiepilogo) {
        this.datiRiepilogo = datiRiepilogo;
    }

    public DatiBeniServiziType creaDatiBeniServizi(){

        DatiBeniServiziType datiBeniServiziType = new DatiBeniServiziType();
        for(DatiRiepilogo dato : datiRiepilogo)
            datiBeniServiziType.getDatiRiepilogo().add(dato.creaDatiRiepilogo());
        for(DettaglioLinee dettaglio : dettaglioLinee)
            datiBeniServiziType.getDettaglioLinee().add(dettaglio.creaDettaglioLinee());
        return datiBeniServiziType;

    }
}
