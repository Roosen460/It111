public class GallonsLiters {

    public static void main(String[] args) {

        Double LittersPerGallon = 3.79;

        int count = 0;

        for (int gallons = 1; gallons <= 100; gallons += 4) {
            double liters = gallons * LittersPerGallon;
            System.out.printf("%.2f Liters = %.1f Gallons%n", liters, (double) gallons);

            count++;
            if (count % 5 == 0) {

                System.out.println();

            }
        }
        System.out.println("We are done!!!!");
    }
}






