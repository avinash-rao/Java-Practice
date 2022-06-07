public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};
        int[] a2 = {5, 11, 21, 31, 41};
        int[] sortedArray = new int[a1.length + a2.length];
        int i = 0, j = 0, k=0;
        while(i < a1.length && j < a2.length) {
            if(a1[i] < a2[j]) {
                sortedArray[k++] = a1[i++];
            } else {
                sortedArray[k++] = a2[j++];
            }
        }
        while(i < a1.length) {
            sortedArray[k++] = a1[i++];
        }
        while(j < a2.length) {
            sortedArray[k++] = a2[j++];
        }

        for(i = 0; i < sortedArray.length; i++)
            System.out.println(sortedArray[i]);
    }
}
