public class BattleEquipment {
    private double life;
    private int defence;
    private int attackPower;
    private String name;
    private String flyingMode;
    private double batteryLife;

    public BattleEquipment(double life, int defence, int attackPower, String name, String flyingMode, double batteryLife) {
        setLife(life);
        setDefence(defence);
        setAttackPower(attackPower);
        setName(name);
        setFlyingMode(flyingMode);
        setBatteryLife(batteryLife);
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        try{
            if(life >= 0 && life <= Integer.MAX_VALUE){
                this.life = life;
            }
            else throw new IncorrectInfoException("Incorrect life value");
        }
        catch (IncorrectInfoException e){
            System.err.println(e.getMessage());
        }

    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        try{
            if(defence >= 0 && defence <= 100){
                this.defence = defence;
            }
            else throw new IncorrectInfoException("Incorrect defence value");
        }
        catch (IncorrectInfoException e){
            System.err.println(e.getMessage());
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlyingMode() {
        return flyingMode;
    }

    public void setFlyingMode(String flyingMode) {
        try{
            if(flyingMode.equals("Stealth") || flyingMode .equals("Offensive") || flyingMode .equals("Defensive")){
                this.flyingMode = flyingMode;
            }
            else throw new IncorrectInfoException("Unspecified flying mode");
        }
        catch (IncorrectInfoException e){
            System.err.println(e.getMessage());
        }
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        try{
            if(batteryLife >= 0 && batteryLife <= 100){
                this.batteryLife = batteryLife;
            }
            else throw new IncorrectInfoException("Incorrect batteryLife value");
        }
        catch (IncorrectInfoException e){
            System.err.println(e.getMessage());
        }
    }

    public int attack(){
        return this.attackPower;
    }
    public double dodge(){
        return getDefence() * 0.08;
    }
    public double recharge(){
        return batteryLife + 0.02035;
    }
}
