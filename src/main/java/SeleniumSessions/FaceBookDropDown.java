package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		String date = "05-May-2010";

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		// ElementUtils el = new ElementUtils(driver);
		// el.doSelectByVisibleText(day, date.split("-")[0]);
		// el.doSelectByVisibleText(month, date.split("-")[1]);
		// el.doSelectByVisibleText(year, date.split("-")[2]);

		// Select selectDay = new Select(driver.findElement(day));
		// List<WebElement> daysOption = selectDay.getOptions();
		// System.out.println(daysOption.size());
		// for(int i=0; i<daysOption.size(); i++){
		// String daysText = daysOption.get(i).getText();
		// System.out.println(daysText);
		// }

		ArrayList<String> dayList = doGetDropDownOptions(driver, day);
		System.out.println(dayList.size());
		System.out.println(dayList);
		
		ArrayList<String> monthList = doGetDropDownOptions(driver, month);
		System.out.println(monthList.size());
		System.out.println(monthList);
		
		ArrayList<String> yearList = doGetDropDownOptions(driver, year);
		System.out.println(yearList.size());
		System.out.println(yearList);
		
		System.out.println(doDropDownOptionsCount(driver, day));
		System.out.println(doDropDownOptionsCount(driver, month));
		System.out.println(doDropDownOptionsCount(driver, year));
		
	}

	public static int doDropDownOptionsCount(WebDriver driver, By locator){
		return doGetDropDownOptions(driver, locator).size();
	}
	public static ArrayList<String> doGetDropDownOptions(WebDriver driver, By locator) {
		ArrayList<String> ar = new ArrayList<>();
		
		Select select = new Select(driver.findElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		for (int i = 0; i < OptionsList.size(); i++) {
			String Text = OptionsList.get(i).getText();
			ar.add(Text);
		}
		return ar;
	}
}
