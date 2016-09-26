/* package whatever; // */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Decryption
{
	public static void main (String[] args) throws java.lang.Exception
	{
    /* The cipher you received from encryption */
		String s = "1B151511584E461A0B07020F16410C0002400C0C163E0B57";
		int len = s.length();
      byte[] r = new byte[len / 2];
      for (int i = 0; i < r.length; i++) {
          int digit1 = s.charAt(i * 2), digit2 = s.charAt(i * 2 + 1);
          if (digit1 >= '0' && digit1 <= '9')
              digit1 -= '0';
          else if (digit1 >= 'A' && digit1 <= 'F')
              digit1 -= 'A' - 10;
          if (digit2 >= '0' && digit2 <= '9')
              digit2 -= '0';
          else if (digit2 >= 'A' && digit2 <= 'F')
              digit2 -= 'A' - 10;
 
          r[i] = (byte) ((digit1 << 4) + digit2);
      }
      String newStr = new String(r, "UTF-8");
      String key = "sambosivasambo";
	  char[] msg = newStr.toCharArray();
	  char temp;
	  StringBuilder cipher = new StringBuilder();
	  for(int i=0, l = msg.length, l1 = key.length()-1; i < l; i++) {
		  temp = key.charAt(l1 % (i+1));
		  cipher.append((char)(temp ^ msg[i]));
	  }
 		System.out.println(" cipher : " + cipher.toString());
	}
}
