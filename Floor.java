public class Floor {
    

        static int floor(int[]arr , int target){
    
            int s = 0;
            int e = arr.length - 1;
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
            return e;
    
        }
        public static void main(String[] args) {
    
            int[]A = {2,3,5,9,14,16,18};
            int target = 15;
            int res = floor(A, target);
            System.out.println("Floor is "+A[res]);
            
    }
    
}
