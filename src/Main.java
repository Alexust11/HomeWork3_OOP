import transport.Car;

public class Main {
    public static void main(String[] args) {
        // Домашка 3
        // Задача 1
        Human max=new Human("",-1980,"Минск","");
        Human anna=new Human("Аня",29,"Москва","методист образовательных программ");
        Human ket=new Human("Катя",28,"Калининград","продакт-менеджер");
        Human artem=new Human("Артем",27,"Москва","директор по развитию бизнеса");



        System.out.println(max.toString());
        System.out.println(anna.toString());
        System.out.println(ket.toString());
        System.out.println(artem.toString());
        System.out.println("_________________Задание 2________________________________________________");
        // Задание 2
        Car lada=new Car("Lada","Lada Grande",1.7f,"Желтый",2015,"Россия");
        Car audi=new Car("Audi","Audi A8 50 L TDI quattro",3.0f,"Черный",2020,"Германия");
        Car bmw=new Car("BMW","",0,"Черный",0,"");
        Car kia=new Car("Kia","Kia Sportage 4",2.4f,"Красный",2018,"Южная корея");
        Car hyundai=new Car("Hyundai","Hyundai Avante",1.6f,"Оранжевый",2016,"Южная корея");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }
}