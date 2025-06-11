package package_person;

public class person {

    String name;
    char gender;
    int age;
    String car;
    boolean violations;
    double creditScore;


    public void display() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(car);
        System.out.println(violations);
        System.out.println(creditScore);
    }

    // our logic is regarding our credit score and violations

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }

        return monthlyRate;
    }
    public double assumeGender(double adjustedRate)
    {
        if (gender== 'M' && age <= 25)
        {
            adjustedRate=100;

        }
        else
        {
            adjustedRate=0;

        }
        return adjustedRate;
    }
}
