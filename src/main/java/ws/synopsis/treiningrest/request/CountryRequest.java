package ws.synopsis.treiningrest.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class CountryRequest implements Serializable {
    private String name;
    private String capital;

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
