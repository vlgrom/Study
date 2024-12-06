public class Product { // Класс для товаров, содержащий следущую информацию: кол-во товаров, цена товара, скидка на товар
    int quantity; // Количество товаров
    double price; // Цена товара
    double discount; // Скидка на товар

    void calculateSum() { // Метод подсчета суммы
        double sumBeforeDiscount = quantity * price; // Общая сумма без скидки
        double sumWithDiscount = sumBeforeDiscount * (discount / 100); // Сумма со скидкой
        double sumAfterDiscount = sumBeforeDiscount - sumWithDiscount; // Итоговая сумма со скидкой

        // Вывод результатов
        System.out.printf("Общая сумма без скидки: %.2f\n", sumBeforeDiscount);
        System.out.printf("Сумма со скидкой: %.2f\n", sumAfterDiscount);
    }
}
