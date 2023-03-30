package e_oop_part_one.c_static_methods;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Melih", 31);
        System.out.println("Name : " + Persona.getHumanName(null ,persona.getName()));
        System.out.println("Age : " + persona.getHumanAge());
    }
}
