import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void search(ArrayList<String> list, String a) {
        int index = 0;
        for (String s : list) {
            if (s.equals(a)) {
                System.out.println("Индекс строки '" + a + "' :" + index);
                return;
            }
            index++;
        }
        System.out.println("Строки нет в текщем списке");
    }

    public static void main(String[] args) {
        //Ex 1
        ArrayList<String> surname = new ArrayList<>();

        surname.add("Сорокин");
        surname.add("Васильев");
        surname.add("Новгородов");
        surname.add("Алешин");
        surname.add("Запряаев");

        for(String s : surname){
            System.out.println(s);
        }
        //Ex2
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                number.add(i);
            }
        }
        for (int i = 0; i < number.size(); i++) {
            System.out.println(i);
        }
        //Ex 3
        ArrayList<String> text = new ArrayList<>();
        text.add("Осло");
        text.add("Москва");
        text.add("Пекин");
        text.add("Варшава");
        text.add("Ташкент");
        text.add("Астана");
        text.add("Пушкин");
        search(text, "Москва");

        //Ex4
        ArrayList<Integer> plus = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            plus.add(i);
        }
        for (int i = 0; i < plus.size(); i++) {
            System.out.println(plus.get(i));
            int b = i + 2;
            plus.set(i, b);
            System.out.println(plus.get(i));
        }

        //Ex 5
        ArrayList<String> first = new ArrayList<>();
        first.add("Один");
        first.add("Два");
        first.add("Три");
        first.add("Четыре");
        first.add("Пять");
        ArrayList<String> second = new ArrayList<>();
        second.add("Шесть");
        second.add("Семь");
        second.add("Восемь");
        second.add("Девять");
        second.add("Десять");
        for(String s : second){
            first.add(s);
        }
        for(String s : first){
            System.out.println(s);
        }

        //Ex 6
        ArrayList<String> a = new ArrayList<>();
        a.add("Арбуз");
        a.add("Ваниль");
        a.add("Сахар");
        a.add("Апельсин");
        a.add("Мука");
        for (int i = 0; i < a.size(); i++) {
            char str1 = a.get(i).charAt(0);
            if (str1 == 'а' || str1 == 'А') {
                a.remove(i);
            }
        }
        for(String s : a){
            System.out.println(s);
        }
        //Ex 7
        ArrayList<Integer> max = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            max.add(random.nextInt(100));
        }
        int maxi = 0;
        for(int s : max){
            if(s > maxi) {
                maxi = s;
            }
            System.out.println(s);
        }
        System.out.println(maxi);
        //Ex 8
        ArrayList<String> dublin = new ArrayList<>();
        dublin.add("питер");
        dublin.add("питер");
        dublin.add("новосиб");
        dublin.add("москва");
        dublin.add("челяба");
        for (int i = 0; i < dublin.size(); i++) {
            for (int j = i + 1; j < dublin.size(); j++) {
                if (dublin.get(i).equals(dublin.get(j))) {
                    dublin.remove(j);
                    j--;
                }
            }
            System.out.println(dublin.get(i));
        }
        //Ex 9

        ArrayList<String> sortir = new ArrayList<>();
        sortir.add("Apple");
        sortir.add("Banana");
        sortir.add("Orange");
        sortir.add("Pineapple");

        Collections.sort(sortir);

        System.out.println("Отсортированный список:");
        for (String fruit : sortir) {
            System.out.println(fruit);
        }

        //Ex 10
        ArrayList<String> reversed = new ArrayList<>();
        reversed.add("Факториал");
        reversed.add("Экспонента");
        reversed.add("Дискриминант");
        reversed.add("Бизу");

        Collections.reverse(reversed);

        System.out.println("Перевернутый список:");
        for (String fruit : reversed) {
            System.out.println(fruit);
        }


    }
}