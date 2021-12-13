package com.casestudy.Recource;

import java.util.Arrays;
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

import com.casestudy.Repository.AdminRepository;
import com.casestudy.model.Admindetails;
import com.casestudy.model.Cropdetails;
import com.casestudy.model.Dealerdetails;
import com.casestudy.model.Farmerdetails;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminRepository repository;
	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/a")
	 public String admin() {
	 return "hello world-admin";
	}

	
 @RequestMapping("/Farmerdetails/{Id}") 
	public Farmerdetails getFarmerdetails(@PathVariable int id){
	 System.out.println("calling Admin from farmer"); 
	 Farmerdetails farmer=restTemplate.getForObject("http://localhost:8085/farmer/f/"+ id,Farmerdetails.class); 
	 return farmer ; }	

	
	/* @RequestMapping("/Cropdetails/") 
	 public Cropdetails getCropdetail(@PathVariable String destination){
	 System.out.println("calling Crop details from admin"); 
	 Cropdetails crop=restTemplate.getForObject("http://localhost:8787/crop/getAllcrops" ,Cropdetails.class); 
	 return crop; }*/
	

	@RequestMapping("/Cropdetails/{id}")
	public Cropdetails getCropdetails(@PathVariable int id){
	System.out.println("calling crop details from admin");
	Cropdetails Crop= restTemplate.getForObject("http://localhost:8787/crop/get/"+ id, Cropdetails.class);
	return Crop;
	}


	
	@RequestMapping("/Dealerdetails/")
	public List<Dealerdetails> getAllDealerdetailsetails(){
	System.out.println("calling dealer details from admin");
	List<Dealerdetails>dealer= (List<Dealerdetails>)restTemplate.getForObject("http://localhost:8081/dealer/getAlldealers",Dealerdetails.class); 
	return dealer; 
	}
	
	@PostMapping("/Addadmin")
	public String saveadmin(@RequestBody Admindetails admin) {
		repository.save(admin);
		return "Added admin"+admin.getId();
	}

	@GetMapping("/Alladmin")
	public List<Admindetails> getAll(){
		return repository.findAll();
	}
	@GetMapping("/findAlladmin/{id}")
	public Optional<Admindetails> getadmin(@PathVariable int id){
		return repository.findById(id);
	}
	@PutMapping("/updateadmin/{id}")
	public String putbyadmin(@RequestBody Admindetails admin) {
		repository.save(admin);
		return "admin updated with id:"+admin.getId();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteadmin(@PathVariable int id) {
		repository.deleteById(id);
		return "admin deleted with id:"+id;
		
		
	}
	
		}	
	