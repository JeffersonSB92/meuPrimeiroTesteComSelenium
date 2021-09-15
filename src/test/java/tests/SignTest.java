package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {

    @Test
    public void testFazerLoginNoTaskit(){

        //esses dois primeiros comandos são pra instanciar o webdriver do chrome e abrir uma aba do navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\seleniumDrivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://juliodelima.com.br/taskit");


        assertEquals(1,1);
    }

}
