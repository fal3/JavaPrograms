
public static boolean isStrictlyIncreasing(double[] in)
{
	for(int i = 0; i < in.length -1; i++){
		if(in[i] >= in[i + 1]){
			return false;
		}
	return true;
}
