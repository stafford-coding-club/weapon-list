class Weapon {

   private String name;
   private int rarity;
   private int damage;
   private int uses;

   Weapon(String name, int rarity, int damage, int uses) {
      this.name   = name;
      this.rarity = rarity;
      this.damage = damage;
      this.uses   = uses;
   }

   void attack() {
      if (uses > 0) {
         System.out.println("Attacked with " + name + "!");
         System.out.println("Did " + damage + " damage.");
         uses -= 1;
         if (uses == 0) {
            System.out.println(name + " broke!");
         }
      } else {
         System.out.println(name + " is broken!");
      }
   }

   @Override
   public String toString() {
      return name + "[" + rarity + "]" + " Dmg: " + damage + " Uses: " + uses;
   }

}