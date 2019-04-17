package by.belhard.j2.lesson5;

public interface Workable {
    double PI = 3.1415; // публичные, статические и файнал

    //любой метод будет абстрактным и публичным

    void doWork();

    default void exampleDefaultM(){
        System.out.println("default method");
    }

}
