//Write a Java program to find the index of an array element.
public class array_exercise_6 {
    public static int findIndex(int[] My_Array, int val) {
        if(My_Array == null)
            return -1;
        int i=0;
        while (i < My_Array.length){
            if (My_Array[i] == val)
                return i;
            else
               i+=1;
        }
        return -1;
    }
}
class runArray_exercise_6 {
    public static void main(String[] args) {
        int[] arr={22,66,77,44,88, 0,11,33,55};
        System.out.println("77 is present at position "+ array_exercise_6.findIndex(arr,66));
        System.out.println("44 is present at position "+ array_exercise_6.findIndex(arr,44));
    }
}