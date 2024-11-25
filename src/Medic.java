public class Medic extends Hero{
    private double healPoints;


    protected Medic(int health, int damage, String superAbility, double healPoints) {
        super(health, damage, superAbility);
        this.healPoints=healPoints;


    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способноть "+getSuperAbility());

    }

    public void increaseExperience(){
        healPoints*=1.1;
        System.out.println("Medic увеличил количество единиц на "+healPoints);
    }
}


