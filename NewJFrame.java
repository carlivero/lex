package Lexemas;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewJFrame extends javax.swing.JFrame {

    public String divisor [];
    
    private StringBuilder salida = new StringBuilder();
    private Stack<String> pila = new Stack<>(); 
    ArrayList<String> expreciones = new ArrayList<String>();
    ArrayList<String> declaraciones = new ArrayList<String>();
    ArrayList<String[]> errores = new ArrayList();
    private String[] entrada;
    private String[] cadenas;
    
    
    /**
     * @param args the command line arguments
     */

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar texto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(140, 140, 140))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lexema");

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setText("Salida PostFijo");

        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel5.setText("Errores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 20, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salida.setLength(0); //reiniciamos el constructor para que no concatene mas palabras cada vez que ponemos una nueva
        
        
        String cad = jTextArea1.getText(); //obtenemos el texto
        
        //Expreciones regulares para evaluar que es cada linea
        String exprecion = "[A-Za-z0-9]+[\\s][=][\\s][A-Za-z0-9]+([\\s][-+*/][\\s][A-Za-z0-9]+)*[;]"; // para pasr a postfijo
        String declaracion = "(int|char|boolean|String|float|double)[\\s][A-Za-z0-9]+([,][\\s][A-Za-z0-9]+)*[;]";//para declaraciones de variables
        String exprecion_final = "(([\\s]*"+declaracion+"[\\s]*)|([\\s]*"+exprecion+"[\\s]*))*"; //E.R para varias declaraciones y expreciones
       
        Pattern exp = Pattern.compile(exprecion);
        Pattern dec = Pattern.compile(declaracion);
        Pattern Final = Pattern.compile(exprecion_final);
        System.out.println(cad);
        Matcher MatFinal = Final.matcher(cad); 
        String a = "";
        
        
        //ciclo de entrada para realizar el metodo correspondiente
        if(MatFinal.matches()){ 
            //ya que si se cumple la exrecion final lo separamos por espacion y ; manteniendo el ;
            cadenas = cad.split("(?<=;)[\\s]*");
            
        //ciclo para el match de expreciones y declaraciones
        for (int b = 0; b<cadenas.length; b++ ) {
      
                Matcher MatExp = exp.matcher(cadenas[b]);
                Matcher MatDec = dec.matcher(cadenas[b]);
                
                System.out.println("palabra: "+cadenas[b]);
                
                if(MatExp.matches()){
                //exprecion
                     
                     conversion(cadenas[b].replace(";", ""));//enviamos la cadena al metodo convercion sin el ;
                     System.out.println("Exprecion: "+cadenas[b]);
                     expreciones.add(cadenas[b]); //guardamos lo que se esta evaluando en un array list
                     
                     RecorrerTabla(cadenas[b]);// ejecutamos el metodo de reccorrer tabla 
                 }else if(MatDec.matches()){
                     //declaraciones
                     
                     System.out.println("Declaracion: "+cadenas[b]);
                     a = a + cadenas[b]; //guardamos un string la concatenacion de lo que se está evaluando 
                     declaraciones.add(cadenas[b]); //guardamos lo que se esta evaluando en un array list
                 }
                
            }
            lexema(a); //ejecutamos el lexema a fuera del for con el parametro a en la que guardamos la concatenacion para que no se cicle 
            jTextArea4.setText(salida.toString());

         }else{
                 
              }
       
        /* int contador =0;
        int contador2 = 0;
        for(String o : divisor){
            if(o.equals("int") || o.equals("char")||o.equals("double")||o.equals("bool")){
                tipo[contador] = o;
                contador = contador + 1;
            }else{
                lexema[contador2] = o;
                contador2 = contador2 + 1;
            }
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed
    //metodo para evaluar las tablas
    public void RecorrerTabla(String cadenas){
        ArrayList<String[]> errores = new ArrayList();
        
        String[] nuevoError = new String[3];
    //    nuevoError[0] = linea del error
    //    nuevoError[1] = lexema o instrucción del error
    //    nuevoError[2] = descripción del error
        errores.add(nuevoError);
        
        jTextArea5.setText(nuevoError.toString());
        System.out.println("frase: "+cadenas);
        //  ciclo de evaluacion
        for (int l = 0; l<expreciones.size() ;l++){
            //comparamos expreciones con declaraciones para ver si coinciden 
            if (expreciones.get(l).equals(declaraciones)){
                System.out.println("Si se encuentra declarado");
            }else{
                System.out.println("~");
                jTextArea5.append(expreciones.get(l));
                
            }
        }
    }
    
    public void lexema(String cadenas) {
        String palabras = cadenas;
        //remplazamos las comas por nada
        String palabra2 = palabras.replaceAll(",", " ");
        String palabra3 = palabra2.replaceAll("\n", " ");
        
        //dividir las variables cuando encuentre el ";"
        //ejemplo: int a; split boolean b; split char c; split
        divisor = palabra3.split("[;][\\s]*");

        //int x  y  z; int y; bool c;
       // String tipo[] = new String[10];
        //String lexema[] = new String[10];
        ArrayList<String> tipo = new ArrayList<String>();
        ArrayList<String> lexema = new ArrayList<String>();
        String tipoVar = "";
        
        //ya que tenemos las variables dividida las iteramos una por una
        //la primera iteracion seria int a;
        for (int i = 0; i < divisor.length; i++) {
            //dividimos la variable cuando haya un espacio
            String[] palabrasDivididas = divisor[i].split("[\\s]+");
            //volvemos a iterar sobre las palabras ya divididas
            for (int j = 0; j < palabrasDivididas.length; j++) {
                //imprimios en consola las palabras en que se dividio y el tamaño del arreglo 
                System.out.println("PALABRAS:   "+palabrasDivididas[j]);
                System.out.println("Tamanio:   "+palabrasDivididas.length);
                
                //entramos en un siclo donde verificaremos si coinciden con las siguientes palabras
                if(palabrasDivididas[j].equals("int") || palabrasDivididas[j].equals("char") || palabrasDivididas[j].equals("float") 
                        ||palabrasDivididas[j].equals("double")||palabrasDivididas[j].equals("boolean")) {
                    //almacenamos el tipo de variable en este casi int 
                    tipoVar = palabrasDivididas[j];
                } else {
                    //caso contrario almacenamos en lexema e imprimimos en consola
                    tipo.add(tipoVar);
                    lexema.add(palabrasDivididas[j]);
                    System.out.println("TIPO:   "+j+"   "+tipo);
                    System.out.println("LEXEMA"+lexema);
                }
                
            }//imprimimos valores en la tabla de la interfaz 
            StringBuilder builder = new StringBuilder();
            
            for(int k = 0; k < tipo.size(); k++){
                builder.append(tipo.get(k));
                builder.append("\n");
            }
            
            jTextArea3.setText(builder.toString());
            builder.setLength(0);
            
            StringBuilder con = new StringBuilder();
            for(int c = 0; c < lexema.size(); c++){
                con.append(lexema.get(c));
                con.append("\n");
            }
            
            jTextArea2.setText(con.toString());
            con.setLength(0);
        }
    }
    
    public int valor(String opre){
        
        //inicializar las variables
    
    //aqui obtenemos los valores de prioridad
            int prioridad = 0;
            if (opre.equals("*") || opre.equals("/")){
                prioridad = 3;
            }else if( opre.equals("+") || opre.equals("-")){
                prioridad = 2;
            }else if( opre.equals("=")){
                prioridad = 1;
            }
            return prioridad;
        }
   
   //metodo para convertir de infijo a sufijo
    public void conversion(String cadenas){
        //obtenemos los valores del jtexet
        String infijo = cadenas;
        entrada = infijo.split(" ");
        
        //leemos el arreglo entrada y la guardamos en una variable tipo char llamada operador
        for (int i = 0;i < entrada.length; i++){
            char operador = entrada[i].charAt(0);
            
            //entramos en el ciclo de comprobacion 
            //Primero comprobamos si es un dijito o un alfabeto
            if(Character.isDigit(operador) || Character.isAlphabetic(operador)){
                //si se cumple la condicion se agrega a el constructor salida
                salida.append(entrada[i]);
            }else{ 
                //caso contrario entramos en un while para comprobar si la pila no esta vacia
                //y si es el valor del ultimo elemento de la pila es mayor o igual al valor de lo que se esta leyendo 
                while(!pila.isEmpty() && valor(pila.lastElement())
                       >= valor(entrada[i])){
                    //entonces se desapila la pila y se agrega a el arreglo salida
                    salida.append(pila.pop());
                }
                //si no se cumple el while entonces metemos lo que estabamos leyendo en la pila 
                pila.push(entrada[i]);
            }
        }
        //este while servira para el ultimo elemento en la pila para pasarlo a salida
        while(!pila.isEmpty()){
            salida.append(pila.pop());
        }
        salida.append(System.getProperty("line.separator"));
        //imprimimos el resultado
       
    }   
         
         
    /**
     * @param args the command line arguments
     */
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
}

