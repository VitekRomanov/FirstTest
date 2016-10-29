package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.yandex.by");
        

        YandexMail yandexmail = new YandexMail(driver);
        yandexmail.loginTo("testuser2710", "2710user");
    }
}     