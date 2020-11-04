
package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    public GUI(Canvas can) {   
        initComponents();
        Paint.add(can);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        ZoomIn = new javax.swing.JButton();
        ZoomOut = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        ScrollPanel = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        Paint = new javax.swing.JPanel();
        MapImg = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("GUI MAP");

        ZoomIn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ZoomIn.setText("ZoomIn");
        ZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInActionPerformed(evt);
            }
        });

        ZoomOut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ZoomOut.setText("ZoomOut");
        ZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutActionPerformed(evt);
            }
        });

        SearchField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SearchField.setText("Nhập địa chỉ kết thúc");

        Panel.setPreferredSize(new java.awt.Dimension(897, 897));
        Panel.setLayout(null);

        Paint.setOpaque(false);
        Paint.setLayout(new java.awt.BorderLayout());
        Panel.add(Paint);
        Paint.setBounds(-20, -10, 897, 897);

        MapImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/NewMap.png"))); // NOI18N
        MapImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MapImg.setVerifyInputWhenFocusTarget(false);
        Panel.add(MapImg);
        MapImg.setBounds(10, 10, 897, 897);

        ScrollPanel.setViewportView(Panel);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField2.setText("Nhập địa chỉ bắt đầu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(SearchField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ZoomIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ZoomOut))
                    .addComponent(jTextField2))
                .addGap(55, 55, 55)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZoomInActionPerformed

    private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutActionPerformed
        // TODO add your handling code here:
        try {
            int w = MapImg.getWidth();
            int h = MapImg.getHeight();
            File file = new File("/GUI/NewMap.png");
            Image img = ImageIO.read(file);
            ImageIcon icon = ImageIcon(ZoomImage(w - 10, h - 10, img));
            MapImg.setIcon(icon);
        }
        catch (Exception e)
        {

        }
    }//GEN-LAST:event_ZoomOutActionPerformed

    private Image ZoomImage(int w, int h, Image img) {
        BufferedImage buf = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D grf = buf.createGraphics();
        grf.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        grf.drawImage(img, 0, 0, w, h, null);
        grf.dispose();
        return buf;
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MapImg;
    private javax.swing.JPanel Paint;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel Title;
    private javax.swing.JButton ZoomIn;
    private javax.swing.JButton ZoomOut;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private ImageIcon ImageIcon(Image ZoomImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
