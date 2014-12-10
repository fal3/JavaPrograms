
public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	public SubstitutionCipher(int shiftBy){
		shift = shiftBy;
	}
	public String encode(String plainText){
		String encoded="";
		for (int i =0; i<plainText.length();i++){
			char n = plainText.charAt(i);
			encoded = encoded + shift(n,shift);
		}
		return encoded;
	}
}

private char shift(char n, int shiftSpot){
	char shiftN = n;
	if (n >='a' && n <='z'){
		shiftN = (char) ('A'+ (n-'A'+shiftN)%26);
	}
	shiftN;
}
