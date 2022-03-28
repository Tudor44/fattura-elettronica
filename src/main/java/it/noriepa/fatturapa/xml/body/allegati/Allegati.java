package it.noriepa.fatturapa.xml.body.allegati;

import it.noriepa.fatturapa.jaxb.AllegatiType;

import java.util.Optional;

public class Allegati {

    private String nomeAttachment;
    private Optional<String> algoritmoCompressione;
    private Optional<String> formatoAttachment;
    private Optional<String> descrizioneAttachment;
    private byte[] attachment;

    public Allegati(){}

    public Allegati(String nomeAttachment, Optional<String> algoritmoCompressione, Optional<String> formatoAttachment, Optional<String> descrizioneAttachment,  byte[] attachment) {
        this.nomeAttachment = nomeAttachment;
        this.algoritmoCompressione = algoritmoCompressione;
        this.formatoAttachment = formatoAttachment;
        this.descrizioneAttachment = descrizioneAttachment;
        this.attachment = attachment;
    }

    public Allegati(String nomeAttachment) {
        this.nomeAttachment = nomeAttachment;
    }

    public String getNomeAttachment() {
        return nomeAttachment;
    }

    public void setNomeAttachment(String nomeAttachment) {
        this.nomeAttachment = nomeAttachment;
    }

    public Optional<String> getAlgoritmoCompressione() {
        return algoritmoCompressione;
    }

    public void setAlgoritmoCompressione(Optional<String> algoritmoCompressione) {
        this.algoritmoCompressione = algoritmoCompressione;
    }

    public Optional<String> getFormatoAttachment() {
        return formatoAttachment;
    }

    public void setFormatoAttachment(Optional<String> formatoAttachment) {
        this.formatoAttachment = formatoAttachment;
    }

    public Optional<String> getDescrizioneAttachment() {
        return descrizioneAttachment;
    }

    public void setDescrizioneAttachment(Optional<String> descrizioneAttachment) {
        this.descrizioneAttachment = descrizioneAttachment;
    }

    public AllegatiType creaAllegati(){
        AllegatiType allegatiType = new AllegatiType();
        allegatiType.setNomeAttachment(nomeAttachment);
        if(Optional.ofNullable(algoritmoCompressione).isPresent()) {
            allegatiType.setAlgoritmoCompressione(algoritmoCompressione.get());
        }
        if(Optional.ofNullable(formatoAttachment).isPresent()) {
            allegatiType.setFormatoAttachment(formatoAttachment.get());
        }
        if(Optional.ofNullable(descrizioneAttachment).isPresent()) {
            allegatiType.setFormatoAttachment(descrizioneAttachment.get());
        }
        allegatiType.setAttachment(attachment);
        return allegatiType;
    }
}
