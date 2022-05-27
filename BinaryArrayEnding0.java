/*

We have two special characters:
The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).

Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

Example 1:
Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.

Example 2:
Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.

Assumption: The array always ends with 0
*/

public class BinaryArrayEnding0 {
    public static void main(String[] args) {
        int[] input1 = {1, 0, 0};           // true
        int[] input2 = {1, 1, 1, 0};        // false
        int[] input3 = {1, 1, 1, 1, 0};     // true
        int[] input4 = {0, 0, 0, 1, 0};     // false

        System.out.println(isBinaryArrayValid(input1));
        System.out.println(isBinaryArrayValid(input2));
        System.out.println(isBinaryArrayValid(input3));
        System.out.println(isBinaryArrayValid(input4));
    }

    public static boolean isBinaryArrayValid(int[] arr) {
//        Implementation 1 -
        int i = 0;
        int lastCharacterBits = 1;
        while(i < arr.length) {
            if(arr[i] == 0) {
                lastCharacterBits = 1;
                i++;
            }
            else {
                lastCharacterBits = 2;
                i = i + 2;
            }
        }
        return lastCharacterBits == 1;

//        Implementation 2 -
//        int i = 0;
//        while(i != arr.length - 1 && i != arr.length) {
//            if(arr[i] == 0)
//                i++;
//            else
//                i += 2;
//        }
//        return i == arr.length-1;
    }
}
