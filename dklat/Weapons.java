enum Weapons {

   LiteralNoodle("Noodle",                   0,   1,  1),
   NoobSword    ("NoobSword(TM)",           10,   0,  Integer.MAX_VALUE),
   CasualSword  ("Noob+=1",                 15,   1,  Integer.MAX_VALUE),
   ProSword     ("Pro Sword",               26,   3,  Integer.MAX_VALUE),
   UltraSuper   ("Ultra Super",             39,   5,  500),
   SharpStick   ("Stick (Sharp) (Ouch)",    35,   4,  391),
   SatanSlapper ("Satan Slapper",           51,   7,  666),
   Laptop       ("DDOS Machine",           100,   7,  5),
   GodSword     ("Death",                69420, 999,  Integer.MAX_VALUE),
   ;

   final String name;
   final int    damage;
   final int    rarity;
   final int    uses;

   private Weapons(String name, int damage, int rarity, int uses) {
      this.name   = name;
      this.damage = damage;
      this.rarity = rarity;
      this.uses   = uses;
   }

   Weapon make() {
      return new Weapon(name,damage,rarity,uses);
   }

}