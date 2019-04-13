package model;

public class ComputerRoom {
	private ComputerRoom next;
	private ComputerRoom prev;
	private String name;
	public ComputerRoom(ComputerRoom p, ComputerRoom n, String na) {
		next = n;
		prev = p;
		name = na;
	}
	public ComputerRoom getNext() {
		return next;
	}
	public ComputerRoom getPrev() {
		return prev;
	}
	public void setNext(ComputerRoom c) {
		next = c;
	}
	public void setPrev(ComputerRoom c) {
		prev = c;
	}
	public String getName() {
		return name;
	}

}
