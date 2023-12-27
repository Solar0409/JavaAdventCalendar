package FirstDay;

import java.util.Scanner;

import static FirstDay.Programm.i;

public class Programm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean value = true;
        for(int n = 0; i < 6; i ++){
            if((n%2)==0){
                System.out.println("Число " + n + " четное ");
            }
            else{
                if((n%1)==0){
                    System.out.println("Число " + n + " нечетное ");
                    value = false;
                }
            }
        }
        if(value)
            System.out.println("Числа все четные\n" + value);
            int i = sc.nextInt();


    }
    }

