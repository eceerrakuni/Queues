import java.util.ArrayList;
import java.util.Arrays;

public class Queue implements QueueInterface{

	
	ArrayList a = new ArrayList();
	
	
	public void enqueue(String record) {
		a.add(record);
	}

	@Override
	public String dequeue() {
		String temp2 = (String) a.get(0);
		a.set(0, null);
		int c = a.size();
		for (int o = 1; c > o; o++) {
			a.set(o - 1, a.get(o));
		}
		a.remove(c-1);
		return temp2;
	}

	@Override
	public void printQueue() {
		System.out.println(Arrays.toString(a.toArray()));
		
	}
	
}