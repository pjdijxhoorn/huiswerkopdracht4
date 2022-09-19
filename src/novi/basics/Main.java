package novi.basics;

public class Main {

    public static void main(String[] args) {
        char[][] veld;

        veld = new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7','8','9'}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(veld[i][j] + " ");
            }
            System.out.println(" ");
        }

        veld[0][1] = 'x';
        System.out.println(" ");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(veld[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}



