
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> tempList = new ArrayList<Integer>();
        List<Integer> preList = new ArrayList<Integer>();

        preList.add(1);
        preList.add(3);
        preList.add(5);

        tempList.add(1);
        tempList.add(2);
        tempList.add(3);
        tempList.add(4);
        tempList.add(5);
        tempList.add(6);
        tempList.add(7);
        tempList.add(8);
        Iterator<Integer> it = tempList.iterator();
        while (it.hasNext()) {
            if (preList.contains(it.next())) {
                it.remove();
            }
        }
        System.out.println(tempList);
        
    }
}



