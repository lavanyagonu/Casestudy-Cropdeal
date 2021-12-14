package com.casestudy.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.casestudy.model.Farmerdetails;
import com.casestudy.repository.FarmerRepository;
@RestController
@RequestMapping("/farmer")
public class FarmerController {
@Autowired
private FarmerRepository repository;
@Autowired
private RestTemplate restTemplate ;

@GetMapping("/f")
 public String farmer() {
 return "hello world-farmer";
}
@PostMapping("/addfarmer")
public String saveFarmer(@RequestBody Farmerdetails farmer) {
	repository.save(farmer);
	return "Added farmer"+farmer.getId();
}

@GetMapping("/Allfarmer")
public List<Farmerdetails> getAll(){
	return repository.findAll();
}
@GetMapping("/findAllfarmer/{id}")
public Optional<Farmerdetails> getFarmer(@PathVariable int id){
	return repository.findById(id);
}
@PutMapping("/updateFarmer/{id}")
public String putbyFarmer(@RequestBody Farmerdetails farmer) {
	repository.save(farmer);
	return "farmer updated with id:"+farmer.getId();
}

@DeleteMapping("/delete/{id}")
public String deleteFarmer(@PathVariable int id) {
	repository.deleteById(id);
	return "farmer deleted with id:"+id;
	
	
}
}
