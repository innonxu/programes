package good_practice;

public class CountLettersInArray {
	public static void main(String args[]){
		char str[]= new char[100];
		int count[] = new int[26];
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=RandomCharacter.getRandomLowerCaseLetter();
			count[str[i]-'a']++;
		
		}
		
		for(int i =0;i<count.length;i++)
		{
			System.out.print((char)('a'+i)+" : "+count[i]);
			System.out.print("  ");
			if(i%5==0)
				System.out.println();
		}
		
		
	}

}
