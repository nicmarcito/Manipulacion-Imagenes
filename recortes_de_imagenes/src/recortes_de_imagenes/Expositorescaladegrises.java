        /*
         * To change this template, choose Tools | Templates
         * and open the template in the editor.
         */
        package recortes_de_imagenes;

        /**
         *
         * @author Max Enrique
         */
        import java.awt.Color;
        import java.awt.Dimension;
        import java.awt.GridLayout;
        import java.net.URL;
        import javax.swing.ImageIcon;
        import javax.swing.JLabel;
        import javax.swing.JPanel;

        public class Expositorescaladegrises extends JPanel {

            /**
             * Constructor.
             */
            public Expositorescaladegrises() {
                /*
                 * Creamos un layout de 4 paneles, en cada uno mostraremos una imagen
                 * "aparentemente" distinta
                 */
                super(new GridLayout(1, 1));
               // setPreferredSize(new Dimension(800, 100));
        // Los paneles con las imagenes
        //        Original original = new Original();
                EscalaDeGrises escalaDeGrises = new EscalaDeGrises();
                //Espejo espejo = new Espejo();
                //Translucida translucida = new Translucida();
        //        Dimension photoDimension = new Dimension(400, 267);
        //        original.setPreferredSize(photoDimension);
                //escalaDeGrises.setPreferredSize(photoDimension);
                //espejo.setPreferredSize(photoDimension);
                //translucida.setPreferredSize(photoDimension);
        //        original.setOpaque(false);
                  escalaDeGrises.setOpaque(false);
                //espejo.setOpaque(false);
                //translucida.setOpaque(false);
        // Etiquetas
                //JLabel originalLabel = new JLabel("ESPEJO");
                JLabel escalaDeGrisesLabel = new JLabel("ESCALA DE GRISES");
                //JLabel espejoLabel = new JLabel("ESPEJO");
                //JLabel translucidaLabel = new JLabel("TRANSLUCIDA");
                //originalLabel.setForeground(Color.BLACK);
                escalaDeGrisesLabel.setForeground(Color.BLACK);
                //espejoLabel.setForeground(Color.BLACK);
                //translucidaLabel.setForeground(Color.BLACK);
                //original.add(originalLabel);
                escalaDeGrises.add(escalaDeGrisesLabel);
                //espejo.add(espejoLabel);
                //translucida.add(translucidaLabel);
                //this.add(espejo);
                this.add(escalaDeGrises);
                //this.add(espejo);
                //this.add(translucida);
            }

            public Expositorescaladegrises(GetSetImagen obj) {
                /*
                 * Creamos un layout de 4 paneles, en cada uno mostraremos una imagen
                 * "aparentemente" distinta
                 */
                super(new GridLayout(1, 1));
               // setPreferredSize(new Dimension(800, 100));
        // Los paneles con las imagenes
        //        Original original = new Original();
                EscalaDeGrises escalaDeGrises = new EscalaDeGrises(obj);
                //Espejo espejo = new Espejo();
                //Translucida translucida = new Translucida();
        //        Dimension photoDimension = new Dimension(400, 267);
        //        original.setPreferredSize(photoDimension);
                //escalaDeGrises.setPreferredSize(photoDimension);
                //espejo.setPreferredSize(photoDimension);
                //translucida.setPreferredSize(photoDimension);
        //        original.setOpaque(false);
                  escalaDeGrises.setOpaque(false);
                //espejo.setOpaque(false);
                //translucida.setOpaque(false);
        // Etiquetas
                //JLabel originalLabel = new JLabel("ESPEJO");
                JLabel escalaDeGrisesLabel = new JLabel("ESCALA DE GRISES");
                //JLabel espejoLabel = new JLabel("ESPEJO");
                //JLabel translucidaLabel = new JLabel("TRANSLUCIDA");
                //originalLabel.setForeground(Color.BLACK);
                escalaDeGrisesLabel.setForeground(Color.BLACK);
                //espejoLabel.setForeground(Color.BLACK);
                //translucidaLabel.setForeground(Color.BLACK);
                //original.add(originalLabel);
                escalaDeGrises.add(escalaDeGrisesLabel);
                //espejo.add(espejoLabel);
                //translucida.add(translucidaLabel);
                //this.add(espejo);
                this.add(escalaDeGrises);
                //this.add(espejo);
                //this.add(translucida);
            }

            /**
             * Para recuperar una imagen de un archivo...
             *     
        * @param path Ruta de la imagen relativa al proyecto
             * @return una imagen
             */
            public static ImageIcon createImage(String path) {
                URL imgURL = Expositorescaladegrises.class.getResource(path);
                if (imgURL != null) {
                    return new ImageIcon(imgURL);
                } else {
                    System.err.println("Couldn't find file: " + path);
                    return null;
                }
            }

        //    Expositorescaladegrises(GetSetImagen ori) {
        //        throw new UnsupportedOperationException("Not yet implemented");
        //    }
        }