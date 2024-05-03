package oop;

public class Battleship {
    private String name;
    private Alliance alliance;
    private int shieldCapacity;
    private int blasterDamage;
    private int speed;
    private boolean lightSpeedModule;

    public Battleship(String name, Alliance alliance, int shieldCapacity, int blasterDamage, int speed, boolean lightSpeedMogule) {
        this.name = name;
        this.alliance = alliance;
        this.shieldCapacity = shieldCapacity;
        this.blasterDamage = blasterDamage;
        this.speed = speed;
        this.lightSpeedModule = lightSpeedMogule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alliance getAlliance() {
        return alliance;
    }

    public void setAlliance(Alliance alliance) {
        this.alliance = alliance;
    }

    public int getShieldCapacity() {
        return shieldCapacity;
    }

    public void setShieldCapacity(int shieldCapacity) {
        this.shieldCapacity = shieldCapacity;
    }

    public int getBlasterDamage() {
        return blasterDamage;
    }

    public void setBlasterDamage(int blasterDamage) {
        this.blasterDamage = blasterDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLightSpeedModule() {
        return lightSpeedModule;
    }

    public void setLightSpeedModule(boolean lightSpeedModule) {
        this.lightSpeedModule = lightSpeedModule;
    }

    public void travel(String destination){}
    public void fight(Battleship battleship){}
}
