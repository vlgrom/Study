//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.quantity = 100;
        product1.price = 90.5;
        product1.discount = 0.75;

        Product product2 = new Product();
        product2.quantity = 90;
        product2.price = 80.5;
        product2.discount = 42.575;

        Product product3 = new Product();
        product3.quantity = 80;
        product3.price = 70.5;
        product3.discount = 59.1;

        // Вызов метода подсчета суммы calculateSum
        System.out.println("Товар 1: ");
        product1.calculateSum();
        System.out.println("\nТовар 2: ");
        product2.calculateSum();
        System.out.println("\nТовар 3: ");
        product3.calculateSum();
    }
}
