public abstract class Macronutrient {
    private String name;

    public Macronutrient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
