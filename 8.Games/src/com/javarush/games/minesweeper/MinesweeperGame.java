package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;
import java.util.ArrayList;
import java.util.List;
 
 public class MinesweeperGame extends Game {
     private static final int SIDE = 10;
     private static final int PERCENT = 20;
     private static final int COUNT_MINE = SIDE * SIDE * PERCENT / 100;
     private static final String MINE = "\uD83D\uDCA3";
     private static final String FLAG = "\uD83D\uDEA9";

     private int countMinesOnField = 0;
     private int countFlags;
     private GameObject[][] gameField = new GameObject[SIDE][SIDE];

     @Override
     public void initialize() {
         setScreenSize(SIDE, SIDE);
         createGame();
     }

     private void createGame() {
         for (int x = 0; x < SIDE; x++)
             for (int y = 0; y < SIDE; y++) {
                 gameField[x][y] = new GameObject(x, y, false);
                 setCellColor(x, y, Color.ORANGE);
             }
         setMine();
         countFlags = countMinesOnField;
         countMineNeighbors();
         //  for(int x = 0; x<SIDE; x++)
         //   for(int y = 0; y<SIDE; y++)
         //     if (gameField[x][y].isMine)
         //       setCellValueEx(gameField[x][y].x, gameField[x][y].y, Color.ORANGE, MINE, Color.BLACK);
     }

     private void setMine() {
         while (countMinesOnField < COUNT_MINE) {
             int x = getRandomNumber(SIDE);
             int y = getRandomNumber(SIDE);
             if (!gameField[x][y].isMine) {
                 gameField[x][y].isMine = true;
                 countMinesOnField++;
             }
         }
         //System.out.println(countMinesOnField);
     }

     private void countMineNeighbors() {
         List<GameObject> neighbors;
         for (int x = 0; x < SIDE; x++) {
             for (int y = 0; y < SIDE; y++) {
                 if (!gameField[x][y].isMine) {
                     neighbors = getNeighbors(gameField[x][y]);
                     for (int i = 0; i < neighbors.size(); i++) {
                         if (neighbors.get(i).isMine)
                             gameField[x][y].countMineNeighbors++;
                     }

                 }
             }
         }
     }

     private List<GameObject> getNeighbors(GameObject gameObject) {
         List neighbors = new ArrayList<GameObject>();
         int x = gameObject.x;
         int y = gameObject.y;
         for (int sy = y - 1; sy <= y + 1; sy++)
             for (int sx = x - 1; sx <= x + 1; sx++) {
                 if ((sx != x || sy != y) && (sx >= 0 && sy >= 0 && sx < SIDE && sy < SIDE))
                     neighbors.add(gameField[sx][sy]);
             }
         return neighbors;
     }

     private void openTile(int x, int y) {
         GameObject cell = gameField[x][y];
         List<GameObject> neighbors;
         if (!cell.isOpen) {
             gameField[x][y].isOpen = true;
             setCellColor(x, y, Color.GREEN);
             if (cell.isMine) {
                 setCellValue(x, y, MINE);
             } else {
                 if (gameField[x][y].countMineNeighbors == 0) {
                     setCellValue(x,y,"");
                     neighbors = getNeighbors(gameField[x][y]);
                     for (int i = 0; i < neighbors.size(); i++) {
                         if (!neighbors.get(i).isMine)
                             openTile(neighbors.get(i).x, neighbors.get(i).y);
                     }
                 } else
                     setCellNumber(x, y, gameField[x][y].countMineNeighbors);
             }
         }
     }

     private void markTile(int x, int y) {
         GameObject cell = gameField[x][y];
         if (cell.isFlag) {
             gameField[x][y].isFlag = false;
             //gameField[x][y].isOpen = false;
             countFlags++;
             setCellColor(x, y, Color.ORANGE);
             setCellValue(x, y, "");
         } else if (!cell.isOpen && countFlags > 0) {
             gameField[x][y].isOpen = true;
             gameField[x][y].isFlag = true;
             countFlags--;
             setCellColor(x, y, Color.YELLOW);
             setCellValue(x, y, FLAG);
         }
     }

     @Override
     public void onMouseLeftClick(int x, int y) {
         openTile(x, y);
     }
     @Override
     public  void onMouseRightClick(int x, int y){
         markTile(x,y);
     }
 }
