package entity;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.Toolkit;
import java.util.regex.Pattern;

public class MQDocument extends PlainDocument {
	private String limit = null; // regular expression of restricted character
	private int maxLength = -1; // limit the maximum length of characters
	private double maxValue = 0; // if a number is entered, the maximum limit is set
	private boolean isMaxValue = false; // whether the maximum limit is used
	private Toolkit toolkit = null; // make a system sound when something is wrong
	private boolean beep = false; // true means to make a sound

	public MQDocument() {
		super();
		toolkit = Toolkit.getDefaultToolkit();
	}
	
	public void setCharLimit(String limit) {
		this.limit = limit;
	}
	
	public String getCharLimit() {
		return this.limit;
	}

	public boolean isOfLimit(CharSequence input) {
		if (limit == null) {
			return true;
		} else {
			return Pattern.compile(limit).matcher(input).find();
		}
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	
	public int getMaxLength() {
		return this.maxLength;
	}
 
	public void errorBeep(boolean beep) {
		this.beep = beep;
	}
 
	public boolean isErrorBeep() {
		return beep;
	}
	
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException, NumberFormatException {
		if (str == null) { // if the string is empty, return directly
			return;
		}
		boolean b = true;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String temp = String.valueOf(ch[i]);
			if (!isOfLimit(temp)) { // if the character to be entered is not in the allowed range
				b = false;
			}
			// if there is a character length limit, and the character length is now greater than or equal to the limit
			if (maxLength > -1 && this.getLength() >= maxLength) {
				b = false;
			}
		}
		if (isMaxValue) { // if the content is set to the maximum number
			String s = this.getText(0, this.getLength()); // a character already in the document
			s = s.substring(0, offs) + str + s.substring(offs, s.length());
			if (Double.parseDouble(s) > maxValue) {
				if (beep) {
					toolkit.beep(); // make a sound
				}
				return;
			}
		}
		if (!b) { // if the input is illegal
			if (beep) {
				toolkit.beep(); // make a sound
			}
			return;
		}
		super.insertString(offs, new String(ch), a);
	}
}