package com.sartest.demotdd;


public class NaturalNumerals {

	public int convertToNatural(String roman){
		int result = 0;
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