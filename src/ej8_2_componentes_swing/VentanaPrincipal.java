package ej8_2_componentes_swing;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        setLocationRelativeTo(null); 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNotas = new javax.swing.JPanel();
        etqNota1 = new javax.swing.JLabel();
        etqNota2 = new javax.swing.JLabel();
        etqNota3 = new javax.swing.JLabel();
        etqNota4 = new javax.swing.JLabel();
        etqNota5 = new javax.swing.JLabel();
        campoNota1 = new javax.swing.JTextField();
        campoNota2 = new javax.swing.JTextField();
        campoNota3 = new javax.swing.JTextField();
        campoNota4 = new javax.swing.JTextField();
        campoNota5 = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        promedio = new javax.swing.JLabel();
        desviacion_est = new javax.swing.JLabel();
        mayor_nota = new javax.swing.JLabel();
        menor_nota = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notas");
        setResizable(false);
        setSize(new java.awt.Dimension(280, 380));

        panelNotas.setPreferredSize(new java.awt.Dimension(280, 380));
        panelNotas.setRequestFocusEnabled(false);
        panelNotas.setSize(new java.awt.Dimension(280, 380));

        etqNota1.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        etqNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNota1.setText("Nota 1");

        etqNota2.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        etqNota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNota2.setText("Nota 2");

        etqNota3.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        etqNota3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNota3.setText("Nota 3");

        etqNota4.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        etqNota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNota4.setText("Nota 4");

        etqNota5.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        etqNota5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNota5.setText("Nota 5");

        campoNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNota5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonCalcular.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(0, 51, 153));
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        promedio.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        promedio.setForeground(new java.awt.Color(0, 51, 153));
        promedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        promedio.setText("Promedio =");

        desviacion_est.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        desviacion_est.setForeground(new java.awt.Color(0, 51, 153));
        desviacion_est.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desviacion_est.setText("Desviación estándar =");

        mayor_nota.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        mayor_nota.setForeground(new java.awt.Color(0, 51, 153));
        mayor_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayor_nota.setText("Mayor nota obtenida =");

        menor_nota.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        menor_nota.setForeground(new java.awt.Color(0, 51, 153));
        menor_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menor_nota.setText("Menor nota obtenida =");

        botonLimpiar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(102, 0, 0));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNotasLayout = new javax.swing.GroupLayout(panelNotas);
        panelNotas.setLayout(panelNotasLayout);
        panelNotasLayout.setHorizontalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(desviacion_est, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mayor_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menor_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelNotasLayout.createSequentialGroup()
                            .addComponent(botonCalcular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonLimpiar)))
                    .addGroup(panelNotasLayout.createSequentialGroup()
                        .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etqNota1)
                            .addComponent(etqNota2)
                            .addComponent(etqNota3)
                            .addComponent(etqNota4)
                            .addComponent(etqNota5))
                        .addGap(16, 16, 16)
                        .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota1)
                    .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota2)
                    .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota3)
                    .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota4)
                    .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota5)
                    .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCalcular)
                    .addComponent(botonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desviacion_est, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mayor_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menor_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        double nota1 = Double.parseDouble(campoNota1.getText());
        double nota2 = Double.parseDouble(campoNota2.getText());
        double nota3 = Double.parseDouble(campoNota3.getText());
        double nota4 = Double.parseDouble(campoNota4.getText());
        double nota5 = Double.parseDouble(campoNota5.getText());
        Notas notas = new Notas(nota1,nota2,nota3,nota4,nota5);
        String prom = "Promedio = " + String.format("%.2f",notas.promedioNotas);
        promedio.setText(prom);
        String desvEst = "Desviación estándar = " + String.format("%.2f",notas.desviacionEstandar);
        desviacion_est.setText(desvEst);
        String mayor = "Mayor nota obtenida = " + String.format("%.2f",notas.mayorNota);
        mayor_nota.setText(mayor);
        String menor = "Menor nota obtenida = " + String.format("%.2f",notas.menorNota);
        menor_nota.setText(menor);
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");
        promedio.setText("Promedio =");
        desviacion_est.setText("Desviación estándar =");
        mayor_nota.setText("Mayor nota obtenida =");
        menor_nota.setText("Menor nota obtenida =");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField campoNota1;
    private javax.swing.JTextField campoNota2;
    private javax.swing.JTextField campoNota3;
    private javax.swing.JTextField campoNota4;
    private javax.swing.JTextField campoNota5;
    private javax.swing.JLabel desviacion_est;
    private javax.swing.JLabel etqNota1;
    private javax.swing.JLabel etqNota2;
    private javax.swing.JLabel etqNota3;
    private javax.swing.JLabel etqNota4;
    private javax.swing.JLabel etqNota5;
    private javax.swing.JLabel mayor_nota;
    private javax.swing.JLabel menor_nota;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JLabel promedio;
    // End of variables declaration//GEN-END:variables
}