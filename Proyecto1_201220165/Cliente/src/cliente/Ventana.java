/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author oscar
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    
    Result result = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Pryecto 1");
        setResizable(false);

        jLabel1.setText("Proyecto 1:");

        jLabel2.setText("Proyecto 2:");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Enviar al servidor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTree1.setModel(modelo

        );
        jTree1.setToolTipText("");
        jScrollPane1.setViewportView(jTree1);

        jLabel3.setText("Datos de la respuesta del servidor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Error", "Columna", "Fila"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consola"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Analizar");

        jMenuItem5.setText("Analizar archivo actual");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jMenuItem6.setText("Mostrar salida");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Guardar salida");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static ArrayList<String> errores = new ArrayList();
    public static ArrayList<String> impresion = new ArrayList();
    public static String html = new String();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccion = new JFileChooser();
        seleccion.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int res = seleccion.showOpenDialog(this);
        File archivo =  seleccion.getSelectedFile();
        if((archivo  == null || archivo.getName().equals(""))){
            JOptionPane.showMessageDialog(this, "No se selecciono un directorio correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextField1.setText(archivo.getAbsolutePath());
            proyecto1 = archivo;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    File proyecto1;
    File proyecto2;
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Datos json");
    DefaultTreeModel modelo = new DefaultTreeModel(raiz);
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccion = new JFileChooser();
        seleccion.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int res = seleccion.showOpenDialog(this);
        File archivo = seleccion.getSelectedFile();
        if(archivo == null || archivo.getName().equals("")){
            JOptionPane.showMessageDialog(this, "No se selecciono un directorio correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextField2.setText(archivo.getAbsolutePath());
            proyecto2 = archivo;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void VaciarArbol(){
        raiz = new DefaultMutableTreeNode("Datos json");
        modelo = new DefaultTreeModel(raiz);
        jTree1.setModel(modelo);
    }
    
    public void LlenarArbol(){
        DefaultMutableTreeNode score = new DefaultMutableTreeNode("Score: " + String.valueOf(result.getScore()));
        modelo.insertNodeInto(score, raiz, 0);
        DefaultMutableTreeNode clases = new DefaultMutableTreeNode("Clases");
        modelo.insertNodeInto(clases, raiz, 1);
        for(int i = 0; i < result.getClases().size(); i++){
            DefaultMutableTreeNode auxclases = new DefaultMutableTreeNode(result.getClases().get(i).getNombre());
            modelo.insertNodeInto(auxclases, clases, i);
        }
        DefaultMutableTreeNode variables = new DefaultMutableTreeNode("Variables");
        modelo.insertNodeInto(variables, raiz, 2);
        for(int i = 0; i < result.getVariables().size(); i++){
            DefaultMutableTreeNode auxvariables = new DefaultMutableTreeNode(result.getVariables().get(i).getNombre());
            modelo.insertNodeInto(auxvariables, variables, i);
            DefaultMutableTreeNode nombre = new DefaultMutableTreeNode("Nombre: " + result.getVariables().get(i).getNombre());
            modelo.insertNodeInto(nombre, auxvariables, 0);
            DefaultMutableTreeNode tipo = new DefaultMutableTreeNode("Tipo: " + result.getVariables().get(i).getTipo());
            modelo.insertNodeInto(tipo, auxvariables, 1);
            tipo = new DefaultMutableTreeNode("Funcion: " + result.getVariables().get(i).getFuncion());
            modelo.insertNodeInto(tipo, auxvariables, 2);
            tipo = new DefaultMutableTreeNode("Clase: " + result.getVariables().get(i).getClase());
            modelo.insertNodeInto(tipo, auxvariables, 3);
        }
        DefaultMutableTreeNode metodos = new DefaultMutableTreeNode("Metodos");
        modelo.insertNodeInto(metodos, raiz, 3);
        for(int i = 0; i < result.getMetodos().size(); i++){
            DefaultMutableTreeNode auxmetodos = new DefaultMutableTreeNode(result.getMetodos().get(i).getNombre());
            modelo.insertNodeInto(auxmetodos, metodos, i);
            DefaultMutableTreeNode nombre = new DefaultMutableTreeNode("Nombre: " + result.getMetodos().get(i).getNombre());
            modelo.insertNodeInto(nombre, auxmetodos, 0);
            nombre = new DefaultMutableTreeNode("Tipo: " + result.getMetodos().get(i).getTipo());
            modelo.insertNodeInto(nombre, auxmetodos, 1);
            nombre = new DefaultMutableTreeNode("Parametros: " + result.getMetodos().get(i).getParametros());
            modelo.insertNodeInto(nombre, auxmetodos, 2);
        }
        DefaultMutableTreeNode comentarios = new DefaultMutableTreeNode("Comentarios");
        modelo.insertNodeInto(comentarios, raiz, 4);
        for(int i = 0; i < result.getComentarios().size(); i++){
            DefaultMutableTreeNode auxcomentarios = new DefaultMutableTreeNode(result.getComentarios().get(i).getTexto());
            modelo.insertNodeInto(auxcomentarios, comentarios, i);
        }
        ExpandirNodos(jTree1, 0, jTree1.getRowCount());
    }
    
    public void ExpandirNodos(JTree arbol, int indiceinicio, int numerofila){
        for(int i = indiceinicio; i < numerofila; i++){
            arbol.expandRow(i);
        }
        if(arbol.getRowCount() != numerofila){
            ExpandirNodos(arbol, numerofila, arbol.getRowCount());
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean pro1 = false, pro2 = false;
        if(jTextField1.getText().equals("") || jTextField1.getText() == null){
            pro1 = false;
        }else{
            pro1 = true;
        }
        if(jTextField2.getText().equals("") || jTextField2.getText() == null){
            pro2 = false;
        }else{
            pro2 = true;
        }
        
        if(pro1 && pro2){
            String[] ficheros1 = proyecto1.list();
            String aux = "";
            String contenido = "";
            ConexionCliente conexion = new ConexionCliente(this);
            String auxnombre[];
            auxnombre = jTextField1.getText().split("\\\\");
            aux = auxnombre[auxnombre.length -1];
            conexion.Inicio("Inicio Proyecto 1," + aux);
            VaciarArbol();
            for (String ficheros11 : ficheros1) {
                try {
                    //System.out.println(jTextField1.getText() + "\\" + ficheros11);
                    File auxarchivo = new File(jTextField1.getText() + "\\" + ficheros11);
                    FileReader fr = new FileReader(auxarchivo);
                    conexion.Inicio("Inicio clase," + ficheros11);
                    BufferedReader br = new BufferedReader(fr);
                    while((aux = br.readLine()) != null){
                        contenido += aux + "\n";
                    }
                    br.close();
                    fr.close();
                    
                    //System.out.println(contenido);
                    conexion.Inicio(contenido);
                    contenido = "";
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            auxnombre = jTextField2.getText().split("\\\\");
            aux = auxnombre[auxnombre.length -1];
            conexion.Inicio("Inicio Proyecto 2," + aux);
            ficheros1 = proyecto2.list();
            for (String ficheros11 : ficheros1) {
                //System.out.println(ficheros11);
                try{
                    File auxarchivo = new File(jTextField2.getText() + "\\" + ficheros11);
                    FileReader fr = new FileReader(auxarchivo);
                    BufferedReader br = new BufferedReader(fr);
                    conexion.Inicio("Inicio clase," + ficheros11);
                    while((aux = br.readLine()) != null){
                        contenido += aux + "\n";
                    }
                    br.close();
                    fr.close();
                    
                    //ConexionCliente conexion = new ConexionCliente();
                    conexion.Inicio(contenido);
                    contenido = "";
                }catch(IOException e){}
            }
            conexion.Inicio("Termino Proyecto 2");
            if(result != null){
                this.LlenarArbol();
            }
        }else if(pro1 && !pro2){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado el primer proyecto", "ERROR", JOptionPane.ERROR);
        }else if(!pro1 && pro2){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado el segundo proyecto", "ERROR", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    public void ObtenerResultados(Result resultados){
        this.result = resultados;
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try{
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("CPReport", "cp");
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(filtro);
            chooser.showOpenDialog(this);
            File archivo = chooser.getSelectedFile();
            if(archivo != null && !VerificarTab(archivo.getAbsolutePath())){
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                tab tabb = new tab();
                String contenido = "";
                while((aux = br.readLine()) != null){
                    contenido += aux + "\n";
                }
                tabb.setTexto(contenido);
                String auxpath = archivo.getAbsolutePath();
                String partespath[] = auxpath.split("\\\\");
                auxpath = "";
                String auxnombre = "";
                for(int i = 0; i < partespath.length; i++){
                    if(i != partespath.length-1){
                        auxpath += partespath[i] + "\\";
                    }else{
                        auxnombre = partespath[i];
                    }
                }
                tabb.setPath(auxpath);
                tabb.setNombre(auxnombre);
                this.jTabbedPane1.add(auxnombre, tabb);
                this.jTabbedPane1.setSelectedIndex(this.jTabbedPane1.getTabCount() - 1);
            }
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public boolean VerificarTab(String path){
        int numpesta = this.jTabbedPane1.getTabCount();
        for(int i = 0; i < numpesta; i++){
            tab tabb = (tab)this.jTabbedPane1.getComponent(i);
            String aux = tabb.getPath() + tabb.getNombre();
            if(aux.equals(path)){
                this.jTabbedPane1.setSelectedIndex(i);
                return true;
            }
        }
        return false;
    }
    
    public static String auxnombretab = "";
    public static String auxpathtab = "";
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CrearArchivo crear = new CrearArchivo();
        crear.setVentana(this);
        crear.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int numerotab = this.jTabbedPane1.getTabCount();
        for(int i = 0; i < numerotab; i++){
            tab tabb = (tab)this.jTabbedPane1.getComponent(i);
            //System.out.println(tabb.getPath() + tabb.getNombre());
            File archivo = new File(tabb.getPath() + tabb.getNombre());
            if(archivo.exists()){
                archivo.delete();
                GuardarArchivo(tabb.getPath() + tabb.getNombre(), i);
            }else{
                GuardarArchivo(tabb.getPath() + tabb.getNombre(), i);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(this.jTabbedPane1.getTabCount() > 0){
            int indiceseleccionado = this.jTabbedPane1.getSelectedIndex();
            tab tabb = (tab)this.jTabbedPane1.getComponent(indiceseleccionado);
            GuardarArchivo(tabb.getPath() + tabb.getNombre(), indiceseleccionado);
            this.jTabbedPane1.remove(indiceseleccionado);
        }else{
            JOptionPane.showMessageDialog(this, "No se encuentra abierto ningun archivo para analizar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
boolean compilado = false;
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if(this.jTabbedPane1.getTabCount() > 0){
                            try {
            // TODO add your handling code here:
            errores.clear();
            impresion.clear();
            compilado = true;
            this.jTextArea1.setText("");
            int filas = this.jTable1.getRowCount();
            DefaultTableModel modelotabla = (DefaultTableModel)this.jTable1.getModel();
            
            for(int i = 0; i < filas; i++){
                modelotabla.removeRow(0);
            }
            tab tabb = (tab)this.jTabbedPane1.getSelectedComponent();
            JTextArea aux = tabb.getTexto();
            lexico_cpreport scanner = new lexico_cpreport(new BufferedReader(new StringReader(aux.getText())));
            sintactico_cp parser = new sintactico_cp(scanner, this.result);
            parser.parse();
            if(errores.isEmpty()){
                JOptionPane.showMessageDialog(this, "El analisis de: " + tabb.getNombre() + " termino con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                for(int i = 0; i < impresion.size(); i++){
                    this.jTextArea1.append(impresion.get(i) + "\n");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se han encontrado errores en el analisis del archivo : " + tabb.getNombre(), "ERROR", JOptionPane.ERROR_MESSAGE);
                LlenarErrores();
            }
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
        }
        }else{
            compilado = false;
            JOptionPane.showMessageDialog(this, "No se encuentra abierto ningun archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(compilado && errores.isEmpty()){
            try {
                //System.out.println(html);
                File temp = new File("temp.html");
                //System.out.println("ruta " + temp.getAbsolutePath());
                temp.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
                bw.write(html);
                bw.close();
                Runtime run = Runtime.getRuntime();
                Process p = run.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe temp.html");
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se ha analizado ningun archivo, o el ultimo que se analizo contienen errores", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("HTML", "html");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        if(chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
            String path = chooser.getSelectedFile().getAbsolutePath() + ".html";
            File aux = new File(path);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(aux));
                bw.write(html);
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
    public void LlenarErrores(){
        DefaultTableModel modelotabla = (DefaultTableModel)this.jTable1.getModel();
        for(int i = 0; i < errores.size(); i++){
            String[] datos = errores.get(i).split("-");
            modelotabla.addRow(datos);
        }
    }
    
    public void GuardarArchivo(String path, int indice){
        File archivo = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            tab tabb = (tab)this.jTabbedPane1.getComponent(indice);
            JTextArea text = tabb.getTexto();
            bw.write(text.getText());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
