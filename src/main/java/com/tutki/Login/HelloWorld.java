package com.tutki.Login;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.script.ScriptException;


@ManagedBean
@SessionScoped
public class HelloWorld implements Serializable{
	String userName, lastName, address, birthDate;
	boolean validDate = true;
	int id;
	User user = new User();	
	ArrayList<User> users;
	
	public User getUser() {
		return user;
	}
	
	public boolean getValidDate() {
		return validDate;
	}
	
	public void setUser(String userName, String lastName, String address, String birthDate) {
		   user.setUserName(userName);
		   user.setLastName(lastName);
		   user.setAddress(address);
		   user.setBirthDate(birthDate);
	}
	
   public HelloWorld() {
		users = new ArrayList<User>();
		User user1 = new User(0, "Jan", "Kowalski", "Bydgoszcz", "1900.01.01");
		User user2 = new User(1, "Zbigniew", "Nowak", "Warszawa", "1925.03.03");
		User user3 = new User(2, "Jakis", "Gosc", "Gdziekolwiek", "1666.06.06");
	   
	   	users.add(user1);
	   	users.add(user2);
	   	users.add(user3);
	   }
   
   public List<User> getUsers() {
      return users;
   } 
   
   public void addUser() throws NoSuchMethodException, ScriptException {
	   if(isDateValid(user.getBirthDate()) != false) {
	   user.setId(users.get(users.size() - 1).getId() + 1 );
	   validDate = true;
	   users.add(user);	   
	   user = new User();
	   }
	   else {
		   validDate = false;
	   }
   }
   
   public void deleteUser(int id) {
	   users.remove(id);
   }
   
   public boolean isDateValid(String date){
       try {
           SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
           format.setLenient(false);
           format.parse(date);
           return true;
       } catch (ParseException e) {
           return false;
       }	   
   }
}