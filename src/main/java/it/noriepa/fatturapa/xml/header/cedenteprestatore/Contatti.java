package it.noriepa.fatturapa.xml.header.cedenteprestatore;

import it.noriepa.fatturapa.jaxb.ContattiType;

import java.util.Optional;

public class Contatti {

    private Optional<String> telefono;
    private Optional<String> fax;
    private Optional<String> email;

    public Contatti(){}

    public Contatti(Optional<String> telefono, Optional<String> fax, Optional<String> email) {
        this.telefono = telefono;
        this.fax = fax;
        this.email = email;
    }

    public Optional<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(Optional<String> telefono) {
        this.telefono = telefono;
    }

    public Optional<String> getFax() {
        return fax;
    }

    public void setFax(Optional<String> fax) {
        this.fax = fax;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public ContattiType creaContatti(){
        ContattiType contattiType = new ContattiType();

        if(Optional.ofNullable(telefono).isPresent()) {
            contattiType.setTelefono(telefono.get());
        }
        if(Optional.ofNullable(fax).isPresent()) {
            contattiType.setFax(fax.get());
        }
        if(Optional.ofNullable(email).isPresent()) {
            contattiType.setEmail(email.get());
        }

        return contattiType;
    }
}
