package lab3;

public class Main {
    public static void main(String[] args) {

// Создаем объекты для тестирования
        CandyBag candyBag = new CandyBag();
        candyBag.addCandyBox(new Lindt("Milk", "Swiss", 3, 4, 5));
        candyBag.addCandyBox(new Baravelli("Dark", "Italy", 5, 6));
        candyBag.addCandyBox(new ChocAmor("White", "Belgium", 7));

// Создаем объект area, используя candyBag, который уже создан
        Area area = new Area(candyBag, 123, "Main Street");

// Выводим адрес и поздравление с днем рождения
        System.out.println(area.getBirthdayCard());

// Выводим содержимое конфетной коробки
        area.printCandyBag();

// Выводим детали конфетных коробок
        area.printCandyBoxDetails();

// Выводим детали конфетных коробок без использования instanceof
        area.printCandyBoxDetailsWithoutInstanceof();

    }
}
