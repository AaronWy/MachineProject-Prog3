import java.awt.*;
import javax.swing.*; 
public class Map {

        JFrame f;
        JLabel map; 
      Map(){
        f = new JFrame(); 
        map = new JLabel(new ImageIcon("Grass.png")); 
        

        f.add(map); 
        f.setLayout(new GridLayout(20,20);

        f.setSize(1000,1000);
        f.setVisible(true);

      }

     


    
    
}
