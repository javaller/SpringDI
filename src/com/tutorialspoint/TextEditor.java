package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	private CalculationsChecker calcChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void setCalcChecker(CalculationsChecker calcChecker) {
		this.calcChecker = calcChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	public void calcCheck() {
		calcChecker.calcCheck();
	}
	
}