


  Feature: Facebook sign up form



    Scenario: TC14 Faker class ile kullanici formu doldurulabilmelidir
      Given kullanici "faceUrl" anasayfaya gider
      And facebook'da yeni hesap olustur butonuna basar
      And 1 saniye bekler
      When Faker class'indan bilgilerle facebook kayit formunu doldurur
      Then 2 saniye bekler
      And facebook kayit ol butonuna basar
      Then 2 saniye bekler
      And sayfayi kapatir