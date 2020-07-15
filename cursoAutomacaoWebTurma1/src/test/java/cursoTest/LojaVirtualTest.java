package cursoTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.Driver;
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

		List<WebElement> elLivros = Driver.getDriver().findElements(By.cssSelector("ul.products-grid > li"));

		for (WebElement elLivro : elLivros) {
			WebElement elTituloLivro = elLivro.findElement(By.cssSelector("h2 > a"));

			String tituloLivro = elTituloLivro.getText();
			if (tituloLivro.contains("Ajax com Java")) {
				WebElement elPreco = elLivro.findElement(By.cssSelector("span.price"));

				assertThat(elPreco.getText(), is("R$444,50"));
				break;
			}
		}

	}

}
