Feature: 1002 Kullanici background ozelligini kullanir

  Background: anasayfaya gitme
    Given kullanici Testotomasyon sayfasina gider

  Scenario: TC:04 Kullanici phone icin arama yapabilmeli
    And phone icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir

  Scenario: TC:05 Kullanici dress icin arama yapabilmeli
    And dress icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir


  Scenario: TC:06 Kullanici java icin sonuc bulamamalidir
    And java icin arama yapar
    Then aradigi urunun bulunmadigini test eder
    And sayfayi kapatir