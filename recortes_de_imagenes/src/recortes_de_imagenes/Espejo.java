            /*
             * To change this template, choose Tools | Templates
             * and open the template in the editor.
             */
            package recortes_de_imagenes;

            /**
             *
             * @author Max Enrique
             */
            import java.awt.Graphics;
            import java.awt.Image;
            import javax.swing.ImageIcon;
            import javax.swing.JOptionPane;
            import javax.swing.JPanel;
            public class Espejo extends JPanel {
            // Cargamos la imagen original
            //    private ImageIcon photo = Expositororiginal.createImage("lily.jpg");
            //
            //    Espejo(GetSetImagen obj) {
            //        throw new UnsupportedOperationException("Not yet implemented");
            //    }
                 public ImageIcon photo;       
                String URLIMA;

                 public Espejo(GetSetImagen obj){

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

                public Espejo(){
            //    photo = Expositororiginal.createImage("lily.jpg"); 

                }

                @Override
                public void paint(Graphics g) {
            // Imagen
                    Image img = photo.getImage();
                    int width = photo.getIconWidth();
                    int height = photo.getIconHeight();
            // Rotamos la imagen
                    g.drawImage(img, 0, 0, width, height, 0, height, width, 0, null);
            // Pintamos el resto de componentes
                    super.paint(g);
                }
            }