public class Warrior extends Hero {
    protected Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способноть "+getSuperAbility());

    }
}
