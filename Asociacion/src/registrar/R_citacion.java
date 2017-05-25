/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar;

import eliminar.E_socio;
import eliminar.E_citacion;
import eliminar.E_propiedad;
import modificar.M_citacion;
import modificar.M_socio;
import modificar.M_propiedad;
import consultas.C_cartera;
import consultas.*;
import consultas.C_socio;
import consultas.C_citacion;
import consultas.C_recibo;
import asociacion.*;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEXANDER
 */
public class R_citacion extends javax.swing.JFrame {
 
    String cod_pr;
    /**
     * Creates new form LOGIN
     */
    public R_citacion() {
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

        salir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numero_citacion = new javax.swing.JTextField();
        motivo = new javax.swing.JTextField();
        menu1 = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        lugar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        fecha_reunion = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        fecha_citacion = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        numero_propiedad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mostrar_propiedades = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        asistio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 90, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("REGISTRAR CITACION");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("NUMERO DE CITACION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("FECHA DE REUNION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("FECHA DE CITACION:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 160, -1));
        getContentPane().add(numero_citacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 290, 30));
        getContentPane().add(motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 730, 30));

        menu1.setText("MENU");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 80, 30));

        menu2.setText("NUEVO");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 120, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("HORA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 60, -1));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 270, 30));
        getContentPane().add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 290, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("LUGAR:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 440, -1));

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 120, 30));

        fecha_reunion.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fecha_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 270, 31));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("MOTIVO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, -1));

        fecha_citacion.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fecha_citacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 270, 31));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("CODIGO PROPIEDAD:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 27));

        numero_propiedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_propiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(numero_propiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 180, 31));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 910, 153));

        mostrar_propiedades.setText("MOSTRAR PROPIEDADES");
        mostrar_propiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_propiedadesActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_propiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("ASISTIO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, 27));

        asistio.setBackground(new java.awt.Color(204, 204, 204));
        asistio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        asistio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        getContentPane().add(asistio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/IMG_LOGIN.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 740));

        jMenu1.setText("GESTIONAR");

        jMenuItem1.setText("SOCIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("PROPIEDAD");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("CARTERA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("RECIBOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("CITAS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem26.setText("PAGOS");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem26);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("REGISTRAR");

        jMenuItem6.setText("SOCIO");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("PROPIEDAD");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("CARTERA");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("RECIBO");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("CITA");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem27.setText("PAGOS");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem27);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("MODIFICAR");

        jMenuItem11.setText("SOCIO");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("PROPIEDAD");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem15.setText("CITACION");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("CONSULTAR");

        jMenuItem16.setText("SOCIO");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("PROPIEDAD");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("CARTERA");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("RECIBO");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("CITACION");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem23.setText("PAGOS");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("ELIMINAR");

        jMenuItem21.setText("SOCIO");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("PROPIEDAD");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem22);

        jMenuItem25.setText("CITACION");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
     new Menu().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
   
        numero_citacion.setText(null);
        motivo.setText(null);
        hora.setText(null);
        lugar.setText(null);

        
    }//GEN-LAST:event_menu2ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
            this.hide();         // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       Conexion con=new Conexion();
       Connection reg = con.conectar();
       
       String num_cita, fecha_reun, fecha_cita,hor,lug,mot,est,num_p;
       String sql;
       
       String formato=fecha_citacion.getDateFormatString();
       Date date=fecha_citacion.getDate();
       SimpleDateFormat sdf=new SimpleDateFormat(formato);
       fecha_cita=String.valueOf(sdf.format(date));
       
       String format=fecha_citacion.getDateFormatString();
       Date dat=fecha_citacion.getDate();
       SimpleDateFormat sd=new SimpleDateFormat(format);
       fecha_reun=String.valueOf(sd.format(dat));
       
       num_cita=numero_citacion.getText();
       hor=hora.getText();
       lug=lugar.getText();
       mot=motivo.getText();
       est=(String)asistio.getSelectedItem();
       num_p=numero_propiedad.getText();
        
       sql="INSERT INTO citacion VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,num_cita);
              pst.setString(2,fecha_cita);
               pst.setString(3,lug);
                pst.setString(4,hor);
                    pst.setString(5,mot);
                               int n=pst.executeUpdate();
                        if(n>0){
                      
                      JOptionPane.showMessageDialog(null,"Registrado con exito");
                      }
        } catch (SQLException ex) {
            Logger.getLogger(R_socio.class.getName()).log(Level.SEVERE, null, ex);
          
        } 

  sql="INSERT INTO PropiedadCitacion VALUES(?,?,?,?)";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,num_p);
              pst.setString(2,num_cita);
               pst.setString(3,fecha_reun);
                pst.setString(4,est);
                    
                               int n=pst.executeUpdate();
                        if(n>0){
                      
                      JOptionPane.showMessageDialog(null,"Registrado con exito");
                      }
        } catch (SQLException ex) {
            Logger.getLogger(R_socio.class.getName()).log(Level.SEVERE, null, ex);
          
        }        
               // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int datos = jTable1.getSelectedRow();
            cod_pr = (jTable1.getModel().getValueAt(datos, 0).toString());
            numero_propiedad.setText(cod_pr);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }    // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void mostrar_propiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_propiedadesActionPerformed
        Connection con=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=socios","asociacion","123456");
            Statement stm = con.createStatement();
            ResultSet rsT = stm.executeQuery("SELECT * FROM propiedad ");
            ResultSetMetaData rsMd = rsT.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rsT.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rsT.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            rsT.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "error de conexion "+e);
        }

    }//GEN-LAST:event_mostrar_propiedadesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new G_socio().setVisible(true);              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new  G_propiedad().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new G_cartera().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new G_factura().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new G_cita().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        new R_pagos().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new R_socio().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new R_propiedad().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new R_carteraExtra().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new R_recibo().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new R_citacion().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        new R_pagos().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new M_socio().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new M_propiedad().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        new M_citacion().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new C_socio().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new C_propiedad().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new C_cartera().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new C_recibo().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        new C_citacion().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        new C_pago().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        new E_socio().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        new E_propiedad().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        new E_citacion().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

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
            java.util.logging.Logger.getLogger(R_citacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R_citacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R_citacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R_citacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R_citacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asistio;
    private com.toedter.calendar.JDateChooser fecha_citacion;
    private com.toedter.calendar.JDateChooser fecha_reunion;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lugar;
    private javax.swing.JButton menu1;
    private javax.swing.JButton menu2;
    private javax.swing.JButton mostrar_propiedades;
    private javax.swing.JTextField motivo;
    private javax.swing.JTextField numero_citacion;
    private javax.swing.JTextField numero_propiedad;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}