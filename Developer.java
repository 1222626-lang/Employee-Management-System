
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary,
                     String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(
            name + " is coding in " + programmingLanguage
        );
    }
}
