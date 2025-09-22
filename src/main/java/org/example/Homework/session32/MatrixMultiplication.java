package org.example.Homework.session32;

public class MatrixMultiplication {

    //single thread
    public static int[][] multiplySingleThreaded(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsB = B[0].length;
        int common = B.length;

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    //multi thread
    static class MultiplyPerLine extends Thread {
       private final int [][] A,B,C;
       private final int startRow, endRow;


        MultiplyPerLine(int[][] A, int[][] B, int[][] C, int startRow, int endRow) {
            this.A = A;
            this.B = B;
            this.C = C;
            this.startRow = startRow;
            this.endRow = endRow;
        }

        @Override
        public void run(){
            int colB=B[0].length;
            int common=B.length;
            for(int i=startRow;i<endRow;i++){
                for(int j=0;j<colB;j++){
                    int sum=0;
                    for(int k=0; k<common;k++){
                        sum+=A[i][k]+B[k][j];
                    }
                    C[i][j]=sum;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        long start1 = System.nanoTime();
        int[][] C1 = multiplySingleThreaded(A, B);
        long end1 = System.nanoTime();
        System.out.println("Timp de executie pt single: " + (end1 - start1)/1000000 + " ms");

        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        int numThreads = 2;
        Thread[] threads = new Thread[numThreads];
        int rowsPerThread = rowsA / numThreads;

        long start = System.nanoTime();

        for (int t = 0; t < numThreads; t++) {
            int startRow = t * rowsPerThread;
            int endRow = (t == numThreads - 1) ? rowsA : startRow + rowsPerThread;
            threads[t] = new MultiplyPerLine(A, B, C, startRow, endRow);
            threads[t].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.nanoTime();
        System.out.println("Timp de execuție: " + (end - start)/1000000 + " ms");

        System.out.println("C = A * B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}








