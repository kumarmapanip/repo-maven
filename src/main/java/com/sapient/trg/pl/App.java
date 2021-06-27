package com.sapient.trg.pl;

import java.time.LocalDate;

import com.sapient.trg.service.Person;

public class App 
{
    public static void main( String[] args )
    {
    	Person person1 = new Person();
    	person1.setPersonId(1);
    	person1.setFirstName("Mapanip");
    	person1.setLastName("Sahoo");
    	System.out.println(person1.getPersonId()+","+person1.getFirstName()+","+person1.getLastName()); 
    	Person person2 = new Person(2,"Aditi","Roy",LocalDate.of(2005, 9, 23),977717224L);
    	System.out.println(person2.getPersonId()+","+person2.getFirstName()+","+person2.getLastName());
    }
}
