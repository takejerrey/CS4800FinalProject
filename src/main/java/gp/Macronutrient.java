package main.java.gp;

public abstract class Macronutrient {
    private final String name;

    public Macronutrient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
