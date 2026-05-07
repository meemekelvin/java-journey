import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("         Welcome Kelvin you can do this");
        System.out.println("=================================================");
        System.out.println("What's your Name: ");
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        System.out.println("What's your Age: ");
        int age= input.nextInt();

       if(age < 18){
           System.out.println("You are a minor");
       }
       else {
           System.out.println(name +" You are an adult");
       }
        input.close();

    }


}