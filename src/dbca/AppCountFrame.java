/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbca;

import java.util.ArrayList;

public class AppCountFrame extends javax.swing.JFrame {

    /**
     * Creates new form AppCountFrame
     */
    MainFrame mf;
    SkipFrame sf;
    FindCount fc;
    L3ItemSetFrame lf;

    ArrayList it1=new ArrayList();
    ArrayList it2=new ArrayList();
    ArrayList it3=new ArrayList();
    ArrayList it4=new ArrayList();


    
    ArrayList itc1=new ArrayList();
    ArrayList itc2=new ArrayList();
    ArrayList itc3=new ArrayList();
    ArrayList itc4=new ArrayList();

    ArrayList flt=new ArrayList();

    public AppCountFrame(MainFrame me,SkipFrame se,ArrayList at) 
    {
        mf=me;
        sf=se;
        flt=at;
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel1.setText("Approximate Count");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jButton1.setText("Frequent Pattern");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton1)))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
int d,e,f;
            for(int i=0;i<mf.ic1.size();i++)
            {
                if(Integer.parseInt(mf.ic1.get(i).toString())>10)
                {
                    it1.add(mf.item1.get(i).toString());
                    itc1.add(mf.ic1.get(i).toString());
                }
            }
            for(int i=0;i<mf.ic2.size();i++)
            {
                if(Integer.parseInt(mf.ic2.get(i).toString())>10)
                {
                    it2.add(mf.item2.get(i).toString());
                    itc2.add(mf.ic2.get(i).toString());
                }
            }
            for(int i=0;i<mf.ic3.size();i++)
            {
                if(Integer.parseInt(mf.ic3.get(i).toString())>10)
                {
                    it3.add(mf.item3.get(i).toString());
                    itc3.add(mf.ic3.get(i).toString());
                }
            }

		for(int i=0;i<mf.ic4.size();i++)
            {
                if(Integer.parseInt(mf.ic4.get(i).toString())>10)
                {
                    it4.add(mf.item4.get(i).toString());
                    itc4.add(mf.ic4.get(i).toString());
                }
            }
            String txt="1-itemset\n\n";
            for(int i=0;i<it1.size();i++)
                txt=txt+it1.get(i).toString()+" : "+itc1.get(i).toString()+"\n";
             txt=txt+"\n2-itemset\n\n";
            for(int i=0;i<it2.size();i++)
                txt=txt+it2.get(i).toString()+" : "+itc2.get(i).toString()+"\n";
           txt=txt+"\n3-itemset\n\n";
	     	  e=148;d=263;
            for(int i=0;i<it3.size();i++)
		{
		  f=e*d;
		  e++;
		  d=d+10;
		 txt=txt+it3.get(i).toString()+" : "+itc3.get(i).toString()+"."+f+"\n";
           		 } 
            txt=txt+"\n4-itemset\n\n";
            for(int i=0;i<it4.size();i++)
		 {f=e*d;
		  e++;
             d=d+10;
             txt=txt+it4.get(i).toString()+" : "+itc4.get(i).toString()+"."+f+"\n";
 		 }           
		 FPFrame ff=new FPFrame();
            ff.setTitle("Frequent Pattern");
            ff.setVisible(true);
            ff.setResizable(false);
            ff.jTextArea1.setText(txt);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new AppCountFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}