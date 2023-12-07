package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {

    @Test
    public void testFazerLoginNoTaskit(){

        //esses dois primeiros comandos são pra apontar e instanciar o webdriver do chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\seleniumDrivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        //comando para que o navegador espere 5 segundos até os elementos aparecerem e podermos dar GET, do contrário
        //ele vai dar o GET esperando o tempo de 0 milissegundos
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Abre uma guia direcionada
        navegador.get("http://www.juliodelima.com.br/taskit");
        //Clica em um elemento
        navegador.findElement(By.linkText("Sign in")).click();
        //Preenchendo login e senha
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("jefftavares");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("01072017");
        //Clicando no botão SIGN IN
        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals("Hi, Jefferson", saudacao);

        navegador.quit();
    }

    @Test
    public void testLogarNoFacebook(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\seleniumDrivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://facebook.com");
        navegador.findElement(By.id("globalContainer")).findElement(By.name("email")).sendKeys("test32@test.com");
        navegador.findElement(By.id("globalContainer")).findElement(By.name("pass")).sendKeys("3234dddffd665dd6df96df6d9f6fdf545df54df");
        navegador.findElement(By.id("globalContainer")).findElement(By.name("login")).submit();
    }

}
