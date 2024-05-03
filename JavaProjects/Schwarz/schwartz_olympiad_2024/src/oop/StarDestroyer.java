package oop;

public class StarDestroyer extends Battleship{
    private int crewCapacity;
    private int amountOfGuns;

    public StarDestroyer(String name, Alliance alliance, int shieldCapacity, int blasterDamage, int speed, boolean lightSpeedMogule, int crewCapacity, int amountOfGuns) {
        super(name, alliance, shieldCapacity, blasterDamage, speed, lightSpeedMogule);
        this.crewCapacity = crewCapacity;
        this.amountOfGuns = amountOfGuns;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public int getAmountOfGuns() {
        return amountOfGuns;
    }

    public void setAmountOfGuns(int amountOfGuns) {
        this.amountOfGuns = amountOfGuns;
    }


    public void deployTroops(String location){
        if(isLightSpeedModule()){
            System.out.printf("Star Destroyer %s enters lightspeed hyperspace on route to %s \n", getName(), location);
        }
        else{
            System.out.printf("XWing %s deploys troops to %s \n", getName(), location);
        }
    }

    public void fight(Battleship battleship){
        if(!(getAlliance().equals(battleship.getAlliance()))){
            if(!(battleship instanceof XWing)){
                StarDestroyer enemyStarDestroyer = (StarDestroyer) battleship;
                if(getAmountOfGuns() * getBlasterDamage() > enemyStarDestroyer.getShieldCapacity()){
                    System.out.println("Victory!");
                }
                else if(enemyStarDestroyer.getAmountOfGuns() * enemyStarDestroyer.getBlasterDamage() > getShieldCapacity()){
                    System.out.println("Defeat!");
                }
                else{
                    System.out.println("Both ships damaged!");
                }
            }
        }
    }
}
