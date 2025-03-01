import java.util.Arrays;
public class Array {
    public static void main (String[] args){
        int[] marks = {10, 2, 3, 4, 5};
        System.out.println(marks[0]);
//  array functions like . length and sorting 

        System.out.println(marks.length);
        // sort 
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2d array init
        int[][] arr = {{12,13,45},{11,22,31}};
        System.out.println(arr[0][2]);
    }
}
