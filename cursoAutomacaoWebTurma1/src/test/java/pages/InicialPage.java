package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;

public class InicialPage {

	String elPesquisa = "search";
	String elTituloLivro = "h2.product-name";
	String elPreco = "span.regular-price span.price";

	public void setPesquisa(CharSequence... valor) {
		WebElement pesquisa = Driver.getDriver().findElement(By.id(elPesquisa));
		pesquisa.sendKeys(valor);
	}
	
	public String getTituloLivro() {
		WebElement tituloLivro = Driver.getDriver().findElement(By.cssSelector(elTituloLivro));
		String livro = tituloLivro.getText();
		return livro;
	}
	
	public String getPreco() {
		WebElement preco = Driver.getDriver().findElement(By.cssSelector(elPreco));
		return preco.getText();
	}
}
