package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button loginButton = new Button(By.xpath("//html/body/div/div/div[1]/div/nav/div/div[2]/div/ul[2]/li[1]/a"),"[Login] button in Main page");
}

