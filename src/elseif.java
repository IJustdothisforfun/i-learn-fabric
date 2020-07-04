public class elseif {
    public static void main(String[] args){
        int age = 25;

        if (age<= 0){
            System.out.println("Error");
        }else if(age <= 16){
            System.out.println("too young");
        }else if (age < 100){
            System.out.println("welcome!");
        }else{
            System.out.println("Really?");
        }
    }
}
