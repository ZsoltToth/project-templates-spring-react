# Software Requirement Specification

## 1. Áttekintés

**1.1 A leírás célja**

Ennek a dokumentumnak célja, hogy részletes leírást adjon a Kemping menedzselő rendszer projektről. Bemutatja a rendszer célját és feladatait, részeit a megrendelő és a készítők számára is.

**1.2 A projekt leírása**

*Egy parcellázott kemping számára foglalós rendszert készítünk.*

Az online kemping menedzser rendszer segítségével a recepciós lebonyolítja a helyfoglalás menetét. A rendszer számontartja a szabad, illetve a foglalt férőhelyeket – parcellákat. A vendég kérése alapján a recepciós űrlapot tölt ki. Az űrlap eredményeképp a férőhelyek vizuálisan megjelennek, ennek segítségével a recepciós lefoglalja a vendég számára megfelelő szabad helyet. Adatbázis rögzíti a vendégek és foglalások adatait. A foglalás lemondható illetve módosítható. A rendszer jelzi amikor a foglalás ideje lejár, a vendégéjszakáknak és egyéb opcióknak megfelelően kiszámolja a fizetendő összeget. A helyek a vendég távozásakor felszabadulnak.

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

A recepciós kérdéseket tesz fel a vendégnek: Sátorral vagy gépkocsi-karavánnal szeretne kempingezni? Mettől meddig szeretné a kempinghelyet bérelni? A vendég megválaszol ezekre a kérdésekre, mely válaszokat a recepciós betáplálja az űrlapba. Az űrlap eredményeképp a szoftver megmutatja, melyik kempinghelyek felelnek meg a vendég kérésének. A vendég kiválasztja a számára legjobb helyet, melyet a recepciót betáplál a foglalás űrlapjába. A vendég választhat, kér-e elektromosságot. A recepciós bekéri a vendég adatait, megtörténik a foglalás.

**3.4 Továbbfejlesztési lehetőségek**

A későbbiekben maga a kemping funkcionalitása is fejlődik. Új épületek, új szolgáltatások, bővülő kemping hely fogadja a látogatókat.

Természetesen fontos a naprakészség: a jövőben a rendszer követi fogja az építkezést, terjedést: felkerülnek térképére és adatbázisába az új parcellák, épületek.

**3.5 A szükséges rendszer specifikáció**

Az alábbi hardvereszközök szükségesek a program működtetéséhez:

A recepciósnak szüksége van egy számítógépre, melyhez két monitor tartozik. A recepciós egy kisebb 30" monitorral dolgozik. A másik, nagyméretű fali monitor a látogató számára mutatja a térképet, a szabad és foglalt helyeket. Az adatbázis a kemping szervergépén fut.

## 4. Funkcionális követelmény

**4.1 A recepciós, mint felhasználó lehetőségei:**

- Lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint.
- Betáplálhatja a rendszerbe a kérést miszerint a vendég sátorral, vagy karavánkocsival szeretne a kempingbe tartózkodni, szüksége van-e áramra, illetve mettől meddig marad a kempingben.
- Betáplálhatja a vendég adatait a rendszerbe a foglaláshoz.
- Le tudja foglalni a vendég számára a megfelelő helyet.
- A vendég kérésére megszüntetheti illetve módosíthatja a foglalást.
- A rendszer segítségével ki tudja nyomtatni a bizonylatot.

## 5. Követelmény lista

**5.1 A rendszer fontos tulajdonságai:**

- Tartalmaznia kell a férőhelyek információit. Minden férőhelynek egyedi azonosítója van. Adatbázisban tárolja, hogy az adott helyek foglaltak, vagy szabadak-e, illetve karaván-kocsi elfér-e az adott helyen. A helyek elhelyezkedése, azonosítója, foglaltsága a felhasználói felületen vizuálisan megjelenik.

- Űrlap tölthető ki: megadott kérdések tölthetők ki a vendég kérése alapján.
- A rendszer képes lekérdezni a kitöltött űrlap szerint megfelelő helyeket.
![Férőhelyek lekérdező űrlapja](https://media.discordapp.net/attachments/757619777828159620/775164040338472970/ferohely-lekerdezes.png)

- A vendég által kiválasztott hely lefoglalható az adott időközre.
- Foglaláshoz a rendszer eltárolja a vendégek adatait, illetve az opcionális elektromosság igénybevételét.
- Mindezek alapján meghatározza azt az összeget, amit foglaláskor kell fizetni.

![Foglalás űrlapja](https://media.discordapp.net/attachments/757619777828159620/775164045178830898/foglalas.png)


- Kijelentkezéskor a helyet automatikusan felszabadítja a rendszer. Korábbi távozás esetén van lehetőség manuális beállításra is – ekkor az összeg módosul: a vendég visszakapja a visszamondott éjszakák árát.

![Férőhely lemondása](https://media.discordapp.net/attachments/757619777828159620/775164048135684177/foglalas-lemondasa.png)

- Lehetőség van adott id-jű férőhely foglalásának módosítására - amennyiben az újonnan beállított kezdő és befejező dátum között más vendég nem foglalja az adott helyet. Módosítható az elektromosság igénylése, és a vendég adatai is. 
	Ha azonban a vendég másik férőhelyre szeretne "átköltözni", ahhoz először le kell mondania előző férőhelyét és egy újat igényelni - hiszen a foglalás módosítása a vendég által jelenleg foglalt id-jű férőhelyhez szól. 

![Foglalás módosítása](https://media.discordapp.net/attachments/757619777828159620/775168174093500416/unknown.png?width=422&height=671)

`Készítették: Katyina Brigitta, Guti Adrián, Csattos Bence, Majoros Norbert`

## 6. Esetek és funkciók

**6.1 Recepciós:**

- A rendszer felhasználója kizárólag a recepciós, aki kérdéseket tesz fel a vendég számára a hellyel kapcsolatban.

- A recepciós a vendég válaszainak megfelelően kitölti a férőhely-lekérdező űrlapot

- Lekérdezi a szabad helyeket a kitöltött űrlapba táplált adatoknak megfelelően. A lekérdezés alapján megmutatja a szabad helyeket a vendégnek.

- A recepciós jelzi a rendszerben, hogy szükséges-e elektromosság,  bekéri a vendég adatait.
- A recepciós lefoglalja a vendég által kiválasztott helyet a férőhelyek lekérdezésekor  megadott időközre.

- A recepciós a foglalás adatai alapján kiállítja a számlát.

- A recepciós bármikor törölheti a foglalást. 

- A recepciós módosíthatja az adott férőhely foglalási adatait.

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

- Látja az igényelhető helyeket

- Kiválasztja a számára megfelelő helyet, ha van ilyen.

- Amenyiben nincs megfelelő hely a vendég számára, nem történik foglalás

-  Módosíttathatja a foglalást

- A vendég bármikor lemondhatja a foglalást

`Készítette: Csattos Bence`

## 7. Szükséges adatok
**7.1 Szükséges adatok táblázatos formában:**

| id | név | kifejtés | 
| ---: | --- | --- |
| K1 | Férőhely-lekérdezés | A recepciós lekérdezi a kemping férőhelyek adatait a megadott időre vonatkozóan. |
| K2| Foglalás | Amikor a Recepciós lefoglalja a Vendégnek az adott kempinghelyet, a foglalás saját azonosítót kap.|
| K3| Számla generálása | A vendég foglaláskor számlát kap.| 
| K4| Módosítás | A foglalás időtartama és a számla módosul. |
| K5| Távozás | A kemping rendszer kilépteti a vendéget távozáskor. |
| K6| Lemondás| A vendég bármikor lemondhatja a foglalást jelen időpontra vonatkozólag. |

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
      from: datetime,
      to: datetime
    }, ...
  ],
  price: int
}
```

***K4: Módosítás:***
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
`Készítette: Katyina Brigitta`

***Férőhelyek:***

- Egy férőhelynek van ID-je, ami a fix helyre utal.

- Tárolva van: adott férőhelyen lakókocsi elfér-e, vagy csak sátrazás lehetséges.

- A kemping hely lehet szabad illetve foglalt.

*A helyek elhelyezkedése, azonosítója, foglaltsága a felhasználói felületen vizuálisan megjelenik.*

![kemping térképe](https://media.discordapp.net/attachments/757619777828159620/772623210101211146/kemping-terkep.png?width=725&height=671)

***Vendég:***

- Egy vendégnek van neve, lakcíme, személyi száma és telefonszáma.

***Foglalás:***

- Egy foglalásban található a hely száma, a kempingezés kezdetének illetve befejezésének dátuma, az elektromosság igénybevétele. A vendég személyi száma jelzi, a helyet melyik vendég foglalta le.

***Foglalás lemondása/megszakítása:***

- Minden foglalásnak generált id-je van. A recepciós ez alapján törölheti, vagy módosíthatja a foglalást.

**Számla:**

- A kemping hely árát a foglalás adatai alapján határozzuk meg és így kerül előállításra a számla.

`Készítették: Katyina Brigitta, Guti Adrán, Majoros Norbert`