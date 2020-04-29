import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ChipotleJrPlus {
    public static void main(String[] args) {
        Random r = new Random();
        int i, j, pickIngredient;

        // Build the 'menu':

        String burritoRice[] = new String[4];
        burritoRice[0] = "white rice";
        burritoRice[1] = "brown rice";
        burritoRice[2] = "no rice";
        burritoRice[3] = "all rice";

        String burritoMeat[] = new String[8];
        burritoMeat[0] = "chicken";
        burritoMeat[1] = "steak";
        burritoMeat[2] = "carnidas";
        burritoMeat[3] = "chorizo";
        burritoMeat[4] = "sofritas";
        burritoMeat[5] = "veggie meat";
        burritoMeat[6] = "no meat";
        burritoMeat[7] = "all meats";

        String burritoBeans[] = new String[4];
        burritoBeans[0] = "pinto beans";
        burritoBeans[1] = "black beans";
        burritoBeans[2] = "no beans";
        burritoBeans[3] = "all beans";

        String burritoSalsa[] = new String[5];
        burritoSalsa[0] = "mild salsa";
        burritoSalsa[1] = "medium salsa";
        burritoSalsa[2] = "hot salsa";
        burritoSalsa[3] = "no salsa";
        burritoSalsa[4] = "all salsas";

        String burritoVeggies[] = new String[4];
        burritoVeggies[0] = "lettuce";
        burritoVeggies[1] = "fajita veggies";
        burritoVeggies[2] = "no veggies";
        burritoVeggies[3] = "all veggies";

        String burritoCheese[] = new String[2];
        burritoCheese[0] = "cheese";
        burritoCheese[1] = "no cheese";

        String burritoGuac[] = new String[2];
        burritoGuac[0] = "guac";
        burritoGuac[1] = "no guac";

        String burritoQueso[] = new String[2];
        burritoQueso[0] = "queso";
        burritoQueso[1] = "no queso";

        String burritoSourcream[] = new String[2];
        burritoSourcream[0] = "sour cream";
        burritoSourcream[1] = "no sour cream";

        //Initiate empty array list to populate with the random ingredients.
        ArrayList<String> ranBurrito = new ArrayList<>();

        //Generate 25 random burritos.
        for(i=0; i<25; i++){
            //Print burrito #
            System.out.println("Burrito "+(i+1)+"/25: ");
            //Random ingredients.
            String ranRice = burritoRice[r.nextInt(4)];
            String ranMeat = burritoMeat[r.nextInt(8)];
            String ranBeans = burritoBeans[r.nextInt(4)];
            String ranSalsa = burritoSalsa[r.nextInt(5)];
            String ranVeggies = burritoVeggies[r.nextInt(4)];
            String ranCheese = burritoCheese[r.nextInt(2)];
            String ranGuac = burritoGuac[r.nextInt(2)];
            String ranQueso = burritoQueso[r.nextInt(2)];
            String ranSourcream = burritoSourcream[r.nextInt(2)];
            //With Method public static ArrayList burritoConstruction
            burritoMethod(ranBurrito, ranRice, ranMeat, ranBeans, ranSalsa, ranVeggies, ranCheese, ranGuac, ranQueso, ranSourcream);
            //Without Method
//            ranBurrito.add(ranRice);
//            ranBurrito.add(ranMeat);
//            ranBurrito.add(ranBeans);
//            ranBurrito.add(ranSalsa);
//            ranBurrito.add(ranVeggies);
//            ranBurrito.add(ranCheese);
//            ranBurrito.add(ranGuac);
//            ranBurrito.add(ranQueso);
//            ranBurrito.add(ranSourcream);
            int ingredientsRemaining = 9;
            //Generate random number of ingredients.
            int ranIngredients = 5 + r.nextInt(5);
            //Set and Reset base price of burrito
            double priceBurrito = 3.00;
            //Generate random ingredients.
            for(j=0; j<ranIngredients; j++){
                //r.nextInt(ingredientsRemaining) to generate a random number from 0-8(number of types of ingredients).
                pickIngredient = r.nextInt(ingredientsRemaining);
                //Challenge #2: Count the number of times each ingredient was used.
                //.get(pickIngredient) and .remove(pickIngredient) to return an ingredient and to prevent that type from being chosen again.
                System.out.println(">"+ranBurrito.get(pickIngredient));
                //condition for adding 50 cents to the price of the burrito
                if(!ranBurrito.get(pickIngredient).contains("no")){
                    priceBurrito += 0.5;
                }
                ranBurrito.remove(pickIngredient);
                //For every item I pull, it's one less to the total (n) so n--.
                ingredientsRemaining--;
            }
            System.out.println("    Subtotal: $"+priceBurrito+"\n_____________________________");
            ranBurrito.clear();
        }
    }
    public static ArrayList burritoMethod(ArrayList<String> ranBurrito, String rice, String meat, String beans, String salsa, String veggies, String cheese, String guac, String queso, String sourcream){

        ranBurrito.add(rice);
        ranBurrito.add(meat);
        ranBurrito.add(beans);
        ranBurrito.add(salsa);
        ranBurrito.add(veggies);
        ranBurrito.add(cheese);
        ranBurrito.add(guac);
        ranBurrito.add(queso);
        ranBurrito.add(sourcream);

    return ranBurrito;}
//    public static HashMap ingCount(ArrayList<String> ranBurrito, int pickIngredient){
//        HashMap<String, Integer> ingCountHashMap = new HashMap<>();
//        for (int i = 0; i<ranBurrito.size(); i++){
//            if(!HashMap.containsKey(ranBurrito.get(pickIngredient))){
//
//            }
//        }
//
//    }

}
