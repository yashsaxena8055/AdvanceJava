package lambda;

public class Main {
    public static void main(String[] args) {
        Person fred = new Person("Fred", "Smith", 56);

        if(fred.isValid())
        {
            System.out.println("everthing is fine!!");
        }
        else{
            System.out.println("Something doesn't me");
        }

    }
}
