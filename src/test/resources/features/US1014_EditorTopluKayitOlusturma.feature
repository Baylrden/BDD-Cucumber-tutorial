Feature: US1014 Kullanici tablo olarak verilen degerlerle kayit olusturur


 Scenario Outline: TC22 Tablo olarak verilen bilgilerlekayit olusturulabilmeli
   When kullanici "editorUrl" anasayfaya gider
   And 3 saniye bekler
   Then new butonuna basar
   And 2 saniye bekler
   And "<firstname>" "<lastname>" "<position>" "<office>" "<extension>" "<startdate>" ve "<salary>"
   And 2 saniye bekler
   And Create tusuna basar
   And 2 saniye bekler
   When kullanici ilk isim ile arama yapar
   And 2 saniye bekler
   Then isim bolumunde isminin oldugunu dogrular
   And 2 saniye bekler
   And sayfayi kapatir

   Examples:
   |firstname|lastname|position|office|extension|startdate |salary |
   |john     |roark   |qa      |Baku  |-        |2024-12-12|3000   |
   |jane     |doe     |qa      |Guba  |-        |2024-12-12|4000   |