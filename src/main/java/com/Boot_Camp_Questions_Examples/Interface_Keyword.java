package com.Boot_Camp_Questions_Examples;

interface Animals{
    
    // abstract methods 
    void habitat(); 
} 

class AquaticAnimals implements Animals
{ 
    String AnimalName = " "; 
    // constructor   
    AquaticAnimals (String name) 
    { 
        this.AnimalName = name; 
    } 
  @Override
  public void habitat()  
  { 
      System.out.println(this.AnimalName + " leave in water");  
  } 
     
  }
 
class Interface_Keyword
{ 
  public static void main (String[] args)  
  { 
    
         
      // creating the Objects of circle class 
      Animals object2 = new AquaticAnimals("Fishes");  
      object2.habitat(); 
  }}
 