import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer;
    private static boolean vsComputer;
    private static char userSymbol;
    private static char computerSymbol;
    private static Random rand = new Random();

    public static void main(String[] args) {
        initBoard();
        Scanner scanner = new Scanner(System.in);

        // Choose game mode
        System.out.println("Select game mode: 1 = Player vs Player, 2 = Player vs Computer:");
        int mode = scanner.nextInt();
        vsComputer = (mode == 2);

        if (vsComputer) {
            // Let user choose symbol
            System.out.println("Player vs Computer: choose your symbol (X or O). X goes first:");
            userSymbol = scanner.next().trim().toUpperCase().charAt(0);
            if (userSymbol != 'O') {
                userSymbol = 'X';
            }
            computerSymbol = (userSymbol == 'X') ? 'O' : 'X';
        }

        // X always starts
        currentPlayer = 'X';
        printBoard();

        while (true) {
            if (vsComputer && currentPlayer == computerSymbol) {
                // Computer turn
                System.out.println("Computer's turn (" + computerSymbol + "):");
                int[] move = getComputerMove();
                board[move[0]][move[1]] = computerSymbol;
                System.out.println("Computer played at " + (move[0] + 1) + " " + (move[1] + 1));
            } else {
                // Human turn
                System.out.println("Player " + currentPlayer + "'s turn. Enter move (row and column: 1 1 for top-left):");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;
                if (!isValidMove(row, col)) {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }
                board[row][col] = currentPlayer;
            }

            printBoard();

            // Check win or draw
            if (hasWon(currentPlayer)) {
                if (vsComputer) {
                    if (currentPlayer == userSymbol) {
                        System.out.println("Congratulations! You win!");
                    } else if (currentPlayer == computerSymbol) {
                        System.out.println("Computer wins. Better luck next time!");
                    }
                } else {
                    System.out.println("Player " + currentPlayer + " wins!");
                }
                break;
            }

            if (isBoardFull()) {
                System.out.println("The game is a draw.");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    private static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println("Current board:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean hasWon(char player) {
        // rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] getComputerMove() {
        List<int[]> available = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    available.add(new int[]{i, j});
                }
            }
        }
        return available.get(rand.nextInt(available.size()));
    }
}
