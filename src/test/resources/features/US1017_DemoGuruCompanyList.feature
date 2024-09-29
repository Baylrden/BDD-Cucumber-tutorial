Feature: US1017 Kullanici listedeki sirketleri yazdirir


  @wip
  Scenario: TC25 Kullanici istenen sirketlerin listede oldugunu test eder

    Given kullanici "demoGuruUrl" anasayfaya gider
    And Company listesini consola yazdirir
    And Listede 20'den fazla sirket oldugunu test eder