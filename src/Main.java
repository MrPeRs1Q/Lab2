import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ///Task 1///
        Shape a = new Shape();
        System.out.println("Цвет фигуры: " + a.getColor());
        System.out.println("Фигура: " + a.getForm());
        System.out.println("==========");
        ///Task 2///
        Ball  b = new Ball();
        System.out.println("Тип: " + b.getShape());
        System.out.println("Площадь: " + b.Square(2));
        System.out.println("==========");
        ///Task 3///
        Book c = new Book();
        c.setBook_title("Ведьмак");
        System.out.println("Название книги: " + c.getBook_title());
        c.setPages(1364);
        System.out.println("Количество страниц: " + c.getPages());
        System.out.println("==========");
        ///Task 4///
        Dog d1 = new Dog(7,"Собака");
        System.out.println(d1.toString());
        Dog d2 = new Dog(3,"Голд");
        System.out.println(d2.toString());
        Dog d3 = new Dog(5,"Барбос");
        System.out.println(d3.toString());

        Dog_kennel dd = new Dog_kennel();
        dd.addDog(3,d1,d2,d3);
    }
}
