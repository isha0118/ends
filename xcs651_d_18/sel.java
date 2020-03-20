package SamplePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest{

 public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("file:///D:/DEVOPS_/index.html");
      driver.manage().window().maximize();

      //text fields
      driver.findElement(By.id("firstname")).sendKeys("Isha");
      driver.findElement(By.name("lastname")).sendKeys("Vishwkarma");
      driver.findElement(By.name("email")).sendKeys("84521636866");
      driver.findElement(By.name("reemail")).sendKeys("84521636866");
      driver.findElement(By.name("pass")).sendKeys("il9HNJ1234");

      //static drop down
      Select s = new Select(driver.findElement(By.id("day")));
      Thread.sleep(1000);
      s.selectByVisibleText("12");

      Select s1 = new Select(driver.findElement(By.id("month")));
      Thread.sleep(1000);
      s1.selectByValue("5");

      Select s2 = new Select(driver.findElement(By.id("year")));
      Thread.sleep(1000);
      s2.selectByValue("1993");
      //radio button
          driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

      driver.findElement(By.name("websubmit")).click();

      driver.close();
  }


}
