
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class FileUpload {
    public void imageload(){
               BufferedImage bImage = null;
         try {
             File initialImage = new File("C://Users/Rou/Desktop/image.jpg");
             bImage = ImageIO.read(initialImage);

             ImageIO.write(bImage, "gif", new File("C://Users/Rou/Desktop/image.gif"));
             ImageIO.write(bImage, "jpg", new File("C://Users/Rou/Desktop/image.png"));
             ImageIO.write(bImage, "bmp", new File("C://Users/Rou/Desktop/image.bmp"));

         } catch (IOException e) {
               System.out.println("Exception occured :" + e.getMessage());
         }
         System.out.println("Images were written succesfully.");
    }

    
}
