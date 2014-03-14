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
            import java.awt.image.FilteredImageSource;
            import java.awt.image.ImageFilter;
            import java.awt.image.ImageProducer;
            import javax.swing.GrayFilter;
            import javax.swing.ImageIcon;
            import javax.swing.JOptionPane;
            import javax.swing.JPanel;

            public class EscalaDeGrises extends JPanel {
            // Cargamos la imagen original
            //    private ImageIcon photo = Expositororiginal.createImage("lily.jpg");
            //
            //    EscalaDeGrises(GetSetImagen obj) {
            //        throw new UnsupportedOperationException("Not yet implemented");
            //    }




                 public ImageIcon photo;       
                String URLIMA;

                 public EscalaDeGrises(GetSetImagen obj){

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

                public EscalaDeGrises(){
            //    photo = Expositororiginal.createImage("lily.jpg"); 

                }


                @Override
                public void paint(Graphics g) {
            // Imagen
                    Image img = photo.getImage();
            // Filtro de escala de grises
                    ImageFilter filter = new GrayFilter(true, 50);
                    ImageProducer producer = new FilteredImageSource(img.getSource(), filter);
                    ImageIcon newIcon = new ImageIcon(this.createImage(producer));
                    newIcon.paintIcon(this, g, 0, 0);
            // Pintamos el resto de componentes
                    super.paint(g);
                }
            }