package org.sample;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	@Test
	public void sam() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> links = driver.findElements(By.xpath(
				"//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'][1]/following::ul[1]/li/a"));
		// List<WebElement> links = driver.findElements(By.tagName("a"));

		int size = links.size();

		for (int i = 0; i < size; i++) {

			String linktext = links.get(i).getText();
			System.out.println(linktext);
		}
		Random r = new Random();
		links.get(r.nextInt(4)).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
