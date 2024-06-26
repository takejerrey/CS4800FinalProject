package main.java.gp;

import java.util.Random;

public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory factory = null;

    private ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if(factory == null)
            factory = new ProteinFactory();
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
                        return new Protein("Fish");
                    case 1:
                        return new Protein("Chicken");
                    case 2:
                        return new Protein("Beef");
                }
            case VEGAN:
                return new Protein("Tofu");
            default:
                num = rand.nextInt(4);
                return switch (num)
                {
                    case 0 -> new Protein("Fish");
                    case 1 -> new Protein("Chicken");
                    case 2 -> new Protein("Beef");
                    case 3 -> new Protein("Tofu");
                    default -> null;
                };
        }
    }

}
