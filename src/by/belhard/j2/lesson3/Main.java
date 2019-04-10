package by.belhard.j2.lesson3;

public class Main {
    public static void main(String[] args) {
       /* String array [] = new String [3]; //3 позиции, счёт позиций начинается с 0 т.е если в цифровом значении 3 позиции будет соответствовать цифра 2 (т.к. 0 1 2)
        array [0]="a";
        array [2]="c";
        System.out.println(array [1]);*/ // выведет null т.к. 1 позиции не присвоенно значение

        //или (сразу происходит инициализация)
        /*
        String array [] = new String [] {"a", "b", "c"}; */

       //двумерные массивы
       // String array [][] = new String [4][3] ; //4 строки 3 столбца

        //ПРАКТИКА
//одномерные массивы
        /*String array [] = new String[]{"1","2","3"};
        //array [0] = "valuel";
        //array [2] = "value3";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);*/

     /*   String array [] = new String[3];
        array [0] = "valuel";
        array [2] = "value3";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);*/

        /*String array [] = new String[]{"1","2","3"};
        //array [0] = "valuel";
        //array [2] = "value3";
        for (int i =0; i<array.length; i++){
                System.out.println(array[i]);
        }*/

        // через for each
        /*String array [] = new String[]{"1","2","3"};
        //array [0] = "valuel";
        //array [2] = "value3";
        for (String s : array) {
            System.out.println(s);
        }*/
//двумерные массивы

        String array [][] = new String[3][];
        array [0] = new String [3];
        array [1] = new String [2];
        array [2] = new String [1];

        for (String[] ar : array){
            for (String s:ar){
                s="a";
                System.out.printf("%3s", s);
            }
            System.out.println();
        }
    }
}
