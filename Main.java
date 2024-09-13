import java.util.Scanner;
public class Main{
    static boolean checkWin(int[] x){
        // columns
        if (x[0] == 1  && x[3] == 1 && x[6] == 1) {return true;}
        else if (x[1] == 1 && x[4] == 1 && x[7] == 1) {System.out.println("Player 1 Wins!"); return true;}
        else if (x[2] == 1 && x[5] == 1 && x[8] == 1) {System.out.println("Player 1 Wins!"); return true;}
        //rows
        else if (x[0] == 1 && x[1] == 1 && x[2] == 1) {System.out.println("Player 1 Wins!"); return true;}
        else if (x[3] == 1 && x[4] == 1 && x[5] == 1) {System.out.println("Player 1 Wins!"); return true;}
        else if (x[6] == 1 && x[7] == 1 && x[8] == 1) {System.out.println("Player 1 Wins!"); return true;}
        //diags
        else if (x[0] == 1 && x[4] == 1 && x[8] == 1) {System.out.println("Player 1 Wins!"); return true;}
        else if (x[2] == 1 && x[4] == 1 && x[6] == 1) {System.out.println("Player 1 Wins!"); return true;}

        // columns2
        if (x[0] == 2  && x[3] == 2 && x[6] == 2) {System.out.println("Player 2 Wins!"); return true;}
        else if (x[1] == 2 && x[4] == 2 && x[7] == 2) {System.out.println("Player 2 Wins!"); return true;}
        else if (x[2] == 2 && x[5] == 2 && x[8] == 2) {System.out.println("Player 2 Wins!"); return true;}
        //rows2
        else if (x[0] == 2 && x[1] == 2 && x[2] == 2) {System.out.println("Player 2 Wins!"); return true;}
        else if (x[3] == 2 && x[4] == 2 && x[5] == 2) {System.out.println("Player 2 Wins!"); return true;}
        else if (x[6] == 2 && x[7] == 2 && x[8] == 2) {System.out.println("Player 2 Wins!"); return true;}
        //diags2
        else if (x[0] == 2 && x[4] == 2 && x[8] == 2) {System.out.println("Player 2 Wins!"); return true;}
        else if (x[2] == 2 && x[4] == 2 && x[6] == 2) {System.out.println("Player 2 Wins!"); return true;}

        return false; }
    static boolean checkDraw(int[] x){
        for(int i = 0; i < 9; i++){
            if(x[i] == 0){return false;}
        }
        System.out.println("Draw!");
        return true; }
    //showboard
    static void Showboard(int[] x){
        for(int i = 0; i < 9; i++) {
            if (x[i] == 0) {System.out.print("- ");}
            if (x[i] == 1) {System.out.print("X ");}
            if (x[i] == 2) {System.out.print("O ");}
            if ((i + 1) % 3 == 0) {System.out.println();}}}
    static void checkValidp1(int[] x, int y){
        if (x[y] != 0) {System.out.println("Invalid move");}
        else {x[y] = 1;}}
        static void checkValidp2(int[] x, int y){
            if (x[y] != 0) {System.out.println("Invalid move");}
            else {x[y] = 2;}}
    


  public static void main(String[] args) {
      int[] Tictactoe = new int[9];
      while(true){
          //define input
          Scanner input = new Scanner(System.in);
          //input 1
          System.out.println("Enter coords in");
          int u1 = input.nextInt();
          checkValidp1(Tictactoe, u1);

          Showboard(Tictactoe);
          if(checkWin(Tictactoe) == true){
            break;
          }
          if(checkDraw(Tictactoe) == true){
              break;
          }
          
          //input 2
          System.out.println("Enter coords in ");
          int u2 = input.nextInt();
          checkValidp2(Tictactoe, u2);

          Showboard(Tictactoe);
          if(checkDraw(Tictactoe) == true){
              break;
          }
          if(checkWin(Tictactoe) == true){
              break;
          }

      } 
  }
}