/*
  
 https://www.w3resource.com/java-exercises/index-abstract.php
 
 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). 
 Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method 
 to make a specific sound for each animal.
 
 
 */



package sample;

//Abstract class Animal
abstract class Animal {
 // Abstract method
 abstract void sound();
}

//Lion class extends Animal
class Lion extends Animal {
 // Implement the sound() method
 @Override
 void sound() {
     System.out.println("Lion roars!");
 }
}

//Tiger class extends Animal
class Tiger extends Animal {
 // Implement the sound() method
 @Override
 void sound() {
     System.out.println("Tiger growls!");
 }
}


public class AnimalSoundTest {

	public static void main(String[] args) {
        // Create objects of Lion and Tiger
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        // Call the sound() method
        lion.sound();  // Output: Lion roars!
        tiger.sound(); // Output: Tiger growls!
	}

}
