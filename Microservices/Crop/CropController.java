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

import com.casestudy.model.Cropdetails;
import com.casestudy.repository.CropRepository;
@RestController
@RequestMapping("/crop")

public class CropController {
	@Autowired
	private CropRepository repository;
	@Autowired
	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/crop")
	 public String crop() {
	 return "hello world-Crop";
	}
	@PostMapping("/addcrop")
	public String savecrop(@RequestBody Cropdetails crop) {
		repository.save(crop);
		return "Added crop"+crop.getCropId();
	}
	
	@GetMapping("/Allcrop")
	public List<Cropdetails> getAll(){
		return repository.findAll();
	}
	@GetMapping("/findAllcrop/{id}")
	public Optional<Cropdetails> getcrop(@PathVariable int id){
		return repository.findById(id);
	}
	@PutMapping("/updatecrop/{id}")
	public String putbycrop(@RequestBody Cropdetails crop) {
		repository.save(crop);
		return "crop updated with id:"+crop.getCropId();
	}

	@DeleteMapping("/delete/{id}")
	public String deletecrop(@PathVariable int id) {
		repository.deleteById(id);
		return "crop deleted with id:"+id;
		
		
	}
	}

