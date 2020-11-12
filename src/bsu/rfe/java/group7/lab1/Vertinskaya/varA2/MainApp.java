package bsu.rfe.java.group7.lab1.Vertinskaya.varA2;

public class MainApp {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int sumApple = 0;
        int sumPie = 0;
        int sumCheese = 0;
        int i = 0;
        for (String arg : args) {
            String[] parts = arg.split(("/"));
            if (parts[0].equals("Cheese")) {
                Cheese cheese = new Cheese();
                cheese.consume();
                sumCheese++;

            } else if (parts[0].equals("Apple")) {
                Apple apple = new Apple(parts[1]);
                apple.consume();
                sumApple++;
            } else if (parts[0].equals("Pie")) {
                Pie pie = new Pie(parts[1]);
                pie.consume();
                sumPie++;
            }
            i++;
        }
        System.out.println("Завтрак: ");
        System.out.println("Количество съеденных продуктов:  " + (sumApple+sumPie+sumCheese));
        System.out.println("Яблок съедено: " + sumApple);
        System.out.println("Пирогов съедено: " + sumPie);
        System.out.println("Сыра съедено: " + sumCheese);
        System.out.println("Всего хорошего!");
    }
}
