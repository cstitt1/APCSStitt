package baseConversion;

public class BaseConverter
{
    static char digitToChar(int digit) // package access for testing
    {
    	switch (digit) {
    		case (0): return '0';
    		case (1): return '1';
    		case (2): return '2';
    		case (3): return '3';
    		case (4): return '4';
    		case (5): return '5';
    		case (6): return '6';
    		case (7): return '7';
    		case (8): return '8';
    		case (9): return '9';
    		case (10): return 'A';
    		case (11): return 'B';
    		case (12): return 'C';
    		case (13): return 'D';
    		case (14): return 'E';
    		case (15): return 'F';
    	}
    	return (char) -1;
    }
    
    public static String convertFromBase10(int num, int targetBase)
    {
        String res = "";
        
        while (num > 0) {
        	int rem = num % targetBase;
        	num /= targetBase;
        	res = digitToChar(rem) + res;
        }
        
        return res;
    }

    static int charToValue(char digit) // package access for testing
    {
        switch (digit) {
        	case ('0'): return 0;
        	case ('1'): return 1;
        	case ('2'): return 2;
        	case ('3'): return 3;
        	case ('4'): return 4;
        	case ('5'): return 5;
        	case ('6'): return 6;
        	case ('7'): return 7;
        	case ('8'): return 8;
        	case ('9'): return 9;
        	case ('A'): return 10;
        	case ('B'): return 11;
        	case ('C'): return 12;
        	case ('D'): return 13;
        	case ('E'): return 14;
        	case ('F'): return 15;
        }
        
        return -1;
    }
    
    public static int convertToBase10(String num, int originalBase)
    {
    	int res = 0;
    	for (int i=0; i<num.length(); i++) {
    		res += (charToValue(num.charAt(num.length()-(i+1)))*(Math.pow(originalBase, i)));
    	}
    	return res;
    }

    public static String convert(String num, int originalBase, int targetBase)
    {
        int res = convertToBase10(num, originalBase);
        num = convertFromBase10(res, targetBase);
        return num;
    }
}
