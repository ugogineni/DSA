package hrank.datastructures.arrays;

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxVal = Integer.MIN_VALUE;
        for(int row=0; row<4; row++){
            for(int col=0; col<4; col++){
                int currSum = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                currSum += arr[row+1][col+1];
                currSum += arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                
                /*for(int arr_i=row; arr_i <= row+2; arr_i++){
                    for(int arr_j=col; arr_j <= col+2; arr_j++){
                        if(!((arr_i == row+1) && (arr_j == col || arr_j == col+2)))
                            currSum += arr[arr_i][arr_j]; 
                    }
                    
                }*/
                if (currSum > maxVal) {
                    maxVal = currSum;
                }
                //System.out.print(currSum);
            } 
            //System.out.println(" ");
        }
            System.out.println(maxVal);
    } 
}
