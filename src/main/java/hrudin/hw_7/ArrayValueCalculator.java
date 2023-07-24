package hrudin.hw_7;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"1", "2", "3", "4"}, {"2", "2", "2", "3"},
                {"1", "2", "2", "2"}, {"1", "2", "2", "a"}};
        try {
            int result = doCalc(array);
            System.out.println(result);
        } catch (ArraySizeException e) {
            System.out.println("Не вірний розмір масиву");
        } catch (ArrayDataException e) {
            System.out.println("Невірне число");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Невідома помилка");
        }
   }
    public static int doCalc(String array[][]) throws ArrayDataException, ArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new ArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
