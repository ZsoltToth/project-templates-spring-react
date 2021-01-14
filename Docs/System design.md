## 1. A rendszer célja
Az eddigiekben használt offline rendszert szeretnénk modernizálni. Ezentúl a foglalás menete, a szabad- illetve foglalt parcellák követése, a számla összegének kiszámítása elektronikus módon fog történni. A projekt webalkalmazásként fog elkészülni. Így a környezet védelmére is figyelünk, hiszen kevesebb papír kerül felhasználásra.

## 2. Projekt terv
**Projekt szerepkörök, felelősségek**
-   szerepkörök
	-  product owner: Tóth Zsolt 
    -   scrum master: Madaras József Károly (elhagyott)
    -   junior fejlesztők: 1. Katyina Brigitta, 2. Guti Adrián, 3. Csattos Bence, 4. Majoros Norbert
-   felelősségek:
    -   scrum master: A Scrum mester felügyeli és megkönnyíti a folyamat fenntartását, segíti a csapatot, ha problémába ütközik, illetve felügyeli, hogy mindenki betartja-e a Scrum alapvető szabályait.
    -   junior fejlesztő: A projekt elkészítése. 
    
  **Projekt munkások és felelősségeik**
-   Webfelület: Katyina Brigitta
-   Frontend: Guti Adrián, Majoros Norbert
-   Backend: Csattos Bence


## 3. Üzleti folyamatok modellje

![A projekt use-case modellje](https://cdn.discordapp.com/attachments/757619777828159620/799225167204974592/Use-case.jpg)


A recepciós feladatkör ellátja az adminisztrátor feladatát. A vendég nincsen közvetlen kapcsolatban a rendszerünkel, de közvetett módon a recepciós által kerül kapcsolatba a rendszerrel. A weboldal megnyitásakor megnyílik a főoldalunk, ahol található a Lekérdezés, amellyel letudjuk kérdezni mely férőhelyek szabadok illetve foglaltak az adott intervallumon. Ez alatt található a vendég felvétele. A weboldal középső részén találjuk a férőhelyeket amelyeket a lekérdezésben megadott intervallumon lefoglalt időpontban megjeleníti a foglalt kemping helyeket pirossal, a szabad helyeket zölddel és a kemping számát. Ezt a térképet a vendég egy nagy képernyőn tekintheti meg. A jobb oldalon pedig letudjuk foglalni a férőhely száma alapján a mezők kitöltésével.
 A cél, hogy adott időközre megkapjuk mely parcellák szabadok, illetve foglaltak. A vendégek választhatnak, hogy igényel e elektromosságot, illetve sátorban vagy karavánban tölti az időt, ennek megfelelően jelzi a rendszer a számára megfelelő helyeket, illetve e szerint állapítja meg az árat. Minden vendég lefoglalhatja a számára legjobb parcellát. A rendszernek számon kell tartania az adott időközben foglalt parcellákat, ezekre ne engedjen több foglalást amíg az adott foglalás ideje le nem jár. A számlát a vendég távozásakor kapja meg és fizeti ki.

- A recepciós lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint. 
- Betáplálhatja a rendszerbe a kérést miszerint a vendég sátorral, vagy karavánkocsival szeretne a kempingbe tartózkodni, szüksége van-e áramra, illetve mettől meddig marad a kempingben. 
- Betáplálhatja a vendég adatait a rendszerbe a foglaláshoz.
- Le tudja foglalni a vendég számára a megfelelő helyet.
- A vendég kérésére megszüntetheti illetve módosíthatja a foglalást.
- A rendszer segítségével ki tudja nyomtatni a bizonylatot.


## 4. Követelmények

| modul| id | név | verzió | kifejtés | 
| --- | ---: | --- | --- | --- |
| funkció| K1 | Férőhelyek-lekérdezése |1.0| A recepciós lekérdezi a kemping férőhelyek adatait a megadott időre vonatkozóan. |
| funkció| K2| Foglalás |1.0| Amikor a Recepciós lefoglalja a Vendégnek az adott kempinghelyet, a foglalás saját azonosítót kap.|
| funkció| K3| Számla generálása |1.0| A vendég foglaláskor számlát kap.| 
| modifikáció | K4| Módosítás |1.0| A foglalás időtartama és a számla módosul. |
| funkció| K5| Távozás |1.0| A kemping rendszer kilépteti a vendéget távozáskor. |
| funkció| K6| Lemondás|1.0| A vendég bármikor lemondhatja a foglalást jelen időpontra vonatkozólag. |

## 5. Funkcionális terv
**A recepciós, mint a rendszer felhasználója**

- Lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint.
- Betáplálhatja a rendszerbe a kérést miszerint a vendég sátorral, vagy karavánkocsival szeretne a kempingbe tartózkodni, szüksége van-e áramra, illetve mettől meddig marad a kempingben.
- Betáplálhatja a vendég adatait a rendszerbe a foglaláshoz.
- Le tudja foglalni a vendég számára a megfelelő helyet.
- A vendég kérésére megszüntetheti illetve módosíthatja a foglalást.
- A rendszer segítségével ki tudja nyomtatni a bizonylatot.

**Menü hierarchiák**

*Férőhelyek lekérdezése:*
- Kezdés dátuma
- Befejezés dátuma
- Sátor/Karaván ?
  - Sátor
  - Karaván

*Vendég létrehozása:*

- Név
- Email
- Telefonszám
- Lakcím
    > Létrehoz

*Foglalás:*

- Férőhely száma
- Szükséges elektromosság ?
     -  Igen
     - Nem
- Kezdés dátuma
- Befejezés dátuma 
- Vendég email címe
	 >Foglal


