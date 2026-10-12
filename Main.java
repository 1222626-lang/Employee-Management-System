
public class Main {
    public static void main(String[] args) {
        Developer dev =
            new Developer("Omar", 1000, "Java");

        dev.display();
        dev.writeCode();

        System.out.println(
            "Bonus: " + dev.calculateBonus()
        );
    }
}
