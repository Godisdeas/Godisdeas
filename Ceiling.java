public class Ceiling {

    static int ceil(int[]arr , int target){

        int s = 0;
        int e = arr.length - 1;
        if(target > arr[e]){
            System.out.print("Ceiling not Found"); }
        else{
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]<target){
                s = mid+1;
            }else if (arr[mid]>target) {
                e = mid -1;
                
            }
            else {
            return mid;
        }

        }
        return s;
        }

    }
    public static void main(String[] args) {

        int[]A = {2,3,5,9,14,16,18};
        int target = 15;
        int res = ceil(A, target);
        System.out.println("Ceiling is "+A[res]);
        
}
}
