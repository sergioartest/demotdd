package com.sartest.demotdd;
import java.util.HashMap;


public class RomanNumerals {

	private HashMap<Integer,String[]> romanSymbols;
	
	public RomanNumerals(){
		this.romanSymbols = new HashMap<>();
		this.romanSymbols.put(1,	new String[]{"I", "V", "X"});
		this.romanSymbols.put(10,	new String[]{"X", "L", "C"});
		this.romanSymbols.put(100,	new String[]{"C", "D", "M"});
		this.romanSymbols.put(1000,	new String[]{"M", null,null});
	}

	public String convertToRoman(int natural){
		return romanNumber(natural,1000);
	}

	public String romanNumber(int natural, int factor){
		int number = natural;
		if (number>3999){
			return null;
		}
		if (factor>=1){
			if (number>=factor)
				return (romanSymbols((number/factor),romanSymbols.get(factor)) + romanNumber((number%factor),(factor/10)));
			return romanNumber(number, (factor/10));
		}
		return "";
	}

	private String romanSymbols(int number, String[] symbols){
		String unitySymbol = symbols[0];
		String fifthSymbol = symbols[1];
		String tenthSymbol = symbols[2];
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