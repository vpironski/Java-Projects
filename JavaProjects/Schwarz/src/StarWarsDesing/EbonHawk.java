package StarWarsDesing;

public class EbonHawk extends Ship{

    public EbonHawk(long id, String name, String color, int attack, int life, int shield, int capacity) {
        super(id, name, color, attack, life, shield, capacity);
    }

    @Override
    public void attack(Ship ship) {
        ship.TakeDamage(this.getAttackDamage());
        if(ship.isDestroyed()){
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void TakeDamage(int damage) {
        if(this.getShield() >= damage){
            this.setShield(getShield() - damage);

        } else if (this.getShield() < damage) {
            setLife(this.getLife() - (damage - this.getShield()));
            setShield(0);
        }
        else if(this.getShield() <= 0){
            setLife(this.getLife() - damage);
        }
    }

    @Override
    public boolean isDestroyed() {
        if(this.getLife() <= 0){
            return true;
        }
        return false;
    }

    public void heal(int life){
        this.setLife(getLife() + life);
    }

}
