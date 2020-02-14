import java.util.*;
import javax.xml.transform.*;

class validParentheses {
	
	private static HashMap<Character,Character> mappings;
	static  {
		mappings = new HashMap<Character,Character>();
		mappings.put(')', '(');
		mappings.put(']', '[');
		mappings.put('}', '{');
	}
	
	public static void main(String[] args) {
		test2();
	}
	
	public static void test2() {
			String s= "]";
			boolean result = isValid2(s);
			System.out.println(result);
	}
		
	public static void test1() {
		String s= "";
		boolean result = isValid1(s);
		System.out.println(result);
	}
	
	public static void test() {
		String testStr = "";
		boolean result = isValid(testStr);
		System.out.println(result);
	}
	
	public static boolean isValid2(String s) {
		
		if (s.length() == 0) {
			return true;
		}
		
		int index = 0;
		char[] stack = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case '(':
				case '{':
				case '[':
					stack[index++] = c;
					continue;
				case ')':
					if (index == 0 || stack[--index] != '(') {
						return false;
					}
					continue;
				case '}':
					if (index == 0 || stack[--index] != '{') {
						return false;
					}
					continue;
				case ']':
					if (index == 0 || stack[--index] != '[') {
						return false;
					}
					continue;
			}
		
	}
	return index == 0;
	}
	
	public  static boolean isValid1(String s) {
		Stack<Character> stack = new Stack<Character>();
		int left = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mappings.containsKey(c)) {
				Character v = stack.isEmpty() ? '#' : stack.pop();
				if (mappings.get(c) != v) {
					return false;
				}
			} else {
				stack.push(c);
			}
			
		}
		
		return stack.isEmpty();
	}
	
	public static  boolean isValid(String s) {
		int n = s.length();
		Stack<String> opStack = new Stack<String>();
		
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			switch (ch) {
				case '(':
				case '{':
				case '[':
					char[] charList = {ch};
					opStack.push(new String(charList));
					break;
				case ' ':
					break;
				case ')':
				case '}':
				case ']':
					if (opStack.empty()) {
						return false;
					} else {
						char targetChar  = opStack.peek().toCharArray()[0];
						if (isCompare(ch, targetChar)) {
							opStack.pop();
						} else {
							return false;
						}
					}
					
					break;
				default:
					break;
			}
		}
		
		return opStack.empty();
	}
	
	public static  boolean isCompare(char src, char target) {
		boolean result = false;
		switch (src) {
			case ')':
				result = target == '(';
				break;
			case '}':
				result = target == '{';
				break;
			case ']':
				result = target == '[';
				break;
			default:
				break;
		}
		
		return result;
	}
}