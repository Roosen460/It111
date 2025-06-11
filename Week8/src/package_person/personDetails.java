package package_person;

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
        firstperson.violations = false;
        firstperson.creditScore= 690;

        secondperson.name = "Kendall";
        secondperson.gender = 'M';
        secondperson.age    = 22;
        secondperson.car = " Mustang";
        secondperson.violations = true;
        secondperson.creditScore = 670;

//        System.out.println("Customer name: "+name);
//        System.out.println(Gender:.+gender);
//        System.out.println(f"Age: +age);
//        System.out.println(firstperson.car);
//        System.out.println(firstperson.violations);
//        System.out.println(firstperson.creditScore);
//        System.out.println();
//        System.out.println(secondperson.name);
//        System.out.println(secondperson.gender);
//        System.out.println(secondperson.age);
//        System.out.println(secondperson.car);
//        System.out.println(secondperson.violations);
//        System.out.println(secondperson.creditScore);

//        when we created firstPerson objet, we assigned all values and call method inside person class

double monthlyRate = 0;
double adjustedRate=0;

       firstperson.display();
        System.out.println("preliminary Rate for" +firstperson.name +  ":" +firstperson.getRate (monthlyRate)+" dollars");
        System.out.println("Ajustments: "+firstperson.assumeGender(adjustedRate)+" dollars");
        System.out.println("Here is " +firstperson.name+"'s totaly monthly premium: ");
        System.out.println(firstperson.assumeGender(adjustedRate)+ firstperson.getRate(monthlyRate));
        System.out.println();

        secondperson.display();
        System.out.println("preliminary Rate for" +secondperson.name +  ":" +secondperson.getRate (monthlyRate)+" dollars");
        System.out.println("Ajustments: "+secondperson.assumeGender(adjustedRate)+" dollars");
        System.out.println("Here is " +secondperson.name+"'s totaly monthly premium: ");
        System.out.println(secondperson.assumeGender(adjustedRate)+ secondperson.getRate(monthlyRate));
        System.out.println();

    }
}
