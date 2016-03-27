import java.util.Scanner;

public class PrintMatrix {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = input.nextInt();
    printMatrix(n);
  } // main  
  
  public static void printMatrix(int n){
    for (int i = 1; i <= n; i++){
      System.out.print((int)(Math.round(Math.random())) + " ");
      for (int j = 1; j < n; j++){
        System.out.print((int)(Math.round(Math.random())) + " ");
      }  // for j
      System.out.println();
    } // for i 
  } // printMatrix
}
