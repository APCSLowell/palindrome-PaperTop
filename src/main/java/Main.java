

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
	}
	public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  if (clean(word).equals(reverse(word))){
    return true;
  }
  else {
    return false;
  }
}
public String reverse(String str)
{
    String sNew = new String();
    //your code here
    str = clean(str);
    for (int i = str.length() - 1; i >= 0; i--){
      sNew += str.substring(i, i + 1);
    }
    return sNew;
}
public String clean(String str){
  String cleanStr = new String();
  for (int i = 0; i < str.length(); i++){
    if (Character.isLetter(str.charAt(i))){
      cleanStr += str.substring(i, i + 1);
    }
  }
  return cleanStr.toLowerCase();
}

}

