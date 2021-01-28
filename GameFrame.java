import java.awt.event.*;
import javax.swing.*;





//Fox image grab at https://favpng.com/png_view/animation-animation-pixel-art-png/GkRNjjaL



public class GameFrame implements KeyListener {
    
    JFrame frame;
    JLabel foxImage;
    JLabel rabbit; 
   

    int fx=0,fy=0,fctr=0; 
    int rx=50,ry=50; 

    GameFrame(){
        rabbit = new JLabel(new ImageIcon("rabbit.png"));
        foxImage= new JLabel(new ImageIcon("fox.png")); 
        foxImage.setBounds(fx,fy,50,50);
        rabbit.setBounds(rx,ry,50,50);
        frame = new JFrame(); 
        frame.setSize(1000,1000); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.add(foxImage);frame.add(rabbit);
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            fy-=50;
            foxImage.setLocation(fx,fy);
            fctr++; 
            if(fctr == 3)
            {
                fctr= 0; 

            }
        }
        if(key == KeyEvent.VK_DOWN){
            fy+=50;
            foxImage.setLocation(fx,fy);
            fctr++; 
            if(fctr == 3)
            {
                fctr= 0; 
                
            }
        }
        if(key == KeyEvent.VK_LEFT){
            fx-=50;
            foxImage.setLocation(fx,fy);
            fctr++; 
            if(fctr == 3)
            {
                fctr= 0; 
                
            }
        }
        if(key == KeyEvent.VK_RIGHT){
            fx+=50;
            foxImage.setLocation(fx,fy);
            fctr++; 
            if(fctr == 3)
            {
                fctr= 0; 
                
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

   

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    



}
