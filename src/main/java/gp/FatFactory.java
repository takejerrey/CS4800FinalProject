package main.java.gp;

import java.util.Random;

public class FatFactory extends MacronutrientFactory {
    private static FatFactory factory = null;

    private FatFactory(){}

    public static FatFactory getInstance() {
        if(factory == null)
            factory = new FatFactory();
        return factory;
    }

    @Override
    Macronutrient getMacronutrient(DietaryRestriction.DietPlan dietPlan) {
        Random rand = new Random();
        int num;
        switch (dietPlan) {
            case PALEO:
                num = rand.nextInt(3);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Tuna");
                    case 2:
                        return new Fat("Peanuts");
                }
            case VEGAN:
                num = rand.nextInt(2);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Peanuts");
                    }
            case NUT_ALLERGY:
                num = rand.nextInt(3);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Sour Cream");
                    case 2:
                        return new Fat("Tuna");
                    }
            default:
                num = rand.nextInt(4);
                return switch (num)
                {
                    case 0 -> new Fat("Avocado");
                    case 1 -> new Fat("Sour Cream");
                    case 2 -> new Fat("Tuna");
                    case 3 -> new Fat("Peanuts");
                    default -> null;
                };
        }
    }

}
