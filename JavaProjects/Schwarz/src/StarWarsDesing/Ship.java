package StarWarsDesing;

public abstract class Ship {
     private long id;
     private String name;
     private String color;
     private int attackDamage;
     private int life;
     private int shield;
     private int capacity;

    public Ship(long id, String name, String color, int attack, int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attack;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }

    public abstract void  attack(Ship ship);


    public abstract void TakeDamage(int damage);



    public abstract boolean isDestroyed();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
