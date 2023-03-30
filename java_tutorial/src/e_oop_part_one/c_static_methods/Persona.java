package e_oop_part_one.c_static_methods;

public class Persona {
    private static String type = "Human";
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getHumanName(String type, String name){
        return type + " " + name;
    }

    public String getHumanAge(){
        return this.name + " " +this.age;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Persona.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
