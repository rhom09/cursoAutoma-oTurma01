package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.pt.Entao;
import pages.LivroPage;

public class LivroSteps {

	LivroPage livroPage = new LivroPage();

	@Entao("confirmo o titulo sendo {string} e o preco sendo {string}")
	public void confirmoOTituloSendoEOPrecoSendo(String titulo, String preco) {

		assertThat(titulo, is(livroPage.getTitulo()));
		assertThat(preco, is(livroPage.getPreco()));

	}

}
