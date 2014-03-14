/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recortes_de_imagenes;

/**
 *
 * @author Max Enrique
 */
import recortes_de_imagenes.Expositororiginal;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Original extends javax.swing.JPanel {
// Cargamos la imagen original 
    public ImageIcon photo;       
    String URLIMA;
    
     public Original(GetSetImagen obj){
    
    try{URLIMA=obj.getImagen();
    //System.out.print("Original..."+URLIMA);
    ImageIcon objimagen;
        
                if(URLIMA==null){
                    JOptionPane.showMessageDialog(null, "Falta Cargar Imagen");
                }
                else{
                    objimagen= new ImageIcon(URLIMA);
                    photo = objimagen; 
                    
                }
                
     }
    catch(Exception e)
    {
     
     }
    }
    
    public Original(){
//    photo = Expositororiginal.createImage("lily.jpg"); 
    
    }
    
      

    @Override
    public void paint(Graphics g) {
        
         try{
                g.drawImage(photo.getImage(), 0, 0, null);
// Pintamos el resto de componentes
        super.paint(g);
     }catch(Exception e){
     
     }
    }
}