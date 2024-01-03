package SecondDay;
//       Идет n-я секунда суток, определить,
//        сколько полных часов,
//        полных минут и секунд прошло к этому моменту.

public class Moments {
    public static void main(String[] args) {
        int seconds = 12345;

        System.out.println("Hours: " + seconds / 3600);
        System.out.println(java.util.concurrent.TimeUnit.SECONDS.toHours(10000));

    }

}
