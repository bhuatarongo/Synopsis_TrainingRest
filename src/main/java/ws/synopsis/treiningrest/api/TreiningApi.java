package ws.synopsis.treiningrest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ws.synopsis.treiningrest.model.GetCountryResponse;
import ws.synopsis.treiningrest.repository.CountryRepository;
import ws.synopsis.treiningrest.request.CountryRequest;
import ws.synopsis.treiningrest.service.TrainingService;

@RestController
public class TreiningApi {
	@Autowired
	private TrainingService service;
	
	/*
	@Autowired
	private CountryRepository countryrepository;
	
	
	@GetMapping("/findbyname")
	public void findByNameGet(CountryRequest value) {
		System.out.println("Mesaje");
		service.findByNameGet(value);
	}*/
	
	@GetMapping("/findbyname")
	public ResponseEntity<?> findByNameGet (CountryRequest request) {
		service.findByNameGet(request);
		GetCountryResponse countryresponse = service.findByNameGet(request);		
		
		return ResponseEntity.ok(countryresponse);
	}
	
	@PutMapping("/editCapital")	
	public ResponseEntity<?> editNameGet (@RequestBody CountryRequest request) {
		service.editCountry(request);
		GetCountryResponse countryresponse = service.editCountry(request);
		
		
		return ResponseEntity.ok(countryresponse);
	}
	
	
	
	

}
