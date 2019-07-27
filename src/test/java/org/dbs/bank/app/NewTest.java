package org.dbs.bank.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/K510U/Desktop/chromedriver_win32/chromedriver.exe");
	  WebDriver wd=new ChromeDriver();
	  wd.get("https://www.facebook.com");
	  Thread.sleep(3000);
	  wd.quit();
	  
  }
}
