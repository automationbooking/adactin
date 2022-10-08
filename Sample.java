package com.automation.org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lap-319\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805697%7Cb%7Cfb%27%27%27%27%7C&placement=&creative=550525805697&keyword=fb%27%27%27%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327681933321%26loc_physical_ms%3D9061929%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwkOqZBhDNARIsAACsbfLQ9ikosEJna8smOHb8TEloVQPHlDS_nGvmdutmtfGZV0IgzknY_fMaAl3EEALw_wcB");
		driver.close();
	}
}