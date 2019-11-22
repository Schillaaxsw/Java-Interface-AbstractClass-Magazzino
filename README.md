# Java-Interface-AbstractClass-Magazzino

## Esercizio 1

CLASSI ASTRATTE E INTERFACCIE

### Descrizione
Si vuole realizzare un software di gestione di un magazzino di stoccagio per prodotti alimentari.

Alcuni prodotti fanno parte di gruppi come i prodotti della pesca.

Altri prodotti se pur appartenneti a categorie differente anche alcune caratteristiche in comune quali il prezzo per kilogrammo
o il codice a basse frequenze (NFC code).

Si vuole ottimizzare la gestione dello spazio.

Ricevuti i proddoti dai propri fornitori in **lotti** (pallet) dello stesso prodotto si vuole sapere dove possono essere collocati.

Ogni lotto occupa un certo spazio definito in metri quadri e ogni settore ha una percentuale di spazio ottenuta dal metodo
getMqDisponibili che restituisce i mq disponibili.

Su alcuni prodotti, quali il pesce o carne, sono presenti dei vincoli quali la temperatura di conservazione.

Il magazzino è diviso in **settori** che hanno una certa dimensione, una temperatura e uno spazio disponibile.


1. creare una interfaccia Prodotto (di vendita) con metodi getDescrizione e getPrezzo

2. Creare una classe Orata (pesce) che implementi l'interfaccia Prodotto
 a)gli attributi della classe sono descirzione e prezzo
 b)deve implementare i metodi dell'interfaccia Prodotto

3. Creare una interfaccia Pesabile con metodi setPeso e getPeso

4. Creare una classe Farina che implementi Prodotto e Pesabile
 a)con attributi prezzoAlKg e peso
 b)la classe deve implementare i metodi delle interfacce
 c)modificare in maniera opportuna il metodo getPrezzo
 
5. Creare una interfaccia NFCLeggibile con metodi getId e getPosizione
 
6. La classe Orata deve implementare Pesabile

7. Creare una classe ABSTRACT Pesce
 a)con metodi getLuogoPesca e getTempCons (restituisce la temperatura di conservazione)
 
8. Estendere la classe Orata con la classe astratta Pesce

9. Creare la classe Settore 
 a)con attributi posizione, mq (metri quadrati), lotti e temperatura
 b)con metodi getter per ogni attributo e un metodo getMqDisponibili
 
10. Creare classe lotto che implementi NFCLeggibile
 a)con attributi fornitore, prodotto e quantita e metriQuadri
 b)con metodi getter e getPrezzo
 
11. Creare classe Magazzino che contiene il main  
 a)una funzione per collocare i lotti nei vari settori nel caso ci fosse spazio e che aggiorni lo spazio disponibile
 b)crere un magazzino che è un array di settori
 c)creare delle istanze di farina e di orata
 d)creare dei lotti che contengano delle istanze di farina o di orata
 e)con una funzione che dato un lotto restituisce tutti i settori nei quali può essere collocato in base allo spazio e alla temperatura
  1)lo spaio disponibile deve essere superiore a quello richiesto dal lotto e la temperatura del settore deve essere inferiore uguale a
  quella richiesta dal prodotto
 f)Il settore contiene un array di lotti
