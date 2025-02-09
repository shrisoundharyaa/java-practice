class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i < arr.length){
            int crt = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[crt]){
                int a = arr[i];
                arr[i] = arr[crt];;
                arr[crt] = a;
            }
            else i++;
        }
        //find the missing number
        for(int index = 0;index <arr.length;index++){
            if(index + 1 != arr[index]){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}
