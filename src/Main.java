//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 10000, "Electronic");
        Product p2 = new Product(2, "Laptop", 10000, "Electronic");
        Product p3 = new Product(3, "Keyboard", 1300, "Components");

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}