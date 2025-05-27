package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.binddings.PassengerInfo;
import com.app.binddings.TicketInfoo;

@RestController
public class TicketRestController {
	
	
	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfoo> grtTicket(@PathVariable("ticketId") Integer ticketId) {
		TicketInfoo Tinfo = new TicketInfoo();
		Tinfo.setTicketId(ticketId);
		Tinfo.setPnr("JLJL5554");
		Tinfo.setTicketStatus("CONFIRMED");

		return new ResponseEntity<>(Tinfo, HttpStatus.OK);
	}

	//////////////////////////////////////////////////////////////
	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TicketInfoo> bookTicket(@RequestBody PassengerInfo refInfo) {

		System.out.println(refInfo);
		TicketInfoo Tinfo = new TicketInfoo();
		Tinfo.setTicketId(1234);
		Tinfo.setPnr("JLJL5554");
		Tinfo.setTicketStatus("CONFIRMED");

		return new ResponseEntity<>(Tinfo, HttpStatus.CREATED);

	}

	//////////////////////////////////////////////////////////////
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo refInfo) {

		System.out.println(refInfo);

		return new ResponseEntity<String>("Ticket Updated", HttpStatus.OK);
	}
	
	///////////////////////////////////////////////////////////////

	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId) {

		return new ResponseEntity<String>("Ticket Deleted", HttpStatus.OK);
	}
}