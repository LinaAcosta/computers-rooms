package ui;
import model.*;
public class Main {
	public static void main(String[]args) {
		ComputerRoom nextNext = new ComputerRoom(null, null, "NEXTNEXT");
		ComputerRoom first = new ComputerRoom(null, null, "FIRST");
		ComputerRoom next = new ComputerRoom(first, nextNext, "NEXT");
		first.setNext(next);
		nextNext.setPrev(next);
		ComputerRoom last = new ComputerRoom(nextNext, null, "LAST");
		nextNext.setNext(last);
		Computer c = new Computer(first);
		c.seeRealList();
		c.investList();
		c.seeNewList();
	}

}
