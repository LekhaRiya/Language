package org.all;

import org.tamil.Tamil;

public class LanguageClass extends Tamil {
  public void allLanguage() {
	  System.out.println("Tamil,Telugu and English");
  }
  public static void main(String[] args) {
	  LanguageClass d = new LanguageClass();
	  d.allLanguage();
	  d.tamilLanguage();
	  d.telguLanguage();
	  d.englishLanguage();
  }
}
