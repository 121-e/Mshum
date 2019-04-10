package by.belhard.j2.lesson4;

public class Main {
    public static void main(String[] args) {

        String result = newMethod(10,10);
        System.out.println(result);
    }

        private static String newMethod(int a, int b){

        if(a==b)
            return "equal";

            return String.valueOf(a-b);

    }
}
