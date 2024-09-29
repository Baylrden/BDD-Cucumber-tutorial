Feature: US1013 kullanicilar toplu kayit olusturabilmeli

 Scenario: : TC21 kullanici verilen listeden kayit olusturabilmeli
   When kullanici "editorUrl" anasayfaya gider
    And 3 saniye bekler
   Then new butonuna basar
    And 2 saniye bekler
   And tum bilgileri girer
    And 2 saniye bekler
   And Create tusuna basar
    And 2 saniye bekler
   When kullanici ilk isim ile arama yapar
    And 2 saniye bekler
   Then isim bolumunde isminin oldugunu dogrular
    And 2 saniye bekler
    And sayfayi kapatir
