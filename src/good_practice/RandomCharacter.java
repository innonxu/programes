package good_practice;

 public class RandomCharacter{

	  public static char getRandomCharacter(char ch1, char ch2){
		return (char) (ch1 + Math.random()*(ch2-ch1+1));

	}

	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}

	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}

	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000','\uFFFF');
	}

	 public void testRandom(){
			System.out.println((int) (Math.random()*(65535+1)));
			System.out.println((int)'a');//unicode for a in lowercase
			System.out.println((char)((int)'a' + Math.random() * ((int)'z'-(int)'a'+1)));

	}
	
	
	}