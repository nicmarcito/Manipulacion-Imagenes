/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recortes_de_imagenes;

/**
 *
 * @author Max Enrique
 */
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Translucida extends JPanel {

//    Translucida(GetSetImagen obj) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
    
     public ImageIcon photo;       
    String URLIMA;
    
     public Translucida(GetSetImagen obj){
    
    try{URLIMA=obj.getImagen();
    JOptionPane.showMessageDialog(this, "ssss: "+URLIMA);
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
    
    public Translucida(){
//    photo = Expositororiginal.createImage("lily.jpg"); 
    
    }
    

    @Override
    public void paint(Graphics g) {
// En este caso tendremos que trabajar con una BufferedImage
        URL imgURL = Expositortranslucida.class.getResource(URLIMA);
        
        File ob = new File(URLIMA);
        BufferedImage img = null;
        try {
            img = ImageIO.read(ob);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int w = img.getWidth(null);
        int h = img.getHeight(null);
// Necesitaremos una imagen auxiliar a la que aplicar un filtro
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics gI = bi.getGraphics();
// Sobre esta imagen dibujaremos la imagen original
        gI.drawImage(img, 0, 0, null);
        Graphics2D g2d = (Graphics2D) g;
// Establecemos la componente alpha de nuestros graficos 50%
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        /* Draw the image, applying the filter */
        g2d.drawImage(bi, null, 0, 0);
// Pintamos el resto de componentes
        super.paint(g);
    }
}