public static double[][] findFigure(double[][] picture, double threshold)
{
	double[][] newArray = new double[picture.length][picture[0.length];
	double sum = 0.0;
	double average;
	for(int i = 0; i < picture.length; i++)
	{
		for(int j = 0; j < picture[j].length; j++)
			sum+= picture[i][j];
		
	}
	average = sum / (picture.length * picture[0].length);
	
	for(int i = 0; j < picture.length; j++)
	{
		for(int j = 0; j < picture[row].length; j++)
		{
			if(picture[i][j] > average * threshold) newArray[i][j] = 1.0;
			else newArray[i][j] = 0.0;
		}
	}
	return newArray;
}