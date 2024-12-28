import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> addFirst(ArrayList<Integer> arr, int item){
        arr.addFirst(item);
        return arr;

    }

    public static int get(ArrayList<Integer> arr, int index){
        return arr.get(index);
    }

    public static ArrayList<Integer> set(ArrayList<Integer> arr, int index, int setItem){
        arr.set(index, setItem);
        return arr;
    }

    public static ArrayList<Integer> removeFirst(ArrayList<Integer> arr){
        arr.remove(2);
        return arr;
    }

    public static int found(ArrayList<Integer> arr, int item){
        for (int element : arr){
            if (element == item){
                return element;
            }
        }
        return 0;
    }


    public static List<Integer> subMassive(ArrayList<Integer> arr , int firstIndex, int lastIndex){
        return arr.subList(firstIndex, lastIndex);
    }

    public static ArrayList<Integer> addMassive(ArrayList<Integer> arr, ArrayList<Integer> arr1){
        arr = new ArrayList<>(arr1);
        return arr;
    };

    public static ArrayList<Integer> clean(ArrayList<Integer> arr , int item){
        return new ArrayList<>();
    }

    public static boolean isEmpty (ArrayList<Integer> arr){
        return arr.isEmpty();
    }
}
