package com.nat.arrays;

import com.nat.util.PrintHelper;

public class CountLargeSubset {

    public static void main(String[] s) {
        int a[] = {6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        int b[] = {86, 177, 115, 193, 135, 186, 92, 49, 21, 162, 27, 90, 59, 163, 126, 140, 26, 172, 136, 11, 168, 167, 29, 182, 130, 62, 123, 67, 129, 2, 22, 58, 69, 56, 42, 173, 119, 184, 137, 198, 124, 170, 13, 91, 180, 156, 73, 196, 81, 105, 125, 84, 127, 46, 113, 57, 95, 145, 14, 34, 164, 43, 150, 87, 8, 76, 178, 188, 3, 51, 154, 199, 132, 60, 139, 12, 94, 195, 1, 97, 102, 117, 52, 101};
        PrintHelper.print(findLongestConseqSubseq(b,b.length));
    }

    static int findLongestConseqSubseq(int arr[], int N) {
        java.util.Arrays.sort(arr);
        //{1,9,3,10,4,20,2} -> 1 2 3 4 9 10 20
        int seq = 1, prevseq = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == (arr[i - 1] + 1)) {
                seq++;
            } else {
                if (prevseq < seq)
                    prevseq = seq;
                seq = 1;
            }

        }
        return (prevseq < seq) ? seq : prevseq;
    }

}
