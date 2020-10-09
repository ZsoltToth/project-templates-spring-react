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
 ## 6. Esetek és funkciók
 > **Recepciós:**
 > - A program felhasználója
 > - Törölheti a foglalást
 > - Kérdéseket tesz fel a vendég számára a hellyel kapcsolatban
 > - Megkapja a vendég válaszait
 > - Válaszoknak megfelelően tölti ki a formot és elindítja a lekérdezést
 > - A lekérdezés alapján megmutatja a szabad helyeket a vendégnek, ha van ilyen
 > - Vendég által kiválasztott helyet lefoglalja
 > - Kiállítja a számlát
 > 
>**Recepciós-Vendég:**
> - Alap kérdések a hellyel, illetve a Vendég igényeivel kapcsolatban:
> >-Lakókocsija vagy sátra van-e?
> -Hány éjszakát szeretne a kempingben tölteni?
> -Szüksége van-e elektromosságra?
> -Elkéri a Vendég adatait: név, személyi igazolvány szám, lakcím, telefonszám
>- Recepciós megmutatja a lehetséges helyket
>- Megkérdezi, hogy melyik helyet szeretné igénybe venni
>
> **Vendég:**
> 
> - Válaszol a Recepciós kérdéseire
> - Lemondhatja foglalást
> - Látja az igényelhető helyeket
> - Kiválasztja a számára megfelelő helyet,ha van ilyen.
> - Amenyiben nincs megfelelő hely a venég számára, nem történik foglalás
> - A vendég bármikor lemondhatja a szolgáltatást vagy a foglalást
 
`Készítették: Katyina Brigitta, Guti Adrián, Csattos Bence, Majoros Norbert` 
