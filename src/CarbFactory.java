import java.util.Random;

public class CarbFactory extends MacronutrientFactory {
    private static CarbFactory factory = null;

    CarbFactory(){}

    public static CarbFactory getInstance() {
        if(factory == null)
            factory = new CarbFactory();
        return factory;
    }

    @Override
    Macronutrient getMacronutrient(String dietPlan) {
        Random rand = new Random();
        int num;
        switch (dietPlan) {
            case "Paleo":
                return new Carb("Pistachio");
            case "Vegan":
                num = rand.nextInt(2);
                switch (num) {
                    case 0:
                        return new Carb("Bread");
                    case 1:
                        return new Carb("Lentils");
                    case 2:
                        return new Carb("Pistachio");
                }
            case "Nut Allergy":
                num = rand.nextInt(2);
                switch (num) {
                    case 0:
                        return new Carb("Cheese");
                    case 1:
                        return new Carb("Bread");
                    case 2:
                        return new Carb("Lentils");
                }
            default:
                num = rand.nextInt(3);
                switch (num) {
                    case 0:
                        return new Carb("Cheese");
                    case 1:
                        return new Carb("Bread");
                    case 2:
                        return new Carb("Lentils");
                    case 3:
                        return new Carb("Pistachio");
                }
                return null;
        }
    }

}
