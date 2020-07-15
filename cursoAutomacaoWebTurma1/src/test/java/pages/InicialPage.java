package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;
import map.InicialMap;

public class InicialPage {
	
	InicialMap inicialMap = new InicialMap();

	String elLivros = "ul.products-grid > li";
	String elTituloLivroLista = "h2 > a";
	String elPrecoLista = "span.price";

	public void setPesquisa(CharSequence... valor) {
		inicialMap.pesquisa.sendKeys(valor);
	}

	public String getTituloLivro() {
		String livro = inicialMap.tituloLivro.getText();
		return livro;
	}

	public String getPreco() {
		return inicialMap.preco.getText();
	}

	public String getPrecoLista() {
		List<WebElement> livros = Driver.getDriver().findElements(By.cssSelector(elLivros));

		for (WebElement elLivro : livros) {
			WebElement elTituloLivro = elLivro.findElement(By.cssSelector(elTituloLivroLista));

			String tituloLivro = elTituloLivro.getText();
			if (tituloLivro.contains("Ajax com Java")) {
				WebElement elPreco = elLivro.findElement(By.cssSelector(elPrecoLista));

				return elPreco.getText();
			}
		}
		return null;
	}

}
