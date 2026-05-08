//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for( int i=1;i<=15;i++)
            if(isEven(i)){
                System.out.println(i + " is even");
            }




    }
    public static boolean isEven(int number){
        return number%2==0;


    }



}