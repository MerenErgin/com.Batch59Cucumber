Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 3 sn bekler
    # int'leri parametre kabul eder
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir