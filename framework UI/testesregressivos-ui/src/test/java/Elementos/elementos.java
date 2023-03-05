package Elementos;

import org.openqa.selenium.By;

public class elementos {

	private By Username = By.id("user-name");
	private By Password = By.id("password");
	private By Login = By.id("login-button");
	private By mensagemDeErro = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
	private By mensagemDeErro2 = By.xpath("//*[text()='Epic sadface: Username is required']");

	public By getMensagemDeErro2() {
		return mensagemDeErro2;
	}

	public By getMensagemDeErro() {
		return mensagemDeErro;
	}

	public By getUsername() {
		return Username;
	}

	public By getPassword() {
		return Password;
	}

	public By getLogin() {
		return Login;
	}

}
