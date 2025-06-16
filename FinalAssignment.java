import java.util.Scanner;

public class FinalAssignment {

    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);


        System.out.println("please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();
        specials = correcting(specials);

// in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;


        while (specials.equals("Saturday") || specials.equals("Sunday")) {
            System.out.println("please enter a weekday, not weekend!");
            specials = input.next();
            specials = correcting(specials);
        }

        if (specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") || specials.equals("Thursday") || specials.equals("Friday")) {
            switch (specials) {

//           my cases will be the day of the week
                case "Monday":
                    coffee = "Latte";
                    price = 4.95;
                    Calculate(coffee, specials, price);
                    break;


                case "Tuesday":
                    coffee = "Frapp";
                    price = 5.95;
                    Calculate(coffee, specials, price);
                    break;


                case "Wednesday":
                    coffee = "Capucino";
                    price = 4.95;
                    Calculate(coffee, specials, price);
                    break;


                case "Thursday":
                    coffee = "Regular Joe";
                    price = 2.95;
                    Calculate(coffee, specials, price);
                    break;


                case "Friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    Calculate(coffee, specials, price);
                    break;
            }
        } else {
            System.out.println("please enter a valid day or check your spelling and exit, and try again");
        }
    }

    public static String correcting(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String lowerStr = str.toLowerCase();
        return lowerStr.substring(0, 1).toUpperCase() + lowerStr.substring(1);
    }

    public static void Calculate(String Coffee, String Specials, double price) {
        Scanner input = new Scanner(System.in);
        double calculation;
        byte order;
        System.out.println(Specials + "'s coffee of the day is a " + Coffee + " and price will be $" + price);
        System.out.println("How many " + Coffee + " would you like to order?");
        order = input.nextByte();
        if (order == 0) {
            System.out.println("Looks like you don't like " + Coffee + "! so sad!!!");
        } else if (order == 1) {
            System.out.println("Looks like you will be ordering only 1 " + Coffee + " today!");
        } else {

            if (order > 10 ) {
//                Bigger group discount: 20%
                double discountedPrice= price * 0.80;
                calculation = order * discountedPrice;
                System.out.println(" A bigger group discount! Your regular price is $" + String.format (" %.2f" , price) + " dollars!");
                System.out.println(" You  ordered " + order + " "+ Coffee + "s but will be only charged $" + String.format("%.2f" ,discountedPrice) + " each.");

            } else if (order > 2) {

//             Apply 10% discount
                double discountedPrice= price * 0.90;
                calculation = order * discountedPrice;

                System.out.println(" Looks like you qualify for a group discount! Your regular price is $" + String.format (" %.2f" , price) + " dollars!");
                System.out.println(" You  ordered " + order + " "+ Coffee + "s but will be only charged $" + String.format("%.2f" ,discountedPrice) + " each.");

            } else {

//                No discount

                calculation = order * price;
                System.out.printf(order + " " + Coffee + "s have been ordered totalling $");
                System.out.printf("%.2f", calculation);
                System.out.println(" . ");

                System.out.printf(" Your total is: $%.2f\n",calculation);
                System.out.println("Thank you for your order!");

            }
        }

    }
}




