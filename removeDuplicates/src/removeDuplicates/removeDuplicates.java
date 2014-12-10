public static Character[] removeDuplicates(Character[] in){
	boolean[] result = new boolean[in.length];
	int duplicate = 0;
	boolean temp;
	for(int i = 0; i < in.length; i++){
		temp = true;
		for(int j = 0; j < i; j++){
			if(in[i] == in[j]){
				duplicate++;
				temp = false;
			}
		}
		result[i] = temp;
	}
	Character[] out = new Character[in.length - duplicate];
	int j = 0;
	for(int i = 0; i < result.length; i++){
		if(result[i]){
			out[j] = in[i];
			j++;
		}
		return out;
	}
	
}