package it.noriepa.fatturapa;

import it.noriepa.fatturapa.jaxb.FatturaElettronicaType;
import it.noriepa.fatturapa.jaxb.RegimeFiscaleType;
import it.noriepa.fatturapa.xml.Fattura;
import it.noriepa.fatturapa.xml.body.FatturaElettronicaBody;
import it.noriepa.fatturapa.xml.body.datibeniservizi.DatiBeniServizi;
import it.noriepa.fatturapa.xml.body.datibeniservizi.DatiRiepilogo;
import it.noriepa.fatturapa.xml.body.datibeniservizi.DettaglioLinee;
import it.noriepa.fatturapa.xml.body.datigenerali.*;
import it.noriepa.fatturapa.xml.body.datipagamento.DatiPagamento;
import it.noriepa.fatturapa.xml.body.datipagamento.DettaglioPagamento;
import it.noriepa.fatturapa.xml.header.FatturaElettronicaHeader;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.Anagrafica;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.CedentePrestatore;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.DatiAnagrafici;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.Sede;
import it.noriepa.fatturapa.xml.header.cedenteprestatore.IdFiscaleIVA;
import it.noriepa.fatturapa.xml.header.cessionariocommittente.CessionarioCommittente;
import it.noriepa.fatturapa.xml.header.datitrasmissione.DatiTrasmissione;
import it.noriepa.fatturapa.xml.header.datitrasmissione.IdTrasmittente;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws JAXBException, DatatypeConfigurationException {

        String azione = args[0];
        JAXBContext jaxbContext = JAXBContext.newInstance(FatturaElettronicaType.class);

        //Prova di creazione di una fattura xml
        if (Costanti.TEST_CREA_FATTURA.equals(azione)) {
            //Leggi i parametri per il nome file della fattura da
            String codicePaese = args[1];
            String piva = args[2];
            String progressivo = args[3];
            String percorsoCartella = args[4];
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            /*<FatturaElettronica>*/
            Fattura fattura = new Fattura();
            fattura.setVersione("FPA12");
            /*<FatturaElettronicaHeader>*/
            FatturaElettronicaHeader fatturaElettronicaHeader = new FatturaElettronicaHeader();
            fatturaElettronicaHeader.setDatiTrasmissione(setDatiTrasmissione());
            fatturaElettronicaHeader.setCedentePrestatore(setCedentePrestatore());
            fatturaElettronicaHeader.setCessionarioCommittente(setCessionarioCommittente());
            /*<FatturaElettronicaBody>*/
            FatturaElettronicaBody fatturaElettronicaBody = new FatturaElettronicaBody(setDatiGenerali(),setDatiBeniServizi());
            fatturaElettronicaBody.setDatiPagamento(Optional.of(setDatiPagamento()));
            fattura.setFatturaElettronicaHeader(fatturaElettronicaHeader);
            fattura.setFatturaElettronicaBody(fatturaElettronicaBody);

            //Creazione della fattura xml in una cartella arbitraria
            jaxbMarshaller.marshal(new JAXBElement<>(
                    new QName("http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2", "FatturaElettronica"),
                    FatturaElettronicaType.class,
                    fattura.creaFatturaElettronica()),
                    new File(percorsoCartella + "/" + codicePaese + piva + "_" + progressivo + ".xml")
            );
            System.out.println("Fattura elettronica di prova creata");
        }

    }

    /*<DatiTrasmissione>*/
    public static DatiTrasmissione setDatiTrasmissione(){
        DatiTrasmissione datiTrasmissione = new DatiTrasmissione();
        IdTrasmittente idTrasmittente = new IdTrasmittente("IT", "01234567890");
        datiTrasmissione.setIdTrasmittente(idTrasmittente);
        datiTrasmissione.setProgressivoInvio("00001");
        datiTrasmissione.setFormatoTrasmissione("FPA12");
        datiTrasmissione.setCodiceDestinatario("AAAAAA");
        return datiTrasmissione;
    }

    /*<CedentePrestatore>*/
    public static CedentePrestatore setCedentePrestatore(){
        DatiAnagrafici datiAnagrafici = new DatiAnagrafici();
        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setDenominazione(Optional.of("ALPHA SRL"));
        datiAnagrafici.setAnagrafica(anagrafica);
        datiAnagrafici.setRegimeFiscale(RegimeFiscaleType.RF_19);
        datiAnagrafici.setIdFiscaleIVA(new IdFiscaleIVA("IT","01234567890"));
        Sede sede = new Sede();
        sede.setIndirizzo("VIALE ROMA 543");
        sede.setCap("07100");
        sede.setNazione("IT");
        sede.setComune("SASSARI");
        sede.setComune("SS");
        sede.setProvincia(Optional.of("IT"));
        CedentePrestatore cedentePrestatore = new CedentePrestatore(datiAnagrafici,sede);

        return cedentePrestatore;
    }

    /*<CessionarioCommittente>*/
    public static CessionarioCommittente setCessionarioCommittente(){
        it.noriepa.fatturapa.xml.header.cessionariocommittente.DatiAnagrafici datiAnagrafici = new  it.noriepa.fatturapa.xml.header.cessionariocommittente.DatiAnagrafici();
        datiAnagrafici.setCodiceFiscale(Optional.of("09876543210"));
        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setDenominazione(Optional.of("AMMINISTRAZIONE BETA"));
        datiAnagrafici.setAnagrafica(anagrafica);
        it.noriepa.fatturapa.xml.header.cessionariocommittente.Sede sede = new  it.noriepa.fatturapa.xml.header.cessionariocommittente.Sede();
        sede.setCap("00145");
        sede.setComune("ROMA");
        sede.setComune("RM");
        sede.setNazione("IT");
        sede.setIndirizzo("VIA TORINO 38-B");
        sede.setProvincia(Optional.of("IT"));
        CessionarioCommittente cessionarioCommittente = new CessionarioCommittente(datiAnagrafici,sede);
        return cessionarioCommittente;
    }

    /*<DatiGenerali>*/
    public static DatiGenerali setDatiGenerali() throws DatatypeConfigurationException {
        DatiGenerali datiGenerali = new DatiGenerali();
        datiGenerali.setDatiGeneraliDocumento(setDatiGeneraliDocumento());

        List<DatiOrdineAcquisto> datiOrdineAcquisto = new ArrayList<>();
        datiOrdineAcquisto.add(setDatiOrdineAcquisto());
        datiGenerali.setDatiOrdineAcquisto(Optional.of(datiOrdineAcquisto));

        List<DatiContratto> datiContratto = new ArrayList<>();
        datiContratto.add(setDatiContratto());
        datiGenerali.setDatiContratto(Optional.of(datiContratto));

        List<DatiConvenzione> datiConvenzione = new ArrayList<>();
        datiConvenzione.add(setDatiConvenzione());
        datiGenerali.setDatiConvenzione(Optional.of(datiConvenzione));

        List<DatiRicezione> datiRicezione = new ArrayList<>();
        datiRicezione.add(setDatiRicezione());
        datiGenerali.setDatiRicezione(Optional.of(datiRicezione));

        List<DatiTrasporto> datiTrasporto = new ArrayList<>();
        datiTrasporto.add(setDatiTrasporto());
        datiGenerali.setDatiTrasporto(Optional.of(setDatiTrasporto()));

        return datiGenerali;
    }

    /*<DatiGeneraliDocumento>*/
    public static DatiGeneraliDocumento setDatiGeneraliDocumento() throws DatatypeConfigurationException {
        DatiGeneraliDocumento datiGeneraliDocumento = new DatiGeneraliDocumento();
        datiGeneraliDocumento.setTipoDocumento("TD01");
        datiGeneraliDocumento.setDivisa("EUR");
        final GregorianCalendar now = new GregorianCalendar();
        XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().toString());
        datiGeneraliDocumento.setData(data);
        datiGeneraliDocumento.setNumero("123");
        List<String> casuale = new ArrayList<>();
        casuale.add("FF");
        datiGeneraliDocumento.setCausale(Optional.of(casuale));
        return datiGeneraliDocumento;
    }

    /*<DatiOrdineAcquisto>*/
    public static DatiOrdineAcquisto setDatiOrdineAcquisto() throws DatatypeConfigurationException {
        DatiOrdineAcquisto datiOrdineAcquisto = new DatiOrdineAcquisto();
        List<Integer> riferimentoNumeroLinea = new ArrayList<>();
        riferimentoNumeroLinea.add(1);
        datiOrdineAcquisto.setRiferimentoNumeroLinea(Optional.of(riferimentoNumeroLinea));
        datiOrdineAcquisto.setIdDocumento("66685");
        datiOrdineAcquisto.setCodiceCIG(Optional.of("456def"));
        datiOrdineAcquisto.setCodiceCUP(Optional.of("123abc"));
        datiOrdineAcquisto.setNumItem(Optional.of("1"));
        return datiOrdineAcquisto;
    }

    /*<DatiContratto>*/
    public static DatiContratto setDatiContratto() throws DatatypeConfigurationException {
        DatiContratto datiContratto = new DatiContratto();
        List<Integer> riferimentoNumeroLinea = new ArrayList<>();
        riferimentoNumeroLinea.add(1);
        datiContratto.setRiferimentoNumeroLinea(Optional.of(riferimentoNumeroLinea));
        datiContratto.setIdDocumento("123");
        final GregorianCalendar now = new GregorianCalendar();
        XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().toString());
        datiContratto.setData(Optional.of(data));
        datiContratto.setCodiceCIG(Optional.of("456def"));
        datiContratto.setCodiceCUP(Optional.of("123abc"));
        datiContratto.setNumItem(Optional.of("5"));
        return datiContratto;
    }

    /*<DatiConvenzione>*/
    public static DatiConvenzione setDatiConvenzione() throws DatatypeConfigurationException {
        DatiConvenzione datiConvenzione = new DatiConvenzione();
        List<Integer> riferimentoNumeroLinea = new ArrayList<>();
        riferimentoNumeroLinea.add(1);
        datiConvenzione.setRiferimentoNumeroLinea(Optional.of(riferimentoNumeroLinea));
        datiConvenzione.setIdDocumento("456");
        datiConvenzione.setCodiceCIG(Optional.of("456def"));
        datiConvenzione.setCodiceCUP(Optional.of("123abc"));
        datiConvenzione.setNumItem(Optional.of("5"));
        return datiConvenzione;
    }

    /*<DatiRicezione>*/
    public static DatiRicezione setDatiRicezione() throws DatatypeConfigurationException {
        DatiRicezione datiRicezione = new DatiRicezione();
        List<Integer> riferimentoNumeroLinea = new ArrayList<>();
        riferimentoNumeroLinea.add(1);
        datiRicezione.setRiferimentoNumeroLinea(Optional.of(riferimentoNumeroLinea));
        datiRicezione.setIdDocumento("789");
        datiRicezione.setCodiceCIG(Optional.of("456def"));
        datiRicezione.setCodiceCUP(Optional.of("123abc"));
        datiRicezione.setNumItem(Optional.of("5"));
        return datiRicezione;
    }

    /*<DatiTrasporto>*/
    public static DatiTrasporto setDatiTrasporto() throws DatatypeConfigurationException {
        DatiTrasporto datiTrasporto = new DatiTrasporto();
        DatiAnagraficiVettore datiAnagraficiVettore = new DatiAnagraficiVettore();
        it.noriepa.fatturapa.xml.body.datigenerali.IdFiscaleIVA idFiscaleIVA = new it.noriepa.fatturapa.xml.body.datigenerali.IdFiscaleIVA("IT", "24681012141");
        it.noriepa.fatturapa.xml.body.datigenerali.Anagrafica anagrafica = new it.noriepa.fatturapa.xml.body.datigenerali.Anagrafica();
        anagrafica.setDenominazione(Optional.of("Trasporto spa"));
        datiAnagraficiVettore.setAnagrafica(anagrafica);
        datiAnagraficiVettore.setIdFiscaleIVA(idFiscaleIVA);
        datiTrasporto.setDatiAnagraficiVettore(Optional.of(datiAnagraficiVettore));
        return datiTrasporto;
    }

    /*<DatiBeniServizi>*/
    public static DatiBeniServizi setDatiBeniServizi() throws DatatypeConfigurationException {
        DatiBeniServizi datiBeniServizi = new DatiBeniServizi();
        List<DatiRiepilogo> dati = new ArrayList<>();
        dati.add(setDatiRiepilogo());
        datiBeniServizi.setDatiRiepilogo(dati);
        List<DettaglioLinee> dettaglio = new ArrayList<>();
        dettaglio.add(setDettaglioLinee());
        datiBeniServizi.setDatiRiepilogo(dati);
        datiBeniServizi.setDettaglioLinee(dettaglio);
        return datiBeniServizi;
    }

    /*<DettaglioLinee>*/
    public static DettaglioLinee setDettaglioLinee(){
        DettaglioLinee dettaglioLinee = new DettaglioLinee();
        dettaglioLinee.setNumeroLinea(1);
        dettaglioLinee.setDescrizione("DESCRIZIONE DELLA FORNITURA");
        dettaglioLinee.setQuantita(Optional.of(new BigDecimal("134.00")));
        dettaglioLinee.setPrezzoUnitario(new BigDecimal("6.20"));
        dettaglioLinee.setPrezzoTotale(new BigDecimal("5.00"));
        dettaglioLinee.setAliquotaIVA(new BigDecimal(("22.00")));
        return dettaglioLinee;
    }
    /*<DatiRiepilogo>*/
    public static DatiRiepilogo setDatiRiepilogo(){
        DatiRiepilogo datiRiepilogo = new DatiRiepilogo();
        datiRiepilogo.setAliquotaIVA(new BigDecimal(("22.00")));
        datiRiepilogo.setImponibileImporto(new BigDecimal("5.00"));
        datiRiepilogo.setImposta(new BigDecimal("1.10"));
        datiRiepilogo.setEsigibilitaIVA(Optional.of("I"));
        return datiRiepilogo;
    }
    /*<DatiPagamento>*/
    public static DatiPagamento setDatiPagamento() throws DatatypeConfigurationException {
        List<DettaglioPagamento> dettagliPagamento = new ArrayList<>();
        DatiPagamento datiPagamento = new DatiPagamento();
        datiPagamento.setCondizioniPagamento("TP01");
        DettaglioPagamento dettaglioPagamento = new DettaglioPagamento();
        dettaglioPagamento.setModalitaPagamento(Optional.of("MP01"));
        dettaglioPagamento.setImportoPagamento(new BigDecimal("6.10"));
        dettagliPagamento.add(dettaglioPagamento);
        datiPagamento.setDettaglioPagamento(dettagliPagamento);
        return datiPagamento;
    }
}