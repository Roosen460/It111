import java.util.Scanner;

public class dailySpecials
{

    public static void main(String[] args)
    {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();


// in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;
        double count;
        double total;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday)
        {
            System.out.println("please enter a weekday, not weekend!");
            specials = input.next();
        }


        switch (specials)
        {

//            my cases will be the day of the week
            case "Monday":
                coffee = "Latte";
                price = 4.95;

                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                count = input.nextDouble();
                if (count == 0)
                {
                    System.out.println("Looks like you don't like " + coffee + "s! so sad!!!!");
                } else if (count==1)
                {
                    System.out.println("Looks like will be ordering only 1 " +coffee + " today!");
                }
                else
                {
                    total= price*count;
                    System.out.println(count + " " +coffee+ "s have been ordered totalling $"  +total+  " dollars!");
                }

                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                count = input.nextDouble();
                if (count == 0)
                {
                    System.out.println("Looks like you don't like " + coffee + "s! so sad!!!!");
                } else if (count==1)
                {
                    System.out.println("Looks like will be ordering only 1 " +coffee + " today!");
                }
                else
                {
                    total= price*count;
                    System.out.println(count + " " +coffee+ "s have been ordered totalling $"  +total+  " dollars!");
                }

                break;


            case "Wednesday":
                coffee = "Capucino";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                count = input.nextDouble();
                if (count == 0)
                {
                    System.out.println("Looks like you don't like " + coffee + "s! so sad!!!!");
                } else if (count==1)
                {
                    System.out.println("Looks like will be ordering only 1 " +coffee + " today!");
                }
                else
                {
                    total= price*count;
                    System.out.println(count + " " +coffee+ "s have been ordered totalling $"  +total+  " dollars!");
                }

                break;


            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");

                count = input.nextDouble();
                if (count == 0)
                {
                    System.out.println("Looks like you don't like " + coffee + "s! so sad!!!!");
                } else if (count==1)
                {
                    System.out.println("Looks like will be ordering only 1 " +coffee + " today!");
                }
                else
                {
                    total= price*count;
                    System.out.println(count + " " +coffee+ "s have been ordered totalling $"  +total+  " dollars!");
                }

                    break;


                    case "Friday":
                        coffee = "Green Tea Latte";
                        price = 6.95;
                        System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");

                        count = input.nextDouble();
                        if (count == 0)
                        {
                            System.out.println("Looks like you don't like " + coffee + "s! so sad!!!!");
                        } else if (count==1)
                        {
                            System.out.println("Looks like will be ordering only 1 " +coffee + " today!");
                        }
                        else
                        {
                            total= price*count;
                            System.out.println(count + " " +coffee+ "s have been ordered totalling $"  +total+  " dollars!");
                        }

                        break;
        }
    }
}











