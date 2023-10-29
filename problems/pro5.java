import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class pro5
{
	public static void main(String[] args) {
		List<Integer> i=new ArrayList<>();
		i.add(9);
		i.add(4);
		i.add(0);
		i.add(8);
		i.add(1);
		Collections.sort(i);
		System.out.println("Sorted list:"+i);
	}
}
