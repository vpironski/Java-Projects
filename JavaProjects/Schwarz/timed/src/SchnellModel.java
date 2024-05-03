public class SchnellModel extends BattleEquipment{
    private int speed;
    public SchnellModel(double life, int defence, int attackPower, String name, String flyingMode, double batteryLife, int speed) {
        super(life, defence, attackPower, name, flyingMode, batteryLife);
        this.speed = speed;
    }

    @Override
    public int attack() {
        return getAttackPower() - 5;
    }

    @Override
    public double dodge() {
        return getDefence() * 0.092;
    }
}
