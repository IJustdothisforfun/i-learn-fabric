public class LogicalOperators {
    public static void main(String[] args){
        int age = 18;
        int money = 542;
        int age2 = 25;

        if (age > 18 && money > 500){ // works only if both of the vars are equal to true
            System.out.println("Welcome!");
        }

        if (age > 18 || money>500){ //OR
            System.out.println("Welcome2!");
        }
        if(!(age2>18)){//NOT
            System.out.println("Too Young");
        }else{
            System.out.println("Welcome");
        }

    }
}
