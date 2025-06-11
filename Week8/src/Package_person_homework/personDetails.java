package Package_person_homework;

public class personDetails {

    public static void main (String[] args){

        person firstperson;
        person secondperson;

        firstperson = new person();
        secondperson = new person();
        firstperson.name = "Cathy";
        firstperson.gender = 'F';
        firstperson.age = 33;
        firstperson.car = "volkswagen Bug";
        firstperson.carAge=5;
        firstperson.violations = false;
        firstperson.creditScore= 690;

        secondperson.name = "Kendall";
        secondperson.gender = 'M';
        secondperson.age    = 22;
        secondperson.car = " Mustang";
        secondperson.carAge=10;
        secondperson.violations = true;
        secondperson.creditScore = 670;
        double monthlyRate = 0;
        double adjustedRate=0;

        firstperson.display();
        System.out.println("preliminary Rate for " + firstperson.name +  ":" +firstperson.getRate (monthlyRate)+" dollars");
        System.out.println("Adjustments: "+firstperson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Adjustment for car: ");
        System.out.printf("%.2f",firstperson.carValue(firstperson.carAge));
        System.out.println(" dollars");
        System.out.println("Here is " +firstperson.name+"'s totaly monthly premium: ");
        System.out.println(firstperson.assumeGender(adjustedRate)+ firstperson.getRate(monthlyRate)+firstperson.carValue(firstperson.carAge));
        System.out.println();

        secondperson.display();
        System.out.println("preliminary Rate for " +secondperson.name +  ":" +secondperson.getRate (monthlyRate)+" dollars");
        System.out.println("Adjustments: "+secondperson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Adjustment for car: ");
        System.out.printf("%.2f",secondperson.carValue(secondperson.carAge));
        System.out.println(" dollars");
        System.out.println("Here is " +secondperson.name+"'s totaly monthly premium: ");
        System.out.println(secondperson.assumeGender(adjustedRate)+ secondperson.getRate(monthlyRate)+secondperson.carValue(secondperson.carAge));
        System.out.println();

    }
}
