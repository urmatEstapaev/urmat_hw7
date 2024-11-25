public abstract class Hero implements HavingSuperAbility  {
    private int health;
    private int damage;
    private String superAbility;

    protected Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage= damage;
        this.superAbility=superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}
