package com.sartest.demotdd;
import java.util.HashMap;


public class NaturalNumerals {

	private HashMap<Integer,String[]> romanSymbols;
	
	public NaturalNumerals(){
		this.romanSymbols = new HashMap<>();
		this.romanSymbols.put(1,	new String[]{"I", "V", "X"});
		this.romanSymbols.put(10,	new String[]{"X", "L", "C"});
		this.romanSymbols.put(100,	new String[]{"C", "D", "M"});
		this.romanSymbols.put(1000,	new String[]{"M", null,null});
	}

	public int convertToNatural(String roman){
		return naturalNumber(roman,1000);
	}

	private int naturalNumber(String roman, int factor){
		int result	  = 0;
		Object[][] symbols_values = {
			{"I",1},
			{"V",5},
			{"X",10},
			{"L",50},
			{"C",100},
			{"D",500},
			{"M",1000}
		};
		String[] number = reverse(roman).split("");
		int oldValue = 0;
		for (String c : number){
			for (Object[] sv : symbols_values){
				String symbol = (String)sv[0];
				int	value	  = (Integer)sv[1];
				if (c.equals(symbol)){
					if (value>=oldValue){
						result	+= value;
						oldValue = value;
					}else{
						result -= value;
					}
					break;
				}
			}
		}
		return result;
	}

	private String reverse(String s){
		String reverseString = "";
		for (char c : s.toCharArray()){
			reverseString = (c+reverseString);
		}
		return reverseString;
	}

}