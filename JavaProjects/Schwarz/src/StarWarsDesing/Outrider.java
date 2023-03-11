package StarWarsDesing;

public class Outrider extends Ship{
    private int plasma;

    public Outrider(long id, String name, String color, int attack, int life, int shield, int capacity, int plasma) {
        super(id, name, color, attack, life + 100, shield, capacity);
        this.plasma = plasma;
    }

    @Override
    public void attack(Ship ship) {
        ship.TakeDamage(this.getAttackDamage());
        if(ship.isDestroyed()) {
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void TakeDamage(int damage) {
        damage -= 50;
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

    public int getPlasma() {
        return plasma;
    }

    public void setPlasma(int plasma) {
        this.plasma = plasma;
    }
}
