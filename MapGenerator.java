package BreakoutBall;

import java.awt.*;

public class MapGenerator {
    public int[][] mapp;
    public int brickHeight;
    public int brickWidth;

    public MapGenerator(int row, int col) {
        mapp = new int[row][col];
        for (int i = 0; i < mapp.length; i++) {
            for (int j = 0; j < mapp[0].length; j++) {
                mapp[i][j] = 1;
            }
        }
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < mapp.length; i++) {
            for (int j = 0; j < mapp[0].length; j++) {
                if (mapp[i][j] > 0){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i *brickHeight + 50, brickWidth, brickHeight);
                }
            }

        }
    }

    public void setBrickValue(int value, int row, int col){
        mapp[row][col] = value;
    }
}
