Feature: US1010 Kullanici yanlis bilgilerle giris yapamaz

  Scenario Outline: TC18 yanlis bilgilerle giris yapilamadigini test eder

    Given kullanici "toUrl" anasayfaya gider
    Then account buttonuna basar
    When email olarak listeden "<siradakiEmail>" girer
    And password olarak listeden "<siradakiPassword>" girer
    Then signIn buttonuna basar
    And basarili giris yapilamadigini test eder
    And 1 saniye bekler
    Then sayfayi kapatir

    Examples:
    |siradakiEmail|siradakiPassword|
    |shl@gmail.com|121212          |
    |mlk@gmail.com|2232323         |
    |rrk@gmail.com|232424          |