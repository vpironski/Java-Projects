public class PeacfulModel extends BattleEquipment{
    public PeacfulModel(double life, int defence, int attackPower, String name, String flyingMode, double batteryLife) {
        super(life*2, defence, attackPower, name, flyingMode, batteryLife);
    }

    @Override
    public double dodge() {
        System.out.println("Cant dodge");
        return 0.00;
    }
}
