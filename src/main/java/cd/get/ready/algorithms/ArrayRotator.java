package cd.get.ready.algorithms;

public class ArrayRotator {

    public void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.printf("%n");
    }

    public int[] rotateLeftOne(int[] arr, int n, int arrLen){
        int temp = arr[0];
        for(int j = 1; j < (arrLen); j++){
            arr[j-1] = arr[j];
        }
        arr[arrLen-1] = temp;

        return arr;
    }

    public int[] rotateLeft(int[] arr, int n){
        int arrLen = arr.length;
        int chooseMethod = 2;
        // chooseMethod = 1 --> naive nested loop method O(n^2)
        // chooseMethod = 2 --> array subsection copying O(n)

        printArray(arr, arrLen);

        if(chooseMethod == 1) {
            // First method created was naive as it moved the elements one by one
            for (int i = 0; i < n; i++) {
                arr = rotateLeftOne(arr, n, arrLen);
                //System.out.println("Rotation: " + (i+1));
                //printArray(arr, arrLen);
            }
            return arr;
        } else{
            // Second method uses array copying
            int[] copyingArray = new int[arrLen];
            // copy the array from position 0 to their left shift position in the temp array
            for(int i = 0; i < n; i ++){
                copyingArray[(arrLen-n+i)] = arr[i];
            }
            // then copy the values to the new first position onwards
            int i = 0;
            for(int j = n; j < arrLen; j++){
                copyingArray[i] = arr[j];
                i +=1;
            }

            return copyingArray;
        }
    }
}
