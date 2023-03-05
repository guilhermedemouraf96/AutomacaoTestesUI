package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class metodos {

	WebDriver driver;

	public void abrirNavegador(String url) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);

	}
	public void fecharNavegador() {

		driver.quit();
	}

	public void escreverTexto(By elemento, String texto, String descricaoDoPasso) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.out.println("ERRO AO " + descricaoDoPasso);
		}

	}

	public void clicar(By elemento, String descricaoDoPasso) {
		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {

			System.out.println("ERRO AO " + descricaoDoPasso);
		}

	}

	public void submit(By elemento, String descricaoDoPasso) {

		try {

			driver.findElement(elemento).submit();

		} catch (Exception e) {

			System.out.println("ERRO AO " + descricaoDoPasso);

		}

	}

	public void validarTitle(String titleEsperado, By Elemento, String descricaoDoPasso) {

		try {

			String title = driver.getTitle();
			assertEquals(titleEsperado, title);
			System.out.println("o titulo da pagina é " + title);

		} catch (Exception e) {
			System.out.println("ERRO AO " + descricaoDoPasso);
		}

	}

	public void validarUrl(String urlEsperado, By elemento, String descricaoDoPasso) {

		try {
			String url = driver.getCurrentUrl();
			assertEquals(urlEsperado, url);
			System.out.println(url);

		} catch (Exception e) {
			System.out.println("ERRO AO " + descricaoDoPasso);
		}

	}

	public void validarTexto(String textoEsperado, By elemento, String descricaoDoPasso) {

		try {
			String texto = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, texto);
			System.out.println(texto);

		} catch (Exception e) {
			System.out.println("ERRO AO " + descricaoDoPasso);
		}
	}

	public void Screenshot(String nome) throws IOException {

		
			TakesScreenshot src = ((TakesScreenshot) driver);
			File srcFile = src.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/test/resources/evidencias/" + nome + ".png");
			FileUtils.copyFile(srcFile, destFile);

		
	}

	}

	
