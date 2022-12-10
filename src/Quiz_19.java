//Searching with method
public class Quiz_19 {
    public static int linear_search(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70,80};
        int val = 20;
        System.out.println(val+" is found at index: "+ linear_search(num,val));
    }
}
