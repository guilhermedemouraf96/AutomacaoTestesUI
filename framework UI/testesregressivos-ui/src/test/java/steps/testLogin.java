package steps;

import java.io.IOException;
import java.time.LocalDateTime;

import Elementos.elementos;
import Elementos.massaDeTeste;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import metodos.metodos;

public class testLogin {

	metodos metodo = new metodos();
	elementos el = new elementos();
	massaDeTeste massa = new massaDeTeste();

	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String appUrl) {
		metodo.abrirNavegador(appUrl);

	}

	@Given("preencho usuario invalido")
	public void preenchoUsuarioInvalido() {
		metodo.escreverTexto(el.getUsername(), massa.UsernameCT1, "Preenchendo Login");

	}

	@Given("preencho senha invalida")
	public void preenchoSenhaInvalida() {
		metodo.escreverTexto(el.getPassword(), massa.PasswordCT1, "Preenchendo a senha");

	}

	@Given("realizo o login com dados invalidos")
	public void realizoOLoginComDadosInvalidos() throws IOException {
		metodo.Screenshot("CT1 - 1 - Realizar o login com dados invalidos");
		metodo.clicar(el.getLogin(), "Realizando o login");

	}

	@Then("visualizo mensagem de usuario e senha invalido")
	public void visualizoMensagemDeUsuarioESenhaInvalido() throws IOException {
		metodo.Screenshot("CT1 - 2 - Validar mensagem de erro");
		metodo.validarTexto("Epic sadface: Username and password do not match any user in this service",
				el.getMensagemDeErro(), "validar o texto" + LocalDateTime.now());
		metodo.fecharNavegador();

	}

	@Given("não preencho usuario")
	public void nãoPreenchoUsuarioBloqueado() {

	}

	@Given("não preencho senha")
	public void nãoPreenchoSenha() {

	}

	@Given("realizo o login com dados em branco")
	public void realizoOLoginComDadosEmBranco() throws IOException {
		metodo.Screenshot("CT2 - 1 - Realizar o login com dados em branco");
		metodo.clicar(el.getLogin(), "Realizando o login com dados em branco");
	}

	@Then("visualizo mensagem de campos em branco")
	public void visualizoMensagemDeCamposEmBranco() throws IOException {
		metodo.Screenshot("CT2 - 2 - Validar mensagem de erro");
		metodo.validarTexto("Epic sadface: Username is required", el.getMensagemDeErro2(),
				"Validar o texto" + LocalDateTime.now());
		metodo.fecharNavegador();
	}

}
