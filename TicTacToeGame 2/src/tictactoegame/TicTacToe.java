/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package tictactoegame;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author jkp
 */
public class TicTacToe extends javax.swing.JFrame {

    ImageIcon X = new ImageIcon(getClass().getResource("X.png"));
    ImageIcon O = new ImageIcon(getClass().getResource("O.png"));
    
    char board[][] = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };
    
    boolean flag = true;
    boolean turn = false;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
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

        jLabel1 = new javax.swing.JLabel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Luminari", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Tic Tac Toe");

        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn00, 00);
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn00, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
              
            }
        
          turn = !turn;
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn01, 01);
            turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn01, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
               turn = !turn;  
            }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn02, 02);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn02, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
            turn = !turn;     
            }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn10, 10);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn10, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
                turn = !turn;  
              
            }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn11, 11);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn11, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
               turn = !turn;  
            }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn12, 12);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn12, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
              turn = !turn;    
              
            }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn20, 20);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn20, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               turn = !turn;   
              
            }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn21, 21);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn21, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
               turn = !turn;  
            }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        if(turn){
            select(this.btn22, 22);
             turn = !turn;  
        }else{
            
             Random rand = new Random();
             int check = 0;
            
            while(check == 0){
                
                   int row = rand.nextInt(3);
                   int column = rand.nextInt(3);

                    String r = Integer.toString(row);
                    String c = Integer.toString(column);

                    int finalNumber = Integer.parseInt(r.concat(c));
                    
                    if(board[row][column] == 'X' || board[row][column] == 'O'){
                        check = 0;
                    }else{
                       select(this.btn22, finalNumber);   
                       
                       computerPlay(row, column, finalNumber);                  
                       
                       check = 1;
                    }
               }
               
               turn = !turn;  
            }
    }//GEN-LAST:event_btn22ActionPerformed

    public void computerPlay(int r, int c, int finalNumber){
        
        if(r == 0 && c == 0){
            select(this.btn00, finalNumber); 
            btn00.setEnabled(false);
        }
        
        if(r == 0 && c == 1){
            select(this.btn01, finalNumber);
            btn01.setEnabled(false);
            
        }
         if(r == 0 && c == 2){
            select(this.btn02, finalNumber);
            btn02.setEnabled(false);
        }
        
        if(r == 1 && c == 0){
            select(this.btn10, finalNumber);
            btn10.setEnabled(false);
        }
         if(r == 1 && c == 1){
            select(this.btn11, finalNumber);
            btn11.setEnabled(false);
        }
        
        if(r == 1 && c == 2){
            select(this.btn12, finalNumber);
            btn12.setEnabled(false);
        }
        
         if(r == 2 && c == 0){
            select(this.btn20, finalNumber);
            btn20.setEnabled(false);
        }
        
        if(r == 2 && c == 1){
            select(this.btn21, finalNumber);
            btn21.setEnabled(false);
        }
        
        if(r == 2 && c == 2){
            select(this.btn22, finalNumber);
            btn22.setEnabled(false);
        }
         turn = !turn;  
    }
    
    public void select(JButton btn, int cell){
        int row = cell / 10;
        int col = cell % 10;
        
        if(flag){
            board[row][col] = 'X';
            btn.setIcon(X);
        }else{
            board[row][col] = 'O';
            btn.setIcon(O);
        }
        
        flag = !flag;      
        
        btn.setEnabled(false);
        
        checkWin();
    }
    
    public void checkWin(){
        
        for(int i=0; i<3; i++){
            if(board[i][0] == board[i][1] 
                    && board[i][0] == board[i][2]){
                JOptionPane.showMessageDialog(this, "Player " + board[i][0] + " Wins!");
                
                this.setVisible(false);
                new PlayerInfo().setVisible(true);
                 playUserAgain();
                break;
               
            }
            
            if(board[0][i] == board[1][i] 
                    && board[0][i] == board[2][i]){
                JOptionPane.showMessageDialog(this, "Player " + board[i][0] + " Wins!");
                
                this.setVisible(false);
                new PlayerInfo().setVisible(true);
                playUserAgain();
                 break;
                 
            }
            
            if(board[0][0] == board[1][1] 
                    && board[0][0] == board[2][2]){
                JOptionPane.showMessageDialog(this, "Player " + board[0][0] + " Wins!");
                
                this.setVisible(false);
                new PlayerInfo().setVisible(true);
                playUserAgain();
                 break;
                 
            }
            
            if(board[0][2] == board[1][1] 
                    && board[0][2] == board[2][0]){
                JOptionPane.showMessageDialog(this, "Player " + board[0][2] + " Wins!");
                
                this.setVisible(false);
                new PlayerInfo().setVisible(true);
                 playUserAgain();
                 break;
                
            }
        }
    }
    
    public void playUserAgain(){
        
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
