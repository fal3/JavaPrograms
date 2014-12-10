import java.util.Scanner;
import java.io.*;


public class Appointments {
	public static void main(String[] args){
	Scanner Keyboard = new Scanner(System.in);
	String name;
	String[][] schedule = new String[6][6];
	String time="";
	int count = 0;
	int i,n,j;
	boolean full = false;
	schedule[0][0]="1";
	schedule[1][0]="2";
	schedule[2][0]="3";
	schedule[3][0]="4";
	schedule[4][0]="5";
	schedule[5][0]="6";
	if(count<6){
		System.out.print("Enter the time: ");
		time = Keyboard.nextLine();
		try{
			for(i =0; i < 6; i++){
				if((!time.equals(schedule[i][0])) && (Integer.parseInt(time)) > 6){
					throw new Exception();
				
				}
			}
		}
			
			catch(Exception test){
					System.out.println(test.getMessage());
				}
			}
				for(n = 0; n < 6; n++){
					try{
						if(time.equals(schedule[n][0])){
							if(schedule[n][1]!= null){
								if(!full){
									System.out.print("There are times : ");
									for(j = 0; j < 6; j++){
										if(schedule[j][1]==null)System.out.print(schedule[j][0]);
									
								else{
											throw new Exception();
										}
														   }
									
									}
							else{
									System.out.print("Enter your Name: ");
									name = Keyboard.nextLine();
									schedule[n][1] = name;
									
								}
								}
						}
					}
					}
					
			

					
	
