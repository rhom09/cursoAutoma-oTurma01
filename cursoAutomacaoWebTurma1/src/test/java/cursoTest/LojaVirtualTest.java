package cursoTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import pages.InicialPage;

public class LojaVirtualTest extends BaseTest {

	InicialPage inicialPage = new InicialPage();

	@Test
	public void testPesquisaLivro() {

		inicialPage.setPesquisa("fortaleza digital", Keys.ENTER);
		String livro = inicialPage.getTituloLivro();

		String preco = inicialPage.getPreco();

		assertThat(livro, is("[PRODUTO DE EXEMPLO] - Fortaleza Digital"));
		assertThat(preco, is("R$519,90"));

	}

	@Test
	public void testClickLista() {

		inicialPage.setPesquisa("html", Keys.ENTER);

		String preco = inicialPage.getPrecoLista();
		assertThat(preco, is("R$444,50"));

	}

}
