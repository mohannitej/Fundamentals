
public class Alphabet {
	public static void main(String[] args) {
		char ch=48;
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("alphabet");
		}
		else if(ch >= 48 && ch <=57)
		{
			System.out.println("numeric");
			
		}
		else
		{
			System.out.println("special character");
		}
	}

}
