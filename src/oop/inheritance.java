package oop;

public class inheritance {
    public static void main(String args[]) {
        // Fish fish = new Fish();
        // fish.eat();
        // Wheal bluWheal = new Wheal();
        // bluWheal.breathe();
        // bluWheal.feedsMilk();
        // Mammal man = new Mammal();
        // man.walk();
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(23, 55));
        // System.out.println(calc.sum(1.2f, 0.3f));
        // System.out.println(calc.sum(33, 33, 44));
        DomesticAnimal domanimal = new DomesticAnimal();
        Cow cow = new Cow();
        domanimal.eat();
        cow.eat();
    }
}

class DomesticAnimal {
    void eat() {
        System.out.println("eats things which is halal for them.");
    }
}

class Cow {
    void eat() {
        System.out.println("eats grass.");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats...");
    }

    void breathe() {
        System.out.println("breaths.....");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks....");
    }
}

class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("swims.....");
    }
}

class Wheal extends Fish {
    void feedsMilk() {
        System.out.println("feading...");
    }
}
