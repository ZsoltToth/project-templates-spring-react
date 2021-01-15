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
	 
##6. Fizikai követelmény

 **Fejlesztői környezet:**
 (Az alábbi konfiguráció szükséges a fejlesztéshez)

 - Linux, bash, screen, curl 
 - Java, Maven, ItelliJ IDEA
 - Node, npm, WebStorm
 - Docker, docker-compose, Dockstation
 - Postman
 - git (Github account)
 -  React
 - Spring framework

Kiindulási pontunk a Tóth Zsolt által megadott projekt. amely az alábbi linken érhető el: [Projekt Templates Spring React](https://github.com/ZsoltToth/project-templates-spring-react)

**Futtatási környezet:**

A rendszer egy webalkalmazás amely első sorban elérhető számítógépen, telefonon és tableten eszközön. 

Az alábbi hardvereszközök szükségesek a program működtetéséhez:

A recepciósnak szüksége van egy számítógépre, melyhez két monitor tartozik. A recepciós egy kisebb 30" monitorral dolgozik. A másik, nagyméretű fali monitor a látogató számára mutatja a térképet, a szabad és foglalt helyeket. Az adatbázis és a backend a kemping szervergépén fut.

##7. Architekturális terv

**1. Backend **

A web app szerveroldali komponensei Java-t és Spring Frameworköt használnak MySQL-lel és Hibernate-tel.

Technológiák:
    • Maven: függőség vezérlés(depencency management) és építés
    • JUni5 & Jupiter: tesztelés
    • Lombok: konstruktor és getter/setter generáció @annitációkkal
    • SLF4J: naplózás (logging), a Lombokkal jön (injected with Lombok)
    • Hibernate: adatelérés (data access) és Object relational mapping
    • Spring Boot: függőség injection és Web kontrollerek


A szerver HTTP protokollon keresztül használható
![enter image description here](https://cdn.discordapp.com/attachments/757619777828159620/799256606432296990/unknown.png)

**2. Frontend**

•	felhasználói felületet adja
•	backenddel kommunikál.
•	A böngésző a felhasználói felület, ami mindent kirenderel és kontroller elemeket ad a felhaszánlónak. A backend HTTPvel érhető el

A frontend megkülönbözteti a
>	komponenseket,
>	actionoket,
>	store-okat
miközben a Dispatchert Axiost és kívülálló eszközöket használ	

Komponensek a React framework fő elemei, böngészőben renderelődnek. Az alkalmazás kinézete
>	gombok, formok, felhasználói interakciókat kezelnek, eveteket továbbitanak a megfelelő actionöknek
	>Action-ök elválasztják az event kezelését a vizualizációtól.
>	Implementálják a Command Desicn Patternt
>	ujrafelhasználhatók
>	AJAX kéréseketvégeznek Axiossal. Az AJAX kérések legyenek az Action-ökben!

Action szó kétértelmű, mert utalhat
>	az Actionra ami felhasználói eventeket kezel a Command/Action Design Pattern alapján.
>	Utalhat a Flux Dispatcherének dispatchelt actioneire
>	
>	Dispatcher a Flux középső eleme.

>	A Dispatcher továbbitja az összes üzenetet.
>	Ez az üzenetküldési minta hasonlit a
Message Queue és Publish/Subscribe modelekhez	Store-k tárolják a komponensek megosztott állapotát (state).
 Storek implementálják aaz event emittereket az Observer Design Pattern-t
 
>A Storek dolgozzák fel az Actionöket és Dispatchert
	Komponensek a React framework fő elemei, böngészőben renderelődnek. 
	
>Az alkalmazás kinézetegombok, formok, felhasználói interakciókat kezelnek, eveteket továbbitanak a megfelelő actionöknek
>	Action-ök elválasztják az event kezelését a vizualizációtól.
>	Implementálják a Command Desicn Patternt
>	ujrafelhasználhatók
>
>	AJAX kéréseketvégeznek Axiossal. Az AJAX kérések legyenek az Action-ökben!

Action szó kétértelmű, mert utalhat
>	az Actionra ami felhasználói eventeket kezel a Command/Action Design Pattern alapján.
>	Utalhat a Flux Dispatcherének dispatchelt actioneire
>	
>	Dispatcher a Flux középső eleme.
>	Action-ök eventeket akciókat hoznak létre a Dispatchernek, amit a Store-k dolgoznak fel.
>
>	A Dispatcher továbbitja az összes üzenetet.
>
>	Ez az üzenetküldési minta hasonlit aMessage Queue és Publish/Subscribe modelekhez	Store-k tárolják a komponensek megosztott állapotát (state). Storek implementálják a
>>	az event emittereket
>>	az Observer Design Pattern-t
A Storek dolgozzák fel az Actionöket és Dispatchert


![enter image description here](https://cdn.discordapp.com/attachments/757619777828159620/799261457233608734/unknown.png)

**9. Adatbázis terv**

Táblák:

	Camping_slot:
	
		 - id (int) PRIMARY KEY
		 - coordinatex (int)
		 - coordinatey (int)
		 - description (varchar(255))
		 - price (int)
		 - status (bit(1))
		
	camping_slot_reservations:
		 -camping_slot_entity_id (int)
		 -reservation_id (int) UK
		 -FK (reservation_id ->reservation(id))
		 -FK (camping_slot_entity_id -> campingslot(id))
	customer:
		 -id (int) PRIMARY KEY
		 -address (varchar(255))
		 -email (varchar(255))
		 -name (varchar(255))
		 -phone_number (varchar(255))
	customer_reservations:
		 -customer_entity_id(int)
		 -reservation_id (int) UK
		 -FK (reservation_id -> reservation(id))
		 -FK (costumer_entity_id -> costumer(id))
	reservation:
		 -id (int) PRIMARY KEY
		 -caravan (bit(1))
		 -electricity (bit(1))
		 -end (date)
		 -paid (int)
		 -start (date)
		 -camping_slot_id (int)
		 -costumer_id (int)
		 -FK (costumer_id -> costumer(id))
		 -FK (camping_slot_id -> campingslot(id))
	

**10. Implementációs terv:**
	
A Webes felület főként HTML, CSS, és Javascript nyelven fog készülni. Ezeket a technológiákat amennyire csak lehet külön fájlokba írva készítjük, és úgy fogjuk egymáshoz csatolni a jobb átláthatóság, könnyebb változtathatóság, és könnyebb bővítés érdekében.

 Képes lesz felhasználni a Backend részen futó REST szolgáltatás metódusait, ezáltal tud felvinni és lekérdezni adatokat az adatbázisból. 

**11. Tesztterv**
| Sorszám | Funkció neve | Vizsgálat módja/eszköze, részletes leírása | Elvárt eredmény| Eredmény
|--|--|--|--|--|
| T1 | Férőhelyek lekérdezése  | A webes felületen a kezdő dátum és záró dátum meg adása a férő helyek megjelenítéséhez|férőhelyek pirossal a foglaltat , zölddel a szabad helyek való megjelenítése adott intervallumon| lefoglalt helyek pirossal való jelzése míg a szabad helyek zölddel való megjelenítése a térképen
|T2|Vendég létre hozása|A név, email, lakcím, telefonszám kitöltése után a létrehoz gombra kattintva felvisszük az adatbázisba|a felvett vendég adatbázisba való létre jötte|Az adatbázisban megtalálható a felvett vendég
|T3|Foglalás|Férőhely számának megadása, sátor vagy karaván kiválasztása, elektromosság igénylése, kempingezés kezdés és befejezés dátumának megadása, vendég email címe amely csak olyan vendéget fogad el amely már szerepel az adatbázisban,  majd a foglalás gombbal lefoglaljuk a helyet megadott idő intervallumra| Foglalás létrejötte az adatbázisban| Lefoglalta az adatbázisban a megadott időközre a kemping helyet


**12. Telepítési terv**
A rendszer beüzemelésekor ajánlott egy hozzá szakértő emberre bízni a beüzemelést mivel a szerver elindításához szükség van némi hozzáértéshez. Így elkerülve esetleges nem kívánatos hibák létre jöttét.

**13. Üzemeltetési terv**
Az üzemeltetés a rendszergazda feladata. A rendszergazda lehet a megrendelő munkatársa, vagy külső munkaerő is. Az üzemeltetés során elvárás:

-   a rendszeres biztonsági mentés
-   meghibásodás esetén az utolsó konzisztens állapot visszaállítása
-   a rendszer frissítése
-   az általános átvizsgálás során észlelt hibák javítása
-   bejelentések során érkezett hibák javítása
-   a munkatársak igényeinek folyamatos figyelése és felmérése
-   biztonsági beállítások folyamatos felülvizsgálata és szükség esetén korrigálásuk.