package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;



public class A101StepDefinitions {
    A101Page a101Page=new A101Page();



    @Given("{string} anasayfasina gidildi")
    public void anasayfasina_gidildi(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }

    @And("cookieler kabul edildi")
    public void cookielerKabulEdildi() {
        a101Page.cookie.click();

    }

    @Then("Giyim&Aksesuar butonuna tiklandi")
        public void giyim_aksesuar_butonuna_tiklandi() {
        a101Page.giyimAksesuarButonu.click();


    }
    @Then("Giyim&Aksesuar altinda yer alan Kadin İc Giyim kategorisine tiklandi")
    public void giyim_aksesuar_altinda_yer_alan_kadin_ic_giyim_kategorisine_tiklandi() {
        a101Page.kadinİcGiyim.click();

    }
    @Then("Kadin İc Giyim altinda yer alan Dizalti Çorap kategorisine tiklandi")
    public void kadin_ic_giyim_altinda_yer_alan_dizalti_çorap_kategorisine_tiklandi() {

        a101Page.dizAltiCorap.click();

    }
    @Then("filtrelerden Renk olarak siyah secildi")
    public void filtrelerden_renk_olarak_siyah_secildi() throws InterruptedException {

       Thread.sleep(2000);
        if (!a101Page.siyahRenkCheckBox.isSelected()){
            a101Page.siyahRenkCheckBox.click();
        }
        Thread.sleep(2000);


    }

    @Then("acilan urunun siyah oldugu dogrulandi")
    public void acilan_urunlerin_siyah_oldugu_dogrulandi() throws InterruptedException {
    String expectedColour="SİYAH ";
    String actualColour=a101Page.filtreSiyah.getText();
        Assert.assertTrue(expectedColour.contains(actualColour));
    Thread.sleep(2000);

    }
    @Then("Sepete Ekle butonuna tiklandi")
    public void sepete_ekle_butonuna_tiklandi() throws InterruptedException {
        a101Page.siyahUrun.click();
        Thread.sleep(2000);
        a101Page.sepeteEkle.click();

    }
    @Then("Sepeti Goruntule butonuna tiklandi")
    public void sepeti_goruntule_butonuna_tiklandi() throws InterruptedException {
    a101Page.sepetiGoruntule.click();
    }
    @Then("Sepeti Onayla butonuna tiklandi")
    public void sepeti_onayla_butonuna_tiklandi() throws InterruptedException {
    a101Page.sepetiOnayla.click();
    }
    @Then("Uye Olmadan Devam Et butonuna tiklandi")
    public void uye_olmadan_devam_et_butonuna_tiklandi() {
    a101Page.uyeOlmadanDevamEt.click();
    }
    @Then("Email alani dolduruldu ve Devam Et butonuna tiklandi")
    public void email_alani_dolduruldu_ve_devam_et_butonuna_tiklandi() {
    a101Page.eMail.sendKeys("aYuzBir@hotmail.com");
    a101Page.eMailGirdiktenSonraDevamEt.click();

    }
    @Then("Yeni adres olustur kutusuna tiklandi")
    public void yeni_adres_olustur_kutusuna_tiklandi() {
    a101Page.yeniAdresOlustur.click();
    }
    @Then("adres bilgileri dolduruldu ve kaydedildi")
    public void adres_bilgileri_dolduruldu_ve_kaydedildi() throws InterruptedException {
        a101Page.adresBasligi.sendKeys("ev");
        a101Page.ad.sendKeys("Abdulkadir");
        a101Page.soyAd.sendKeys("Okumus");
        a101Page.cepTelefonu.sendKeys("5555555555");
        Select select=new Select(a101Page.il);
        select.selectByValue("41");
        Select select1=new Select(a101Page.ilce);
        select1.selectByValue("494");
        Thread.sleep(2000);
        Select select2=new Select(a101Page.mahalle);
        select2.selectByValue("36690");


        Faker faker=new Faker();
        a101Page.adres.sendKeys(faker.address().fullAddress());
      //  a101Page.adres.sendKeys("ataturk mh 3545sk no:43 ");




    }
    @Then("Kaydet ve Devam Et butonuna tiklandi")
    public void kaydet_ve_devam_et_butonuna_tiklandi() throws InterruptedException {
        a101Page.adresSonrasiKaydet.click();


    }
    @Then("Siparisi Tamamla butonuna tiklandi ve odeme sayfasina yonlendi")
    public void siparisi_tamamla_butonuna_tiklandi_ve_odeme_sayfasina_yonlendi() throws InterruptedException {
        Thread.sleep(5000);
        a101Page.kargoSecilipKaydetVeDevamEt.click();
        Thread.sleep(5000);
        a101Page.siparisiTamamla.click();
        String actualTile=a101Page.odemeSayfasindayiz.getText();
        String expectedTitle="Kart ile ödeme";
        Assert.assertTrue(actualTile.contains(expectedTitle));
        System.out.println("odeme ekranina gidildigi dogrulandi");


    }



}
