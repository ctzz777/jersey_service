package jersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {
	
	private String name;
	private Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}