import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] list = new char[5][15];

        for(int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            for(int j = 0; j < str.length(); j++) {
                list[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(list[j][i] != 0) {
                    System.out.print(list[j][i]);
                }
            }
        }
    }
}