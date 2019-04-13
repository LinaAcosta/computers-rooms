package model;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	private ComputerRoom first;
	private List<ComputerRoom> realList;
	private List<ComputerRoom> newList;
	public Computer(ComputerRoom f) {
		first = f;
		realList = new ArrayList<>();
		newList = new ArrayList<>();
	}
	public void seeRealList() {
		while(first != null) {
			realList.add(first);
			first = first.getNext();
		}
		for(int i = 0; i<realList.size(); i++) {
			System.out.print(realList.get(i).getName() + "\n");
		}
	}
	public void investList() {
		ComputerRoom last = first;
		while(last != null) {
			last = last.getNext();
			newList.add(last);
		}
		ComputerRoom current = last;
		int j = 0;
		while(current != null) {
			newList.get(j).setNext(current.getPrev());
			newList.get(j).setPrev(current.getNext());
			current = current.getPrev();
			j++;
		}
	}
	public void seeNewList() {
		for(int i = 0; i<newList.size(); i++) {
			System.out.print(newList.get(i).getName() + "\n");
		}
	}

}
