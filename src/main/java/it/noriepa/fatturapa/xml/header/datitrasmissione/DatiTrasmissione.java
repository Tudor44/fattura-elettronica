package it.noriepa.fatturapa.xml.header.datitrasmissione;
import it.noriepa.fatturapa.jaxb.DatiTrasmissioneType;
import it.noriepa.fatturapa.jaxb.FormatoTrasmissioneType;

import java.util.Optional;

public class DatiTrasmissione {

    private IdTrasmittente idTrasmittente;
    private String progressivoInvio;
    private String formatoTrasmissione;
    private String codiceDestinatario;
    private Optional<ContattiTrasmittente> contattiTrasmittente;
    private Optional<String> pecDestinatario;

    public DatiTrasmissione(IdTrasmittente idTrasmittente, String progressivoInvio, String formatoTrasmissione, String codiceDestinatario) {
        this.idTrasmittente = idTrasmittente;
        this.progressivoInvio = progressivoInvio;
        this.formatoTrasmissione = formatoTrasmissione;
        this.codiceDestinatario = codiceDestinatario;
    }

    public DatiTrasmissione(){}

    public DatiTrasmissione(IdTrasmittente idTrasmittente, String progressivoInvio, String formatoTrasmissione, String codiceDestinatario, Optional<ContattiTrasmittente> contattiTrasmittente, Optional<String> pecDestinatario) {
        this.idTrasmittente = idTrasmittente;
        this.progressivoInvio = progressivoInvio;
        this.formatoTrasmissione = formatoTrasmissione;
        this.codiceDestinatario = codiceDestinatario;
        this.contattiTrasmittente = contattiTrasmittente;
        this.pecDestinatario = pecDestinatario;
    }

    public IdTrasmittente getIdTrasmittente() {
        return idTrasmittente;
    }

    public void setIdTrasmittente(IdTrasmittente idTrasmittente) {
        this.idTrasmittente = idTrasmittente;
    }

    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    public void setProgressivoInvio(String progressivoInvio) {
        this.progressivoInvio = progressivoInvio;
    }

    public String getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    public void setFormatoTrasmissione(String formatoTrasmissione) {
        this.formatoTrasmissione = formatoTrasmissione;
    }

    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    public void setCodiceDestinatario(String codiceDestinatario) {
        this.codiceDestinatario = codiceDestinatario;
    }

    public Optional<ContattiTrasmittente> getContattiTrasmittente() {
        return contattiTrasmittente;
    }

    public void setContattiTrasmittente(Optional<ContattiTrasmittente> contattiTrasmittente) {
        this.contattiTrasmittente = contattiTrasmittente;
    }

    public Optional<String> getPecDestinatario() {
        return pecDestinatario;
    }

    public void setPecDestinatario(Optional<String> pecDestinatario) {
        this.pecDestinatario = pecDestinatario;
    }

    public DatiTrasmissioneType creaDatiTrasmissione(){
        DatiTrasmissioneType datiTrasmissioneType = new DatiTrasmissioneType();
        datiTrasmissioneType.setFormatoTrasmissione(FormatoTrasmissioneType.fromValue(formatoTrasmissione));
        datiTrasmissioneType.setIdTrasmittente(idTrasmittente.creaIdTrasmittente());
        datiTrasmissioneType.setCodiceDestinatario(codiceDestinatario);
        datiTrasmissioneType.setProgressivoInvio(progressivoInvio);
        if(Optional.ofNullable(contattiTrasmittente).isPresent()) {
            datiTrasmissioneType.setContattiTrasmittente(contattiTrasmittente.get().creaContattiTrasmittente());
        }
        if(Optional.ofNullable(pecDestinatario).isPresent()) {
            datiTrasmissioneType.setPECDestinatario(pecDestinatario.get());
        }

        return datiTrasmissioneType;
    }
}
