package loopingandcollections;

import java.util.*;

public class Main {
    public static void main(String[] args)
     {
         System.out.println("*** Welcome to Lambda School's Java Day 2");

         System.out.println("\n\n*** Arrays ***");

         Dog[] dogArr = new Dog[5];
         dogArr[0] = new Dog("Springer", 50, false);
         dogArr[1] = new Dog("Bulldog", 45, true);
         dogArr[2] = new Dog("Collie", 45, false);
         dogArr[3] = new Dog("Chihuahua", 5, true);
         dogArr[4] = new Dog("Corgie", 35, true);

         for(int i=0; i<dogArr.length; i++) {
             if(dogArr[i].isApartment())
             {
                 continue;
             }
             System.out.print(dogArr[i]);
         }

         System.out.println();
         for (Dog d : dogArr)
         {
             System.out.print(d);
         }

         System.out.println("\n\n*** ArrayList");
         List<Dog> dogArrayList = new ArrayList<>();
         dogArrayList.addAll(Arrays.asList(dogArr));
         dogArrayList.add(new Dog("Mutt", 15, true));
         for (Dog d : dogArrayList)
         {
             System.out.print(d);
         }

         System.out.println();
         for (Dog d : dogArrayList)
         {
             System.out.print(d.getBreed() + " are ");

             switch (d.getAvgWeight())
             {
                 case 5:
                    System.out.print(d.getAvgWeight() + " very small ");
                    break;
                 case 15:
                    System.out.print(d.getAvgWeight() + " small ");
                    break;
                 case 25:
                    System.out.print(d.getAvgWeight() + " medium ");
                    break;
                 case 35:
                    System.out.print(d.getAvgWeight() + " large ");
                    break;
                 case 45:
                    System.out.print(d.getAvgWeight() + " very large ");
                    break;
                default:
                    System.out.print(d.getAvgWeight() + " unknown ");
             }
             System.out.println("dogs");
         }

         System.out.println();
         if(dogArrayList.get(2).getBreed().equals("Turtle"))
         {
             System.out.println("Match!");
         } else {
             System.out.println("No Match!");
         }

         System.out.println();
         dogArrayList.add(2, new Dog("Labrador", 75, false));
         for (Dog d : dogArrayList)
         {
             System.out.print(d);
         }

         System.out.println();
         dogArrayList.set(2, new Dog("Poodle", 50, false));
         for (Dog d : dogArrayList)
         {
             System.out.print(d);
         }

         System.out.println();
         dogArrayList.remove(3);

         System.out.println("\n *** Sort ArrayList - By Weight from Largest to Smallest");
         dogArrayList.sort(Comparator.comparing(o -> o.getAvgWeight(), Comparator.reverseOrder()));
         for (Dog d : dogArrayList)
         {
             System.out.print(d);
         }

         System.out.println("\n *** HashMaps");
         Map<Integer, Dog> dogHashMap = new HashMap<>();
         int hashcount = 0;
         for (Dog d : dogArrayList)
         {
             dogHashMap.put(hashcount, d);
             hashcount++;
         }

         System.out.println("Key of 3 " + dogHashMap.get(3));
         System.out.println("Size " + dogHashMap.size());
         dogHashMap.remove(3);
         System.out.println("Key of 3 Removed " + dogHashMap.get(3));

         // print hashmap
         System.out.println("\nPrinting HashMap");
         for(HashMap.Entry mapElm : dogHashMap.entrySet())
         {
             System.out.println("Key is " + mapElm.getKey());
             System.out.println("Value is " + mapElm.getValue());
         }

         // sort hashmap
         List<HashMap.Entry> sortedMap = new ArrayList<>(dogHashMap.entrySet());
         sortedMap.sort(Comparator.comparing(o -> ((Dog)o.getValue()).getBreed()));

         System.out.println("*** Sorted Map");
         System.out.println(sortedMap);

         Map<String, Dog> stringDogsMap = new HashMap<>();
         stringDogsMap.put("John", new Dog("Sprinter", 60, false));
         stringDogsMap.put("Matthew", new Dog("Corgie", 35, true));
         stringDogsMap.put("Anne", new Dog("Mutt", 15, false));
         System.out.println("\nPrinting Push HashMap");
         for(HashMap.Entry mapElm : stringDogsMap.entrySet())
         {
             System.out.println("Key is " + mapElm.getKey());
             System.out.println("Value is " + mapElm.getValue());
         }

         System.out.println(stringDogsMap.get("Anne"));
     }
}