package oop;

public class SpaceshipFactory {
    public XWing createXWing(String name, Alliance alliance, int shieldCapacity, int blasterDamage, int speed, boolean lightSpeedModule, int maneuverability){
        return new XWing(name, alliance, shieldCapacity, blasterDamage, speed, lightSpeedModule, maneuverability);
    }

    public StarDestroyer createStarDestroyer(String name, Alliance alliance, int shieldCapacity, int blasterDamage, int speed, boolean lightSpeedModule, int crewcapacity, int amountOfGuns){
        return new StarDestroyer(name, alliance, shieldCapacity, blasterDamage, speed, lightSpeedModule, crewcapacity, amountOfGuns);
    }
}
