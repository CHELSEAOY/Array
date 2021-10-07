/*
    对一个整型数组中的数字进行分类排序，使得负数都靠左端，正数都靠右端，0在中部，负数区域和正数区域不需要排序
 */


import java.util.Arrays;

public class test02 {

    public static void main(String[] args) {
        int[] n = {25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
//        String s1 = "jdhs";
//        String s2 = new String("abxf");
//        printArray(new int[]{25,18,3});
        //String s = Arrays.toString(n);
        System.out.println("排序前数组:" + Arrays.toString(n));
        System.out.println("排序后数组:" + Arrays.toString(numSort(n)));
        System.out.println("---------------------------------");

//        Arrays.sort(n);
//        int num = Arrays.binarySearch(n,16);
//        System.out.println(Arrays.toString(n));
//        System.out.println(num);
//        int[] res = reverse(n);
//        //printArray(res);
//        System.out.println(Arrays.toString(res));
//          int[] a = new int[]{1,2,3,4,5,6};
//          //printArray(a);
//          int[][] b = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
//          printArray2(b);
        //System.out.println(numSort(n));
        /*
        for (int i = 0; i < n.length ; i++) {
            System.out.println(n[i]);
        }

        System.out.println("----------");
        for (int i : n) {
            System.out.println(i);
        }*/
    }


    public static int[]  numSort(int[] x){
            int p = 0;
            int left = 0;
            int right = x.length-1;

            while(p<=right){
                if(x[p]<0){
                    int t = x[left];
                    x[left] = x[p];
                    x[p] = t;
                    left++;
                    p++;
                }
                else if(x[p]>0){
                    int t = x[right];
                    x[right] = x[p];
                    x[p] = t;
                    right--;
                }
                else{
                    p++;  //代码填空位置
                }
            }
            return x;
    }

    public static void printArray(int[] arr){
        for (int i : arr
             ) {
            System.out.println(i);
        }
    }

    public static void printArray2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print('\n');
        }

    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0, j = result.length-1; i <list.length ; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
