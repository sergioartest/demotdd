package com.sartest.demotdd;


public class RomanNumerals{

	//Symbols of Roman numerals
	private static String ONE			="I";
	private static String FIVE			="V";
	private static String TEN			="X";
	private static String FIFTY			="L";
	private static String ONE_HUNDRED	="C";
	private static String FIVE_HUNDRED	="D";
	private static String TOUSAND		="M";

	public String convertToRoman(int natural){
		String result = "";
		int number	  = natural;
		if (number>3999)
			return null;
		if (number>1000){
			result += (romanSymbols((number/1000), TOUSAND, null, null));
			number = (number%1000);
		}
		if (number>100){
			result += (romanSymbols((number/100), ONE_HUNDRED, FIVE_HUNDRED, TOUSAND));
			number = (number%100);
		}
		if (number>10){
			result += (romanSymbols((number/10), TEN, FIFTY, ONE_HUNDRED));
			number = (number%10);
		}
		if (number>0){
			result += (romanSymbols(number, ONE, FIVE, TEN));
		}
		return result;
	}

	private String romanSymbols(int number, String unitySymbol, String fifthSymbol, String tenthSymbol){
		if (number<=0)
			return null;
		if (number<=3)
			return romanSymbol(unitySymbol,number);
		if (number<=5)
			return (romanSymbol(unitySymbol,(number==4))+fifthSymbol);
		if (number<=8)
			return (fifthSymbol+romanSymbol(unitySymbol,(number-5)));
		else
			return (romanSymbol(unitySymbol,(number==9))+tenthSymbol);
	}

	private String romanSymbol(String symbol, boolean add){
		return romanSymbol(symbol,(add?1:0));
	}
	private String romanSymbol(String symbol, int number){
		if (symbol!=null){
			String result = "";
			for (int n=1; n<=number; n++){
				result += symbol;
			}
			return result;
		}
		return null;
	}

}