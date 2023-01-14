package daily.misselenious;

enum Day{
	MONDAY , TUESDAY , WEDNESDAY ,
	THRUSDAY, FRIDAY , SATURDAY,
	SUNDAY
}
public class EnumTypeSpecialDataTpye {
	//An enum type is a special data type that 
	//enables for a variable to be a set of predefined constants
	Day day;
	public EnumTypeSpecialDataTpye(Day day) {
		this.day = day;
	}
	public static void main(String[] args) {
		EnumTypeSpecialDataTpye enum1 = new EnumTypeSpecialDataTpye(Day.MONDAY);
		//in above constructor look at the argument passed.
		//Day.MONDAY 
		System.out.println(enum1); // prints the address of enum1 obj
		System.out.println(enum1.day);//print the value stored in day 
	}
}
