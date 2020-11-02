# Software Requirement Specification

## 1. Áttekintés

**1.1 A leírás célja**

Ennek a dokumentumnak célja, hogy részletes leírást adjon a Kemping menedzselő rendszer projektről. Bemutatja a rendszer célját és feladatait, részeit a megrendelő és a készítők számára is.

**1.2 A projekt leírása**

*Egy parcellázott kemping számára foglalós rendszert készítünk.*

Az online kemping menedzser rendszer segítségével a recepciós lebonyolítja a helyfoglalás menetét. A rendszer számontartja a szabad, illetve a foglalt férőhelyeket – parcellákat. A vendég kérése alapján a recepciós űrlapot tölt ki. Az űrlap eredményeképp a férőhelyek vizuálisan megjelennek, ennek segítségével a recepciós lefoglalja a vendég számára megfelelő szabad helyet. Adatbázis rögzíti a vendégek és foglalások adatait. A helyek a vendég távozásakor felszabadulnak. A rendszer jelzi amikor a foglalás ideje lejár, a vendégéjszakáknak és egyéb opcióknak megfelelően kiszámolja a fizetendő összeget.

## 2. Jelenlegi helyzet

**2.1 A jelenlegi helyzet problémái:**

- Lassú papír alapú könyvelés

- Nagyobb a hibalehetőségek kockázata

- Sok vendég esetén nehéz az áttekinthetőség

## 3. Vízió

**3.1 Cél**

Az eddigiekben használt offline rendszert szeretnénk modernizálni. Ezentúl a foglalás menete, a szabad- illetve foglalt parcellák követése, a számla összegének kiszámítása elektronikus módon fog történni. A projekt webalkalmazásként fog elkészülni.

**3.2 Terjedelem**

A program a kemping recepciósának készül. Az interaktív, vizuális felület segítségével a recepciós élőben látja az aktuális állapotot. A rendszert a modernizálás, az átláthatóság céljából készítjük: használatával egyszerűbb, gyorsabb, könnyebb lebonyolítani a helyfoglalást.

**3.3 Foglalás menete**

A recepciós a vendég kérése alapján űrlapot tölt ki, majd foglal.

A recepciós kérdéseket tesz fel a vendégnek: Sátorral vagy gépkocsi-karavánnal szeretne kempingezni? Szüksége van-e áram-szolgáltatásra? Hány vendégéjszakát szeretne a kempingben tölteni? A vendég megválaszol ezekre a kérdésekre, mely válaszokat a recepciós betáplál az űrlapba. Az űrlap eredményeképp a szoftver megmutatja, melyik kempinghelyek felelnek meg a vendég kérésének. A vendég választ, majd a recepciós a vendég számára legjobb helyet lefoglalja.

**3.4 Továbbfejlesztési lehetőségek**

A későbbiekben maga a kemping funkcionalitása is fejlődik.

Új épületek, új szolgáltatások, bővülő kemping hely fogadja a látogatókat.

Természetesen fontos a naprakészség: a jövőben a rendszer követi fogja az építkezést, terjedést: felkerülnek térképére és adatbázisába az új parcellák, épületek.

**3.5 A szükséges rendszer specifikáció**

Az alábbi hardvereszközök szükségesek a program működtetéséhez:

A recepciósnak szüksége van egy fő számítógépre, melyhez két monitor tartozik. A recepciós egy kisebb 30" monitorral dolgozik. A másik, nagyméretű fali monitor, a látogató számára mutatja a térképet, szabad és foglalt helyeket. Az adatbázis a kemping szervergépén fut.

## 4. Funkcionális követelmény

**4.1 A recepciós, mint felhasználó lehetőségei:**

- Lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint.

- Betáplálhatja a rendszerbe a kérést miszerint a vendég sátorral, vagy karavánkocsival szeretne a kempingbe tartózkodni, szüksége van-e áramra, illetve mennyi vendégéjszakát marad a kempingben.

- Le tudja foglalni a vendég számára a megfelelő helyet.

- A rendszer segítségével ki tudja nyomtatni a bizonylatot.

## 5. Követelmény lista

**5.1 A rendszer fontos tulajdonságai:**


- Tartalmaznia kell a férőhelyek információit. Minden férőhelynek egyedi azonosítója van. Adatbázisban tárolja, hogy az adott helyek lefoglaltak, vagy szabadak-e, illetve karaván-kocsi elfér-e az adott helyen. A helyek elhelyezkedése, azonosítója, foglaltsága a felhasználói felületen vizuálisan megjelenik.

- Űrlap tölthető ki: megadott kérdések tölthetők ki a vendég kérése alapján
![Férőhelyek lekérdező űrlapja](https://media.discordapp.net/attachments/757619777828159620/772635835031879700/ferohely-lekerdezes.png)


- A rendszer képes lekérdezni a kitöltött űrlap szerint megfelelő helyeket.

- A vendég által kiválasztott helyet lefoglalja az adott időközre.

- Eltárolja a vendégek adatait.

![Foglalás űrlapja](https://media.discordapp.net/attachments/757619777828159620/772635863833772052/foglalas.png)

- Mindezek alapján meghatározza azt az összeget, amit foglaláskor kell fizetni.

- Kijelentkezéskor a helyet automatikusan felszabadítja a rendszer. Korábbi távozás esetén van lehetőség manuális beállításra is – ekkor az összeg módosul: a vendég visszakapja a visszamondott éjszakák árát.

![Férőhely lemondása](https://cdn.discordapp.com/attachments/757619777828159620/772635885471924274/foglalas-lemondasa.png)



`Készítették: Katyina Brigitta, Guti Adrián, Csattos Bence, Majoros Norbert`

## 6. Esetek és funkciók

**6.1 Recepciós:**

- A rendszer felhasználója kizárólag a recepciós, aki kérdéseket tesz fel a vendég számára a hellyel kapcsolatban.

- A recepciós a vendég válaszainak megfelelően kitölti a szabad helyek űrlapját,

- Lekérdezi a szabad helyeket a kitöltött űrlapba táplált adatoknak megfelelően. A lekérdezés alapján megmutatja a szabad helyeket a vendégnek, ha vannak.

- A recepciós lefoglalja a vendég által kiválasztott helyet a megadott időközre.

- A recepciós bekéri a vendég adatait a számla kiállításához, majd kiállítja a számlát.

- A recepciós bármikor törölheti a foglalást. Jövőbeli vagy jelenleg lefoglalt helyet is felszabadíthat.

**6.2 Recepciós-Vendég:**

- Alap kérdések a hellyel, illetve a Vendég igényeivel kapcsolatban:

>-Lakókocsija vagy sátra van-e?

>-Hány éjszakát szeretne a kempingben tölteni?

>-Szüksége van-e elektromosságra?

>-Elkéri a Vendég adatait: név, személyi igazolvány szám, lakcím, telefonszám

- Recepciós megmutatja a lehetséges helyeket

- Megkérdezi, hogy melyik helyet szeretné igénybe venni

**6.3 Vendég:**

- Válaszol a Recepciós kérdéseire

- Lemondhatja foglalást

- Látja az igényelhető helyeket

- Kiválasztja a számára megfelelő helyet, ha van ilyen.

- Amenyiben nincs megfelelő hely a vendég számára, nem történik foglalás

- A vendég bármikor lemondhatja a foglalást

`Készítették: Csattos Bence`

## 7. Szükséges adatok
**7.1 Szükséges adatok táblázatos formában:**

| id | név | kifejtés | 
| ---: | --- | --- |
| 
| K1 | Férőhely-lekérdezés | A recepciós lekérdezi a kemping férőhelyek adatait a megadott időre vonatkozóan. |
| K2| Foglalás | Amikor a Recepciós lefoglalja a Vendégnek az adott kempinghelyet, a foglalás saját azonosítót kap.|
| K3| Számla generálása | A vendég foglaláskor számlát kap.| 
| K4| Lemondás | A foglalás időtartama és a számla módosul. |
| K5| Távozás | A kemping rendszer kilépteti a vendéget távozáskor. | 
|

`Készítette: Katyina Brigitta`

## 8. Adatstruktúrák definiálása

***K1: Férőhely-lekérdezés:***
```
{
  slot_id: uuid,
  occupied: bool,
  caravan: bool,
  from: datetime,
  to: datetime
}
```

***K2: Foglalás:***
```
{
  book_id: uuid,
  slot_id: id,
  electricity: bool,
  from: datetime,
  to: datetime
  guest_data: [
    {
      id_card: string,
      name: string,
      address: string,
      phone: int      
    }, ...
  ],
}
```

***K3: Számla generálása:***
```
{
  bill_id: uuid,
  transaction_id: uuid,
  transactions: [
    {
      book_id: uuid,
      electricity: bool,
      time: datetime
    }, ...
  ],
  price: int
}
```

***K4: Lemondás:***
```
{
  bill_id: uuid,
  transaction_id: uuid,
  transactions: [
    {
      book_id: uuid,
      electricity: bool,
      time: datetime
    }, ...
  ],
  price: int
}
```


***Férőhelyek:***

- Egy férőhelynek van ID-je, ami a fix helyre utal.

- Tárolva van: adott férőhelyen lakókocsi elfér-e, vagy csak sátrazás lehetséges.

- A kemping hely lehet szabad illetve foglalt.

*A helyek elhelyezkedése, azonosítója, foglaltsága a felhasználói felületen vizuálisan megjelenik.*

![kemping térképe](https://media.discordapp.net/attachments/757619777828159620/772623210101211146/kemping-terkep.png?width=725&height=671)

***Vendég:***

- Egy vendégnek van neve, lakcíme, személyi száma és telefonszáma.

***Foglalás:***

- Egy foglalásban található a hely száma, érkezési és távozási dátuma, illetve a vendég személyi száma jelzi, a helyet melyik vendég foglalta le.

***Foglalás lemondása/megszakítása:***

- Minden foglalásnak generált id-je van. A recepciós ez alapján törölheti a foglalást.

**Számla:**

- A kemping hely árát a foglalás adatai - vagyis a szabad helyek űrlapjába felvitt adatok - alapján határozzuk meg és így kerül előállításra.

`Készítették: Katyina Brigitta, Guti Adrán, Majoros Norbert`