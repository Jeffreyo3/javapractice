package transport;

import java.util.*;


public class Main {
    private static List<AbstractVehicle> filteredList = new ArrayList<>();
    private static void filterVehicles(List<AbstractVehicle> vehicles, CheckVehicle tester, boolean printit)
    {
        filteredList.clear();
        for(AbstractVehicle v : vehicles)
        {
            if (tester.test(v))
            {
                if(printit)
                {
                    System.out.println(v.getName() + " " + v.getFuelLevel());
                }
                filteredList.add(v);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Transport module 3");
        System.out.println("\n *** Working with Interfaces *** \n");
    
         Horse seabiscuit = new Horse("Seabiscuit");
         Horse affirmed = new Horse("Affirmed");
         Horse joe = new Horse("Joe");
    
         seabiscuit.eat(10);
         affirmed.eat(25);
         seabiscuit.move();
         seabiscuit.move();
         seabiscuit.move();
         System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());

         System.out.println("\n *** Working with Abstract Classes *** \n");

         HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
         secretariat.addFuel(10);

         HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
         eclipse.move(10);

         HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
         HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
         HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);

         Auto vw = new Auto(1, "EuroVan", 2000);
         Auto toyota = new Auto(10, "Tundra", 1998);
         Auto honda = new Auto(5, "Accord", 2003);
         vw.move();
         vw.move(5);

         List<AbstractVehicle> myList = new ArrayList<>();
         myList.add(secretariat);
         myList.add(trigger);
         myList.add(seattleSlew);
         myList.add(americanPharoah);
         myList.add(eclipse);
         myList.add(vw);
         myList.add(toyota);
         myList.add(honda);

         System.out.println("\n *** LIST ***");
        //  System.out.println(myList.toString());
        //  for (AbstractVehicle av : myList)
        //  {
        //  }

        // Lambda Expressions
         myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
         myList.forEach((v) -> System.out.println(v));

         System.out.println("\n *** Print Negative Fuel ***\n");
         // using this method will sort without affecting the original list
         filterVehicles(myList, v -> v.getFuelLevel() < 0, true);

         System.out.println("\n*** Print Negative Fuel Horse ***\n");
         filterVehicles(myList, v -> (v.getFuelLevel() < 0) && (v instanceof HorseFromVehicle), false);
         filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
         filteredList.forEach((v) -> System.out.println(v));
    }    
}