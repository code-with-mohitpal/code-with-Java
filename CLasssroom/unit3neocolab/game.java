abstract class GameCharacter {
    abstract void attack(int value);
    abstract void defend(int value);
}

class Warrior extends GameCharacter {
    void attack(int value) {
        int result = value * 3;
        System.out.println("Attack: Powerful sword slash for " + result + " damage!");
    }

    void defend(int value) {
        System.out.println("Defend: Raises shield, defence boosted by " + value + "!");
    }
}

class Wizard extends GameCharacter {
    void attack(int value) {
        int result = value * 2;
        System.out.println("Attack: Casts spell, deals " + result + " magical damage!");
    }

    void defend(int value) {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + value + "!");
    }
}