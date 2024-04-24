package in.venky.service;

import java.util.List;

import in.venky.entity.passenger;
import in.venky.entity.ticket;

public interface ticketservice {
public void bookticket(passenger p);
public List<ticket> getall();
}
