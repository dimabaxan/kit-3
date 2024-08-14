//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(5, 3.5));
        System.out.println("Divide: " + Calculator.divide(5, 2));
        System.out.println("Subtract: " + Calculator.subtract(5, 3));

        // Примеры использования compareArrays
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {1, 2, 3};
        Integer[] intArray3 = {1, 2, 4};

        System.out.println(ArrayUtils.compareArrays(intArray1, intArray2));
        System.out.println(ArrayUtils.compareArrays(intArray1, intArray3));


        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
