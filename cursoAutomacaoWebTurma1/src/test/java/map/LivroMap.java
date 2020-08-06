package map;

import core.Element;
import enums.ByValue;

public class LivroMap {
	
	public Element titulo = new Element(ByValue.CSSSELECTOR, ".product-name h1");
	public Element preco = new Element(ByValue.CSSSELECTOR, "span.regular-price span.price");

}
