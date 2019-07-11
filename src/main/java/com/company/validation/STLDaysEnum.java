package com.company.validation;

public enum STLDaysEnum {
	UNKNOWN(0),
	ONE_DAY(1),
	ONE_WEEK(7),
	TWO_WEEKS(14),
	FOUR_WEEKS(28),
	EIGHT_WEEKS(56),
	SIXTEEN_WEEKS(112),
 	SIX_MONTHS(180),
 	ONE_YEAR(365);
	
	private final int numDays;

	STLDaysEnum(int numDays) {
        this.numDays = numDays;
           
    }
	
	/*public int toInt() {
        return numDays;
      }
	
	public int getSTLdays() {
        return this.numDays;
    }
	
	public static STLDaysEnum fromInt(int value) {   
        switch(value) {
            case 1: return ONE_DAY;
            case 7: return ONE_WEEK;
            case 14:return TWO_WEEKS;
            case 28:return FOUR_WEEKS;
            case 56:return EIGHT_WEEKS;
        	case 112:return SIXTEEN_WEEKS;
        	case 180:return SIX_MONTHS;
        	case 365:return ONE_YEAR;
            default:return UNKNOWN;
       }
   }*/
}
