package array_programs_using_methods;

public class RemoveDupicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5};
        int ans = removeDuplicates(arr);
        System.out.println("length of actual array : "+ans);
    }
    public static int removeDuplicates(int []arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
