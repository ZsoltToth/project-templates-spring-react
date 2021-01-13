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

## 5. Rendszerre vonatkozó törvények, rendeletek, szabályok és szabványok

>  2016. évi XCIII. törvény a szerzői jogok és a szerzői joghoz kapcsolódó jogok közös kezeléséről
    
>  1997. évi CLV. törvény a fogyasztó védelemről
    
>   1999. évi L XXVI. törvény a szerzői jogról 210/2009. (IX. 29.) Korm. rendelet a kereskedelmi tevékenységek végzésének feltételeiről
     

AZ EURÓPAI PARLAMENT ÉS A TANÁCS 1169/2011/EU RENDELETE (2011. október 25.) A természetes személyeknek a személyes adatok kezelése tekintetében történő védelméről és az ilyen adatok szabad áramlásáról, valamint a 95/46/EK rendelet hatályon kívül helyezéséről (általános adatvédelmi rendelet) AZ EURÓPAI PARLAMENT ÉS A TANÁCS (EU) 2016/679 RENDELETE (2016. április 27.)

>  2011. évi CXII. törvény – az információs önrendelkezési jogról és az információszabadságról (a továbbiakban: Infotv.)
    
>  2001. évi CVIII. törvény – az elektronikus kereskedelmi szolgáltatások, valamint az információs társadalommal összefüggő szolgáltatások egyes kérdéseiről (főképp a 13/A. §-a)

## 6. Jelenlegi üzleti folyamatok modellje 

A mai világban már létezik egy technika az adatok dinamikus kezelésére, ennek ellenére számos kemping még a régi módszereket alkalmazza. A régi megszokott megoldás papír alapú foglalásokat jelent. A recepciós emiatt lassabban és nehezebben látja át a foglalt illetve a szabad parcellákat, illetve a különböző vendégekhez tartozó adatokat. A papír alapú könyvelés növeli a hibázás kockázatát, emellett nehezebben javítható. Ez a megoldás a XXI. században elavultnak számít, ráadásul nem igazán környezetbarát módszernek minősül. 

## 7. Igényelt üzleti folyamatok

A megrendelő számára a legkézenfekvőbb megoldás a vendégek adatainak illetve a foglalásoknak digitális felvétele és kezelése, továbbá elektronikus számla kiállítása. A jelenleg használt kézi megoldásokhoz képest sokkal előnyösebb a digitális rendszer, hiszen itt a hiba kockázata kisebb.
   
> A cél, hogy adott időközre megkapjuk mely parcellák szabadok, illetve foglaltak.
> A vendégek választhatnak, hogy igényel e elektromosságot, illetve sátorban vagy karavánban tölti az időt, ennek megfelelően jelzi a rendszer a számára megfelelő helyeket, illetve e szerint állapítja meg az árat.
> Minden vendég lefoglalhatja a számára legjobb parcellát.
> A rendszernek számon kell tartania az adott időközben foglalt parcellákat, ezekre ne engedjen több foglalást amíg az adott fogallás ideje le nem jár.
> A számlát a vendég távozásakor kapja meg és fizeti ki.