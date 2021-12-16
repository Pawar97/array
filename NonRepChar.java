
public class NonRepChar {
	static final int NO_OF_CHARS=256;
	static char count[]=new char[NO_OF_CHARS];
	static void getCharCountArray(String str )
	{
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
	}
	static int firstNonRepeating(String str)
	{
		getCharCountArray(str);
		int index = -1,i;
		
		for(i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				index=1;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="gibblegabbler";
int index= firstNonRepeating(str);
System.out.println(index==-1?"Either all charchter repeating or string"+"is empty":"First non repeat char is " +str.charAt(index));
	}

}
