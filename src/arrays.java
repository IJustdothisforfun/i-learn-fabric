//if your reading this and arent me lines are commented out so things wont get confusing while running it
//your fine to add the lines back it nothing will break (i hope)

public class arrays {
    public static void main(String[] args){
        int[] arr = new int[5]; //declares the array (datatype needs to be declared also) the number of values it can contain is also declared
        arr[2] = 42; //sets the value of the index provided equal to the value provided
        String[] myNames = {"A","B","C","D"}; //Array literal, used if you already know the values that will be needed
        //System.out.println(myNames[2]);
        int[] intArr = new int[5];
        //System.out.println(intArr.length); // prints the length of the given array
        int[] myArr = {6,42,3,7};
        int sum = 0; //var declared and give value 0 to store result
        for(int x=0; x<myArr.length; x++){ //array is iterated through and every value is added together
            sum += myArr[x];
        }
        //System.out.println(sum);

        int[] primes = {2,3,5,7}; //enhanced for loop, used to traverse elements in arrays (apparently elimates bugs and makes it eaiser to read)
        for(int t: primes){
            System.out.println(t);
        }
    }
}
