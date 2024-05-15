import java.util.Random;

public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory factory = null;

    ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if(factory == null)
            factory = new ProteinFactory();
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
                        return new Protein("Fish");
                    case 1:
                        return new Protein("Chicken");
                    case 2:
                        return new Protein("Beef");
                }
            case "Vegan":
                return new Protein("Tofu");
            default:
                num = rand.nextInt(3);
                switch (num) {
                    case 0:
                        return new Protein("Fish");
                    case 1:
                        return new Protein("Chicken");
                    case 2:
                        return new Protein("Beef");
                    case 3:
                        return new Protein("Tofu");
                }
                return null;
        }
    }

}
