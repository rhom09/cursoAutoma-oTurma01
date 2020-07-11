package cursoTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LojaVirtualTest extends BaseTest {

	@Test
	public void testPesquisaLivro() {

		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("Fortaleza Digital", Keys.ENTER);
		
		WebElement elTituloLivro = driver.findElement(By.cssSelector("h2.product-name"));
		String livro = elTituloLivro.getText();
		
		WebElement elPreco = driver.findElement(By.cssSelector("span.regular-price span.price"));
		String preco = elPreco.getText();
		
		assertThat(livro, is("[PRODUTO DE EXEMPLO] - Fortaleza Digital"));
		assertThat(preco, is("R$519,90"));
		
	}

}
