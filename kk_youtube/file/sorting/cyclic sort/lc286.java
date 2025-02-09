class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int crt = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[crt]){
                int a = arr[i];
                arr[i] = arr[crt];
                arr[crt] = a;
            }
            else i++;
        }
        //find the element which is missed
        for(int index=0;index < arr.length;index++){
            if(index != arr[index]) return index;
        }
        return arr.length;
    }
}