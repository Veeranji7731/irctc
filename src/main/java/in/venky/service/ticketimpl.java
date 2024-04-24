package in.venky.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venky.entity.passenger;
import in.venky.entity.ticket;
import in.venky.repo.ticketrepo;

@Service
public class ticketimpl implements ticketservice{
	@Autowired
private ticketrepo tr;
	
	@Override
	public List<ticket> getall() {
		List<ticket> all = tr.findAll();
		return all;
	}

	@Override
	public void bookticket(passenger p) {
		ticket t=new ticket();
		BeanUtils.copyProperties(p,t);
		tr.save(t);
	}

	
	

}
