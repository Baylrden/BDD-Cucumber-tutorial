Feature:  US1008 Kullanici add ve remove butonlarini test eder


  Scenario: TC16 Kullanici add ve remote butonlarini kullanabilmeli
    Given kullanici "heroUrl" anasayfaya gider
    When kullanici Add Element butonuna basar
    And 2 saniye bekler
    And Delete butonu-nun gorunur oldugunu test eder
    Then Delete tusuna basar
    And Delete tusunun gorunmedigini test eder
    And Add Remove Elements yazisinin gorunur oldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir
