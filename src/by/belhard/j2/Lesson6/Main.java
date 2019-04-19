package by.belhard.j2.Lesson6;

import java.util.*;


public class Main {
    public static void main(String[] args) {
       /* List<String> list = new LinkedList<>(); //для работы со списком значения

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1,"one and half");
        boolean contains=list.contains("two");//проверка содержит ли список какой нибудь элемент
        list.set(3, "five"); //замена индекса
        list.remove("two"); //удаление
        *//*list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");*//*
        list.get(1);
        String s =list.get(1);
        System.out.println(s);


        System.out.println(list);
        System.out.println(list.size()+" "+ list.isEmpty());
        System.out.println("contains 'two' : "+ contains);*/

      /* Set<String> set = new HashSet<>(); //только неповторяющиеся значения
        set.add("one");
        set.add("two");
        set.add("three");

        Iterator<String> iterator = set.iterator();
      while(iterator.hasNext()){    //курсор на итератор и ctrl+enter
          String next = iterator.next();
          if(next.equals("two"))
              iterator.remove();
      }
        System.out.println(set);*/
    Map<String, Car> map = new HashMap<>();

    map.put("audi", new Car("audi"));
        map.put("opel", new Car("opel corse"));
        map.put("zaz", new Car("mersedes"));

       Car audi=  map.get("audi");
       Car vaz = map.get("vaz"); //выдаст null т.к. нет такой записи

        map.put("zaz", new Car("zaparojets"));



        System.out.println(audi);
        System.out.println(vaz);
        System.out.println(map.get("zaz"));


    }
}
