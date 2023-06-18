package trunfopokemon;

import CrudRecorde.PlayerDAO;

public class InterfaceJogo extends javax.swing.JFrame {

    Player player = new Player();
    Computador pc = new Computador();
    Utilidade util = new Utilidade();
    Carta carta[] = new Carta[152];
    pegarPokemons pegar = new pegarPokemons();
    

    public InterfaceJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoCarta = new javax.swing.JButton();
        PokemonName = new javax.swing.JLabel();
        BotaoPeso = new javax.swing.JButton();
        BotaoAtaque = new javax.swing.JButton();
        BotaoTamanho = new javax.swing.JButton();
        TxtPeso = new javax.swing.JLabel();
        TxtAttak = new javax.swing.JLabel();
        TxtTamanho = new javax.swing.JLabel();
        TxtVidas = new javax.swing.JLabel();
        TxtPontos = new javax.swing.JLabel();
        TxtPkPc = new javax.swing.JLabel();
        BotaoProxRodada = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        TFnome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        BotaoCarta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoCarta.setText("Pegar carta");
        BotaoCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCartaActionPerformed(evt);
            }
        });

        PokemonName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PokemonName.setMinimumSize(new java.awt.Dimension(306, 32));
        PokemonName.setPreferredSize(new java.awt.Dimension(306, 32));

        BotaoPeso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoPeso.setText("Peso");
        BotaoPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoPesoMouseClicked(evt);
            }
        });

        BotaoAtaque.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoAtaque.setText("Ataque");
        BotaoAtaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAtaqueMouseClicked(evt);
            }
        });

        BotaoTamanho.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoTamanho.setText("Tamanho");
        BotaoTamanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoTamanhoMouseClicked(evt);
            }
        });

        TxtPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TxtPeso.setMinimumSize(new java.awt.Dimension(486, 24));

        TxtAttak.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TxtAttak.setMinimumSize(new java.awt.Dimension(486, 24));

        TxtTamanho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TxtTamanho.setMinimumSize(new java.awt.Dimension(486, 24));

        TxtVidas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtVidas.setAlignmentY(0.0F);

        TxtPontos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        TxtPkPc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TxtPkPc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TxtPkPc.setMinimumSize(new java.awt.Dimension(306, 32));

        BotaoProxRodada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoProxRodada.setText("Proxima rodada");
        BotaoProxRodada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoProxRodadaMouseClicked(evt);
            }
        });
        BotaoProxRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProxRodadaActionPerformed(evt);
            }
        });

        BotaoSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSalvarMouseClicked(evt);
            }
        });
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSairMouseClicked(evt);
            }
        });
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        TFnome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TFnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PokemonName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoSair))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoProxRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoSalvar)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(TxtVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TxtPkPc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addComponent(TxtAttak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoTamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoAtaque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PokemonName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPkPc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoPeso)
                    .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoTamanho))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoAtaque)
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(TxtVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtAttak, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoProxRodada)
                            .addComponent(BotaoSalvar)
                            .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoCarta)
                            .addComponent(BotaoSair))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCartaActionPerformed
    pegar.getPokemons();
    carta[player.getCarta()] = new Carta(pegar.getId(),pegar.getName(),pegar.getHeight(),pegar.getWeight(),pegar.getAttack());
    pegar.getPokemons();
    carta[pc.getCarta()] = new Carta(pegar.getId(),pegar.getName(),pegar.getHeight(),pegar.getWeight(),pegar.getAttack());
    
    TxtVidas.setText("Vidas: " + String.valueOf(player.getVidas()));
    TxtPontos.setText("Pontos: " + String.valueOf(player.getPontos()));
    
    PokemonName.setVisible(true);
    PokemonName.setText("Sua Carta: " + carta[player.getCarta()].getName());   
    
    carta[player.getCarta()].getDescricao();
    
    BotaoCarta.setVisible(false);
    util.setBotaoVisivel(true);
    }//GEN-LAST:event_BotaoCartaActionPerformed

    private void BotaoPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoPesoMouseClicked
        util.setBotaoVisivel(false);
        util.setTxt();
        int i = util.comp(carta[player.getCarta()].getWeight(), carta[pc.getCarta()].getWeight());
        TxtPkPc.setVisible(true);
        TxtPkPc.setText("Carta do Pc: " + carta[pc.getCarta()].getName());
        
        switch(i){
            case 1:
                TxtTamanho.setText("O seu pokemon e mais pesado! " + carta[player.getCarta()].getWeight() + " Kg  >  " + carta[pc.getCarta()].getWeight() + "Kg");
                TxtTamanho.setVisible(true);
                player.maisPontos();
                BotaoProxRodada.setVisible(true);
        break;
            case 2:
                TxtTamanho.setText("O seu pokemon e mais leve! " + carta[player.getCarta()].getWeight() + " Kg  <  " + carta[pc.getCarta()].getWeight() + "Kg");
                TxtTamanho.setVisible(true);
                player.menosVida();
                BotaoProxRodada.setVisible(true);
        break;
            case 3:
                TxtTamanho.setText("O seu pokemon tem o mesmo peso! " + carta[player.getCarta()].getWeight() + " Kg  =  " + carta[pc.getCarta()].getWeight() + "Kg");
                TxtTamanho.setVisible(true);
                BotaoProxRodada.setVisible(true);
        break;
        }
        
    }//GEN-LAST:event_BotaoPesoMouseClicked

    private void BotaoTamanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoTamanhoMouseClicked
        util.setBotaoVisivel(false);
        util.setTxt();
        int i = util.comp(carta[player.getCarta()].getHeight(),carta[pc.getCarta()].getHeight());
        TxtPkPc.setVisible(true);
        TxtPkPc.setText("Carta do Pc: " + carta[pc.getCarta()].getName());
        
        switch(i){
            case 1:
                TxtTamanho.setText("O seu pokemon e maior! " + carta[player.getCarta()].getHeight() + " centimetros  >  " + carta[pc.getCarta()].getHeight() + " centimetros");
                TxtTamanho.setVisible(true);
                player.maisPontos();
                BotaoProxRodada.setVisible(true);
        break;
            case 2:
                TxtTamanho.setText("O seu pokemon e menor! " + carta[player.getCarta()].getHeight() + " centimetros  <  " + carta[pc.getCarta()].getHeight() + " centimetros");
                TxtTamanho.setVisible(true);
                player.menosVida();
                BotaoProxRodada.setVisible(true);
        break;
            case 3:
                TxtTamanho.setText("Os pokemons tem o mesmo tamanho " + carta[player.getCarta()].getHeight() + " centimetros  =  " + carta[pc.getCarta()].getHeight() + " centimetros");
                TxtTamanho.setVisible(true);
                BotaoProxRodada.setVisible(true);
        break;
        }
    }//GEN-LAST:event_BotaoTamanhoMouseClicked

    private void BotaoAtaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAtaqueMouseClicked
        util.setBotaoVisivel(false);
        util.setTxt();
        int i = util.comp(carta[player.getCarta()].getAttack(),carta[pc.getCarta()].getAttack());
        TxtPkPc.setVisible(true);
        TxtPkPc.setText("Carta do Pc: " + carta[pc.getCarta()].getName());
        
        switch(i){
            case 1:
                TxtTamanho.setText("O seu pokemon tem mais Ataque " + carta[player.getCarta()].getAttack() + "  >  " + carta[pc.getCarta()].getAttack());
                TxtTamanho.setVisible(true);
                player.maisPontos();
                BotaoProxRodada.setVisible(true);
        break;
            case 2:
                TxtTamanho.setText("O seu pokemon tem menos Ataque " + carta[player.getCarta()].getAttack() + "  <  " + carta[pc.getCarta()].getAttack());
                TxtTamanho.setVisible(true);
                player.menosVida();
                BotaoProxRodada.setVisible(true);
        break;
            case 3:
                TxtTamanho.setText("Os pokemons tem o mesmo Ataque " + carta[player.getCarta()].getAttack() + "  =  " + carta[pc.getCarta()].getAttack());
                TxtTamanho.setVisible(true);
                BotaoProxRodada.setVisible(true);
        break;
        }
    }//GEN-LAST:event_BotaoAtaqueMouseClicked

    private void BotaoProxRodadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoProxRodadaMouseClicked
        util.setTxt();
        PokemonName.setText("");
        TxtPkPc.setText("");
        BotaoProxRodada.setVisible(false);
        TxtVidas.setText("Vidas: " + String.valueOf(player.getVidas()));
        TxtPontos.setText("Pontos: " + String.valueOf(player.getPontos()));
        if(player.getVidas()>0){
        BotaoCarta.setVisible(true);
        player.setCarta();
        pc.setCarta();
        }else{
            util.setTxt();
            TxtTamanho.setText("Suas vidas acabaram! sua pontuação foi de: " + player.getPontos());
                if(player.getPontos()>1){
                    TxtAttak.setText("Salve sua pontuação!");
                    BotaoSalvar.setVisible(true);
                    TFnome.setVisible(true);
                }else{
                    BotaoSair.setVisible(true);
                }
        
        }
    }//GEN-LAST:event_BotaoProxRodadaMouseClicked

    private void BotaoProxRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProxRodadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoProxRodadaActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseClicked
        BotaoSair.setVisible(true);
        Recorde recorde = new Recorde(player.getPontos(),TFnome.getText());
        TxtAttak.setText("Recorde salvo!");
        BotaoSalvar.setVisible(false);
        TFnome.setVisible(false);
        
        PlayerDAO DAO = new PlayerDAO();
        DAO.save(recorde);
    }//GEN-LAST:event_BotaoSalvarMouseClicked

    private void BotaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseClicked
        util.menu(true);
        util.jogo(false);
        player.setPontos(0);
        player.setVidas(3);
        util.setTxtVisivel(false);
        BotaoSair.setVisible(false);
        BotaoCarta.setVisible(true);
    }//GEN-LAST:event_BotaoSairMouseClicked

    private void TFnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnomeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BotaoAtaque;
    private javax.swing.JButton BotaoCarta;
    public static javax.swing.JButton BotaoPeso;
    public static javax.swing.JButton BotaoProxRodada;
    public static javax.swing.JButton BotaoSair;
    public static javax.swing.JButton BotaoSalvar;
    public static javax.swing.JButton BotaoTamanho;
    private javax.swing.JLabel PokemonName;
    public static javax.swing.JTextField TFnome;
    public static javax.swing.JLabel TxtAttak;
    public static javax.swing.JLabel TxtPeso;
    public static javax.swing.JLabel TxtPkPc;
    public static javax.swing.JLabel TxtPontos;
    public static javax.swing.JLabel TxtTamanho;
    public static javax.swing.JLabel TxtVidas;
    // End of variables declaration//GEN-END:variables
}
