package it.noriepa.fatturapa.xml.header.datitrasmissione;

import it.noriepa.fatturapa.jaxb.ContattiTrasmittenteType;

public class ContattiTrasmittente {

    private String telefono;
    private String email;

    public ContattiTrasmittente(){}

    public ContattiTrasmittente(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContattiTrasmittenteType creaContattiTrasmittente(){
        ContattiTrasmittenteType contattiTrasmittenteType = new ContattiTrasmittenteType();
        contattiTrasmittenteType.setEmail(email);
        contattiTrasmittenteType.setTelefono(telefono);
        return contattiTrasmittenteType;
    }
}
