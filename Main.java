package bsu.rfe.java.group8.lab1.DubatovkaM.var3a;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int CheeseAm = 0, AppleAm = 0, MilkAm = 0, KeksAm = 0;
        Cheese Ch = new Cheese();
        Milk Mi = new Milk(null);
        Apple Ap = new Apple(null);
        Keks Ke = new Keks();

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Milk")) {
                breakfast[itemsSoFar] = new Milk(parts[1]);
            }
            if (parts[0].equals("Keks")) {
                breakfast[itemsSoFar] = new Keks();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }
        System.out.println("amount of products");
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(Ch)) {
                    CheeseAm++;
                } else if (breakfast[i].equals(Ap)) {
                    AppleAm++;
                } else if (breakfast[i].equals(Mi)) {
                    MilkAm++;
                } else if (breakfast[i].equals(Ke)) {
                    KeksAm++;
                }

            } else break;
        }
        System.out.println("Amount of apples is " + AppleAm + ", Amount of cheese is " + CheeseAm + ", Amount of milk is " + MilkAm + "Amount of keks is " + KeksAm + "");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
        System.out.println("Have a nice day!");
    }
}
