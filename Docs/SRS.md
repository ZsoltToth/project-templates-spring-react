## 1. Áttekintés

*Egy parcellázott kemping számára foglalós rendszert készítünk.*

Az online kemping menedzser rendszer segítségével a recepciós lebonyolítja a helyfoglalás menetét. A rendszer számontartja a szabad, illetve a foglalt férőhelyeket – parcellákat. A vendég kérése alapján a recepciós űrlapot tölt ki. Az űrlap eredményeképp a férőhelyek vizuálisan megjelennek, ennek segítségével a recepciós lefoglalja a vendég számára megfelelő szabad helyet. Adatbázis rögzíti a vendégek és foglalások adatait. A helyek a vendég távozásakor felszabadulnak. A rendszer jelzi amikor a foglalás ideje lejár, a vendégéjszakáknak és egyéb opcióknak megfelelően kiszámolja a fizetendő összeget. 

## 2. Jelenlegi helyzet

*Az eddigiekben használt offline rendszert szeretnénk modernizálni. Ezentúl a foglalás menete, a szabad- illetve foglalt parcellák követése, a számla összegének kiszámítása elektronikus módon fog történni.*

**A jelenlegi helyzet problémái:**
- Lassú papír alapú könyvelés
- Nagyobb a hibalehetőségek kockázata
- Sok vendég esetén nehéz az áttekinthetőség

## 3. Vízió

- **3.1** Terjedés: kik fogják használni a rendszert
 A program a kemping recepciósának készül. Az interaktív, vizuális felület segítségével a recepciós élőben látja az aktuális állapotot. A rendszert a modernizálás, az átláthatóság céljából készítjük: használatával egyszerűbb, gyorsabb, könnyebb lebonyolítani a helyfoglalást. 

 - **3.2** A recepciós a vendég kérése alapján űrlapot tölt ki, majd foglal. 
A recepciós kérdéseket tesz fel a vendégnek: Sátorral vagy gépkocsi-karavánnal szeretne kempingezni? Szüksége van-e áram-szolgáltatásra? Hány vendégéjszakát szeretne a kempingben tölteni? A vendég megválaszol ezekre a kérdésekre, mely válaszokat a recepciós betáplál az űrlapba. Az űrlap eredményeképp a szoftver megmutatja, melyik kempinghelyek felelnek meg a vendég kérésének. A vendég választ, majd a recepciós a vendég számára legjobb helyet lefoglalja.

- **3.3** A későbbiekben maga a kemping funkcionalitása is fejlődik.
 Új épületek, új szolgáltatások, bővülő kemping hely fogadja a látogatókat.
Természetesen fontos a naprakészség: a jövőben a rendszer követi fogja az építkezést, terjedést: felkerülnek térképére és adatbázisába az új parcellák, épületek.

- **3.4** Rendszer specifikációs álmok.
 Az alábbi hardvereszközök szükségesek a program működtetéséhez: 
 A recepciósnak szüksége van egy főszámítógépre, melyhez két monitor tartozik. A recepciós egy kisebb 30" monitorral dolgozik. A másik, nagyméretű fali monitor, a látogató számára mutatja a térképet, szabad és foglalt helyeket. Az adatbázis a kemping szervergépén fut.
 
 ## 4. Funkcionális követelmény
 *A recepciós, mint felhasználó lehetőségei:*
  - Lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint.
  - Betáplálhatja a rendszerbe a kérést miszerint a vendég sátorral, vagy karavánkocsival szeretne a kempingbe tartózkodni, szüksége van-e áramra, illetve mennyi vendégéjszakát marad a kempingben.
  - Le tudja foglalni a vendég számára a megfelelő helyet.
  - A rendszer segítségével ki tudja nyomtatni a bizonylatot.

 ## 5. Követelmény lista
 *A rendszer fontos tulajdonságai:*
 - Tartalmazza a férőhelyek információit: a lefoglalt illetve a szabad helyeket adatbázisban tárolja és vizuálisan is jelzi.
 - Űrlap tölthető ki a vendég kérése alapján
 - Képes lekérdezni a kitöltött űrlap szerint megfelelő helyeket.
 - A vendég által kiválasztott helyet lefoglalja az adott időközre.
 - Eltárolja a vendégek adatait.
 - Mindezek alapján meghatározza azt az összeget, amit foglaláskor kell fizetni.
 - Kijelentkezéskor a helyet automatikusan felszabadítja a rendszer. Korábbi távozás esetén van lehetőség manuális beállításra is – ekkor az összeg módosul: a vendég visszakapja a visszamondott éjszakák árát.
 
 `Készítették: Katyina Brigitta, Guti Adrián, Csattos Bence, Majoros Norbert`
 
 ## 6. Esetek és funkciók
  **Recepciós:**
  - A program felhasználója
  - Törölheti a foglalást
  - Kérdéseket tesz fel a vendég számára a hellyel kapcsolatban
  - Megkapja a vendég válaszait
  - Válaszoknak megfelelően tölti ki a formot és elindítja a lekérdezést
  - A lekérdezés alapján megmutatja a szabad helyeket a vendégnek, ha van ilyen
  - Vendég által kiválasztott helyet lefoglalja
  - Kiállítja a számlát
  
**Recepciós-Vendég:**
 - Alap kérdések a hellyel, illetve a Vendég igényeivel kapcsolatban:
 >-Lakókocsija vagy sátra van-e?
 >-Hány éjszakát szeretne a kempingben tölteni?
 >-Szüksége van-e elektromosságra?
 >-Elkéri a Vendég adatait: név, személyi igazolvány szám, lakcím, telefonszám
- Recepciós megmutatja a lehetséges helyket
- Megkérdezi, hogy melyik helyet szeretné igénybe venni

 **Vendég:**

 - Válaszol a Recepciós kérdéseire
 - Lemondhatja foglalást
 - Látja az igényelhető helyeket
 - Kiválasztja a számára megfelelő helyet,ha van ilyen.
 - Amenyiben nincs megfelelő hely a venég számára, nem történik foglalás
 - A vendég bármikor lemondhatja a szolgáltatást vagy a foglalást
 
 `Készítették: Csattos Bence`
 
 ## 7. Adatstruktúrák definiálása

**Kemping hely leírás:** 
*Egy kemping helynek van ID-je ami a fix helyre utal. Az ID alapján megtudhatjuk , hogy milyen típusú az adott hely. Mint például egy lakókocsi elfér-e egy helyre vagy csak sátrazás lehetséges. A kemping hely lehet szabad illetve foglalt.*

![enter image description here](https://media.discordapp.net/attachments/760108206675460146/766589968603807754/camp-map-design.jpg)

**Vendég:**
>Egy vendégnek van neve, lakcíme, személyi száma és telefonszáma.

**Foglalás:** 
>Egy foglalásban található a hely száma, érkezési és távozási dátuma, illetve melyik vendég foglalta le.

**Foglalás lemondása/megszakítása:**
> Foglalás ID-t kap és ez alapján módosítja a foglalást.

**Számla:**
>A kemping hely árát a foglalás adatai alapján határozzuk meg és így kerül előállításra.

`Készítették: Katyina Brigitta, Guti Adrán, Majoros Norbert`
