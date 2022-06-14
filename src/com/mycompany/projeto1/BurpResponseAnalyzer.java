package com.mycompany.projeto1;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.UIManager;


public class BurpResponseAnalyzer extends javax.swing.JFrame {
    // Diretórios PADRÃO
    public static String path = "D:\\burp\\5teste";
    public static String planVetor = "C:\\Users\\ADM-01\\Desktop\\estoque 29-11.xls";
    public static String planML = "C:\\Users\\ADM-01\\Desktop\\26-11";
    private static DefaultListModel dlmLeft = new DefaultListModel();
    private static DefaultListModel dlmRight = new DefaultListModel();
    
    public static String resposta = path + "\\resposta.xls";
    public int numero = 0;

    public BurpResponseAnalyzer() {
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaLeft = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlListaRight = new javax.swing.JList<>();
        jbRight = new javax.swing.JButton();
        jbLeft = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtfItemLista = new javax.swing.JTextField();
        botao2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burp Attack Analizer");
        setAlwaysOnTop(true);

        jLabel3.setText(" Selecione o Banco de Dados (BurpSuit Responses)");

        txtFile.setText("C:\\\\Users\\\\ADM-01\\\\Desktop\\\\burp\\\\Retirar EAN + MLB");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 51));
        jButton1.setText("procurar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlListaLeft.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-", "-", "-", "-", "-", "-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaLeftMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlListaLeft);

        jlListaRight.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-", "-", "-", "-", "-", "-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaRightMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlListaRight);

        jbRight.setBackground(new java.awt.Color(255, 255, 255));
        jbRight.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbRight.setForeground(new java.awt.Color(255, 102, 51));
        jbRight.setText(">>");
        jbRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRightMouseExited(evt);
            }
        });
        jbRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRightActionPerformed(evt);
            }
        });

        jbLeft.setBackground(new java.awt.Color(255, 255, 255));
        jbLeft.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbLeft.setForeground(new java.awt.Color(255, 102, 51));
        jbLeft.setText("<<");
        jbLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLeftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLeftMouseExited(evt);
            }
        });
        jbLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRight)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLeft)
                    .addComponent(jbRight))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfItemLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfItemListaActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(255, 255, 255));
        botao2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 102, 51));
        botao2.setText("Planilhar Banco de Dados");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao2MouseExited(evt);
            }
        });
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Caracteres a ignorar");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2, null, null, 1));

        jLabel5.setText("Caractere separador");

        jTextField1.setText("\t");

        jLabel6.setText("Formato do arquivo");

        jTextField2.setText(".xls");

        jTextField3.setText(", ");

        jLabel8.setText("Capturar repetições");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfItemLista, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfItemLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto1/wall e icon.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("       Burp Response Analyzer 3.7");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String FindDestroy(String TextoInit, String Palavra){
    int caracteresdestruir;
        
        String retorno = null;

        //System.out.println("TestoInit: " + TextoInit);
        //System.out.println("palavra: " + Palavra);
        //System.out.println("TextoInit.indexOf(Palavra): " + TextoInit.indexOf(Palavra));
            if(TextoInit.indexOf(Palavra) != -1){

                    caracteresdestruir = TextoInit.indexOf(Palavra) + Palavra.length() + Integer.parseInt(jSpinner1.getValue().toString());
                    System.out.println("caracteres destruir: " + Integer.parseInt(jSpinner1.getValue().toString()));
                    //System.out.println("caracteres a destruir: " + caracteresdestruir);

                    retorno = TextoInit.substring(caracteresdestruir);
                    //System.out.println("String depois: " + retorno);
                    
                    jLabel2.setText("ACHEI");

                    } else{  jLabel2.setText("NÃO ACHEI");
                        retorno = null;
            }

        return retorno;
    } 
    
    public String FindReturn(String TextoInit, String Palavra){
    int caracteresdestruir;
    String retorno = null;
    String respostaa ;

            if(TextoInit.indexOf(Palavra) != -1){

                    caracteresdestruir = TextoInit.indexOf(Palavra);
                    //System.out.println("caracteres a destruir: " + caracteresdestruir);

                    respostaa = TextoInit.substring(0, caracteresdestruir);
                    //System.out.println("String depois: " + retorno);
                    jLabel2.setText("ACHEI");

                    retorno = respostaa;
                    } 

            else{  jLabel2.setText("NÃO ACHEI");
                        retorno = null;
            }

        return retorno;
    } 
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar o diretório");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int escolha = fileChooser.showOpenDialog(this);
        
        if(escolha == JFileChooser.APPROVE_OPTION ){
            File file = fileChooser.getSelectedFile();
            txtFile.setText(file.getPath());
            path = file.getPath();
            resposta = path + "\\resposta" + jTextField2.getText();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        numero = 0;
        try {
            File createRespostaa = new File(resposta);
            File arquivo2 = new File(path + "\\retorno.txt");
            createRespostaa.delete();
            arquivo2.delete();
            createRespostaa.createNewFile();
            arquivo2.createNewFile();

            File pasta = new File(path);

            int contador = 0;
            File[] lista = pasta.listFiles();
            for(File file:lista) {
                if(file.isFile()) {
                    contador ++;
                }
            }

            ArrayList<String> newList = new ArrayList<>();
            ArrayList<String> termos = new ArrayList<>();
            
            
            int index = dlmLeft.size();
            
            for(int i = 0; i < index; i++) {
                termos.add(dlmLeft.get(i).toString());
                System.out.println("index:" +i + "Termos: "+ termos.get(i));
            }
            
            ArrayList<String> termosFim = new ArrayList<>();

            for(int i = 0; i < index; i++) {
                termosFim.add(dlmRight.get(i).toString());
                System.out.println("index:" +i + "TermosFim: "+ termosFim.get(i));
            }
            
            File respostaa;
            FileWriter fw;

            respostaa = new File(resposta);
            respostaa.createNewFile();

            fw = new FileWriter(resposta, true );
            BufferedWriter bw = new BufferedWriter( fw );

            int numer = 0;
            
            while(numer <= dlmLeft.size()-1) {
                bw.write(termos.get(numer) + jTextField1.getText());
                numer ++;
            }
            bw.newLine();
            
            while(numero <= contador - 3) {

                FileReader fr;
                BufferedReader br;

                fr = new FileReader(path + "\\" + numero);
                br = new BufferedReader(fr);

                String read = br.readLine();

                while(read != null) {
                    newList.add(read = br.readLine());
                }

                String pickLastLine = null;
                
                //PEGA SOMENTE A ULTIMA LINHA:       
                pickLastLine = newList.get(newList.size() - 2);
                //PEGA TODO O ARQUIVO
                pickLastLine = Files.readString(Paths.get(path + "\\" + numero));
                
                numero ++;
                
                numer = 0;
                while (numer <= dlmLeft.size()-1) {         

                    String newPath = pickLastLine;
                    String auxiliar = null;      

                    //   if antigo: pickLastLine.length() > 10 
                    if(newPath.indexOf(termos.get(numer)) != -1 ){
                        
                        if( !jCheckBox1.isSelected() ){
                            newPath =  FindDestroy(newPath, termos.get(numer));
                            auxiliar = FindReturn(newPath, termosFim.get(numer));
                        }
                        
                        else{
                            while(FindDestroy(newPath, termos.get(numer)) != null){
                                newPath =  FindDestroy(newPath, termos.get(numer));
                                auxiliar = FindReturn(newPath, termosFim.get(numer));
                                
                                if(FindDestroy(newPath, termos.get(numer)) != null){
                                    bw.write(auxiliar + jTextField3.getText());
                                }
                            }
                        }
                    }

                    /*try {
                        Properties p = new Properties();
                        p.load(new StringReader("key="+auxiliar));
                        auxiliar = p.getProperty("key");
                        
                   }catch (IOException ex) {
                       Logger.getLogger(BurpResponseAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
                   }*/
                    
                    bw.write(auxiliar + jTextField1.getText());

                    System.out.println("AUXILIAR: "+auxiliar);

                    numer++;
                }
                
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_botao2ActionPerformed

    private void jbLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeftActionPerformed
        dlmLeft.addElement(jtfItemLista.getText());
        
        jlListaLeft.setModel(dlmLeft);
    }//GEN-LAST:event_jbLeftActionPerformed

    private void jlListaLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaLeftMouseClicked
        int pos = jlListaLeft.getSelectedIndex();
        dlmLeft.remove(pos);
        
        jlListaLeft.setModel(dlmLeft);
    }//GEN-LAST:event_jlListaLeftMouseClicked

    private void jlListaRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaRightMouseClicked
        int pos = jlListaRight.getSelectedIndex();
        dlmRight.remove(pos);
        
        jlListaRight.setModel(dlmRight);
    }//GEN-LAST:event_jlListaRightMouseClicked

    private void jbRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRightActionPerformed
        dlmRight.addElement(jtfItemLista.getText());
        
        jlListaRight.setModel(dlmRight);
    }//GEN-LAST:event_jbRightActionPerformed

    private void jtfItemListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfItemListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfItemListaActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

        jButton1.setBackground(new Color(255,102,51));
        jButton1.setForeground(new Color(255,255,255));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255,255,255));
        jButton1.setForeground(new Color(255,102,51));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jbLeftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeftMouseEntered
      jbLeft.setBackground(new Color(255,102,51));
      jbLeft.setForeground(new Color(255,255,255));  

        // TODO add your handling code here:
    }//GEN-LAST:event_jbLeftMouseEntered

    private void jbLeftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeftMouseExited
      jbLeft.setBackground(new Color(255,255,255));
      jbLeft.setForeground(new Color(255,102,51));

        // TODO add your handling code here:
    }//GEN-LAST:event_jbLeftMouseExited

    private void jbRightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRightMouseEntered
        jbRight.setBackground(new Color(255,102,51));
        jbRight.setForeground(new Color(255,255,255));


        // TODO add your handling code here:
    }//GEN-LAST:event_jbRightMouseEntered

    private void jbRightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRightMouseExited
jbRight.setBackground(new Color(255,255,255));
jbRight.setForeground(new Color(255,102,51));     
        

// TODO add your handling code here:
    }//GEN-LAST:event_jbRightMouseExited

    private void botao2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseEntered
        botao2.setBackground(new Color(255,102,51));
        botao2.setForeground(new Color(255,255,255));

        // TODO add your handling code here:
    }//GEN-LAST:event_botao2MouseEntered

    private void botao2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseExited
        botao2.setBackground(new Color(255,255,255));
        botao2.setForeground(new Color(255,102,51));
        

// TODO add your handling code here:
    }//GEN-LAST:event_botao2MouseExited

    public static void readFileOrder(String resposta) {
        try {
            FileReader fr = new FileReader(resposta);
            BufferedReader br = new BufferedReader(fr);
            
            String ler = br.readLine();
            
            List<String> lista;
            lista = new ArrayList<>();
            
            while(ler != null) {
                lista.add(ler);
                ler = br.readLine();
            }

            fr.close();
            br.close();
            
            List<String> resultado = new ArrayList<>();
            
            Set<String> set = new HashSet<>(lista);
            lista.clear();
            resultado.addAll(set);
            
            //System.out.println("Valor: " + resultado.get(1));
            
            File arquivo2 = new File(path + "\\retorno.txt");
            arquivo2.createNewFile();
            
            FileWriter fw = new FileWriter(arquivo2);
            BufferedWriter bw = new BufferedWriter(fw);
            
            int contLista = 0;
            
            while(contLista < resultado.size()) {
                bw.write(resultado.get(contLista));
                bw.newLine();
                contLista ++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BurpResponseAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BurpResponseAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
   
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf"); 
        }catch(Exception e) {
            
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() { 
                
                
                new BurpResponseAnalyzer().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbLeft;
    private javax.swing.JButton jbRight;
    private javax.swing.JList<String> jlListaLeft;
    private javax.swing.JList<String> jlListaRight;
    private javax.swing.JTextField jtfItemLista;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}
