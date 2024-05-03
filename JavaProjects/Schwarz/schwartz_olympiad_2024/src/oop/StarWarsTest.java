package oop;

public class StarWarsTest {
    public static void main(String[] args) {
        SpaceshipFactory spaceshipFactory = new SpaceshipFactory();
        XWing xWing = spaceshipFactory.createXWing( "Rogue 1", Alliance.REBELS, 80, 150, 200, true, 200);
        StarDestroyer starDestroyer = spaceshipFactory.createStarDestroyer("The Executor", Alliance.EMPIRE, 250, 350, 50, true, 400,150);
        Battleship battleship1 = spaceshipFactory.createStarDestroyer("The Devastator", Alliance.REBELS, 200, 300, 40, true, 350,200);
        Battleship battleship2 = spaceshipFactory.createXWing( "TI-1", Alliance.EMPIRE, 90, 70, 200, true, 150);

        xWing.travel("Endore");
        starDestroyer.deployTroops("Mustafar");

        xWing.fight(battleship1);
//        xWing.fight(battleship2);
//        starDestroyer.fight(battleship1);
//        starDestroyer.fight(battleship2);
    }
}
