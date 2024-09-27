Feature: US 10004 Kullanici gecerli bilgilerle login olabilmeli

  @wip
  Scenario: TC10 valid username and password
    Given kullanici "toUrl" anasayfaya gider
    Then account buttonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn buttonuna basar
    And basarili giris yapabildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir