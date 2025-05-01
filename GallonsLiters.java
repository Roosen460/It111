public class GallonsLiters {

    public static void main(String[] args) {

        double LittersPerGallon = 3.79;

        int count = 0;

        for (int Gallons = 1; Gallons <= 100; Gallons += 4) {
            double liters = Gallons * LittersPerGallon;
            System.out.printf("%.2f Liters = %.1f Gallons%n", liters, (double) Gallons);

            count++;
            if (count % 5 == 0) {

                System.out.println();

            }
        }
        System.out.println("We are done!!!!");
    }
}






