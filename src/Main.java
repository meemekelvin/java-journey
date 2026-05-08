//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 12, 15, 18};
        System.out.println("There are "+ countEven(numbers) + " even numbers");


    }
    public static int countEven(int[] numbers){
        int count=0;
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i]%2==0)
                count++;
        }
        return count;
    }

}