
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i =0;
        while(i < arr.length){
            int crt = arr[i] - 1;
            if(arr[i] != arr[crt]){
                int a= arr[i];
                arr[i] =arr[crt];
                arr[crt] = a;
            }
            else i++;
        }
        //find the missing element and store it in list<integer> and return 
        List<Integer> list =  new ArrayList<>();
        for(int index = 0 ;index<arr.length;index++){
            if(index + 1 != arr[index]){
                    list.add(index + 1);
            }
        }
        return list;
    }
}
