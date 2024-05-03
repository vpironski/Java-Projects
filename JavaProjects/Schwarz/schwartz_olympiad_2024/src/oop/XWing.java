package oop;

public class XWing extends Battleship{
    private int maneuverability;

    public XWing(String name, Alliance alliance, int shieldCapacity, int blasterDamage, int speed, boolean lightSpeedModule, int maneuverability) {
        super(name, alliance, shieldCapacity, blasterDamage, speed, lightSpeedModule);
        this.maneuverability = maneuverability;
    }

    public int getManeuverability() {
        return maneuverability;
    }

    public void setManeuverability(int maneuverability) {
        this.maneuverability = maneuverability;
    }

    public boolean evade(XWing enemyXwing){
        if(getManeuverability() > enemyXwing.getManeuverability()){
            return true;
        }
        else{
            return false;
        }
    }

    public void travel(String destination){
        if(isLightSpeedModule()){
            System.out.printf("XWing %s enters lightspeed hyperspace on route to %s \n", getName(), destination);
        }
        else{
            System.out.printf("XWing %s is on route to %s \n", getName(), destination);
        }
    }

    public void fight(Battleship battleship){
        if(!(getAlliance().equals(battleship.getAlliance()))){
            if(!(battleship instanceof StarDestroyer)){
                if(getBlasterDamage() > battleship.getShieldCapacity()){
                    System.out.println("Victory!");
                } else if (getShieldCapacity() > battleship.getBlasterDamage()) {
                    System.out.println("Defeat!");
                }
                else{
                    if(evade((XWing) battleship)){
                        System.out.println("Battle Evaded!");
                    }
                    else{
                        System.out.println("Defeat");
                    }
                }
            }

        }
    }

}
