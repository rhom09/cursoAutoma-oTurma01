package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.Keys;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.InicialPage;

public class InicialSteps {
	
	InicialPage inicialPage = new InicialPage();

	@Dado("que estou na pagina loja virtual")
	public void queEstouNaPaginaLojaVirtual() {
		Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
	}

	@Quando("realizo a busca do livro {string}")
	public void realizoABuscaDoLivro(String titulo) {
		inicialPage.setPesquisa(titulo, Keys.ENTER);
	}

	@Entao("valido o titulo sendo {string} e o preco sendo {string}")
	public void validoOTituloSendoEOPrecoSendo(String titulo, String preco) {
		assertThat(titulo, is(inicialPage.getTituloLivro()));
		assertThat(preco, is(inicialPage.getPreco()));
	}

	@Quando("clico no livro pesquisado")
	public void clicoNoLivroPesquisado() {
		inicialPage.clickTitulo();
	}

}
