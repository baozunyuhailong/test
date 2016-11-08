package test_yhl;

import java.util.ArrayList;

public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("789");
		for(int i=0; i<list.size();i++){
			
			System.out.print(list.get(i));
		}
		list.remove(2);
	}
}
