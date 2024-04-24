package in.venky.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainid;
	private String name;
	private String email;
	private String gender;
	private String source;
	private String destination;
	private String trainnum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTrainnum() {
		return trainnum;
	}
	public void setTrainnum(String trainnum) {
		this.trainnum = trainnum;
	}
	public Integer getTrainid() {
		return trainid;
	}
	public void setTrainid(Integer trainid) {
		this.trainid = trainid;
	}
	

}
