//import java.util.HashMap;
//import java.util.Map;
//
//public class FoodFactory {
//    private static final Scanner INPUT_READER = new Scanner(System.in);
//    private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();
//
//    static {
//        FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
//        FoodFactory.getFactory().registerCuisine("Italian", new Italian());
//        FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
//        FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
//    }
//
//    public static void main(String[] args) {
//        int totalNumberOfOrders = Integer.parseInt(INPUT_READER.nextLine());
//        while (totalNumberOfOrders-- > 0) {
//            String[] food = INPUT_READER.nextLine().split(" ");
//            String cuisine = food[0];
//            String dish = food[1];
//
//            try {
//                if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
//                    Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);
//
//                    switch (cuisine) {
//                        case "Chinese":
//                            Chinese chineseDish = (Chinese) servedFood;
//                            System.out.println("Serving " + chineseDish.getDish() + "(Chinese)");
//                            break;
//                        case "Italian":
//                            Italian italianDish = (Italian) servedFood;
//                            System.out.println("Serving " + italianDish.getDish() + "(Italian)");
//                            break;
//                        case "Japanese":
//                            Japanese japaneseDish = (Japanese) servedFood;
//                            System.out.println("Serving " + japaneseDish.getDish() + "(Japanese)");
//                            break;
//                        case "Mexican":
//                            Mexican mexicanDish = (Mexican) servedFood;
//                            System.out.println("Serving " + mexicanDish.getDish() + "(Mexican)");
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            } catch (UnservableCuisineRequestException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//
//    private Map<String, Cuisine> cusinesByKey;
//
//    private static FoodFactory foodFactory;
//
//    private FoodFactory() {
//        cusinesByKey = new HashMap<>();
//    }
//
//    public static FoodFactory getFactory() {
//        if (foodFactory == null) {
//            foodFactory = new FoodFactory();
//        }
//
//        return foodFactory;
//    }
//
//    public void registerCuisine(String cuisineKey, Cuisine cuisine) {
//        cusinesByKey.put(cuisineKey, cuisine);
//    }
//
//    public Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException {
//        Cuisine cuisine = cusinesByKey.get(cuisineKey);
//
//        if (cuisine == null) {
//            throw new UnservableCuisineRequestException("Unservable cusine " + cuisineKey + " for dish " + dish);
//        }
//
//        return cuisine.serveFood(dish);
//    }
//}
//
//abstract class Cuisine {
//    public abstract Cuisine serveFood(String dish);
//}
//
//class UnservableCuisineRequestException extends Exception {
//    public UnservableCuisineRequestException(String message) {
//        super(message);
//    }
//}
//
//class CuisineHelper extends Cuisine {
//    protected String dish;
//
//    @Override
//    public Cuisine serveFood(String dish) {
//        this.dish = dish;
//        return this;
//    }
//
//    public String getDish() {
//        return dish;
//    }
//}
//
//class Chinese extends CuisineHelper { }
//class Japanese extends CuisineHelper { }
//class Italian extends CuisineHelper { }
//class Mexican extends CuisineHelper { }