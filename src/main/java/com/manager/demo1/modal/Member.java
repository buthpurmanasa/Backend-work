package com.manager.demo1.modal;

import jakarta.persistence.*;



@Entity
// we are creating table 
@Table(name = "ListOfAdopters")
public class Member {
	
//  we are a cerating  colonms of table 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name ="petName")
    private String petName;
    
    @Column(name ="address")
    private String address;
    
    
    @Column(name = "number")
    private Long number;
    public Member() {
    	
    }
    
    public Member(String name,String email,String address,Long number,String petName) {
    	 super();
    	 
    	 
    	  this.name=name;
          this.email=email;
          this.address=address;
          this.number=number;
          this.petName=petName;          
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	

	
	
          
          
          
          
    	 
     
	
	
	

}
