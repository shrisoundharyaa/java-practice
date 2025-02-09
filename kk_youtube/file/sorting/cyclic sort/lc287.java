class Solution {
    public int findDuplicate(int[] arr) {
        int i= 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
            int crt = arr[i] - 1;
            if(arr[i] != arr[crt]){
                int a = arr[i];
                arr[i] = arr[crt];
                arr[crt] = a;
            }
            else return arr[i];
            }
        else i++;

        }
        return arr[i];
    }
}