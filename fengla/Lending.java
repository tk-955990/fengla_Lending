package fengla;

import java.nio.charset.Charset;

public class Lending {
	
	Lending(){}
	
	private String bookTitle;
	private String personName;

	public Lending(String bookTitle, String personName) {
	//	super();
		this.bookTitle = bookTitle;
		this.personName = personName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	public String toString() {
		return "タイトル: " + format(this.bookTitle, 15) + "著者: " + format(this.personName, 24) ;
	}
	
	private String format(String target, int length) {
		int byteDiff = (getByteLength(target, Charset.forName("UTF-8")) - target.length()) / 2;
		return String.format("%-" + (length - byteDiff) + "s", target);
	}
	
	private int getByteLength(String string, Charset charset) {
		return string.getBytes(charset).length;
	}
}