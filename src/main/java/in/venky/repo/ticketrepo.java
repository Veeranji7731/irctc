package in.venky.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venky.entity.passenger;
import in.venky.entity.ticket;

public interface ticketrepo extends JpaRepository<ticket,Integer>{

	

	

}
