package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;

public enum MenuLevel {
	EIGHT(new MenuEight()),
	SEVEN (new MenuSeven()), 
	SIX (new MenuSix()), 
	FIVE (new MenuFive()), 
	FOUR (new MenuFour());
	
	private MenuNumber menuNumber;
	
	MenuLevel(MenuNumber menuNumber) {
		this.menuNumber = menuNumber;
	}
	
	public MenuNumber getMenuNumber() {
		return menuNumber;
	}

}
