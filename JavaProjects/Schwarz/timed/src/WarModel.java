public class WarModel extends BattleEquipment{

    public WarModel(double life, int defence, int attackPower, String name, String flyingMode, double batteryLife) {
        super(life*0.9, defence, attackPower * 2, name, flyingMode, batteryLife);
    }

    @Override
    public int attack() {
        return getAttackPower() + 10;
    }
}
