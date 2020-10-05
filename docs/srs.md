# Követelmény specifikáció
## Jelenlegi helyzet
Ha foglalás történik, kézzel írja le a recepciós a beérkezett foglalások időpontját és az adott létszámot, esetleges igényeket.
Problémát jelentenek az esetleges elírások, hibák, és a nehéz visszakeresése az adatoknak.
## Vágyálomrendszer
Az új rendszernek köszönhetően gyorsabban, kevesebb hibával képesek a recepciósok a foglalásokat felvinni.
Az adatok könnyen elérhetőek, jól rendszerezettek.
A rendszer mindig a legfrissebb adatokat mutatja igényes, könnyen érthető kezelői felületen.
## Igényelt üzleti folyamatok modellje
![igenyelt uzleti folyamatok modellje](./usecase.png)
## Követelménylista
|ID|Név|Kifejtés|
|---|---|---|
|K1|Adatbázis|A weboldal adatbázisból kell a foglalásokkal kapcsolatos adatokat tárolni, és módosítani, lekérdezni|
|K2|Adatok lekérdezése|A recepciós lekérdezéseket végezhet a táborhelyekkel kapcsolatos adatokról|
|K3|Vásárló adatainak rögzítése|A recepciós felvihet adatokat a vásárlókról|
|K4|Táborhely bérbeadás|A recepciós táborhelyeket kölcsönözhet ki a vásárlóknak|
|K5|Áram bérbeadás|A recepciós áramot kölcsönözhet ki a vásárlóknak|
|K6|Oldal adatainak frissítése|Bizonyos időintervallumonként a felületnek frissülnie kell|
|K7|Számla|A rendszer számlát generál a vásárló távozásakor|
|K8|Design|A recepciosnak látnia kell a táborhely alaprajzát az oldalon|
