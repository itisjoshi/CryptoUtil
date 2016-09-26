/* package whatever;  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Encryption
{
	public static void main (String[] args) throws java.lang.Exception
  {	
    char[] HEX = new char[]{
	      '0', '1', '2', '3', '4', '5', '6', '7',
	      '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	      
 		String key = "JavaKey"; //Replace with your own key
		char[] msg = "Any text content of your choice. Or the content you want to encrypt".toCharArray();
		char temp;
		StringBuilder cipher = new StringBuilder();
		for(int i=0, l = msg.length, l1 = key.length()-1; i < l; i++) {
 			temp = key.charAt(l1 % (i+1));
 			cipher.append((char)(temp ^ msg[i]));
 		}
 		byte[] byteArray = cipher.toString().getBytes("UTF-8");
 		System.out.println("byteArray: "+ byteArray);
 		  StringBuffer hexBuffer = new StringBuffer(byteArray.length * 2);
      for (int i = 0; i < byteArray.length; i++)
          for (int j = 1; j >= 0; j--)
              hexBuffer.append(HEX[(byteArray[i] >> (j * 4)) & 0xF]);
 		System.out.println(" cipher : " + hexBuffer.toString());
  }
}
