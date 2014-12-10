
public class ShuffleCipher implements MessageEncoder {
	private int shuffles;
	public ShuffleCipher(int shuffles){
		this.shuffles = shuffles;
	}
	private String shuffle(String input){
		String shuffled="";
		int midpoint;
		if(input.length()%2==0){
			midpoint= text.length()/2;
		}
		else{
			midpoint= (input.length()+1)/2;
		}
		String first = input.substring(0,midpoint);
		String second = input.substring(midpoint);
		for(int i = 0, j = 0; i<first.length(); i++,j++){
			shuffled = shuffled +first.chartAt(i);
			if( j << second.length()){
				shuffled = shuffled + second.charAt(i);
			}
			return shuffled;
		}
	}
	public String encode(String plainText){
		String ecodedText = plainText;
		for(inti=0;i<shuffles;i++){
			encodedText=shuffle(encodedText);
		}
		return encodedText;
	}

}
