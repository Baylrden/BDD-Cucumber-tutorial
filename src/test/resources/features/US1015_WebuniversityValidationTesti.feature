Feature: US1016 Webuni sayfasinda invalid bilgilerle giris yapilamamalidir


  Scenario: TC23 yanlis bilgilerle girir yapilamadigi test edilir
    Given kullanici "webUniUrl" anasayfaya gider
    And Login portal a kadar asagi iner
    And Login portal a tiklar
    Then acilan ikinci window'a gecer
    And username ve password kutularina fake degerler yazdirir
    And login butonuna basar
    And popup'ta cikan yazinin "validation failed" oldugunu test eder
    And Ok diyerek popup'i kapatir
    When Ilk sayfaya geri doner
    Then Ilk sayfaya geri dondugunu test eder
    And sayfayi kapatir