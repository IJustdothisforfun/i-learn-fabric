public class DoWhileLoops {
    public static void main(String[] args){
        //int x = 1;
        //do{// similar to a while loop except it is guaranteed to execute once
            //System.out.println(x);
            //x++;
        //}while(x<5);

        // loop control

        //while(x>0){
            //System.out.println(x);
            //if(x==4){
                //break; //break terminates the loop and the flow is transferred to the next statement after the loop
           // }
           // x++;

        for(int x=10; x<=40;x=x+10){
            if(x==30){
                continue;
            }
            System.out.println(x);
        }
    }
}
