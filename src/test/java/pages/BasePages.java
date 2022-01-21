package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePages {
    
    
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fitideas\\Documents\\SELENIUM\\webdirver\\chromedriver_97\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disk-cache-size=0");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 80);
    }

    public BasePages(WebDriver driver){
        BasePages.driver = driver;
        wait = new WebDriverWait(driver, 80);
    }

    public static void navegarTu(String url){
        driver.get(url);
    }
    
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void write(String locator, String textToWrite ){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void clickElement2(String locator){
        Find(locator).click();
    }
    public void  clickElement3(String locator){
        Find(locator).click();
    }
    public void switchToiFrame(String locator){
        System.err.println("++++++++++++++++++ " +locator);
        WebElement iframe = Find(locator);
        System.err.println("***************** " +locator);
        if (iframe!=null)
            driver.switchTo().frame(iframe);
        else{
            System.err.println("No encontro el iframe");

        }
        //WebElement body = Find("body");
        
        //body.click();
        //WebElement iframe =  Find("//*[@id='form-create-task']/text[2]/iframe");
        //driver.switchTo().frame(iframe);
        //System.out.println("***");
        //System.out.println(iframe.getText());
        //Find("//span[contains(text(),'Centro de Negocios')]").click();
        
        /*
        try {
            driver.wait(5000, 0);
            
            System.out.println("Getting the page source " + driver.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
            //throw(e);
        }
        //clickElement("/html/body/div/text/nav/li[2]/span");
        */
        
    }
    public void switchToParentFrame(){
        driver.switchTo().defaultContent();
        
    }

    
    /*
    public void clickElement4(String locator){
        Find(locator).click();
        //WebElement webelement= Find(locator);
        
        //310webelement.click();
        
    }
    */
    
    public void selectOficina(String locator, String valueToSelect){
        Select dropdwn = new Select (Find(locator));

        dropdwn.selectByValue(valueToSelect);


    }
    /*
    public void selectNuevaTareaByIndex(String locator, int valueToSelect){
        Select dropdwn = new Select (Find(locator));

        dropdwn.selectByIndex(valueToSelect);
    }
    */
}
