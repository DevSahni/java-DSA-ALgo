public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int m=3;
        int n=3;
        mergeArrays(arr1,m,arr2,n);
        for(int i=0;i<m+n;i++){
            System.out.print(arr1[i]+" ");
        }
}
public static void mergeArrays( int[] arr1, int m, int[] arr2, int n){
    int i = m - 1, j = n - 1, k = m +n-1;
    while (i >= 0 && j >= 0) {
        if (arr1[i] > arr2[j]) {
            arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
                }
    }
    while(j>=0){
        arr1[k--]=arr2[j--];
    }
}
}
