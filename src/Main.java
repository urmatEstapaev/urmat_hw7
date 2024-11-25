public class Main {
    public static void main(String[] args) {
        Hero[]heroes={
                new Magic(800, 70, "невидимость"),
                new Warrior(500,90,"летать"),
                new Medic(700,100,"лечить", 8.0)
        };
        for (Hero hero:heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic)hero).increaseExperience();
            }
        }
    }
}