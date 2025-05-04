package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTextBox = new TextBox(By.id("element-0"),"[Email] textbox in Login section");
    public TextBox passwordTextBox = new TextBox(By.id("element-2"),"[Password] textbox in Login section");
    public Button loginButton = new Button(By.xpath("//*[@id='todoist_app']/div/div/div[2]/div[1]/div/div/form/button"),"[Login] button in Login section");
}

