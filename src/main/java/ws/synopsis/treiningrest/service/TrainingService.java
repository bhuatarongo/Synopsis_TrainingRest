package ws.synopsis.treiningrest.service;

import ws.synopsis.treiningrest.model.GetCountryResponse;
import ws.synopsis.treiningrest.request.*;

public interface TrainingService {

	public GetCountryResponse findByNameGet(CountryRequest request)  ;
	
	public GetCountryResponse editCountry(CountryRequest request);
}
