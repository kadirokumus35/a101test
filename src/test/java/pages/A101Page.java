package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {

    public A101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']
    @FindBy (xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cookie;

     @FindBy (xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
     public WebElement giyimAksesuarButonu;

    @FindBy (xpath = "//a[@data-value='1565']")
    public WebElement kadinİcGiyim;

    @FindBy (xpath = "//a[@data-value='1567']")
    public WebElement dizAltiCorap;

    @FindBy (xpath = "(//*[@class='checkbox'])[8]")
    public WebElement siyahRenkCheckBox;

    @FindBy (xpath = "(//*[@class='name'])[1]")
    public WebElement siyahUrun;

    @FindBy (xpath = "//*[text()='SİYAH ']")
    public WebElement filtreSiyah;

    @FindBy (xpath = "//*[@class='selected-variant-text']")
    public WebElement secilenRenk;

    @FindBy (xpath = "//i[@class='icon-sepetekle']")
    public WebElement sepeteEkle;

    @FindBy (xpath = "(//*[@title='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntule;

    @FindBy (xpath = "(//*[@title='Sepeti Onayla'])[2]")
    public WebElement sepetiOnayla;

    @FindBy (xpath = "//*[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEt;

    @FindBy (xpath = "//*[@name='user_email']")
    public WebElement eMail;

    @FindBy (xpath = "//*[@class='button block green']")
    public WebElement eMailGirdiktenSonraDevamEt;

    @FindBy (xpath = "(//*[@class='new-address js-new-address'])[1]")
    public WebElement yeniAdresOlustur;

    @FindBy (xpath = "//*[@name='title']")
    public WebElement adresBasligi;

    @FindBy (xpath = "//*[@name='first_name']")
    public WebElement ad;

    @FindBy (xpath = "//*[@name='last_name']")
    public WebElement soyAd;

    @FindBy (xpath = "//*[@name='phone_number']")
    public WebElement cepTelefonu;

    @FindBy (xpath = "//*[@name='city']")
    public WebElement il;

    @FindBy (xpath = "//*[@name='township']")
    public WebElement ilce;

    @FindBy (xpath = "//*[@name='district']")
    public WebElement mahalle;

    @FindBy (xpath = "//*[@name='line']")
    public WebElement adres;

    @FindBy (xpath = "//*[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement adresSonrasiKaydet;

    @FindBy (xpath = "//*[@class='button block green js-proceed-button']")
    public WebElement kargoSecilipKaydetVeDevamEt;

    @FindBy (xpath = "//*[@class='order-complete']")
    public WebElement siparisiTamamla;


}
