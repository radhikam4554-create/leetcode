class Solution {
static int[] helper(int[] a, int s, int e) {
    if (s == e) {
        return new int[]{a[s]};
    }
    int mid = s + (e - s) / 2;

    int[] left = helper(a, s, mid);
    int[] right = helper(a, mid + 1, e);

    int[] c = mergeSort(left, right);

    return c;
}

static int[] mergeSort(int[] left, int[] right) {

    int i = 0, j = 0, k = 0;

    int n = left.length;
    int m = right.length;

    int[] c = new int[n + m];

    while (i < n && j < m) {

        if (left[i] < right[j]) {
            c[k++] = left[i++];
        } else {
            c[k++] = right[j++];
        }
    }

    while (i < n) {
        c[k++] = left[i++];
    }

    while (j < m) {
        c[k++] = right[j++];
    }

    return c;
}

public int[] sortArray(int[] nums) {

    if (nums.length <= 1) {
        return nums;
    }

    return helper(nums, 0, nums.length - 1);
}

}
