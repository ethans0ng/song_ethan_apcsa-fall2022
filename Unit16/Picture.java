package classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int gray = (pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3;
        pixelObj.setRed(gray);
        pixelObj.setGreen(gray);
        pixelObj.setBlue(gray);
      }
    }
  }
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(pixelObj.getRed()*3);
      }
    }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width-1; col > width / 2; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
      for (int row = 0; row < pixels.length / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length-row-1][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
      for (int row = pixels.length-1; row > pixels.length / 2; row--)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length-row-1][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel ogPixel = null;
    Pixel reflectedPixel = null;
    int height = pixels.length;
    int width = pixels[0].length;
    if(height<width) {
    	for (int row = height-1; row>=0; row--)
        {
    		for(int i = row-1; i>=0; i--) {
    			ogPixel = pixels[row][i];
    			reflectedPixel = pixels[i][row];
    			reflectedPixel.setColor(ogPixel.getColor());
    		}
    	}
    }
//  if(height>=width) {
//  	for (int row = height-1; row>=0; row--)
//      {
//  		for(int i = row-1; i>=0; i--) {
//  			ogPixel = pixels[row][i];
//  			reflectedPixel = pixels[i][row];
//  			reflectedPixel.setColor(ogPixel.getColor());
//  		}
//  	}
//  } Not needed I guess
}
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	int count=0;
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.print(count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 204;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 156; row < 233; row++)
    {
      for (int col = 105; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        if(leftPixel.getColor().getBlue()<200) rightPixel.setColor(leftPixel.getColor());
      }
    }
    for (int row = 156; row < 200; row++)
    {
      for (int col = 305; col > mirrorPoint; col--)
      {
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row][mirrorPoint-(col - mirrorPoint)];
        if(rightPixel.getColor().getBlue()<200) leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  public void mirrorGull()
  {
    int mirrorPoint = 351;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 233; row < 323; row++)
    {
      for (int col = 236; col < mirrorPoint; col++)
      {
    	  leftPixel = pixels[row][col];      
          rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
          if(leftPixel.getColor().getBlue()<120) rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  public void copy(Picture fromPic, int copyStartR, int copyEndR, int copyStartC, int copyEndC, int startRow, int startCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  Pixel[][] copyFromPixels = new Pixel[copyEndR-copyStartR][copyEndC-copyStartC];
	  for (int row = copyStartR; row < copyEndR; row++)
	  {
		  for (int col = copyStartC; col < copyEndC; col++)
		  {
			  copyFromPixels[row-copyStartR][col-copyStartC] = fromPixels[row][col];
		  }
	  }
	  for (int fromRow = 0, toRow = startRow; fromRow < copyFromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < copyFromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
		  {
			  fromPixel = copyFromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }   
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  Color rightColor = null;
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; 
				  col < pixels[0].length-1; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][col+1];
			  rightColor = rightPixel.getColor();
			  if (leftPixel.colorDistance(rightColor) > 
			  edgeDist)
				  leftPixel.setColor(Color.BLACK);
			  else
				  leftPixel.setColor(Color.WHITE);
		  }
	  }
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Color bottomColor = null;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; 
           row < pixels.length-1; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row+1][col];
        bottomColor = bottomPixel.getColor();
        if (topPixel.colorDistance(bottomColor) > 
            edgeDist)
        	topPixel.setColor(Color.BLACK);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
   Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore(); 
  }
  
} // this } is the end of class Picture, put all new methods before this
