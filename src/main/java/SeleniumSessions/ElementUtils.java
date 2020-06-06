package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	WebDriver driver;
	
	public ElementUtils(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(By locator){
		WebElement element = null;
		try{
			System.out.println("locator is:" + locator);
		element = driver.findElement(locator);
		System.out.println("webelement is created successfully :" + locator);
		}
		catch(Exception e){
			System.out.println("some exception got occured with this locator:" + locator);
		}
		return element;
	}
	
	public void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator){
		getElement(locator).click();
	}
	
	public String doGetText(By locator){
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator){
		return getElement(locator).isDisplayed();
	}
	
	public void doSelectByVisibleText(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public void doSelectByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public int doDropDownOptionsCount(By locator){
		return doGetDropDownOptions(locator).size();
	}
	public ArrayList<String> doGetDropDownOptions(By locator) {
		ArrayList<String> ar = new ArrayList<>();
		
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		for (int i = 0; i < OptionsList.size(); i++) {
			String Text = OptionsList.get(i).getText();
			ar.add(Text);
		}
		return ar;
	}
	
	public void selectChoiceValues(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

//		List<WebElement> choiceList = getElement(locator);
		if(!value[0].equalsIgnoreCase("ALL")){
			
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			for(int k=0; k<value.length; k++){
				if (text.equals(value[k])) {
					choiceList.get(i).click();
					break;
				}
			}
			
		}
		}
		else{
			try{
			for(int all=0; all<choiceList.size();all++){
				choiceList.get(all).click();
			}
			}
			catch(Exception e){
				
			}
		}
	}
//**********************************Wait Utils******************************************
	
	public List<WebElement> visibiltyOfAllElements(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public WebElement waitForElementPresent(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
	
	public WebElement waitForElementToBeVisible(By locator, int timeout){
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public WebElement waitForElementToBeClickable(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
	}
	
	public boolean waitForUrl(String url, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public Alert waitForAlertToBePresent(int timeout){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	
//	clickWhenReady
	public void clickWhenReady(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public String waitForTitleToBePresent(String title, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
}
