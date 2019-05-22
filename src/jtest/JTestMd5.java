package jtest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;
import com.shopping.common.*;
class JTestMd5 {
	public static String byteHEX(byte ib)
	{
		char[] Digit ={ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		char[] ob = new char[2];
		ob[0] = Digit[(ib >>> 4) & 0X0F];
		ob[1] = Digit[ib & 0X0F];
		String s = new String(ob);
		return s;
	}
	
	public static String calMD5(String str) throws Exception
	{
		MessageDigest digest =MessageDigest.getInstance("MD5");
		byte[] bs = digest.digest(str.getBytes());
		String tmp = "";
		for(int i =0;i<bs.length;i++)
		{
			tmp  += byteHEX(bs[i]);
		}
		return tmp;
	}
	
	
	@Test
	void test() throws Exception {
		assertEquals(calMD5("12345"),EncryptionByMD5.getMD5("12345".getBytes("iso-8859-1")));
		assertEquals("63e780c3f321d13109c71bf81805476e",EncryptionByMD5.getMD5("userpass".getBytes("iso-8859-1")));

	}

}
