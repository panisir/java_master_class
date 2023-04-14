package e_oop_part_one.f_inheritance;

/**
 * IMPORTANT NOTE (1) !!!
 * super() is a lot like this()
 * Like this(), it has to be the first statement of the constructor
 * Because of that rule, this() and super() can
 * never be called from the same constructor
 * */

/**
 * IMPORTANT NOTE (2) !!!
 * If you don't call to super(), then JAVA makes it for you,
 * using super's default constructor
 * */

import java.util.Objects;

/**
 * IMPORTANT NOTE (3) !!!
 * If your super class does not have a default(no-args) constructor
 * than you MUST explicitly call super() in all of your constructors
 * passing the right arguments to that constructor.
 * */

public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    /**
     * Overridden Method can do one of three things
     * (1) implement completely different behavior, overriding the behavior of the parent
     * (2) simply call parent's method, which is somewhat redundant to do.
     * (3) call the parent's method and include other code to run, so it can extend the
     *     functionality for that behavior.
     * */
    public void makeNoise(){
        if(Objects.equals(type, "Wolf")){
            System.out.println("Ow Woooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof! ");
    }

    private void run() {
        System.out.println("Dog Barking ");
    }

    private void walk() {
        System.out.println("Dog Walking ");
    }

    private void wagTail() {
        System.out.println("Tail Wagging ");
    }

    @Override
    protected void die() {
        super.die();
    }
}

