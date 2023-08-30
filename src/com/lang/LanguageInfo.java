package com.lang;

public class LanguageInfo extends StateDetails {
   public void tamilLanguage() {
	   System.out.println("Tamil is spoken in TamilNadu");
   }
   public void englishLanguage() {
	   System.out.println("English is spoken in Western Countries");
   }
   public void hindiLanguage() {
	   System.out.println("Hindi is spoken in North India");
	  
   }
   public static void main(String[] args) {
	   LanguageInfo data = new LanguageInfo();
	   data.tamilLanguage();
	   data.englishLanguage();
	   data.hindiLanguage();
	   data.southIndia();
	   data.northIndia();
   }
}
