public class constructor {
    private int[][] matrix;

    // Constructor to initialize the dimensions of the matrix
    public constructor(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    // Method to fill the matrix with values
    public void fillMatrix(int[][] values) {
        if (values.length != matrix.length || values[0].length != matrix[0].length) {
            System.out.println("Error: Input values dimensions do not match matrix dimensions");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

    // Method to display the matrix
    public void displayMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a new matrix with dimensions 3x3
        constructor matrixObj = new constructor(3, 3);

        // Fill the matrix with values
        int[][] values = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        matrixObj.fillMatrix(values);

        // Display the matrix
        System.out.println("Matrix:");
        matrixObj.displayMatrix();
    }
}
