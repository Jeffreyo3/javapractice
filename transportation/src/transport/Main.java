package transport;

public class Main {

    public static void main(String[] args) {
        System.out.println("Transport module 3");
        System.out.println("\n *** Working with Interfaces *** ");
    
         Horse seabiscuit = new Horse("Seabiscuit");
         Horse affirmed = new Horse("Affirmed");
         Horse joe = new Horse("Joe");
    
         seabiscuit.eat(10);
         affirmed.eat(25);
         seabiscuit.move();
         seabiscuit.move();
         seabiscuit.move();
         System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());

    }    
}