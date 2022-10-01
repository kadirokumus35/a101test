Feature: A101 sitesine gidilip ıstenilen urun ile siparis tamamlanacak
@a101
  Scenario: kullanici a101 sayfasinda istedigi urunu sepete ekler
    Given "a101" anasayfasina gidildi
  And cookieler kabul edildi
    Then  Giyim&Aksesuar butonuna tiklandi
    And Giyim&Aksesuar altinda yer alan Kadin İc Giyim kategorisine tiklandi
    And Kadin İc Giyim altinda yer alan Dizalti Çorap kategorisine tiklandi
    Then filtrelerden Renk olarak siyah secildi
    And acilan urunun siyah oldugu dogrulandi
    And Sepete Ekle butonuna tiklandi
    And Sepeti Goruntule butonuna tiklandi
    And Sepeti Onayla butonuna tiklandi
    And Uye Olmadan Devam Et butonuna tiklandi
    And Email alani dolduruldu ve Devam Et butonuna tiklandi
    And Yeni adres olustur kutusuna tiklandi
    And adres bilgileri dolduruldu ve kaydedildi
    And Kaydet ve Devam Et butonuna tiklandi
    And Siparisi Tamamla butonuna tiklandi ve odeme sayfasina yonlendi

