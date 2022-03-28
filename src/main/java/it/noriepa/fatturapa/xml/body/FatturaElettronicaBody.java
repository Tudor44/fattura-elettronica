package it.noriepa.fatturapa.xml.body;

import it.noriepa.fatturapa.jaxb.FatturaElettronicaBodyType;
import it.noriepa.fatturapa.xml.body.allegati.Allegati;
import it.noriepa.fatturapa.xml.body.datibeniservizi.DatiBeniServizi;
import it.noriepa.fatturapa.xml.body.datigenerali.DatiGenerali;
import it.noriepa.fatturapa.xml.body.datipagamento.DatiPagamento;
import it.noriepa.fatturapa.xml.body.dativeicoli.DatiVeicoli;

import java.util.Optional;

public class FatturaElettronicaBody {

    private DatiGenerali datiGenerali;
    private DatiBeniServizi datiBeniServizi;
    private Optional<DatiVeicoli> datiVeicoli;
    private Optional<DatiPagamento> datiPagamento;
    private Optional<Allegati> allegati;

    public FatturaElettronicaBody(){}

    public FatturaElettronicaBody(DatiGenerali datiGenerali, DatiBeniServizi datiBeniServizi, Optional<DatiVeicoli> datiVeicoli, Optional<DatiPagamento> datiPagamento, Optional<Allegati> allegati) {
        this.datiGenerali = datiGenerali;
        this.datiBeniServizi = datiBeniServizi;
        this.datiVeicoli = datiVeicoli;
        this.datiPagamento = datiPagamento;
        this.allegati = allegati;
    }

    public FatturaElettronicaBody(DatiGenerali datiGenerali, DatiBeniServizi datiBeniServizi) {
        this.datiGenerali = datiGenerali;
        this.datiBeniServizi = datiBeniServizi;
    }

    public DatiGenerali getDatiGenerali() {
        return datiGenerali;
    }

    public void setDatiGenerali(DatiGenerali datiGenerali) {
        this.datiGenerali = datiGenerali;
    }

    public DatiBeniServizi getDatiBeniServizi() {
        return datiBeniServizi;
    }

    public void setDatiBeniServizi(DatiBeniServizi datiBeniServizi) {
        this.datiBeniServizi = datiBeniServizi;
    }

    public Optional<DatiVeicoli> getDatiVeicoli() {
        return datiVeicoli;
    }

    public void setDatiVeicoli(Optional<DatiVeicoli> datiVeicoli) {
        this.datiVeicoli = datiVeicoli;
    }

    public Optional<DatiPagamento> getDatiPagamento() {
        return datiPagamento;
    }

    public void setDatiPagamento(Optional<DatiPagamento> datiPagamento) {
        this.datiPagamento = datiPagamento;
    }

    public Optional<Allegati> getAllegati() {
        return allegati;
    }

    public void setAllegati(Optional<Allegati> allegati) {
        this.allegati = allegati;
    }

    public FatturaElettronicaBodyType creaFatturaElettronicaBody(){
        FatturaElettronicaBodyType fatturaElettronicaBodyType = new FatturaElettronicaBodyType();
        fatturaElettronicaBodyType.setDatiGenerali(datiGenerali.creaDatiGenerali());
        fatturaElettronicaBodyType.setDatiBeniServizi(datiBeniServizi.creaDatiBeniServizi());
        if(Optional.ofNullable(datiVeicoli).isPresent()) {
            fatturaElettronicaBodyType.setDatiVeicoli(datiVeicoli.get().creaDatiVeicoliType());
        }
        if(Optional.ofNullable(datiPagamento).isPresent()) {
            fatturaElettronicaBodyType.getDatiPagamento().add(datiPagamento.get().creaDatiPagamento());
        }
        if(Optional.ofNullable(allegati).isPresent()) {
            fatturaElettronicaBodyType.getAllegati().add(allegati.get().creaAllegati());
        }
        return fatturaElettronicaBodyType;
    }
}
