package kk_youtube.file.linearsearch;
import java.util.*;
public class SearchIn2DArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int[][] arr = new int[4][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                  arr[i][j] = in.nextInt();
            }
        }
         System.out.println(max(arr));
        // System.out.println(Arrays.toString(search2(arr,target)));
        in.close();
    }

   

    static boolean search(int[][] arr,int t){
        if(arr.length < 0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j]==t){
                    return true;
                  }
            }
        }
        return false;
    }
    static int[] search2(int[][] arr,int t){
        if(arr.length < 0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j]== t){
                    return new int[] {i,j};
                  }
            }
        }
        return new int[]{-1,-1};
    }
   
        
    static int max(int[][] arr){
        int max =0;
        if(arr.length < 0){
            return -1;
        }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //           if(arr[i][j] > max){
        //             max = arr[i][j];
        //           }
        //     }
        // }

        //enhanced for loop
        for(int[] row : arr){
            for(int col :row){
                if(col > max){
                    max = col;
                }
            }
        }
        return max;
    }



} 
