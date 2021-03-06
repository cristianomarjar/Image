/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author CristianOmarJar
 */
public class Figuras extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Figuras() {
        initComponents();
    }
    
    
    @Override
    public void paint(Graphics g){
        //Elipse       
        super.paint(g);
        Graphics2D g1 = (Graphics2D)g;
        Ellipse2D e1 = new Ellipse2D.Float(10,35,65,100);
        GradientPaint gp1 = new GradientPaint(3,35,Color.blue,60,110,Color.yellow);
        g1.setPaint(gp1);
        g1.fill(e1);
        
        //Rectangulo               
        Rectangle2D r1 =new Rectangle2D.Float ( 80, 35, 65, 100 ) ;
        g1.setColor(Color.red);
        Stroke pincel =new BasicStroke(4.0f,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
        g1.setStroke(pincel);
        g1.fill(r1);
        
       //Rectangulo                     
      BufferedImage imagenBuf = new BufferedImage( 10, 10,BufferedImage.TYPE_INT_RGB);
      // obtiene objeto Graphics2D de imagenBuf y dibuja en él
      Graphics2D gg = imagenBuf.createGraphics();
      gg.setColor( Color.YELLOW ); // dibuja en color amarillo
      gg.fillRect( 0, 0, 10, 10 ); // dibuja un rectángulo relleno
      gg.setColor( Color.BLACK );  // dibuja en color negro
      gg.drawRect( 1, 1, 6, 6 ); // dibuja un rectángulo
      gg.setColor( Color.BLUE ); // dibuja en color azul
      gg.fillRect( 1, 1, 3, 3 ); // dibuja un rectángulo relleno
      gg.setColor( Color.RED ); // dibuja en color rojo
      gg.fillRect( 4, 4, 3, 3 );
      
       Rectangle2D r2 =new Rectangle2D.Float (0, 0, 10, 10 ) ;
       TexturePaint tp = new TexturePaint(imagenBuf, r2);
       g1.setPaint(tp);                             
       Rectangle2D rt =new Rectangle2D.Float (155, 35, 75, 100 ) ;
       g1.fill(rt);
       
      //Linea
      g1.setColor(Color.GREEN);
      g1.setStroke(new BasicStroke(6.0f));
      Line2D l = new Line2D.Float(395, 35, 320, 150 );
      g1.draw(l);
      
      //Linea       
      Line2D l2 = new Line2D.Float(320, 35, 395, 150);      
      float punteo[]={20,20};
      Stroke pincel2 = new BasicStroke(4,BasicStroke.CAP_SQUARE,BasicStroke.CAP_BUTT,3,punteo,10);
      g1.setStroke(pincel2);
      g1.setColor(Color.BLUE);
      g1.draw(l2);
      
      //Rectangulo
        BufferedImage Bufimage = new BufferedImage( 10, 10,BufferedImage.TYPE_INT_RGB);
      Graphics2D ibuf = Bufimage.createGraphics();
      ibuf.setColor(Color.ORANGE);
      Rectangle2D rec = new Rectangle2D.Float(0,0,5,5);
      ibuf.fill(rec);

       ibuf.setColor(Color.red);
       Rectangle2D rec2 =new Rectangle2D.Float (0, 0, 5, 5 ) ;
       TexturePaint tpaint = new TexturePaint(Bufimage, rec2);
       g1.setPaint(tpaint);                             
       Rectangle2D rect =new Rectangle2D.Float (10,170,120,150) ;
       g1.fill(rect);
       
       //textura img
        Rectangle2D rectan = new Rectangle2D.Float(0,0,50,50);
        Rectangle2D rectan1 = new Rectangle2D.Float(150,175,190,190);
        File imag = new File(("src/recursos/logo_tec.jpg"));
       BufferedImage image = null;

        try {
           image = ImageIO.read(imag);
        }
        catch (IOException e){
            System.out.println("Error al Cargar...");
    }
        
       TexturePaint tp1 = new TexturePaint(image, rectan);
       g1.setPaint(tp1);
       g1.fill(rectan1);
    } 

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
