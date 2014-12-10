public static int[] remove(intv, int[] in){
	int count;
	count = 0;
	for(int i=0; i < in.length; i++){
		if(in[index]==v)count++;
	}
	int[] out = new int[in.length - count];
	int position;
	position=0;
	for(int j = 0; j < in.length; j++){
		if(in[j] != v)
		{
			out[position] = in[index];
			position++;
		}
	}
	return out;
}