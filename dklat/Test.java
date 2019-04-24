import java.util.*;

class Test {

   public static void main(String... args) {

      Map<String,Weapon> inventory = new HashMap<>();

      // Adding weapon from list
      inventory.put("primary", Weapons.LiteralNoodle.make());
      inventory.put("secondary", Weapons.GodSword.make());

      System.out.println(inventory.get("primary"));
      System.out.println(inventory.get("secondary"));

      inventory.get("primary").attack();
      inventory.get("primary").attack();
      inventory.get("primary").attack();
      inventory.get("primary").attack();

      System.out.println(inventory.get("primary"));

      inventory.get("secondary").attack();
      inventory.get("secondary").attack();
      inventory.get("secondary").attack();

      System.out.println(inventory.get("secondary"));

      // Adding custom weapon
      inventory.put("custom", new Weapon("super sand legend", 5, 27, 1));

      System.out.println(inventory.get("custom"));

      inventory.get("custom").attack();
      inventory.get("custom").attack();
      inventory.get("custom").attack();

      System.out.println(inventory.get("custom"));


   }

}