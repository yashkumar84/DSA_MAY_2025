public class Patterns {

    static void printRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void printHollowRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || row == num || row == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printReverseRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printSquare(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printDiamond(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 2; row <= num; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * num) - (2 * row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printHollowSquare(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == col || col == num - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printRightPyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = 2; row <= num; row++) {
            for (int col = 1; col <= 2 * num - 2 * row + 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void printRightTriangleWithAlphabets(int num) {
        char a = 'A';
        for (int row = 1; row <= num; row++) {
            a = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(a++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num = 9;
        // printSquare(num);
        // printRightTriangle(num);
        // printReverseRightTriangle(num);
        // printRightTriangleWithSpaces(num);
        // printHollowRightTriangle(num);
        // printHollowSquare(num);
        // printDiamond(num);
        // printRightPyramid(num);
        printRightTriangleWithAlphabets(num);
    }

}
