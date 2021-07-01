import java.util.Random;
import java.util.Scanner;

public class HomeWork4ZhuravlevD {

    public static Scanner enter = new Scanner(System.in);
    public static Random random = new Random();

    public static char map[][];
    public static int heightMap;
    public static int widthMap;
    public static char user = 'X';
    public static char pc = 'O';
    public static char empty = '_';
    public static int lengthWin;

    public static void buildMap() {
        heightMap = 3;
        widthMap = 3;
        lengthWin = 3;
        map = new char[heightMap][widthMap];
        for (int x = 0; x < heightMap; x++) {
            for (int y = 0; y < heightMap; y++) {
                map[x][y] = empty;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < widthMap * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : (i / 2 + 1));
        }
        System.out.println();
        for (int y = 0; y < heightMap; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < heightMap; x++) {

                System.out.print(map[x][y] + "|");
            }
            System.out.println();
        }
    }

    public static void setUser() {
        int x;
        int y;
        do {
            System.out.print("Enter char:  ");
            x = enter.nextInt() - 1;
            y = enter.nextInt() - 1;
        } while (!TrueEnter(x, y) || !TrueMap(x, y));
        map[x][y] = user;
        System.out.println("Your enter [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static void setPc() {
        int x;
        int y;
        do {
            x = random.nextInt(widthMap);
            y = random.nextInt(heightMap);
        } while (!TrueMap(x, y));
        map[x][y] = pc;
        System.out.println("PC enter [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean TrueEnter(int y, int x) {
        return (y >= 0 && y < heightMap && x >= 0 && x < widthMap);
    }

    public static boolean TrueMap(int x, int y) {
        return map[x][y] == empty;
    }

    public static boolean FullMap() {
        for (int i = 0; i < heightMap; i++) {
            for (int j = 0; j < heightMap; j++) {
                if (map[i][j] == empty) {
                }
            }
        }
        return false;
    }

    public static boolean win(char player) {
        for (int i = 0; i < heightMap; i++) {
            for (int j = 0; j < widthMap; j++) {
                if (CheckVector(i, j, 1, 0, lengthWin, player)) {
                    return true;
                }
                if (CheckVector(i, j, 1, 1, lengthWin, player)) {
                    return true;
                }
                if (CheckVector(i, j, 0, 1, lengthWin, player)) {
                    return true;
                }
                if (CheckVector(i, j, 1, -1, lengthWin, player)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean CheckVector (int x, int y, int vx, int vy, int len, char player) {
        final int endX = x + (len - 1) * vx;
        final int endY = y + (len - 1) * vy;
        if (!TrueEnter(endX, endY)) {
            return false;
        }
            for (int i = 0; i < len; i++)
                if (map[x + i * vx][y + i * vy] != player) {
                    return false;
                }
            return true;
    }

    public static void main(String[] args) {
            buildMap();
            printMap();
            while (true) {
                setUser();
                printMap();
                if (win(user)) {
                    System.out.println("User win !!!");
                    break;
                }
                if (FullMap()) {
                    System.out.println("Draw !!!");
                    break;
                }
                setPc();
                printMap();
                if (win(pc)) {
                    System.out.println("PC win !!!");
                    break;
                }
                if (FullMap()) {
                    System.out.println("Draw !!!");
                    break;
                }
                FullMap();
            }
            System.out.println("Game over");

    }

}
