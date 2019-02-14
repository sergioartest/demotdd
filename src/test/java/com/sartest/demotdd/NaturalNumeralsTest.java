package com.sartest.demotdd;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NaturalNumeralsTest {

	private NaturalNumerals naturalNumerals = new NaturalNumerals();

	@Test
	public void iToNatural(){
		assertEquals(1,naturalNumerals.convertToNatural("I"));
	}

	@Test
	public void iiToNatural(){
		assertEquals(2,naturalNumerals.convertToNatural("II"));
	}

	@Test
	public void iiiToNatural(){
		assertEquals(3,naturalNumerals.convertToNatural("III"));
	}

	@Test
	public void ivToNatural(){
		assertEquals(4,naturalNumerals.convertToNatural("IV"));
	}

	@Test
	public void vToNatural(){
		assertEquals(5,naturalNumerals.convertToNatural("V"));
	}

	@Test
	public void viToNatural(){
		assertEquals(6,naturalNumerals.convertToNatural("VI"));
	}

	@Test
	public void viiToNatural(){
		assertEquals(7,naturalNumerals.convertToNatural("VII"));
	}

	@Test
	public void viiiToNatural(){
		assertEquals(8,naturalNumerals.convertToNatural("VIII"));
	}

	@Test
	public void ixToNatural(){
		assertEquals(9,naturalNumerals.convertToNatural("IX"));
	}

	@Test
	public void xToNatural(){
		assertEquals(10,naturalNumerals.convertToNatural("X"));
	}

	@Test
	public void xviiiToNatural(){
		assertEquals(18,naturalNumerals.convertToNatural("XVIII"));
	}

	@Test
	public void romanUnitsToNatural(){
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
			assertEquals(("Error en "+fields[1]),fields[0],naturalNumerals.convertToNatural((String)fields[1]));
	}

	@Test
	public void romanTensToNatural(){
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
				assertEquals(("Error en "+fields[1]),fields[0],naturalNumerals.convertToNatural((String)fields[1]));
	}

	@Test
	public void romanHundredsToNatural(){
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
				assertEquals(("Error en "+fields[1]),fields[0],naturalNumerals.convertToNatural((String)fields[1]));
	}

	@Test
	public void someRomanNumbersToNatural(){
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
				assertEquals(("Error en "+fields[1]),fields[0],naturalNumerals.convertToNatural((String)fields[1]));
	}

}