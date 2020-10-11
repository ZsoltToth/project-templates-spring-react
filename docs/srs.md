# Software Requirement Specification

## 1. Áttekintés

Szoftverünk célja, hogy hatékonyan segítse az Aquapark modellváltását. Az új rendszerrel a látogatók egy egyedi azonosítót kapnak, és ennek segítségével csúszhatnak le csúszdákon, melyet a rendszer nyomonkövet, a távozáskor pedig összegzi a fizetendő összeget.

Ezzel a módszerrel a csúszdák kihasználtsága is sokkal egyszerűbben lekövethető, ezáltal a vendégek igénye is felmérhető a statisztikák felhasználásával. Ezek mellett egyes esetekben növekedhet a cég profitja is.

## 2. Jelenlegi helyzet

Az eddigi modell alapján a látogatók napi jegyet vehettek, mellyel korlátlanul használható volt az Aquapark területén található összes eszköz.

**A jelenlegi rendszer hátrányai:**

- nehéz statisztikát vezetni a csúszdák kihasználtságáról
- túl sok dolgozó szükséges a csúszdák ellenőrzésére

## 3. Funkcionális követelmények

| ID   | Megnevezés      | Leírás                                                       |
| ---- | --------------- | ------------------------------------------------------------ |
| F1   | Enter Aquapark  | Amikor a látogató bejelentkezik a rendszerbe egy egyedi azonosítót kap, mely minden egyes csúszásnál azonosítja őt. Egy azonosító naponta többször is kiadható. |
| F2   | Use slide       | Azok a látogatók használhatják a csúszdákat, akik rendelkeznek azonosítóval. Minden egyes csúszáskor az azonosítóhoz tartozó számla az adott csúszda használati díjával kerül terhelésre. |
| F3   | Get receipt     | Amennyiben a látogató el szeretné hagyni az Aquaparkot, az azonosítójának leadása előtt az általa generált költségeket ki kell fizetnie. Erről részletes számlát kap, a csúszdák típusa és azon megtett csúszások száma, illetve részösszeg, végösszeg adatokkal. |
| F4   | Payment         | A kapott számla kiegyenlítése.                               |
| F5   | Leave Aquapark  | A fizetés után a látogató visszaadja a kapott azonosítót, melyet későbbi alkalommal megkaphat egy új látogató is. |
| F6   | Usage of slides | A management számára használható funkció. Adott napon a lekérdezésig eltelt időben a csúszdák kihasználtságáról szóló riportot kap. |
| F7   | Daily report    | A management számára használható funkció. Adott napra vonatkozó csúszda kihasználtsági statisztikát kap. |

## 4. Szükséges adatok

| ID   | Data                                                         |
| ---- | ------------------------------------------------------------ |
| F1   | UUID generálás, majd lementése                               |
| F2   | UUID és használt csúszda azonosítójának lekérése, ezek és a timestamp lementése |
| F3   | UUID bekérése, hozzá tartozó használati adatok lekérése, majd összegzés |
| F4   | UUID-hoz tartozó számla kiegyenlítése                        |
| F5   | UUID leválasztása a látogatóról                              |
| F6   | Csúszda azonosító (opcionális) bekérése, ha kapunk, akkor az adott csúszda használati adatainak lekérése (hány csúszás történt rajta), ha nem kapunk akkor ugyanez az összes csúszdára vonatkozóan |
| F7   | Dátum bekérése, az adott napra vonatkozó adatok összegyűjtése (csúszda azonosító, hány csúszás, összes bevétel) |

## 5. Response adatstruktúrák

#### F1 - Enter Aquapark
```
{
  user_id: int,
  watch_id: int
}
```

#### F2 - Use slide
```
{
  user_id: int,
  watch_id: int,
  slide_id: int,
  timestamp: datetime
}
```

#### F3 - Get receipt
```
{
  receipt_id: uuid,
  transactions: [
    {
      user_id: int,
      watch_id: int,
      slide_id: int,
      timestamp: datetime
    }, ...
  ],
  total: int
}
```

#### F4 - Payment


#### F5 - Leave Aquapark


### F6 - Usage of slides
***Ha kapunk ID-t:***
```
{
  slide_id: int,
  usages: [
    {
      user_id: int,
      watch_id: int,
      timestamp: datetime
    }
  ]
}
```
***Ha nem kapunk ID-t:***
```
{
  statistics: [
    {
      slide_id: int,
      usages: [
        {
          user_id: int,
          watch_id: int,
          timestamp: datetime
        } ...
      ]
    }, ...
  ]
}
```

#### F7 - Daily report
```
{
  statistics: [
    {
      slide_id: int,
      usages: [
        {
          user_id: int,
          watch_id: int,
          timestamp: datetime
        } ...
      ]
    }, ...
  ],
  total_income: int
}
```