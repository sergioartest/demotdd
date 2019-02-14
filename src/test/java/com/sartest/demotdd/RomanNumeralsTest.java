package com.sartest.demotdd;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanNumeralsTest {

	private RomanNumerals romanNumerals = new RomanNumerals();

	@Test
	public void unitsToRoman(){
		Object[][] numbers = {
			{1,	"I"},
			{2,	"II"},
			{3,	"III"},
			{4,	"IV"},
			{5,	"V"},
			{6,	"VI"},
			{7,	"VII"},
			{8,	"VIII"},
			{9,	"IX"},
			{10,"X"}
		};
		for (Object[] fields : numbers)
			assertEquals(fields[1],romanNumerals.convertToRoman((Integer)fields[0]));
	}

	@Test
	public void tensToRoman(){
		Object[][] numbers = {
			{11,  "XI"},
			{22,  "XXII"},
			{33,  "XXXIII"},
			{44,  "XLIV"},
			{55,  "LV"},
			{66,  "LXVI"},
			{77,  "LXXVII"},
			{88,  "LXXXVIII"},
			{99,  "XCIX"},
			{100, "C"}
		};
		for (Object[] fields : numbers)
			assertEquals(fields[1],romanNumerals.convertToRoman((Integer)fields[0]));
	}

	@Test
	public void hundredsToRoman(){
		Object[][] numbers = {
			{111,  "CXI"},
			{222,  "CCXXII"},
			{333,  "CCCXXXIII"},
			{444,  "CDXLIV"},
			{555,  "DLV"},
			{666,  "DCLXVI"},
			{777,  "DCCLXXVII"},
			{888,  "DCCCLXXXVIII"},
			{999,  "CMXCIX"},
			{1000, "M"}
		};
		for (Object[] fields : numbers)
			assertEquals(fields[1],romanNumerals.convertToRoman((Integer)fields[0]));
	}

	@Test
	public void someNumbersToRoman(){
		Object[][] numbers = {
			{2,	   "II"},
			{3,	   "III"},
			{4,	   "IV"},
			{6,	   "VI"},
			{7,	   "VII"},
			{8,	   "VIII"},
			{9,	   "IX"},
			{13,   "XIII"},
			{19,   "XIX"},
			{39,   "XXXIX"},
			{40,   "XL"},
			{45,   "XLV"},
			{190,  "CXC"},
			{90,   "XC"},
			{390,  "CCCXC"},
			{400,  "CD"},
			{410,  "CDX"},
			{495,  "CDXCV"},
			{450,  "CDL"},
			{499,  "CDXCIX"},
			{900,  "CM"},
			{999,  "CMXCIX"},
			{1900, "MCM"},
			{2018, "MMXVIII"}
		};
		for (Object[] fields : numbers)
			assertEquals(fields[1],romanNumerals.convertToRoman((Integer)fields[0]));
	}

}