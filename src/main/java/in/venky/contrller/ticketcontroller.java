package in.venky.contrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.venky.entity.passenger;
import in.venky.entity.ticket;
import in.venky.service.ticketservice;

@RestController
public class ticketcontroller {
	@Autowired
	private ticketservice service;
	
	@PostMapping("/bookticket")
	 public ResponseEntity<String> bookticket(@RequestBody passenger p) {
		service.bookticket(p);
		return new ResponseEntity<>(HttpStatus.OK);
		 
	 }
	@GetMapping("/tickets")
	public List<ticket> gettickets() {
		List<ticket> list = service.getall();
		return list;
	}
}
