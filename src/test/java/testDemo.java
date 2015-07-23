import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class testDemo {
	public static final String USERNAME = "*****";
	public static final String PASSWORD = "*****";
	private static WebDriver driver = new ChromeDriver();

	@Test
	public void testLogIn() {
		driver.get("https://cluster.partek.com/flow/login.xhtml");
		assertTrue(driver.getTitle().equals("Login - Partek Flow"));
		driver.findElement(By.id("login_form:username")).sendKeys(USERNAME);
		driver.findElement(By.id("login_form:password")).sendKeys(PASSWORD);
		driver.findElement(By.tagName("button")).click();
	}
}
