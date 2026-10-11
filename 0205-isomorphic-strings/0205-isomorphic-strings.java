class Solution {
public boolean isIsomorphic(String s, String t) {
int[] arr1 = new int[256];
int[] arr2 = new int[256];
    for (int i = 0; i < s.length(); i++) {
        char a = s.charAt(i);
        char b = t.charAt(i);

        if (arr1[a] != arr2[b]) {
            return false;
        }

        arr1[a] = i + 1;
        arr2[b] = i + 1;
    }

    return true;
}

}
