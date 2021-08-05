
//main class
public class DataWrapApp {

	public static void main(String[] args) {
		System.out.println(DataWrapper.wrapSquare("array"));
		System.out.println(DataWrapper.wrapAngle("tag"));
		System.out.println(DataWrapper.wrapRound(0.5));

	}
}	


//second class
class DataWrapper {
	
	//Round
	static String wrapRound (String text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( int numberInt ) {
		  return "(" + numberInt + ")";
		}
	static String wrapRound( double numberDouble ) {
		  return "(" + numberDouble + ")";
		}
	static String wrapRound( char numberChar ) {
		  return "(" + numberChar + ")";
		}
	
	//Square
	static String wrapSquare (String text) {
		return "["+text+"]";
	}
	static String wrapSquare (int numberInt) {
		return "["+numberInt+"]";
	}
	static String wrapSquare (double numberDouble) {
		return "["+numberDouble+"]";
	}
	static String wrapSquare (char numberChar) {
		return "["+numberChar+"]";
	}
	
	//Angle
	static String wrapAngle (String text) {
		return "<"+text+">";
	}
	static String wrapAngle (int numberInt) {
		return "<"+numberInt+">";
	}
	static String wrapAngle (double numberDouble) {
		return "<"+numberDouble+">";
	}
	static String wrapAngle (char numberChar) {
		return "<"+numberChar+">";
	}
	
	
	
}