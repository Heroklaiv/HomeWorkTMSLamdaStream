
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {


        //Задача 1:
        //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //когда пользователю исполнится 100 лет. Использовать Date/Time API.
        System.out.println("Введите дату рождения в формате ДД ММ ГГГГ: ");
        Scanner s = new Scanner(System.in);
        String birthday = s.nextLine();
        OneHundredYears oneHundredYears = new OneHundredYears();

        System.out.println(Arrays.toString(oneHundredYears.timer(birthday)));

        //Задача 2:
        //Используя Predicate среди массива чисел вывести только те, которые являются
        //положительными.
        List<Integer> array = new ArrayList<>();
        int randomSub;
        for (int i = 0; i <= 100; i++) {
            randomSub = (int) (Math.random() * 100);
            if (randomSub < 25 | randomSub > 75)
                array.add(randomSub * (-1));
            else array.add(randomSub);
            Predicate<Integer> negative = number -> number < 0;
            if (!negative.test(array.get(i))) System.out.println(array.get(i));
        }

        //Задача 3:
        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.
        String byn = "169870 BYN";
        double bynUsd = 3.15;
        String deleteElement = "BYN";
        String doubleByn = byn.substring(0, byn.lastIndexOf(deleteElement) - 1);
        double money = Double.parseDouble(doubleByn);
        Converter convert = n -> money / bynUsd;
        System.out.println(convert.converter(money));


        //Задача 4:
        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары
        convert = n -> (money + 59864) / bynUsd;
        System.out.println(convert.converter(money));

        //Задача 5
        //Используя Supplier написать метод, который будет возвращать введенную с консоли
        //строку задом наперед.
        String str = "bujhm fylhttdbx rbctk`d";
        Supplier supplier = n -> {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            return stringBuilder.toString();
        };
        System.out.println(supplier.reverse(str));

        //Задача 1:
        //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        //Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме
        List<Integer> arr;
        arr = array.stream().filter(Lamda::modTwo).distinct().peek(Lamda::sum).toList();
        System.out.println(arr);
        System.out.println(Lamda.getSum());

        //


    }
}