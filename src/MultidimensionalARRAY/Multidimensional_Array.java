package MultidimensionalARRAY;

public class Multidimensional_Array {
    public void myMethod() {
        int[][] array = new int[3][3];
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = sum;
                sum++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + " ");
            }
        }

//        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(matrice[0][2]);
    }
}
