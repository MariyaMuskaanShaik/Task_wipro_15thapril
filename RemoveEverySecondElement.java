import java.util.ArrayList;
import java.util.List;

public class RemoveEverySecondElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println("Original list: " + numbers);
        
        removeEverySecondElement(numbers);
        
        System.out.println("List after removing every second element: " + numbers);
    }

    public static void removeEverySecondElement(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if ((i + 1) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
