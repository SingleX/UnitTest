package net.singlex.code;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDoor {

	private int count = 100;
	List<Door> doors = new ArrayList<Door>();

	@Test
	public void testDoor() {
		init();
		
		for (int i = 0, step = 1; i < count; i++) {
			int j = step - 1;
			for (; j < count - (count % step); j += step) {
				doors.get(j).setStatus(!doors.get(j).isStatus());
			}
			showResult(i);
			step++;
		}
	}

	/**
	 * 初始化函数
	 */
	public void init() {
		System.out.print("#000:");
		for (int i = 0; i < count; i++) {
			Door door = new Door();
			doors.add(door);
			System.out.print(door.isStatus() ? "o" : "x");
		}
		System.out.println();
	}
	/**
	 * 打印每次的结果
	 * @param i
	 */
	public void showResult(int i) {
		System.out.print("#" + (i < 9 ? "00" + (i + 1) : (i < 99 ? "0" + (i + 1) : (i + 1))) + ":");
		for (int k = 0; k < count; k++) {
			System.out.print(doors.get(k).isStatus() ? "o" : "x");
		}
		System.out.println();
	}
}
