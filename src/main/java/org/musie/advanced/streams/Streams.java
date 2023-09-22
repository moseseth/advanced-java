package org.musie.advanced.streams;

public class Streams {
    public static void main(String[] args) {
        /// Parallel processing involves dividing a task into subtasks that can be executed concurrently
        /// on multiple threads or processors. In Java, you can achieve parallelism using features like Java's
        /// Stream API, which provides an easy way to perform parallel operations on collections.

        //        Map<OrderStatus, List<Order>> ordersByStatus = orders.stream()
        //                .collect(Collectors.groupingBy(Order::getStatus));
        //
        //        Employee highestPaidEmployee = employees.stream()
        //                .max(Comparator.comparing(Employee::getSalary))
        //                .orElse(null);
        //
        //        List<Integer> uniqueNumbers = numbers.stream()
        //                .distinct()
        //                .collect(Collectors.toList());

        //        String combinedWords = words.stream()
        //                .collect(Collectors.joining(", "));
        //
        //
        //        List<Product> products = new ArrayList<>();
        //        products.add(new Product("Laptop", "Electronics", 999.99));
        //        products.add(new Product("T-Shirt", "Clothing", 19.99));
        //        products.add(new Product("Phone", "Electronics", 599.99));
        //        products.add(new Product("Jeans", "Clothing", 49.99));
        //
        //        Map<String, Double> totalPricesByCategory = products.stream()
        //                .collect(Collectors.groupingBy(
        //                        Product::getCategory,
        //                        Collectors.summingDouble(Product::getPrice)
        //                ));
        //
        //        totalPricesByCategory.forEach((category, totalPrice) ->
        //                System.out.println("Total price for " + category + ": $" + totalPrice));
    }
}
