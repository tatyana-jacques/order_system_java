package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Client {
	
	private static DateTimeFormatter fmtBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email;
	private LocalDate birthDate;
	
	
	public Client() {
		
	}


	public Client(String name, String email, LocalDate birth) {
		
		this.name = name;
		this.email = email;
		this.birthDate = birth;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getBirth() {
		return birthDate;
	}


	public void setBirth(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return name + " (" + fmtBirth.format(birthDate) + ") - " + email;	
	}
	
	
	
	

}
