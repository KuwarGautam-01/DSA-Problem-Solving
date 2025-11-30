class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;

        int maxmArea = 0;

        while(i < j) {
            int heightt = Math.min(height[i] , height[j]);
            int width = j - i;
            int area = heightt * width;

            maxmArea = Math.max(maxmArea , area);

            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxmArea;
    }
}