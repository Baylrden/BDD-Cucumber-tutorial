


#komple feature-i calistirmak icin Feature: yukarisina @wip yazmamiz yeterlidir
  #@wip
Feature: US1005 Kullanici invalid datalarla login olamamalidir


  Scenario: TC11 valid email and invalid password
    Given kullanici "toUrl" anasayfaya gider
    Then account buttonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn buttonuna basar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir


  Scenario: TC12 invalid email and valid password
    Given kullanici "toUrl" anasayfaya gider
    Then account buttonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn buttonuna basar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir


  Scenario: TC13 invalid email and invalid password
    Given kullanici "toUrl" anasayfaya gider
    Then account buttonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn buttonuna basar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir