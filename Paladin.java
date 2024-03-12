package CORALDE_RPG;

public class Paladin extends Swordsman {

    private boolean hasResurrected;

    public Paladin() {
        super();
        hasResurrected = false;
    }

    
    @Override
    public void receiveDamage(int damage) {

        if (damage % 2 == 0) {
        }
        super.receiveDamage(damage);
        if (getHealth() <= 0) {
            resurrect();
        }
    }

    public void resurrect() {
        if (hasResurrected == false) {
            hasResurrected = true;
            setHealth(100);
        } else if (getHealth() <= 0) {
            System.out.println("Paladin has Died");
        }
    }

}

