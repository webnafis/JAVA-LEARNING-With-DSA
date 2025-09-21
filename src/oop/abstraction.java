package oop;

public class abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        // h.eats();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eats();
        // c.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Animals a = new Animals(); // error
        // a.eats();
        // a.walk();

        // Mustang m = new Mustang();
        // Queen q = new Queen();
        // q.move();
        // FullForceAttack attack = new FullForceAttack();
        // attack.threeDimentionalAttack();
        // Person p1 = new Person();
        // p1.name = "nafis";
        // Person p2 = new Person();
        // System.out.println(p2.name);
        // Person p3 = new Person();
        // p3.name = "alif";
        // System.out.println(p2.name);

    }
}

class Person {
    static String name;

    static int essentialEarning(int familyMembers) {
        return 5000 * familyMembers;
    }
}

interface LandAttack {
    void tank();
}

interface SkyAttack {
    void jetPlane();
}

interface SeaAttack {
    void warship();
}

class FullForceAttack implements LandAttack, SkyAttack, SeaAttack {
    public void tank() {
        System.out.println("send tanks.....");
    }

    public void jetPlane() {
        System.out.println("send jet planes......");
    }

    public void warship() {
        System.out.println("send warships........");
    }

    void threeDimentionalAttack() {
        tank();
        jetPlane();
        warship();
    }
}

interface chessePlayer {
    void move();
}

class King implements chessePlayer {
    public void move() {
        System.out.println("King is moving......");
    }
}

class Rock implements chessePlayer {
    public void move() {
        System.out.println("Rock is moving.....");
    }
}

class Queen implements chessePlayer {
    public void move() {
        System.out.println("Queen is moving.....");
    }
}

abstract class Animals {
    String color;

    Animals() {
        color = "brown";
        System.out.println("Animal constructor is working......");
    }

    void eats() {
        System.out.println("animal are eating....");
    }

    abstract void walk();
}

class Horse extends Animals {
    Horse() {
        super();
        System.out.println(super.color);
        System.out.println("Horse constructor is working......");
    }

    void changeColor() {
        this.color = "black";
    }

    void walk() {
        System.out.println("Horse is walking.....");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is working......");
    }
}

class Chicken extends Animals {
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("Chicken is walking...");
    }
}