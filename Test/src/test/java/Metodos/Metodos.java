package Metodos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

    public WebDriver driver;
   

    public void abrirNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException {

        if (driver == null) {

            try {
                if (navegador == "CHROME" || navegador == "FIREFOX") {
                    if (navegador == "CHROME") {

                        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
                        driver = new ChromeDriver();
                        driver.get(appUrl);
                        driver.manage().window().maximize();
                    } else if (navegador == "FIREFOX") {
                        System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
                        driver = new FirefoxDriver();
                        driver.get(appUrl);
                        driver.manage().window().maximize();

                    }

                } else {
                    System.out.println("Opção inválida escolha CHROME ou FIREFOX");
                }

            } catch (Exception e) {
                Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
                screenShoot("target/erros/" + descricaoPasso, descricaoPasso);

            }

        }
    }

    public void clicar(By elemento, String descricaoPasso) throws IOException {
        try {
            driver.findElement(elemento).click();
        } catch (Exception e) {
            Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
            screenShoot("target/erros/" + descricaoPasso, descricaoPasso);

        }
    }



    public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {
        try {

            driver.findElement(elemento).sendKeys(texto);

        } catch (Exception e) {
            Assert.fail(LocalDateTime.now() + " -- erro ao tentar " + descricaoPasso);
            screenShoot("target/erros/" + descricaoPasso, texto);

        }
    }

   
    public void screenShoot(String nome, String caseTest) throws IOException {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("target/Screenshots/" + File.separator + "Screenshots " + nome + ".jpeg");
        FileUtils.copyFile(SrcFile, DestFile);
    }


    public void espera(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");

        }
    }




    public void killDriver(String descricaoPasso) {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



    public void scroll(By elemento){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elemento);
        je.executeScript("arguments[0].scrollIntoView(true);",element);
    }




    public void passarMouse(By elemento, By elemento1){
        Actions actions = new Actions(driver);
        WebElement menuHoverLink = driver.findElement(elemento);
        actions.moveToElement(menuHoverLink);

        WebElement subLink = driver.findElement(elemento1);
        actions.moveToElement(subLink);
        actions.click();
        actions.perform();
    }

    public void clear(By elemento){
        WebElement clear = driver.findElement(elemento);
        clear.clear();
    }

    public void emailRandom(By elemento){
        WebElement email = driver.findElement(elemento);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("username"+ randomInt +"@gmail.com");
    }

}
