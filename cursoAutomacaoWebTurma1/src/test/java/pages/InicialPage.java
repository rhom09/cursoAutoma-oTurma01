package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

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
		List<WebElement> livros = inicialMap.livros.getElements();

		for (WebElement elLivro : livros) {
			inicialMap.tituloLivroLista.setWebElement(elLivro);
			String tituloLivro = inicialMap.tituloLivroLista.getText();

			if (tituloLivro.contains("Ajax com Java")) {
				inicialMap.precoLista.setWebElement(elLivro);

				return inicialMap.precoLista.getText();
			}
		}
		return null;
	}

}
