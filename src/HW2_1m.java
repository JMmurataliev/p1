import java.util.Random;

public class HW2_1m {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 39));
        System.out.println(permission(13, 23));
        System.out.println(permission(33, 49));
        System.out.println(permission(55, -4));
        System.out.println(permission(88, -30));

    }

    private static String permission(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= 20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else
            return "Оставайтесь дома";

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println("age " + x);
        return x;
    }
}


