import java.util.ArrayList;
import java.io.*;
import java.awt.List;

public class Assignment 
{
	int assignmentId = 0;
	int courseId = 0;
	String assignmentName = "";
	int possiblePoints = 0;
	ArrayList<Score> scores = new ArrayList<Score>();
	
	public int getId() 
	{
		return assignmentId;
	}
	public int getCourse()
	{
		return courseId;
	}
	public String getPoints()
	{
		return assignmentName;
	}
	public ArrayList<Score> getScores()
	{
		return scores;
	}
	void setScore(Student s, int score)
	{
		Score tempScore = Score(s.getID(), score);
		
	}
	
	
	
}
