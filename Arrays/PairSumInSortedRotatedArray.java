
// class Solution {
//     static boolean pairInSortedRotated(int arr[], int target) {
//         // Your code here
//         // //2 pointer approach (wrong also not good) only 3 test cases passed :(
        
//         // int n = arr.length;
//         // int st = 0;
//         // int end = n-1;
        
//         // while(st < end) {
//         //     if ((arr[st] + arr[end]) == target) {
//         //         return true;
//         //     } else if ((arr[st] + arr[end]) > target) {
//         //         st++;
//         //     } else {
//         //         end--;
//         //     }
//         // }
        
//         // return false;
//     }
// }

class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;

        // 1. Find the index of the minimum element (pivot)
        int minIdx = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                minIdx = i + 1;
                break;
            }
        }
        // If array is not rotated at all, minIdx remains 0
        
        //note:::: ' % n ' is used to circular moving 
        // i.e from last index to 1st and from 1st to last
        
        // 2. Set left to smallest, right to largest
        int left = minIdx;                    // index of smallest element
        int right = (minIdx - 1 + n) % n;     // index of largest element

        // 3. Circular two-pointer search
        while (left != right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                // move left forward (circular)
                left = (left + 1) % n;
            } else {
                // sum > target: move right backward (circular)
                right = (right - 1 + n) % n;
            }
        }

        return false;
    }
}

