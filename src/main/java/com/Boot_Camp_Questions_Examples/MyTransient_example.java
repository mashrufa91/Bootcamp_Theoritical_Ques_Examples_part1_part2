package com.Boot_Camp_Questions_Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyTransient_example implements Serializable{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
 	String email;
 	
 	transient String password; 
 	public MyTransient_example (String name, String email, String password) {   
  	this.name = name;    
  	this.email = email;    
  	this.password=password;    
 	} 	
 	public static void main(String args[])throws Exception{
 
  	MyTransient_example C =new MyTransient_example ("John", "coding.john@gmail.com","CN!@1");
  	
  	FileOutputStream cn=new FileOutputStream("cn.txt");    
  	ObjectOutputStream out=new ObjectOutputStream(cn);    
  	out.writeObject(C);    
  	out.flush();    
  	out.close();    
  	cn.close();  
  	  
  	System.out.println("Serialized Student Object"); 
  	
  	ObjectInputStream in=new ObjectInputStream(new FileInputStream("cn.txt"));    
  	MyTransient_example c=(MyTransient_example)in.readObject();  
  	
  	System.out.println("Deserialized Student Object:"); 
  	System.out.println("Name: "+c.name+" ;"+"E-mail: " +c.email+" ;"+"Password: "+c.password);    
  	
  	in.close();
 	}}



