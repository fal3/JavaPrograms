import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import processing.core.PVector;
import fontastic.FGlyph;
import fontastic.Fontastic;

public class WriteSpecies {

	public static void main(String[] args) {
	 
		PApplet applet = new PApplet();
		Fontastic f = null;
		
		PImage img = null; // Declaring a variable of type PImage
		File outputImage = null;
		try{ // testing to see if the output of SplitImage is found, these should be the chunk images 
		
		outputImage = new File("ExampleFont2.png"); // not needed for loadImage or Pvectors at the moment
	   // but going to need for conversation later on, since we can no directly access pvector with bufferedImage 
		// might as well test now with the loadimage, if one fails the other will surely fail 
		
		//created a method called image 
		img=loadImage("ScriptTemplate0.png"); // Make a new instance of a PImage by loading an image file
		
		//coordinates of the image at (0,0)
		image(img, 0, 0);
		}
		catch(Exception e){ // error message, something went wrong with the file 
			//most likely split image was not run first
			//something wrong with the name, case sensitive 
			//refresh and try again	
			System.out.println("An error occured while trying to location your images");
			System.out.println("Pleas ensure your images are in the right location and try again");
			System.out.println("You need to make sure you run 'Split Image' was run first");
			System.exit(0);
		}
         
		File outputFolder = null;
		try { // going to create output folder now 
			
			// Fontastic is no different than a String, but used for folder names and fonts in this case 
			f = new Fontastic(applet, "ExampleFont2"); // Create a new Fontastic object
													
			
			f.setAuthor("Andreas Koller"); // Set author name - will be saved in
											// TTF file too
			
			String output = "ExampleFont2"; // I want to find the location of the output folder 
			// so call the string on the file, then use getAbsolutePath() on the file 
			 outputFolder = new File(output);
			System.out.println("Output folder has been created at: " + outputFolder.getAbsolutePath()); // location of the output folder
			// also suggest success, output folder was made 
		} catch (Exception ex) { // error message of output folder was not made correctly

			System.out.println("An Error occured while trying to make output folder, plesae try again, Thanks");
			System.exit(0);

		}
		
		// if no exceptions occur until this point, means image was successfully loaded, and output folder was successfully made 
		// next need to load the image into a PVector
		
		
		//here might start causing issues with conversion 
		// conversation has not started yet
		// but we are preparing for it now 
		// goal right now is to successfully create a buffered image so we can get the width and the height of each image 
		
		FileInputStream picture = null;
		
		try { // testing to ensure that the that out outputImages  from Split Images can be read in the InputStream ( bytes of fata )
			picture = new FileInputStream(outputImage);
			// actually read the file in bytes
			// outputImage is the file name "ScriptTemplate0.png"
			//call outputImage it on FileInputStream
			System.out.println("File was successful readin!");
		} catch (FileNotFoundException e) {
			System.out.println("Error occured, File could not be read, please try again ");
			System.out.println("Most likly files are not in the correct location, pleas ensure they are at: " + outputImage.getAbsolutePath());
			e.printStackTrace();
			System.exit(0);
		} 
		
		
		
		BufferedImage readImage = null; // Initialing a BufferedImage  
		try { // want to test to ensure a buffered image can be create successfully 
			readImage = ImageIO.read(picture); // readImage the variable we declared is now being used to read picture
			// picture = FileInputStream  which = outputImage which = our split up image 
			System.out.println("A BufferedImage was succesfuly made, Congrats!");
			System.out.println("Conversation can now begin!");
		} catch (IOException e) { // fail case 
			System.out.println("Error occured while trying to create a BufferedImage, please try again");
			System.out.println("Check to ensure that FileInputStream is corrrect;");
			e.printStackTrace();
			System.exit(0);
		} // code works perfect to this part, no issues after testing
		// if any errors occur, it will be with the code below
		// but BufferedImage has been successful made 
	
		// now able to read all image data via readImage 
		// called it on picture which was the FileInputStream 
		
		
		
		
		//Converts an image into a point set of dimension 1
		
		// don't forget 'readImage' is the bufferedImage 
		// we can not use the function .getWidth(), and getHeight(), directly on the PImage 
		//but since the images height and width are the same, we can  use a bufferedImage to determine the height and the width 
		int width = readImage.getWidth();    // remember these are predetermined by java 
		int height = readImage.getHeight();
		
		int nb_pixels = width * height; // full picture, should gives us the pixels of the image 
		
		PVector[] pixels   = new PVector[nb_pixels]; // create a vector array from pixels
		// this code right here might cause issues
		//need to pay close attention 
        
        
		PVector[] points = new PVector[4]; // Define a PVector array containing
											// the points of the shape
		
		pixels = points; // let see if this is possible, want to make the pixels equal to the points 
		// because pixels contains info for the image 
		
		points[0] = new PVector(0, 0); // Start at bottom left
		points[1] = new PVector(10, 0); // The normal width is 512, the normal
											// height 1024 
		points[2] = new PVector(254, 888); // y coordinates are from bottom to
											// top!
		points[3] = new PVector(0, 500);

		FGlyph g = f.addGlyph('a'); // Assign contour to character A
		
		g.addContour(points);
	

		f.buildFont(); // Build the font resulting in .ttf and .woff files
						// and a HTML template to preview the WOFF
		f.cleanup();
		
		/*String nameTTF = f.getTTFfilename() ;
		File ttf = new File(nameTTF);
		//System.out.println("Font has now been created, please go check it out at:" + ttf.getAbsolutePath() );*/

	}


	private static void image(PImage img, int i, int j) {
		img=loadImage("ExampleFont2.png");
		i = 0;
		j = 0;
	}

	private static PImage loadImage(String string) {
		string = "ExampleFont2.png";
		File file = new File(string);
		System.out.println("Success");
		System.out.println("Found file location at:" + file.getAbsolutePath());
		return null;
	}
	
	
	
}