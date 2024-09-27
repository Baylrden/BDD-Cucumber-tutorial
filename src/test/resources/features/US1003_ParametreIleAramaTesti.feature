Feature: US1003 Kullanici parametre olarak verilen urunu aratabilmeli

  Scenario: TC:07 baby icin arama
    Given kullanici Testotomasyon sayfasina gider
    And "baby" icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And 1 saniye bekler
    And sayfayi kapatir

  Scenario: TC:08 Kullanici nutella icin sonuc bulamamalidir
    Given kullanici Testotomasyon sayfasina gider
    And "nutella" icin arama yapar
    And 2 saniye bekler
    Then aradigi urunun bulunmadigini test eder
    And sayfayi kapatir

  Scenario: TC:07 iphone icin arama
    Given kullanici Testotomasyon sayfasina gider
    And "iphone" icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir