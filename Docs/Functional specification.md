
**Áttekintés**
Egy olyan  rendszert fejlesztünk, ami egy kemping gyorsabb, áttekinthetőbb rendszerét szeretné létrehozni , ezzel meg könnyítve a kemping recepciósának munkáját. A rendszer az egyszerűségre alapoz ,hogy minél könnyebben és egyszerűbben megtanulható és átláthatóbb legyen a recepciós számára.A projekt netes böngészőből indítható lesz így akármilyen platformon elérhető , nem létfontosságú , hogy a munkatárs egy irodai környezetben legyen.Akár egy tabletről is le tudjuk foglalni a megfelelő férőhelyet. A rendszerünk nyilvántartja a szabad és foglalt férőhelyeket, illetve egy grafikus felületen is láthatóak ezek (A megfelelő intervallumok között). Ha az ügyfél szeretne a kempingben egy férőhelyet lefoglalni , akkor előbb regisztrálásra lesz szüksége ahol meg kell adni a személyes adatait ami arra szolgál ,hogy letudjuk foglalni a kemping helyet az adott adatokra. Ha ez megtörtént le is foglalhatjuk a helyet. Ha véletlenül a vendég valamilyen okból leszeretné mondani a foglalását akkor ezt megteheti.A távozás előtt a fizetéskor a rendszer egy nyugtát hozlétre és nyomtatt ki.ű
**Jelenlegi helyzet**

- Lassú papír alapú könyvelés

- Nagyobb a hibalehetőségek kockázata

- Sok vendég esetén nehéz az áttekinthetőség

**Követelmény lista**
| modul| id | név | verzió | kifejtés | 
| --- | ---: | --- | --- | --- |
| funkció| K1 | Férőhelyek-lekérdezése |1.0| A recepciós lekérdezi a kemping férőhelyek adatait a megadott időre vonatkozóan. |
| funkció| K2| Foglalás |1.0| Amikor a Recepciós lefoglalja a Vendégnek az adott kempinghelyet, a foglalás saját azonosítót kap.|
| funkció| K3| Számla generálása |1.0| A vendég foglaláskor számlát kap.| 
| modifikáció | K4| Módosítás |1.0| A foglalás időtartama és a számla módosul. |
| funkció| K5| Távozás |1.0| A kemping rendszer kilépteti a vendéget távozáskor. |
| funkció| K6| Lemondás|1.0| A vendég bármikor lemondhatja a foglalást jelen időpontra vonatkozólag. |
**Jelenlegi üzleti folyamatok modellje**
 mai világban már létezik egy technika az adatok dinamikus kezelésére, ennek ellenére számos kemping még a régi módszereket alkalmazza. A régi megszokott megoldás papír alapú foglalásokat jelent. A recepciós emiatt lassabban és nehezebben látja át a foglalt illetve a szabad parcellákat, illetve a különböző vendégekhez tartozó adatokat. A papír alapú könyvelés növeli a hibázás kockázatát, emellett nehezebben javítható. Ez a megoldás a XXI. században elavultnak számít, ráadásul nem igazán környezetbarát módszernek minősül. 
**Igényelt üzleti folyamatok**
A megrendelő számára a legkézenfekvőbb megoldás a vendégek adatainak illetve a foglalásoknak digitális felvétele és kezelése, továbbá elektronikus számla kiállítása. A jelenleg használt kézi megoldásokhoz képest sokkal előnyösebb a digitális rendszer, hiszen itt a hiba kockázata kisebb.
   
> A cél, hogy adott időközre megkapjuk mely parcellák szabadok, illetve foglaltak.
> A vendégek választhatnak, hogy igényel e elektromosságot, illetve sátorban vagy karavánban tölti az időt, ennek megfelelően jelzi a rendszer a számára megfelelő helyeket, illetve e szerint állapítja meg az árat.
> Minden vendég lefoglalhatja a számára legjobb parcellát.
> A rendszernek számon kell tartania az adott időközben foglalt parcellákat, ezekre ne engedjen több foglalást amíg az adott foglalás ideje le nem jár.
> A számlát a vendég távozásakor kapja meg és fizeti ki.

**Használati esetek**
Recepciós: 
A recepciósa következőket tudja kezelni a rendszeren belül :
>a vendég adatait felvinni
>a vendég adatait megtekinteni
>a vendég adatit módosítani
>a vendég adatait törölni
>
>foglalásokat létrehozni.
>foglalásokat lekérdezni
>foglalásokat módosítani
>foglalásokat törölni

**Megfeleltetés , hogyan fedik le a használati esetek a követelményeket**
 A recepciós feladatkör ellátja az adminisztrátor feladatát. Az weboldal megnyitásakor megnyílik a főoldalunk, ahol található a Lekérdezés ,amellyel letudjuk kérdezni mely férőhelyek szabadak illetve foglaltak adott intervallumon. Ez alatt található a vendég felvétele. A weboldal középső részén találjuk a a férőhelyeket amelyeket a lekérdezésben megadott intervallumon lefoglalt időpontban megjeleníti a foglalt kemping helyeket pirossal ,a szabad helyeket zölddel és a kemping szám. A jobb oldalon pedig letudjuk foglalni , férőhely száma alapján a mezők kitöltésével.



