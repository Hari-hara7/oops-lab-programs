package muiltitread;

import java.util.Random;

//Thread to generate a random number
class RandomNumber extends Thread {
 int num;

 public void run() {
     Random rand = new Random();
     while (true) {
         num = rand.nextInt(100); // Generate a random number between 0 and 99
         System.out.println("Generated: " + num);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Thread to compute and print the square of the random number
class Square extends Thread {
 RandomNumber random;

 public Square(RandomNumber random) {
     this.random = random;
 }

 public void run() {
     while (true) {
         int square = random.num * random.num;
         System.out.println("Square: " + square);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Thread to compute and print the cube of the random number
class Cube extends Thread {
 RandomNumber random;

 public Cube(RandomNumber random) {
     this.random = random;
 }

 public void run() {
     while (true) {
         int cube = random.num * random.num * random.num;
         System.out.println("Cube: " + cube);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Main class to start the threads
public class muilti {
 public static void main(String[] args) {
     RandomNumber random = new RandomNumber();
     Square square = new Square(random);
     Cube cube = new Cube(random);

     random.start();
     square.start();
     cube.start();
 }
}
