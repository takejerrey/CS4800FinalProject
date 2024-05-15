import java.util.Random;

public class FatFactory extends MacronutrientFactory {
    private static FatFactory factory = null;

    FatFactory(){}

    public static FatFactory getInstance() {
        if(factory == null)
            factory = new FatFactory();
        return factory;
    }

    @Override
    Macronutrient getMacronutrient(String dietPlan) {
        Random rand = new Random();
        int num;
        switch (dietPlan) {
            case "Paleo":
                num = rand.nextInt(2);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Tuna");
                    case 2:
                        return new Fat("Peanuts");
                }
            case "Vegan":
                num = rand.nextInt(1);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Peanuts");
                    }
            case "Nut Allergy":
                num = rand.nextInt(2);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Sour Cream");
                    case 2:
                        return new Fat("Tuna");
                    }
            default:
                num = rand.nextInt(3);
                switch (num) {
                    case 0:
                        return new Fat("Avocado");
                    case 1:
                        return new Fat("Sour Cream");
                    case 2:
                        return new Fat("Tuna");
                    case 3:
                        return new Fat("Peanuts");
                }
                return null;
        }
    }

}
