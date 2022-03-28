# Fattura elettronica (Italian Electronic Invoice) in Java

## Italian presentation and instructions

Condivido la versione libera e aperta della mia Libreria in Java per la costruzione delle Fatture Elettroniche italiane, 
secondo le normative vigenti italiani.


Da diversi anni mi accompagna con la movimentazione e l'elaborazione di un numero notevole di documenti, su vari sistemi di gestione
documentale.

------

#### Aggiornata all'ultima versione della specifica proveniente dall'Agenzia Delle Entrate (1.7).
Link della specifica completa in formato pdf: [Specifica](https://www.agenziaentrate.gov.it/portale/documents/20143/4056792/Allegato+A+-+Specifiche+tecniche+vers+1.7_30122021.pdf/80bc484b-57d8-1803-f1ab-948bf95912b9)

Funzionalità di base versione 0.1:
1) Possibilità di utilizzare un semplice esempio di fattura per testare le sue funzionalità di base con dati fittizi.
2) Supporto totale alla specifica. (Compatibile con il supporto alla nuova gestione del tag AltriDatiGestionali).
3) Possibilità di scrivere e creare porzioni di documento XML.


### Installazione per i test di prova
All'interno della cartella del progetto lanciare da riga di comando: 
```
mvn clean
```

```
mvn install
```

Testata con Maven 3 e Java 8 (al momento).

Il progetto è stato ideato utilizzando le API di JAXB 2.3.1: 

Per maggiori dettagli [Link](https://en.wikipedia.org/wiki/Jakarta_XML_Binding) 

### Avvio creazione xml di prova:
```
java -jar fattura-digitale-0.1.jar creaFattura IT 99999999999 00001 ./xml
```

L'azione genera un file xml nominato IT99999999999_00001.xml, sotto la cartella indicata che viene indicata.

--------

## English presentation and instruction

I'm pleased to share with all of you Open Source version of Italian Electronic Invoice Java Library, according to the Italian rules and specifications.

--------
I think that the process of digitization of document management is important for all size of organizations and any grade.
My primer experience with the sphere of document management sphere begin with Italian E-Invoice.


#### Updated with latest version of ADE (Agenzia delle Entrate) specifications (1.7).

Link to the completed document in pdf: [Specifica](https://www.agenziaentrate.gov.it/portale/documents/20143/4056792/Allegato+A+-+Specifiche+tecniche+vers+1.7_30122021.pdf/80bc484b-57d8-1803-f1ab-948bf95912b9)



### Installation
In the project folder run following commands:
```
mvn clean
```

```
mvn install
```

Tested with Maven 3 and Java 8 (more modern versions to come).

This component use JAXB API 2.3.1 version.

### Run Main Example 
```
java -jar fattura-digitale-0.1.jar creaFattura IT 99999999999 00001 ./xml
```

--------

### License
CC BY 4.0 
Gaetano D'Orsi 
@Tudor44/@Noirepa. 
