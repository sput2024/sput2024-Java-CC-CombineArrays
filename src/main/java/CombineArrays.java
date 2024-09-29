
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public static void main(String[] args){}
    public int[] combine(int[] arr1, int[] arr2){
        int r = 2*arr1.length;
        int[] myArray = new int[r];
   
        for (int i=0; i<arr1.length;i++){
            myArray[i] = arr1[i];
           
        }
    
        for (int i=3; i<r;i++){
             myArray[i] = arr2[i-3];
          
            }
        
        
        return myArray;
    }
}
