//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1500);
        boss.setDamage(50);
        boss.setDefenseType("Magic");

        Hero[] heroes = createHero();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Heroes damage " + heroes[i].getDamage());
            System.out.println("Hero Health"  + heroes[i].getHealth());
            System.out.println("Boss Defense Super Type"  + boss.getDefenseType());
        }

    }
    public static Hero[] createHero(){
        Hero Geralt = new Hero(40, 51, "Speed");
        Hero Ben = new Hero(50, 100, "magic");
        Hero Bull = new Hero(60,40,"invisibility");

        return new Hero[]{Geralt,Ben,Bull};

    }
}



