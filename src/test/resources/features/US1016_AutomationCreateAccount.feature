Feature: US1016 yeni kayit olusturulabilmeli

  @wip
  Scenario: TC24 kullanici kayit olusturabilmeli
    Given kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create an account bolumune email adresi girer
    And signUp butonuna basar
    And user kisisel bilgileriniv e iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test eder