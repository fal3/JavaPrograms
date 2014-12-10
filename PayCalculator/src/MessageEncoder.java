import java.util.Scanner;

public interface MessageEncoder {
	public String encode(String plainText){
		plainText = plainText+"ssss";	
		return plainText;
	}
	
}
