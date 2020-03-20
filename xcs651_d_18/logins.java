public class Facebook {

    public static void main(String[] args) throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///D:/DEVOPS_/index.html");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("emails")).sendKeys("Enter the USERNAME");
        driver.findElement(By.id("passwo")).sendKeys("Enter the PASSWORD");
        driver.findElement(By.id("button")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Log out")).click();
        System.out.println("Successfully logged out");

    }
