package by.belhard.j2.lesson5;


//наследование тема
public class Main {
    public static void main(String[] args) {
     /*   Worker worker = new Worker();
        worker.exampleMethod();
        Person person1 = new Person();
        person1.doWork();
        worker.doWork();*/
       /* Person person1 = new Teacher();
        Person person2 = new Worker ();
        person1.setA(150);
        System.out.println(person1.getA());
        System.out.println(person2.getA());

        person1.doWork();
        person2.doWork();
        person1.doWork("Desk");
        person2.doWork("Hammer");*/

      /*  System.out.println(person1 instanceof Person);
        System.out.println(person2 instanceof Teacher);
        System.out.println(new FactoryWorker() instanceof Object);*/
      Workable monkey = new Monkey();
      Workable worker = new Worker();
      monkey.doWork();
      worker.doWork();

    }
}
