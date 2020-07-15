package map;

import core.Element;
import enums.ByValue;

public class InicialMap {
	
	public Element pesquisa = new Element(ByValue.ID, "search");
	public Element tituloLivro = new Element(ByValue.CSSSELECTOR, "h2.product-name");
	public Element preco = new Element(ByValue.CSSSELECTOR, "span.regular-price span.price");
	
	public Element livros = new Element(ByValue.CSSSELECTOR, "ul.products-grid > li");
	public Element tituloLivroLista = new Element(ByValue.CSSSELECTOR, "h2 > a");
	public Element precoLista = new Element(ByValue.CSSSELECTOR, "span.price");

}
