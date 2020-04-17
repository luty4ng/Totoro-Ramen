package entity;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.Toolkit;
import java.util.regex.Pattern;

 

public class MQDocument extends PlainDocument {

 private static final long serialVersionUID = -4462693078138709956L;

 private String limit = null; // 输入字符限制的正则表达式

 private int maxLength = -1; // 输入字符最大长度的限制，-1为不限制

 private double maxValue = 0; // 如果输入的是数字，则最大值限制

 private boolean isMaxValue = false; // 是否采用了最大值限制

 private Toolkit toolkit = null; // 用来在错误的时候发出系统声音

 private boolean beep = false; // 是否发声，true为发出声音
 
 private int number_of_dot = 0; //记录输入的小数点个数

 // 构造方法

 public MQDocument() {
  super();
  this.init();
 }

 public MQDocument(Content c) {
  super(c);
  this.init();
 }

 
 private void init() {
  toolkit = Toolkit.getDefaultToolkit();
 }

 // 构造方法结束

 
 public void setCharLimit(String limit) {
  this.limit = limit;
 }

 
 public String getCharLimit() {
  return this.limit;
 }

 
 public void clearLimit() {
  this.limit = null;
 }

 
 public boolean isOfLimit(CharSequence input) {
  if (limit == null) {
   return true;
  } else {
   return Pattern.compile(limit).matcher(input).find();
  }
 }

 
 public boolean isEmptyLimit() {
  if (limit == null) {
   return true;
  } else {
   return false;
  }
 }

 
 public void setMaxLength(int maxLength) {
  this.maxLength = maxLength;
 }

 
 public void cancelMaxLength() {
  this.maxLength = -1;
 }

 
 public void setMaxValue(double maxValue) {
  this.isMaxValue = true;
  this.maxValue = maxValue;
 }

 
 public boolean isMaxValue() {
  return this.isMaxValue;
 }

 
 public double getMaxValue() {
  return this.maxValue;
 }

 
 public void cancelMaxValue() {
  this.isMaxValue = false;
  this.maxValue = 0;
 }

 
 public void reset() {
  clearLimit();
  cancelMaxLength();
  cancelMaxValue();
 }

 
 public void errorBeep(boolean beep) {
  this.beep = beep;
 }

 
 public boolean isErrorBeep() {
  return beep;
 }

 public void insertString(int offs, String str, AttributeSet a)
   throws BadLocationException, NumberFormatException {
  // 若字符串为空，直接返回。
  if (str == null) {
   return;
  }
  boolean b = true;
	char[] ch = str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		String temp = String.valueOf(ch[i]);
//		if(temp.equals('.')) {
////			System.out.print("******");
//			number_of_dot++;
//			if(number_of_dot > 1) {
//				b = false;
//			}
//		}
		// 如果要输入的字符不在允许范围内
		if (!isOfLimit(temp)) {
			b = false;
		}
   // 如果有字符长度限制，并且现在的字符长度已经大于或等于限制
   if (maxLength > -1 && this.getLength() >= maxLength) {
    b = false;
   }

  }
  // 如果内容设置了最大数字
  if (isMaxValue) {
   String s = this.getText(0, this.getLength()); // 文档中已有的字符
   s = s.substring(0, offs) + str + s.substring(offs, s.length());
   if (Double.parseDouble(s) > maxValue) {
    if (beep) {
     toolkit.beep(); // 发出声音
    }
    return;
   }
  }

  // 如果输入不合法
  if (!b) {
   if (beep) {
    toolkit.beep(); // 发出声音
   }
   return;
  }

  super.insertString(offs, new String(ch), a);
 }

}