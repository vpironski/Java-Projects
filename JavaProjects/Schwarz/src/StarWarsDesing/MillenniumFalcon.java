package StarWarsDesing;

public class MillenniumFalcon extends Ship{
    private int dodge;

    public MillenniumFalcon(long id, String name, String color, int attack, int life, int shield, int capacity, int dodge) {
        super(id, name, color, attack, life, shield, capacity);
        this.dodge = dodge;
    }

    @Override
    public void attack(Ship ship) {
        ship.TakeDamage(this.getAttackDamage() * 2);
        if(ship.isDestroyed()){
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void TakeDamage(int damage) {
        damage += 200;

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

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
