//package AP.twoDArrays.Labs;
//
//import java.util.Scanner;
//
//public class SumMatrix {
//    private int[][] num;
//
//    private int[] rowsSum;
//    private int[] columnsSum;
//
//    private int rows;
//    private int columns;
//    private String matrix;
//
//
//    public void enterData() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter number of rows-->");
//        rows = scan.nextInt();
//        System.out.print("Enter number of columns-->");
//        columns = scan.nextInt();
//        System.out.println();
//    }
//
//    public void randomMatrix() {
//        num = new int[rows][columns];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                num[i][j] = (int) (Math.random() * 10);
//            }
//        }
//        matrix = printMatrix();
//    }
//
//    public String printMatrix() {
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                output.append(num[i][j]).append(" ");
//            }
//            output.append("\n");
//        }
//        return output.toString();
//    }
//
//    public void addRows() {
//        rowsSum = new int[rows];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                rowsSum[i] += num[i][j];
//            }
//        }
//    }
//
//    public void addColumns() {
//        columnsSum = new int[columns];
//        for (int j = 0; j < columns; j++) {
//            for (int i = 0; i < rows; i++) {
//                columnsSum[j] += num[i][j];
//            }
//        }
//    }
//
//    private String createFinalResults(int[][] matrix, int[] summedRows, int[] summedColumn) {
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                output.append(matrix[i][j]).append(" ");
//            }
//            output.append("\t").append(summedRows[i]).append("\n");
//        }
//        output.append("\n");
//        for (int i = 0; i < columns; i++) {
//                output.append(summedColumn[i]).append(" ");
//        }
//        return output.toString();
//    }
//
//    public String toString() {
//        return createFinalResults(num, rowsSum, columnsSum);
//    }
//
//
//}
