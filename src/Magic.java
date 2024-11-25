public class Magic extends Hero{
    protected Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность "+getSuperAbility());

    }
}
