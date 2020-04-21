package com.test2;

public enum Menu {
	Pizza(12000), Spageti(9000), Nuddle(8000);
	int value;
	private Menu(int value) {
		this.value = value;
	}
}
