package view;

import javax.swing.JOptionPane;
import model.entidades.Consulta;
import model.entidades.Medicamento;
import model.entidades.Medico;
import model.entidades.Paciente;


public class ConsultaGUI extends javax.swing.JDialog {

    /**
     * Creates new form ConsultaGUI
     */
    public ConsultaGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManagerConsulta = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjetoClinicaMedicaPU").createEntityManager();
        queryConsulta = java.beans.Beans.isDesignTime() ? null : entityManagerConsulta.createQuery("");
        listConsulta = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : queryConsulta.getResultList();
        listMedico = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : queryMedico.getResultList();
        queryMedico = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        listPaciente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : queryPaciente.getResultList();
        queryPaciente = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        listMedicamento = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : queryMedicamento.getResultList();
        queryMedicamento = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jLabelPesquisar = new javax.swing.JLabel();
        jComboBoxPesquisar = new javax.swing.JComboBox();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTabbedPaneDados = new javax.swing.JTabbedPane();
        jPanelDados = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jFormattedTextFieldHora = new javax.swing.JFormattedTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelExame = new javax.swing.JLabel();
        jTextFieldExame = new javax.swing.JTextField();
        jLabelExameData = new javax.swing.JLabel();
        jFormattedTextFieldExameData = new javax.swing.JFormattedTextField();
        jLabelExameResult = new javax.swing.JLabel();
        jTextFieldExameResult = new javax.swing.JTextField();
        jPanelMedico = new javax.swing.JPanel();
        jLabelMedico = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox();
        jButtonAdicionarMedico = new javax.swing.JButton();
        jPanelPaciente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPaciente = new javax.swing.JComboBox();
        jButtonAdicionarPaciente = new javax.swing.JButton();
        jPanelMedicamento = new javax.swing.JPanel();
        jLabelMedicamento = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabelInicioMed = new javax.swing.JLabel();
        jLabelPosologia = new javax.swing.JLabel();
        jTextFieldPosologia = new javax.swing.JTextField();
        jFormattedTextFieldInicioMed = new javax.swing.JFormattedTextField();
        jLabelFinalMed = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButtonAdicionarMedicamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Consultas");

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSalvar);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonAlterar);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonExcluir);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancelar);

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.NORTH);

        jPanelTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Médico", "Paciente", "Tipo", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabelPesquisar.setText("Pesquisar:");

        jComboBoxPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Médico", "Paciente" }));

        jButtonPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabelaLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisar)
                    .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelTabela, java.awt.BorderLayout.SOUTH);

        jPanelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelData.setText("Data:");

        jLabelHora.setText("Hora:");

        try {
            jFormattedTextFieldHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHora.setEnabled(false);

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setEnabled(false);

        jLabelExame.setText("Exame:");

        jTextFieldExame.setEnabled(false);

        jLabelExameData.setText("Data do Exame:");

        try {
            jFormattedTextFieldExameData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldExameData.setEnabled(false);

        jLabelExameResult.setText("Resultados do Exame:");

        jTextFieldExameResult.setEnabled(false);

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData)
                            .addComponent(jLabelHora))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldHora)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelExame)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldExame, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelExameData)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldExameData, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelExameResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 192, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHora)
                    .addComponent(jFormattedTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExame)
                    .addComponent(jTextFieldExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExameData)
                    .addComponent(jFormattedTextFieldExameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExameResult)
                    .addComponent(jTextFieldExameResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPaneDados.addTab("Dados", jPanelDados);

        jLabelMedico.setText("Médico:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listMedico, jComboBoxMedico);
        bindingGroup.addBinding(jComboBoxBinding);

        jButtonAdicionarMedico.setText("Adicionar");
        jButtonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMedicoLayout = new javax.swing.GroupLayout(jPanelMedico);
        jPanelMedico.setLayout(jPanelMedicoLayout);
        jPanelMedicoLayout.setHorizontalGroup(
            jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdicionarMedico)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanelMedicoLayout.setVerticalGroup(
            jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedico)
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarMedico))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPaneDados.addTab("Medico", jPanelMedico);

        jLabel1.setText("Paciente:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listPaciente, jComboBoxPaciente);
        bindingGroup.addBinding(jComboBoxBinding);

        jButtonAdicionarPaciente.setText("Adicionar");
        jButtonAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPacienteLayout = new javax.swing.GroupLayout(jPanelPaciente);
        jPanelPaciente.setLayout(jPanelPacienteLayout);
        jPanelPacienteLayout.setHorizontalGroup(
            jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdicionarPaciente)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanelPacienteLayout.setVerticalGroup(
            jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarPaciente))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPaneDados.addTab("Paciente", jPanelPaciente);

        jLabelMedicamento.setText("Medicamento:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listMedicamento, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabelInicioMed.setText("Inicio do Medicamento:");

        jLabelPosologia.setText("Posologia:");

        try {
            jFormattedTextFieldInicioMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelFinalMed.setText("Final do Medicamento:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonAdicionarMedicamento.setText("Adicionar");
        jButtonAdicionarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMedicamentoLayout = new javax.swing.GroupLayout(jPanelMedicamento);
        jPanelMedicamento.setLayout(jPanelMedicamentoLayout);
        jPanelMedicamentoLayout.setHorizontalGroup(
            jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFinalMed, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInicioMed, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPosologia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMedicamento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldInicioMed, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPosologia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdicionarMedicamento)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanelMedicamentoLayout.setVerticalGroup(
            jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedicamento)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosologia)
                    .addComponent(jTextFieldPosologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInicioMed)
                    .addComponent(jFormattedTextFieldInicioMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFinalMed)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPaneDados.addTab("Medicamento", jPanelMedicamento);

        getContentPane().add(jTabbedPaneDados, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        statusComponentes(true);
        listConsulta.add(new Consulta());
        int linha = listConsulta.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        int linhaSelecionada = jTableDados.getSelectedRow();
        Consulta con = (Consulta) listConsulta.get(linhaSelecionada);

        try {
            entityManagerConsulta.getTransaction().begin();
            entityManagerConsulta.persist(con);
            entityManagerConsulta.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            if (!entityManagerConsulta.getTransaction().isActive()) {
                entityManagerConsulta.getTransaction().begin();
            }
            entityManagerConsulta.getTransaction().rollback();
        }
        atualizaTabela();
        statusComponentes(false);

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        if (jTableDados.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        } else {
            statusComponentes(true);
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        if (jTableDados.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir");
        } else {
            try {
                int linhaClicada = jTableDados.getSelectedRow();
                Consulta cons = (Consulta) listConsulta.get(linhaClicada);
                entityManagerConsulta.getTransaction().begin();
                entityManagerConsulta.remove(cons);
                entityManagerConsulta.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
                if (!entityManagerConsulta.getTransaction().isActive()) {
                    entityManagerConsulta.getTransaction().begin();
                }
                entityManagerConsulta.getTransaction().rollback();
            }
        }
        atualizaTabela();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        statusComponentes(false);
        atualizaTabela();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarMedicamentoActionPerformed
        MedicamentoGUI medi = new MedicamentoGUI( new JFramePrincipal(), true);
        medi.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarMedicamentoActionPerformed

    private void jButtonAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarPacienteActionPerformed
        PacienteGUI pac = new PacienteGUI( new JFramePrincipal(), true);
        pac.setVisible(true);    }//GEN-LAST:event_jButtonAdicionarPacienteActionPerformed

    private void jButtonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarMedicoActionPerformed
        MedicoGUI med = new MedicoGUI( new JFramePrincipal(), true);
        med.setVisible(true);    }//GEN-LAST:event_jButtonAdicionarMedicoActionPerformed

    private void atualizaTabela() {
        String ejbql = "from Consulta c ";
        String atributo = "";
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("Médico")) {
            atributo = "c.medico";
        }
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("Paciente")) {
            atributo = "c.paciente";
        }
        String filtro = jTextFieldPesquisar.getText();
        if (filtro.length() > 0 && filtro != null) {
            ejbql += "where upper(" + atributo + ") like '"
                    + filtro.toUpperCase() + "%' ";
        }
        ejbql += "order by " + atributo;

        queryConsulta = entityManagerConsulta.createQuery(ejbql);
        listConsulta.clear();
        listConsulta.addAll(queryConsulta.getResultList());
        int linha = listConsulta.size() - 1;
        if (listConsulta.size() > 0) {
            jTableDados.setRowSelectionInterval(linha, linha);
        }
    }

    private void statusComponentes(boolean status) {
        // true: habilita para inserção
        // false: desabilita inserção
        jButtonNovo.setEnabled(!status);
        jButtonAlterar.setEnabled(!status);
        jButtonExcluir.setEnabled(!status);
        jButtonSalvar.setEnabled(status);
        jButtonCancelar.setEnabled(status);

        // Habilitando/desabilitando campos para inserção de dados
        jComboBoxMedico.setEnabled(status);
        jComboBoxPaciente.setEnabled(status);
        jFormattedTextFieldData.setEnabled(status);
        jFormattedTextFieldHora.setEnabled(status);

        /*
        //Campos de Pesquisa
        jComboBoxPesquisar.setEnabled(!status);
        jTextFieldPesquisar.setEnabled(!status);
        jButtonPesquisar.setEnabled(!status);
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManagerConsulta;
    private javax.swing.JButton jButtonAdicionarMedicamento;
    private javax.swing.JButton jButtonAdicionarMedico;
    private javax.swing.JButton jButtonAdicionarPaciente;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBoxMedico;
    private javax.swing.JComboBox jComboBoxPaciente;
    private javax.swing.JComboBox jComboBoxPesquisar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldExameData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHora;
    private javax.swing.JFormattedTextField jFormattedTextFieldInicioMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelExame;
    private javax.swing.JLabel jLabelExameData;
    private javax.swing.JLabel jLabelExameResult;
    private javax.swing.JLabel jLabelFinalMed;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelInicioMed;
    private javax.swing.JLabel jLabelMedicamento;
    private javax.swing.JLabel jLabelMedico;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelPosologia;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelMedicamento;
    private javax.swing.JPanel jPanelMedico;
    private javax.swing.JPanel jPanelPaciente;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneDados;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldExame;
    private javax.swing.JTextField jTextFieldExameResult;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPosologia;
    private java.util.List listConsulta;
    private java.util.List<Medicamento> listMedicamento;
    private java.util.List<Medico> listMedico;
    private java.util.List<Paciente> listPaciente;
    private javax.persistence.Query queryConsulta;
    private javax.persistence.Query queryMedicamento;
    private javax.persistence.Query queryMedico;
    private javax.persistence.Query queryPaciente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
