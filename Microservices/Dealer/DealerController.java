package com.casestudy.Resource;

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

import com.casestudy.Repository.DealerRepository;
import com.casestudy.model.Dealerdetails;

@RestController
@RequestMapping("/dealer")
public class DealerController {
		@Autowired
		private DealerRepository repository;
		@Autowired
		RestTemplate restTemplate = new RestTemplate();

		@GetMapping("/d")
		 public String dealer() {
		 return "hello world-dealer";
		}
		@PostMapping("/adddealer")
		public String savedealer(@RequestBody Dealerdetails dealer) {
			repository.save(dealer);
			return "Added dealer"+dealer.getId();
		}

		@GetMapping("/Alldealer")
		public List<Dealerdetails> getAll(){
			return repository.findAll();
		}
		@GetMapping("/findAlldealer/{id}")
		public Optional<Dealerdetails> getdealer(@PathVariable int id){
			return repository.findById(id);
		}
		@PutMapping("/updatedealer/{id}")
		public String putbydealer(@RequestBody Dealerdetails dealer) {
			repository.save(dealer);
			return "farmer updated with id:"+dealer.getId();
		}

		@DeleteMapping("/delete/{id}")
		public String deletedealer(@PathVariable int id) {
			repository.deleteById(id);
			return "dealer deleted with id:"+id;
			
			
		}
		
		}

