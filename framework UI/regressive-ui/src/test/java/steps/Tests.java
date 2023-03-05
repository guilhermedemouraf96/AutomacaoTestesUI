package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Tests {

	Metodos metodo = new Metodos();

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		
		metodo.abrirNavegador();

	}

	@Then("acessar o site da loja")

	@Given("preencho o campo usuario valido")
	public void preencho_o_campo_usuario_valido() {

	}

	@Given("preencho o campo senha valido")
	public void preencho_o_campo_senha_valido() {

	}

	@When("fazer o login")
	public void fazer_o_login() {

	}

	@Then("acessar o site da loja {string}")
	public void acessar_o_site_da_loja(String urlLoja) {

	}

	@Given("preencho o campo usuario Bloqueado")
	public void preencho_o_campo_usuario_bloqueado() {

	}

	@Given("preencher a senha")
	public void preencher_a_senha() {

	}

	@Then("visualizo mensagem de usuario bloqueado")
	public void visualizo_mensagem_de_usuario_bloqueado() {

	}

	@Given("preencho o campo usuario invalido")
	public void preencho_o_campo_usuario_invalido() {

	}

	@Given("preencho o campo senha invalido")
	public void preencho_o_campo_senha_invalido() {

	}

	@Then("visualizo mensagem de usuario invalido")
	public void visualizo_mensagem_de_usuario_invalido() {

	}

	@Given("não preencho o campo usuario")
	public void não_preencho_o_campo_usuario() {

	}

	@Given("não preencho o campo senha")
	public void não_preencho_o_campo_senha() {

	}

	@Then("visualizo mensagem de dados em branco")
	public void visualizo_mensagem_de_dados_em_branco() {

	}

}
