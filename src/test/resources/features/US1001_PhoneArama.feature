


Feature:
   # Feature == US . feature == class, scenario == method

  Scenario: TC:01 Kullanici phone icin arama yapabilmeli
    # Scenario == TC

  Given kullanici Testotomasyon sayfasina gider
    And phone icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir

  Scenario: TC:02 Kullanici dress icin arama yapabilmeli
    Given kullanici Testotomasyon sayfasina gider
    And dress icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir

  Scenario: TC:03 Kullanici java icin sonuc bulamamalidir
    Given kullanici Testotomasyon sayfasina gider
    And java icin arama yapar
    Then aradigi urunun bulunmadigini test eder
    And sayfayi kapatir

