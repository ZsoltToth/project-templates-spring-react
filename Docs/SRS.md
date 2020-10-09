## 1. Áttekintés

*Egy parcellázott kemping számára készül ez a foglalós rendszer.*

Szeretnénk egy online kemping menedzser rendszert létrehozni, ami kezelni tudja a parcellákat az az a szabad illetve a foglalt férőhelyeket és magát a fogalás menetét.  A recepciós látja a kemping térképét, ahol letudja foglalni a szabad helyeket a vendégek számára, illetve távozásuk során feltudja szabdítani. A vendég adatait elkérve a foglalást véglegesítheti. A rendszer legenerálja és jelzi amikor a foglalás ideje lejár, ezáltal kiszámolja a fizetendő összeget. 

## 2. Jelenlegi helyzet

*Az eddigiekben használt rendszert, szeretnénk modernizálni, ami annyit tesz, hogy elektronikus módon fog minden történni.*

**A mostani helyzet problémái:**
- Lassú papír alapú könyvelés
- Nagyobb a hiba lehetőségek kockázata
- Sok vendég esetén nehéz az áttekinthetőség

## 3. Vízió

- **3.1** Terjedés, az az kik fogják használni a rendszert

 A program a kemping recepciósának készül. Ezen az interaktív felületen, a recepciós élőben látja az aktuális állapotot. A célja, hogy modernebben működjön az átláthatóság, ezáltal sokkal könnyebb kezeleni a foglalást. 
 - **3.2** A recepciós a vendég kérése alapján megpróbálja teljesíteni a kérvényt.
 
 A szoftverben melyik kemping helyeket tudja a vevő kérésére ajánlani. Ezután a vendég számára a legjobb helyet lefoglalja. Ebben beletartozik az is, hogy gépjármű számára is igényel helyet, áram szolgáltatást opcionálisan kérhet és sátornak vagy caravannak szeretné a helyet lefoglalni. A vendég jelzi, hogy hány éjszakát szeretne itt tartózkodni, és ezek a feltételek alapján.
- **3.3** A későbbiekben maga a kemping funkcionalitása is fejlődik.

 Új épületek, új szolgáltatások, bövülő kemping hely fogadja a látogatókat.
 A jövőben a rendszer követni fogja a teljes kemping részleteit is.
- **3.4** Rendszer specifikációs álmok.

 A program müködtetésére szolgáló eszközök az alábbiak lesznek: 
 A recepciósnak szüksége van egy főszámítógépre ami tartalmaz egy kisebb 30" monitort, illetve egy nagyobb Tv-t amin a látogató számára megmutatja a helyeket.
 
 ## 4. Funkcionális követelmény
 *A recepciós, mint felhasználó lehetőségei:*
 > - Lekérdezheti a szabad férőhelyeket egy adott időközre a vendég kérése szerint.
 > - Beveszi a rendszerbe a kérést miszerint a vendég sátorral, vagy karaván kocsival szeretne a kempingbe tartózkodni.
 > - Letudja foglalni a vendég számára a megfelelő helyet.
 > - Kitudja nyomtatni a bizonylatot, a rendszer segítségével.

 ## 5. Követelmény lista
 *A rendszer fontos tulajdonságai:*
 >- Tartalmazza a férőhelyek információit: a lefoglalt illetve a szabad helyket térképszerűen jelzi.
> - Képes lekérdezni a vendég kérése alapján, a legmegfelelőbb helyeket.
> - A vendég álltal kiválasztott helyet lefoglalja az adott időközre.
> - Eltárolja a vendégek adatait.
 >- Mindezek alapján meghatározza azt az összeget, amit az elején kell fizetni.
 >- Kijelentkezéskor a hely felszabadul, automatikusan be állítja szabad helyként, de van lehetőség manuális beállításra is.
 
 `Készítették: Katyina Brigitta, Guti Adrián, Csattos Bence, Majoros Norbert`
 
 ## 6.
 
 `Készítették: Csattos Bence`
 
 ## 7. Adatstruktúrák definiálása
 
**Adatbázis:**

- Recepciós Tábla: Id, Felhasználónév, Jelszó
- Kemping Tábla: Id, Elektromosság, Típus(Karaván/Sátor)
- Vendég Tábla: Id, Név, Személyi igazolvány szám, Lakcím, Telefonszám, KempingId
- Foglalás Tábla: Id, VendégId, KempingId, Kezdet, Vég

**Munkaprogram:**
- Vendég Osztály: Név, Személyi igazolvány szám, Lakcím, Telefonszám, KempingId
- Kemping Osztály: Id, Elektromosság, Típus
- Recepciós Osztály: Felhasználónév, Titkosított Jelszó
- Foglalás Osztály: VendégId, KempingId, Lemondás, Lefoglalás, Számla
> -Számla Metódus: Kemping osztály aktuális példányának adatai alapján kiszámítja és megjeleníti az összeget. 

*Felület:*
>**Login rendszer:**
>A recepciós bejelentkezése(Felhasználónév, Jelszó)
>
>**Kemping térkép, annak részei:**
>-Férőhelyek száma
>-Zöld/Piros jelzi a lekérdezésben meghatározott időközben szabad illetve foglalt helyet.
>
>**Lekérdezés formja, és részei:**
>-Karaván vagy Sátor?
>-Éjszakák száma?
>-Szükséges-e elektromosság?
>-Tovább
>-Mégsem
>
>**Megfelelő hely kiválasztása:**
>-Hely Id
>-Tovább
>-Vissza
>
>**A vendég adatai form:**
>-Név
>-Személyi igazolvány szám
>-Lakcím
>-Telefonszám
>-Tovább
>-Vissza
>
>**Számla:**
>-Vendég adatai
>-Kemping adatai
>-Férőhely adatai
>-Összeg
>
>**Férőhely lemondása form:**
>-KempingId
>-Lemondás
>-Vissza
>-Módosított összeg
`Készítették: Katyina Brigitta, Guti Adrán, Majoros Norbert`