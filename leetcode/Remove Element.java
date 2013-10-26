public class Solution {
    public int removeElement(int[] A, int elem) {
        int buffer = 0;
        for (int i = 0; i < A.length; i++) {
        	if (A[i] == elem)
        		continue;
        	A[buffer] = A[i];
        	buffer ++;
        }
        return buffer;
    }
}