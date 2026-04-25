package Resume.Naukari;

import org.testng.annotations.Test;

public class Checking 
{
	String s1="asldkflsdjkf2038942089*(&^%$%$!@#$%^&*()_sldfl><.,';weolsdfj0982308923klkdlfkjalksjdo!@#$%^`~";

	@Test(priority = 1)
	public void Devide_specailcharectors_number_letters()
	{
		char c[]=s1.toCharArray();
		
		String letters="";
		String numbers="";
		String specailchars="";
		
		int a=0;
		
		for(char ch:c)
		{
			if(Character.isLetter(ch)) {
				letters=letters+ch;
			}else if (Character.isDigit(ch)) {
				numbers=numbers+ch;
				
				a=a+ch-'0';
			}else {
				specailchars=specailchars+ch;
			}
		}
		System.out.println(letters);
		System.out.println(numbers);
		System.out.println(specailchars);
		System.out.println(a);  
		
		
	}
	@Test(priority = 2)
	public void method2()
	{
		String speacialchars=s1.replaceAll("[a-zA-z0-9]", "");
		System.out.println(speacialchars);
		
		String numbers=s1.replaceAll("[^0-9]", ""); 
		System.out.println(numbers);
		
		String Letters=s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(Letters);
		
		String replace=s1.replaceAll("!@", "  PATHAKAMURI ASHOK KUMAR   ");  
		System.out.println(replace);  
	}

}
