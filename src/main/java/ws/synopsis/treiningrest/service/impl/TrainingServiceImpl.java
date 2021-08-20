package ws.synopsis.treiningrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ws.synopsis.treiningrest.model.GetCountryResponse;
import ws.synopsis.treiningrest.repository.CountryRepository;
import ws.synopsis.treiningrest.request.CountryRequest;
import ws.synopsis.treiningrest.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {

	/*@Override
	public void findByNameGet(CountryRequest value) {
		System.out.println("TrainingServiceImpl.findByNameGet");
		
	}*/
	
	@Autowired
	private CountryRepository countryrepository;
	
	@Override
	public GetCountryResponse findByNameGet(CountryRequest request) {
	GetCountryResponse response = new GetCountryResponse();
	response.setCountry(countryrepository.findCountry(request.getName()));
	return response;
	}

	@Override
	public GetCountryResponse editCountry(CountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryrepository.editCountry(request.getName(), request.getCapital()));
		return response;
	}

}
