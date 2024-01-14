package com.Boot_Camp_Questions_Examples;

interface A {  
    void a(); // by default, public and abstract  
    void b();  
    void c();  
    void d();  
}  

// Creating abstract class that provides the implementation of one method of A interface  
abstract class Abs implements A {  
    public void c() { System.out.println("I am C"); }  
}  

// Creating subclass of abstract class, now we need to provide the implementation of the rest of the methods  
public class Interface_ints extends Abs {  
    public void a() { System.out.println("I am a"); }  
    public void b() { System.out.println("I am b"); }  
    public void d() { System.out.println("I am d"); }  
}  

// Creating a test class that calls the methods of A interface  
class Test5 {  
    public static void main(String args[]) {  
        A a = new Interface_ints();  
        a.a();  
        a.b();  
        a.c();  
        a.d();  
    }
}

