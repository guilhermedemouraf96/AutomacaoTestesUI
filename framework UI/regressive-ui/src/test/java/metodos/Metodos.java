package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	
	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driversjava\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		

	}

	public void fecharNavegador() {

	}

	public void digitarTexto(By elemento, String texto) {

	}

	public void clicar(By elemento) {

	}

	public void print(String passo) {

	}

	public void validarUrl(String urlEsperada) {

	}

	public void validarMensagem(String textoEsperado) {

	}

}
