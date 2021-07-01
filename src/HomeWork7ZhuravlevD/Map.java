package HomeWork7ZhuravlevD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Map extends JPanel {
    public Random random = new Random();
    public int user = 1;
    public char pc = 2;
    public char empty = 0;
    public int heightMap;
    public int widthMap;
    private int heightCell;
    private int widthCell;
    public int map[][];
    public int mapWinLength;
    public Map() {
        setBackground(Color.GREEN);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                update(e);
            }
        });
    }
    void GameStart (int heightMap,int widthMap, int mapWinLength) {
        this.heightMap = heightMap;
        this.widthMap = widthMap;
        this.mapWinLength = mapWinLength;
        this.map = new int[heightMap][widthMap];
        System.out.println("heightMap = " + heightMap);
        System.out.println("widthMap = " + widthMap);
        System.out.println("lengthWin = " + mapWinLength);
        repaint();

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }
    private void render(Graphics g){
        buildMap(g);
    }
    private void update(MouseEvent e){
    }
    private void buildMap(Graphics g){
        int width = getWidth();
        int height = getHeight();
        widthCell = width/widthMap;
        heightCell = height/heightMap;
        g.setColor(Color.BLACK);
        for (int i = 0; i <= widthMap; i++) {
            int y = i * widthCell;
            g.drawLine(0,y,width,y);
        }
        for (int i = 0; i <= heightMap; i++) {
            int x = i * heightCell;
            g.drawLine(x,0,x,height);
        }
    }
    private void setPc() {
        int x;
        int y;
        do {
            x = random.nextInt(widthMap);
            y = random.nextInt(heightMap);
        } while (!TrueMap(x, y));
        map[x][y] = pc;
        System.out.println("PC enter [" + (x + 1) + ":" + (y + 1) + "]");
    }

    private boolean TrueEnter(int y, int x) {
        return (y >= 0 && y < heightMap && x >= 0 && x < widthMap);
    }

    private boolean TrueMap(int x, int y) {
        return map[x][y] == empty;
    }

    private boolean FullMap() {
        for (int i = 0; i < heightMap; i++) {
            for (int j = 0; j < heightMap; j++) {
                if (map[i][j] == empty) {
                }
            }
        }
        return false;
    }

    private boolean win(int player) {
        for (int i = 0; i < heightMap; i++) {
            for (int j = 0; j < widthMap; j++) {
                if (CheckVector(i, j, 1, 0, mapWinLength, player)) {
                    return true;
                }
                if (CheckVector(i, j, 1, 1, mapWinLength, player)) {
                    return true;
                }
                if (CheckVector(i, j, 0, 1, mapWinLength, player)) {
                    return true;
                }
                if (CheckVector(i, j, 1, -1, mapWinLength, player)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean CheckVector (int x, int y, int vx, int vy, int len, int player) {
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

}
