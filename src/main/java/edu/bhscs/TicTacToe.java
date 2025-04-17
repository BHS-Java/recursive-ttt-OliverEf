package main.java.edu.bhscs;

public class TicTacToe {
  private char[][] board;
  private char currentPlayer;

  public TicTacToe() {
      board = new char[3][3];
      currentPlayer = 'X';
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              board[i][j] = ' ';
          }
      }
  }

  public void playGame() {
      if(!checkWin(currentPlayer)) playTurn();
      playGame();
  }
  public void playTurn(){

  }
  private boolean checkWin(char player){
    if((checkRow(player, player, player) || checkColumn(player, player, player)) || checkDiagonal(player)){
      return true;}
    return false;
  }
private boolean checkRow(int row, int col, char player){

  return true;
}
private boolean checkColumn(int row, int col, char player){

  return true;
}
private boolean checkDiagonal(char player){

  return true;
}
}
