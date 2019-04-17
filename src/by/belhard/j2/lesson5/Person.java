package by.belhard.j2.lesson5;

public abstract class Person implements Workable{  //implements реализует интерфейс
   public int a = 10;

   // public abstract void doWork();
    public  void doWork(String str){
        System.out.println("Work with "+str);
    } ;
    /*{
       System.out.println("Я ничего не умею делать");
    }*/

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
}
