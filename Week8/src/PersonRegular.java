public class PersonRegular {

    public static void main(String[] args) {

        String firstPersonName = "Cathy";
        String secondPersonName = "Kendal";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;
        double monthlyRate1 =0;
        double monthlyRate2= 0;
        double adjustedRate1 = 0;
        double adjustedRate2= 0;
        double total1;
        double total2;

        total1 = monthlyRate1 + adjustedRate1 ;
        total2 = monthlyRate2 + adjustedRate2;



        // logic in  the car insurance industry - if you have traffic tickets, DUIs, other
        // Violations, you will be paying more for your insurance also, if you have a
        // poor credit, you will pay more money

        if (firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;

        } else {
            monthlyRate1 = 100;
        }


        if (secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;

        } else {
            monthlyRate2 = 100;

        }

//will gender and age make a difference???

        if (firstPersonAge <= 25 && firstPersonGender == 'F' ) {
            adjustedRate1 = 100;

        } else {
            adjustedRate1 = 0;

        }
        if (secondPersonAge <= 25 && secondPersonGender =='M') {
            adjustedRate2 = 100;

        } else {
            adjustedRate2 = 0;
        }

        total1=monthlyRate1+adjustedRate1;
        total2= monthlyRate2+ adjustedRate2;

        System.out.println("first person Name: " + firstPersonName);
        System.out.println("first person Gender: " + firstPersonGender);
        System.out.println("first person Age: " + firstPersonCar);
        System.out.println("first person Car: " + firstPersonCar);
        System.out.println("first person Violations: " + firstPersonViolations);
        System.out.println("first person Credit Score: " + firstPersonCreditScore);
        System.out.println("first person preliminary rate: " + monthlyRate1);
        System.out.println("first person final Monthly rate(including gender and age) : " + total1);

        System.out.println();

        System.out.println("Second person Name: " + secondPersonName);
        System.out.println("Second person Gender: " + secondPersonGender);
        System.out.println("Second person Age: " + secondPersonAge);
        System.out.println("Second person Car: " + secondPersonCar);
        System.out.println("Second person Violations: " + secondPersonViolations);
        System.out.println("Second person Credit Score: " + secondPersonCreditScore);
        System.out.println("Second person Monthly rate: " + monthlyRate2);
        System.out.println("Second person final monthly rate(including gender and age: " + total2);

        }
    }










