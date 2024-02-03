import java.util.Arrays;


// TASK 4
public class MainClass {


    public static void main(String[] args) {

        //1
        System.out.println(Arrays.toString(removeFrom(new int[]{1, 1, 2, 4, 5, 8}, 5)));

        //2
        System.out.println(
                Arrays.deepToString(
                        martixTranspose(
                                new int[][]{
                                        {1, 1, 3},
                                        {2, 4, 4},
                                        {4, -3, 6}
                                }
                        )
                )
        );
        System.out.println(
                Arrays.deepToString(
                        matrixColumnReplace(
                                new int[][]{
                                        {1, 1, 3},
                                        {2, 4, 4},
                                        {4, -3, 6}
                                },
                                new int[]{6, 6, 6}
                        )
                )
        );
        //3
        System.out.println(
                Arrays.deepToString(
                        multMatrix(
                                new int[][]{
                                        {1, 2, 3},
                                        {4, 5, 6},
                                        {7, 8, 9}
                                },
                                new int[][]{
                                        {1, 1, 1},
                                        {2, 4, 7},
                                        {9, 3, 2}
                                }
                        )
                )
        );
        //4
        numbers(5);
        //5
        Point test = new Point(3d, 4d);
        Point test2 = new Point();
        Point test3 = new Point(6d, 8d);

        //5.3
        System.out.println(test.length(test2));
        //5.4
        System.out.println(Arrays.deepToString(Point.maxLenght(new Point[]{test, test2, test3})));

        //6
        Circle testCircle = new Circle(test, 5);

        System.out.println(testCircle.getPerimeter());
        System.out.println(testCircle.getSquare());

        //7
        System.out.println(test.getCount());

    }

    //1 removeFrom
    static int[] removeFrom(int[] arr, int x) {
        int[] Result = new int[0];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                Result = Arrays.copyOf(Result, Result.length + 1);
                Result[k] = arr[i];
                k++;
            }
        }

        return Result;

    }

    //2 matrixColumnReplace
    //сначала напишу ф-ю которая транспонирует матрицу
    static int[][] martixTranspose(int[][] arr) {
        int[][] newarr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newarr[i][j] = arr[j][i];
            }

        }

        return newarr;
    }

    static int[][] matrixRowReplace(int[][] arr, int[] y) {

        for (int i = 0, k = 0; i < arr.length; i++) {
            boolean isOdd = false, isNegative = false;
            int sumj = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    isNegative = true;
                    break;
                }

                sumj += arr[i][j];

            }

            if (sumj % 2 == 0) {
                isOdd = true;
            }
            if (isNegative || isOdd) {
                arr[i] = y;
            }
        }

        return arr;
    }
        static int[][] matrixColumnReplace(int[][] arr, int[] y) {
            arr = martixTranspose(arr);
            arr = matrixRowReplace(arr, y);
            arr = martixTranspose(arr);

            return arr;
        }

    //3 multMatrix
    static int[][] multMatrix(int[][] x, int[][] y) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] *= y[j][i];
            }

        }
        return x;
    }

    // 4
    static void numbers(int n) {
        if (n != 1) {
            numbers(n - 1);
        }
        int[] arr = new int[n];
//        for (int i = 0; n > 0; n--, i++) {
        for (; n > 0; n--) {
            arr[arr.length - n] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

}

