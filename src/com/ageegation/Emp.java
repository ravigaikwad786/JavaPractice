package com.ageegation;

public class Emp {
	
	int id;
	String name;
	Addres address;
	Hobbies hob;
	
	public Emp(int id, String name, Addres add , Hobbies hobi) {
		super();
		this.id = id;
		this.name = name;
		this.address = add;
		
		this.hob=hobi;
	}
	
	void display() {
		System.out.println("Id"+id+"Name"+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		System.out.println("Hobbies of Employe"+hob.hobbi1+""+hob.hobbi2+""+hob.hobbi3);
	}
	
	public static void main(String args[]) {
		Addres add1= new Addres("khapri","nagpur","india");
		Addres add2= new Addres("khapri","nagpur","india");
		
		Hobbies hob= new Hobbies("criket","baseball","football");
		Hobbies hob2= new Hobbies("criket","baseball","football");
		
		Emp e=new Emp(111,"varun",add1,hob);  
		Emp e2=new Emp(112,"arun",add2,hob2);  
		
		e.display();
		e2.display();
	}

}
