package SecondDay;
//        Составить программу, печатающую значение true,
//        если указанное высказывание является истинным,
//        и false — в противном случае: среди заданных целых чисел А, В, С, D
//        есть хотя бы два четных.
//        Организовать ввод чисел с консоли.

public class TrueFalse {
    public static void main(String args[]){
        boolean flag = true;
        for(int n = 0; n < 6; n ++){
            if((n%2)==0){
                System.out.println("Число " + n + " четное ");
            }
            else{
                if((n%1)==0){
                    System.out.println("Число " + n + " нечетное ");
                    flag = false;
                }
            }
        }
        if(flag)
            System.out.println( "Числа все четные" );

    }
}



