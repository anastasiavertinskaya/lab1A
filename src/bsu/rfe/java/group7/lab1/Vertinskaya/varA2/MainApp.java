package bsu.rfe.java.group7.lab1.Vertinskaya.varA2;

public class MainApp {
    public static void main(String[] args) {
        Food breakfast[] = new Food[20];
        int i = 0;
        for (String arg : args) {
            String[] parts = arg.split(("/"));
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Pie")) {
                breakfast[i] = new Pie(parts[1]);
            }
            i++;
        }
        System.out.println("Завтрак: ");
        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        System.out.println("Всего хорошего!");

    }
}
