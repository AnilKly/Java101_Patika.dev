import java.util.Scanner;

public class MineSweeper {
    private static int[][] minesweeperMatrix;
    private static int[][] minesMatrix;
    private static int rows;
    private static int cols;
    private static int remainingTiles;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        System.out.print("Satır sayısını giriniz: ");
        rows = scanner.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        cols = scanner.nextInt();

        minesweeperMatrix = new int[rows][cols];
        minesMatrix = new int[rows][cols];

        // Initialize minesweeper matrix with -1 (unrevealed tiles)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                minesweeperMatrix[i][j] = -1;
            }
        }

        // Place mines randomly
        int mineCount = rows * cols / 4;
        placeMines(mineCount);

        remainingTiles = rows * cols - mineCount;

        printMinesweeperMatrix();

        // Game loop
        while (remainingTiles > 0) {
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();

            System.out.print("Sütun Giriniz: ");
            int col = scanner.nextInt();

            if (isValidTile(row, col) && minesweeperMatrix[row][col] == -1) {
                if (minesMatrix[row][col] == 1) {
                    gameOver();
                    break;
                } else {
                    revealTiles(row, col);
                    printMinesweeperMatrix();

                    if (remainingTiles == 0) {
                        System.out.println("Oyunu Kazandınız!");
                    }
                }
            } else {
                System.out.println("Geçersiz koordinat. Tekrar deneyin.");
            }
        }

        scanner.close();
    }

    private static void placeMines(int mineCount) {
        int placedMines = 0;
        while (placedMines < mineCount) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);

            if (minesMatrix[row][col] != 1) {
                minesMatrix[row][col] = 1;
                placedMines++;
            }
        }
    }

    private static boolean isValidTile(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private static void revealTiles(int row, int col) {
        if (!isValidTile(row, col) || minesweeperMatrix[row][col] != -1) {
            return;
        }

        int count = countAdjacentMines(row, col);
        minesweeperMatrix[row][col] = count;
        remainingTiles--;

        if (count == 0) {
            // Reveal adjacent tiles
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    revealTiles(row + i, col + j);
                }
            }
        }
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (isValidTile(newRow, newCol) && minesMatrix[newRow][newCol] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void gameOver() {
        System.out.println("Game Over!!");
        printMinesMatrix();
    }

    private static void printMinesweeperMatrix() {
        System.out.println("===========================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (minesweeperMatrix[i][j] == -1) {
                    System.out.print("- ");
                } else {
                    System.out.print(minesweeperMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    private static void printMinesMatrix() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (minesMatrix[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
