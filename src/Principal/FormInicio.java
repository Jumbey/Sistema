package Principal;

import Clases.Validaciones;
import componentes.ScrollBar;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author NETO
 */
public class FormInicio extends javax.swing.JFrame {

    Clases.CambiarVistas pasar = new Clases.CambiarVistas();

    public FormInicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        btnSeleccionarHora.setText("Seleccionar");
        init();
        SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel();
        SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel();
        modeloSpinner1.setMaximum(30);
        modeloSpinner1.setMinimum(0);
        modeloSpinner2.setMaximum(23);
        modeloSpinner2.setMinimum(0);
        spDias.setModel(modeloSpinner1);
        spHoras.setModel(modeloSpinner2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        time = new com.raven.swing.TimePicker();
        ContenedorPrincipal = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        btnMenu1 = new javax.swing.JPanel();
        btnVista_Clientes = new javax.swing.JButton();
        btnVista_Catalogo = new javax.swing.JButton();
        btnVista_Rentar = new javax.swing.JButton();
        btnVista_Reservas = new javax.swing.JButton();
        btnVista_Usuarios = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        Vista_Inicio = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        Vista_Clientes = new javax.swing.JPanel();
        ContenedorRegistroClientes = new componentes.PanelBorder();
        lblSubtittleClientes = new javax.swing.JLabel();
        sTable1 = new javax.swing.JScrollPane();
        table1 = new componentes.Table();
        jPanel1 = new javax.swing.JPanel();
        panelBorder2 = new componentes.PanelBorder();
        btnAgregarCliente = new javax.swing.JButton();
        panelBorder3 = new componentes.PanelBorder();
        btnActualizarCliente = new javax.swing.JButton();
        panelBorder4 = new componentes.PanelBorder();
        btnEditarCliente = new javax.swing.JButton();
        panelBorder5 = new componentes.PanelBorder();
        btnEliminarCliente = new javax.swing.JButton();
        BuscarClientes = new componentes.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        Disponibilidad = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Vista_Catalogo = new javax.swing.JPanel();
        ContenedorRegistroClientes1 = new componentes.PanelBorder();
        lblSubtittleClientes1 = new javax.swing.JLabel();
        sTable2 = new javax.swing.JScrollPane();
        table2 = new componentes.Table();
        jPanel2 = new javax.swing.JPanel();
        panelBorder6 = new componentes.PanelBorder();
        btnAgregarCliente1 = new javax.swing.JButton();
        panelBorder7 = new componentes.PanelBorder();
        btnActualizarCliente1 = new javax.swing.JButton();
        panelBorder8 = new componentes.PanelBorder();
        btnEditarCliente1 = new javax.swing.JButton();
        panelBorder9 = new componentes.PanelBorder();
        btnEliminarCliente1 = new javax.swing.JButton();
        BuscarClientes1 = new componentes.PanelBorder();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarCliente1 = new javax.swing.JTextField();
        Disponibilidad1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        panelBorder1 = new componentes.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSubtittleClientes2 = new javax.swing.JLabel();
        lblSubtittleClientes3 = new javax.swing.JLabel();
        lblSubtittleClientes4 = new javax.swing.JLabel();
        panelBorder11 = new componentes.PanelBorder();
        jLabel5 = new javax.swing.JLabel();
        lblSubtittleClientes5 = new javax.swing.JLabel();
        lblSubtittleClientes6 = new javax.swing.JLabel();
        panelBorder12 = new componentes.PanelBorder();
        btnCatalogoReservar = new javax.swing.JButton();
        Vista_RegistroRentas1 = new javax.swing.JPanel();
        panelBorder13 = new componentes.PanelBorder();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        panelBorder10 = new componentes.PanelBorder();
        jButton2 = new javax.swing.JButton();
        panelBorder14 = new componentes.PanelBorder();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        panelBorder15 = new componentes.PanelBorder();
        btnContinuarReserva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Vista_RegistroRentas2 = new javax.swing.JPanel();
        panelBorder16 = new componentes.PanelBorder();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        panelBorder21 = new componentes.PanelBorder();
        jButton8 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        spHoras = new javax.swing.JSpinner();
        spDias = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnSeleccionarHora = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        panelBorder20 = new componentes.PanelBorder();
        btnRegresar = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        panelBorder19 = new componentes.PanelBorder();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Vista_Reservas = new javax.swing.JPanel();
        ContenedorRegistroClientes2 = new componentes.PanelBorder();
        lblSubtittleClientes7 = new javax.swing.JLabel();
        sTable3 = new javax.swing.JScrollPane();
        table3 = new componentes.Table();
        jPanel17 = new javax.swing.JPanel();
        panelBorder17 = new componentes.PanelBorder();
        btnAgregarCliente2 = new javax.swing.JButton();
        panelBorder18 = new componentes.PanelBorder();
        btnActualizarCliente2 = new javax.swing.JButton();
        panelBorder22 = new componentes.PanelBorder();
        btnEditarCliente2 = new javax.swing.JButton();
        panelBorder23 = new componentes.PanelBorder();
        btnEliminarCliente2 = new javax.swing.JButton();
        BuscarClientes2 = new componentes.PanelBorder();
        jLabel11 = new javax.swing.JLabel();
        txtBuscarCliente2 = new javax.swing.JTextField();
        Disponibilidad2 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Vista_Usuarios = new javax.swing.JPanel();
        ContenedorRegistroClientes3 = new componentes.PanelBorder();
        lblSubtittleClientes8 = new javax.swing.JLabel();
        sTable4 = new javax.swing.JScrollPane();
        table4 = new componentes.Table();
        jPanel18 = new javax.swing.JPanel();
        panelBorder24 = new componentes.PanelBorder();
        btnAgregarCliente3 = new javax.swing.JButton();
        panelBorder25 = new componentes.PanelBorder();
        btnActualizarCliente3 = new javax.swing.JButton();
        panelBorder26 = new componentes.PanelBorder();
        btnEditarCliente3 = new javax.swing.JButton();
        panelBorder27 = new componentes.PanelBorder();
        btnEliminarCliente3 = new javax.swing.JButton();
        BuscarClientes3 = new componentes.PanelBorder();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarCliente3 = new javax.swing.JTextField();
        Disponibilidad3 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();

        time.set24hourMode(false);
        time.setDisplayText(btnSeleccionarHora);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1234, 710));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        ContenedorPrincipal.setMaximumSize(new java.awt.Dimension(1100, 675));
        ContenedorPrincipal.setMinimumSize(new java.awt.Dimension(1100, 675));

        Menu.setBackground(new java.awt.Color(255, 51, 51));
        Menu.setMinimumSize(new java.awt.Dimension(70, 710));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DriveXpress Logo (small).png"))); // NOI18N
        Logo.setOpaque(true);

        btnMenu1.setBackground(new java.awt.Color(255, 51, 51));
        btnMenu1.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        btnVista_Clientes.setBackground(new java.awt.Color(255, 51, 51));
        btnVista_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVista_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        btnVista_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notes.png"))); // NOI18N
        btnVista_Clientes.setText("       Clientes");
        btnVista_Clientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVista_Clientes.setBorderPainted(false);
        btnVista_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVista_Clientes.setFocusPainted(false);
        btnVista_Clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVista_Clientes.setName(""); // NOI18N
        btnVista_Clientes.setRequestFocusEnabled(false);
        btnVista_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVista_ClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVista_ClientesMouseExited(evt);
            }
        });
        btnVista_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVista_ClientesActionPerformed(evt);
            }
        });
        btnMenu1.add(btnVista_Clientes);

        btnVista_Catalogo.setBackground(new java.awt.Color(255, 51, 51));
        btnVista_Catalogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVista_Catalogo.setForeground(new java.awt.Color(255, 255, 255));
        btnVista_Catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.png"))); // NOI18N
        btnVista_Catalogo.setText("       Catálogo");
        btnVista_Catalogo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVista_Catalogo.setBorderPainted(false);
        btnVista_Catalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVista_Catalogo.setFocusPainted(false);
        btnVista_Catalogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVista_Catalogo.setName(""); // NOI18N
        btnVista_Catalogo.setRequestFocusEnabled(false);
        btnVista_Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVista_CatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVista_CatalogoMouseExited(evt);
            }
        });
        btnVista_Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVista_CatalogoActionPerformed(evt);
            }
        });
        btnMenu1.add(btnVista_Catalogo);

        btnVista_Rentar.setBackground(new java.awt.Color(255, 51, 51));
        btnVista_Rentar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVista_Rentar.setForeground(new java.awt.Color(255, 255, 255));
        btnVista_Rentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car-rental.png"))); // NOI18N
        btnVista_Rentar.setText("       Rentar");
        btnVista_Rentar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVista_Rentar.setBorderPainted(false);
        btnVista_Rentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVista_Rentar.setFocusPainted(false);
        btnVista_Rentar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVista_Rentar.setName(""); // NOI18N
        btnVista_Rentar.setRequestFocusEnabled(false);
        btnVista_Rentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVista_RentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVista_RentarMouseExited(evt);
            }
        });
        btnVista_Rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVista_RentarActionPerformed(evt);
            }
        });
        btnMenu1.add(btnVista_Rentar);

        btnVista_Reservas.setBackground(new java.awt.Color(255, 51, 51));
        btnVista_Reservas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVista_Reservas.setForeground(new java.awt.Color(255, 255, 255));
        btnVista_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        btnVista_Reservas.setText("       Reservas");
        btnVista_Reservas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVista_Reservas.setBorderPainted(false);
        btnVista_Reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVista_Reservas.setFocusPainted(false);
        btnVista_Reservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVista_Reservas.setName(""); // NOI18N
        btnVista_Reservas.setRequestFocusEnabled(false);
        btnVista_Reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVista_ReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVista_ReservasMouseExited(evt);
            }
        });
        btnVista_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVista_ReservasActionPerformed(evt);
            }
        });
        btnMenu1.add(btnVista_Reservas);

        btnVista_Usuarios.setBackground(new java.awt.Color(255, 51, 51));
        btnVista_Usuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVista_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnVista_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile.png"))); // NOI18N
        btnVista_Usuarios.setText("       Usuarios");
        btnVista_Usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVista_Usuarios.setBorderPainted(false);
        btnVista_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVista_Usuarios.setFocusPainted(false);
        btnVista_Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVista_Usuarios.setName(""); // NOI18N
        btnVista_Usuarios.setRequestFocusEnabled(false);
        btnVista_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVista_UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVista_UsuariosMouseExited(evt);
            }
        });
        btnVista_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVista_UsuariosActionPerformed(evt);
            }
        });
        btnMenu1.add(btnVista_Usuarios);

        btnMenu2.setBackground(new java.awt.Color(255, 51, 51));
        btnMenu2.setLayout(new java.awt.GridLayout(1, 0));

        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu2.add(btnInicio);

        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-black.png"))); // NOI18N
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu2.add(btnPerfil);

        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu2.add(btnSalir);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addComponent(btnMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setLayout(new java.awt.GridLayout(1, 0));

        lbl_Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("DriveXpress Car Rental");
        lbl_Title.setMaximumSize(new java.awt.Dimension(1000, 48));
        lbl_Title.setMinimumSize(new java.awt.Dimension(50, 48));
        Titulo.add(lbl_Title);

        Contenedor.setBackground(new java.awt.Color(0, 255, 204));
        Contenedor.setMaximumSize(new java.awt.Dimension(860, 590));
        Contenedor.setMinimumSize(new java.awt.Dimension(860, 590));
        Contenedor.setLayout(new java.awt.CardLayout());

        Vista_Inicio.setBackground(new java.awt.Color(255, 255, 255));

        imgInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cars.jpg"))); // NOI18N
        imgInicio.setMaximumSize(new java.awt.Dimension(860, 590));
        imgInicio.setMinimumSize(new java.awt.Dimension(860, 590));
        imgInicio.setPreferredSize(new java.awt.Dimension(860, 590));

        javax.swing.GroupLayout Vista_InicioLayout = new javax.swing.GroupLayout(Vista_Inicio);
        Vista_Inicio.setLayout(Vista_InicioLayout);
        Vista_InicioLayout.setHorizontalGroup(
            Vista_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Vista_InicioLayout.setVerticalGroup(
            Vista_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Contenedor.add(Vista_Inicio, "card2");

        Vista_Clientes.setBackground(new java.awt.Color(229, 229, 229));
        Vista_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vista_ClientesMouseClicked(evt);
            }
        });

        ContenedorRegistroClientes.setBackground(new java.awt.Color(255, 255, 255));

        lblSubtittleClientes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtittleClientes.setForeground(new java.awt.Color(127, 127, 127));
        lblSubtittleClientes.setText("Registro de Clientes");

        sTable1.setBackground(new java.awt.Color(255, 255, 255));
        sTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Tel", "N. Licencia", "Fecha de Registro"
            }
        ));
        table1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                table1FocusLost(evt);
            }
        });
        sTable1.setViewportView(table1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 80, 1, 80));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelBorder2.setBackground(new java.awt.Color(223, 223, 223));
        panelBorder2.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder2.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.setBorderPainted(false);
        btnAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente.setFocusPainted(false);
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        jPanel1.add(panelBorder2, gridBagConstraints);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder3.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder3.setPreferredSize(new java.awt.Dimension(80, 80));

        btnActualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizarCliente.setBorder(null);
        btnActualizarCliente.setBorderPainted(false);
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        jPanel1.add(panelBorder3, gridBagConstraints);

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder4.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder4.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarCliente.setBorder(null);
        btnEditarCliente.setBorderPainted(false);
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 27, 0, 27);
        jPanel1.add(panelBorder4, gridBagConstraints);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder5.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder5.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder5Layout = new javax.swing.GroupLayout(panelBorder5);
        panelBorder5.setLayout(panelBorder5Layout);
        panelBorder5Layout.setHorizontalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder5Layout.setVerticalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 28);
        jPanel1.add(panelBorder5, gridBagConstraints);

        javax.swing.GroupLayout ContenedorRegistroClientesLayout = new javax.swing.GroupLayout(ContenedorRegistroClientes);
        ContenedorRegistroClientes.setLayout(ContenedorRegistroClientesLayout);
        ContenedorRegistroClientesLayout.setHorizontalGroup(
            ContenedorRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sTable1)
            .addGroup(ContenedorRegistroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addGroup(ContenedorRegistroClientesLayout.createSequentialGroup()
                        .addComponent(lblSubtittleClientes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenedorRegistroClientesLayout.setVerticalGroup(
            ContenedorRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorRegistroClientesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSubtittleClientes)
                .addGap(18, 18, 18)
                .addComponent(sTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        BuscarClientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        txtBuscarCliente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtBuscarCliente.setForeground(new java.awt.Color(127, 127, 127));
        txtBuscarCliente.setText("Buscar...");
        txtBuscarCliente.setBorder(null);
        txtBuscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarClienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout BuscarClientesLayout = new javax.swing.GroupLayout(BuscarClientes);
        BuscarClientes.setLayout(BuscarClientesLayout);
        BuscarClientesLayout.setHorizontalGroup(
            BuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscarClientesLayout.setVerticalGroup(
            BuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(BuscarClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtBuscarCliente)
        );

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponibilidad....", "Activo", "Inactivo" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setOpaque(true);

        javax.swing.GroupLayout DisponibilidadLayout = new javax.swing.GroupLayout(Disponibilidad);
        Disponibilidad.setLayout(DisponibilidadLayout);
        DisponibilidadLayout.setHorizontalGroup(
            DisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisponibilidadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DisponibilidadLayout.setVerticalGroup(
            DisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Vista_ClientesLayout = new javax.swing.GroupLayout(Vista_Clientes);
        Vista_Clientes.setLayout(Vista_ClientesLayout);
        Vista_ClientesLayout.setHorizontalGroup(
            Vista_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vista_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista_ClientesLayout.createSequentialGroup()
                        .addComponent(BuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContenedorRegistroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        Vista_ClientesLayout.setVerticalGroup(
            Vista_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_ClientesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(Vista_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Disponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ContenedorRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        Contenedor.add(Vista_Clientes, "card3");

        Vista_Catalogo.setBackground(new java.awt.Color(204, 204, 204));

        ContenedorRegistroClientes1.setBackground(new java.awt.Color(255, 255, 255));

        lblSubtittleClientes1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtittleClientes1.setForeground(new java.awt.Color(127, 127, 127));
        lblSubtittleClientes1.setText("Catalogo de Vehículos");

        sTable2.setBackground(new java.awt.Color(255, 255, 255));
        sTable2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Tipo", "Color", "Precio x Hora", "Disponibilidad"
            }
        ));
        table2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                table2FocusLost(evt);
            }
        });
        sTable2.setViewportView(table2);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 80, 1, 80));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        panelBorder6.setBackground(new java.awt.Color(223, 223, 223));
        panelBorder6.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder6.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAgregarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregarCliente1.setBorder(null);
        btnAgregarCliente1.setBorderPainted(false);
        btnAgregarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente1.setFocusPainted(false);
        btnAgregarCliente1.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAgregarCliente1.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAgregarCliente1.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAgregarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addComponent(btnAgregarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        jPanel2.add(panelBorder6, gridBagConstraints);

        panelBorder7.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder7.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder7.setPreferredSize(new java.awt.Dimension(80, 80));

        btnActualizarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizarCliente1.setBorder(null);
        btnActualizarCliente1.setBorderPainted(false);
        btnActualizarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente1.setFocusPainted(false);
        btnActualizarCliente1.setMaximumSize(new java.awt.Dimension(80, 80));
        btnActualizarCliente1.setMinimumSize(new java.awt.Dimension(80, 80));
        btnActualizarCliente1.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout panelBorder7Layout = new javax.swing.GroupLayout(panelBorder7);
        panelBorder7.setLayout(panelBorder7Layout);
        panelBorder7Layout.setHorizontalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBorder7Layout.setVerticalGroup(
            panelBorder7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder7Layout.createSequentialGroup()
                .addComponent(btnActualizarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        jPanel2.add(panelBorder7, gridBagConstraints);

        panelBorder8.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder8.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder8.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEditarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarCliente1.setBorder(null);
        btnEditarCliente1.setBorderPainted(false);
        btnEditarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente1.setFocusPainted(false);
        btnEditarCliente1.setMaximumSize(new java.awt.Dimension(80, 80));
        btnEditarCliente1.setMinimumSize(new java.awt.Dimension(80, 80));
        btnEditarCliente1.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addComponent(btnEditarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addComponent(btnEditarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 27, 0, 27);
        jPanel2.add(panelBorder8, gridBagConstraints);

        panelBorder9.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder9.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder9.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEliminarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminarCliente1.setBorder(null);
        btnEliminarCliente1.setBorderPainted(false);
        btnEliminarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente1.setFocusPainted(false);
        btnEliminarCliente1.setMaximumSize(new java.awt.Dimension(80, 80));
        btnEliminarCliente1.setMinimumSize(new java.awt.Dimension(80, 80));
        btnEliminarCliente1.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout panelBorder9Layout = new javax.swing.GroupLayout(panelBorder9);
        panelBorder9.setLayout(panelBorder9Layout);
        panelBorder9Layout.setHorizontalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addComponent(btnEliminarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBorder9Layout.setVerticalGroup(
            panelBorder9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder9Layout.createSequentialGroup()
                .addComponent(btnEliminarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 28);
        jPanel2.add(panelBorder9, gridBagConstraints);

        javax.swing.GroupLayout ContenedorRegistroClientes1Layout = new javax.swing.GroupLayout(ContenedorRegistroClientes1);
        ContenedorRegistroClientes1.setLayout(ContenedorRegistroClientes1Layout);
        ContenedorRegistroClientes1Layout.setHorizontalGroup(
            ContenedorRegistroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorRegistroClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtittleClientes1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorRegistroClientes1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(sTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        ContenedorRegistroClientes1Layout.setVerticalGroup(
            ContenedorRegistroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorRegistroClientes1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSubtittleClientes1)
                .addGap(18, 18, 18)
                .addComponent(sTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );

        BuscarClientes1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        txtBuscarCliente1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtBuscarCliente1.setForeground(new java.awt.Color(127, 127, 127));
        txtBuscarCliente1.setText("Buscar...");
        txtBuscarCliente1.setBorder(null);
        txtBuscarCliente1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCliente1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCliente1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout BuscarClientes1Layout = new javax.swing.GroupLayout(BuscarClientes1);
        BuscarClientes1.setLayout(BuscarClientes1Layout);
        BuscarClientes1Layout.setHorizontalGroup(
            BuscarClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscarClientes1Layout.setVerticalGroup(
            BuscarClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtBuscarCliente1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponibilidad....", "Activo", "Inactivo" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setOpaque(true);

        javax.swing.GroupLayout Disponibilidad1Layout = new javax.swing.GroupLayout(Disponibilidad1);
        Disponibilidad1.setLayout(Disponibilidad1Layout);
        Disponibilidad1Layout.setHorizontalGroup(
            Disponibilidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox2, 0, 222, Short.MAX_VALUE)
        );
        Disponibilidad1Layout.setVerticalGroup(
            Disponibilidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 150));
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 150));

        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        lblSubtittleClientes2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtittleClientes2.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtittleClientes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtittleClientes2.setText("Toyota Hilux");

        lblSubtittleClientes3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSubtittleClientes3.setForeground(new java.awt.Color(51, 51, 51));
        lblSubtittleClientes3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtittleClientes3.setText("Placa: 7777-65665-65656-6565");

        lblSubtittleClientes4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSubtittleClientes4.setForeground(new java.awt.Color(51, 51, 51));
        lblSubtittleClientes4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtittleClientes4.setText("Color: Blanco");

        panelBorder11.setBackground(new java.awt.Color(0, 204, 0));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Disponible");

        javax.swing.GroupLayout panelBorder11Layout = new javax.swing.GroupLayout(panelBorder11);
        panelBorder11.setLayout(panelBorder11Layout);
        panelBorder11Layout.setHorizontalGroup(
            panelBorder11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder11Layout.setVerticalGroup(
            panelBorder11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        lblSubtittleClientes5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSubtittleClientes5.setForeground(new java.awt.Color(51, 51, 51));
        lblSubtittleClientes5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtittleClientes5.setText("Tipo: Pickup");

        lblSubtittleClientes6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSubtittleClientes6.setForeground(new java.awt.Color(51, 51, 51));
        lblSubtittleClientes6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtittleClientes6.setText("Precio por hora: $20.00");

        panelBorder12.setBackground(new java.awt.Color(255, 51, 51));

        btnCatalogoReservar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnCatalogoReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogoReservar.setText("Reservar");
        btnCatalogoReservar.setBorder(null);
        btnCatalogoReservar.setBorderPainted(false);
        btnCatalogoReservar.setContentAreaFilled(false);
        btnCatalogoReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogoReservar.setDefaultCapable(false);
        btnCatalogoReservar.setFocusPainted(false);
        btnCatalogoReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder12Layout = new javax.swing.GroupLayout(panelBorder12);
        panelBorder12.setLayout(panelBorder12Layout);
        panelBorder12Layout.setHorizontalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCatalogoReservar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        panelBorder12Layout.setVerticalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCatalogoReservar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSubtittleClientes2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lblSubtittleClientes5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSubtittleClientes4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBorder11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtittleClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubtittleClientes6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblSubtittleClientes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtittleClientes4))
                .addGap(37, 37, 37)
                .addComponent(lblSubtittleClientes5)
                .addGap(34, 34, 34)
                .addComponent(lblSubtittleClientes3)
                .addGap(33, 33, 33)
                .addComponent(lblSubtittleClientes6)
                .addGap(50, 50, 50)
                .addComponent(panelBorder12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Vista_CatalogoLayout = new javax.swing.GroupLayout(Vista_Catalogo);
        Vista_Catalogo.setLayout(Vista_CatalogoLayout);
        Vista_CatalogoLayout.setHorizontalGroup(
            Vista_CatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_CatalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vista_CatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista_CatalogoLayout.createSequentialGroup()
                        .addComponent(BuscarClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disponibilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContenedorRegistroClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Vista_CatalogoLayout.setVerticalGroup(
            Vista_CatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_CatalogoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(Vista_CatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Disponibilidad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(ContenedorRegistroClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Contenedor.add(Vista_Catalogo, "card4");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(0, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Nombre: Jose Ernesto");

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Apellido: Serrano Sánchez");

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(127, 127, 127));
        jLabel38.setText("Información del cliente:");

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Edad: 20 años");

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Teléfono: 0000-0000");

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("N° Licencia: 0000-0000-0000-0");

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Correo: joseserrano1@gmail.com");

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Fecha de Registro: 24/09/2023");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("* Datos Obligatorios *");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel38)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addGap(28, 28, 28)
                .addComponent(jLabel45)
                .addGap(27, 27, 27)
                .addComponent(jLabel44)
                .addGap(26, 26, 26)
                .addComponent(jLabel46)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(2, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Seleccionar cliente existenete:");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Registrar un nuevo cliente:");

        panelBorder10.setBackground(new java.awt.Color(0, 153, 255));
        panelBorder10.setMaximumSize(new java.awt.Dimension(208, 51));
        panelBorder10.setMinimumSize(new java.awt.Dimension(208, 51));
        panelBorder10.setPreferredSize(new java.awt.Dimension(208, 51));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seleccionar Cliente");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(208, 51));

        javax.swing.GroupLayout panelBorder10Layout = new javax.swing.GroupLayout(panelBorder10);
        panelBorder10.setLayout(panelBorder10Layout);
        panelBorder10Layout.setHorizontalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder10Layout.setVerticalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBorder14.setBackground(new java.awt.Color(0, 204, 0));
        panelBorder14.setMaximumSize(new java.awt.Dimension(208, 75));
        panelBorder14.setMinimumSize(new java.awt.Dimension(208, 75));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nuevo Clientes");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(208, 51));

        javax.swing.GroupLayout panelBorder14Layout = new javax.swing.GroupLayout(panelBorder14);
        panelBorder14.setLayout(panelBorder14Layout);
        panelBorder14Layout.setHorizontalGroup(
            panelBorder14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder14Layout.setVerticalGroup(
            panelBorder14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(panelBorder14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(panelBorder10, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(107, 107, 107))
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(panelBorder14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(panelBorder10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 447, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel5);

        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);

        panelBorder15.setBackground(new java.awt.Color(255, 51, 51));
        panelBorder15.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder15.setMaximumSize(new java.awt.Dimension(208, 75));
        panelBorder15.setMinimumSize(new java.awt.Dimension(208, 75));
        panelBorder15.setPreferredSize(new java.awt.Dimension(100, 50));

        btnContinuarReserva.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnContinuarReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuarReserva.setText("Continuar");
        btnContinuarReserva.setBorder(null);
        btnContinuarReserva.setBorderPainted(false);
        btnContinuarReserva.setContentAreaFilled(false);
        btnContinuarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuarReserva.setFocusPainted(false);
        btnContinuarReserva.setPreferredSize(new java.awt.Dimension(208, 51));
        btnContinuarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder15Layout = new javax.swing.GroupLayout(panelBorder15);
        panelBorder15.setLayout(panelBorder15Layout);
        panelBorder15Layout.setHorizontalGroup(
            panelBorder15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContinuarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelBorder15Layout.setVerticalGroup(
            panelBorder15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder15Layout.createSequentialGroup()
                .addComponent(btnContinuarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(panelBorder15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelBorder15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cliente");

        javax.swing.GroupLayout panelBorder13Layout = new javax.swing.GroupLayout(panelBorder13);
        panelBorder13.setLayout(panelBorder13Layout);
        panelBorder13Layout.setHorizontalGroup(
            panelBorder13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
        );
        panelBorder13Layout.setVerticalGroup(
            panelBorder13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(panelBorder13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder13Layout.createSequentialGroup()
                    .addGap(0, 458, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout Vista_RegistroRentas1Layout = new javax.swing.GroupLayout(Vista_RegistroRentas1);
        Vista_RegistroRentas1.setLayout(Vista_RegistroRentas1Layout);
        Vista_RegistroRentas1Layout.setHorizontalGroup(
            Vista_RegistroRentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Vista_RegistroRentas1Layout.setVerticalGroup(
            Vista_RegistroRentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_RegistroRentas1Layout.createSequentialGroup()
                .addComponent(panelBorder13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Contenedor.add(Vista_RegistroRentas1, "card5");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridLayout(0, 2));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Vehículo:");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("* Datos Obligatorios *");

        jLabel58.setBackground(new java.awt.Color(255, 51, 51));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 51, 51));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Datos de Renta");

        panelBorder21.setBackground(new java.awt.Color(0, 204, 255));
        panelBorder21.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder21.setMaximumSize(new java.awt.Dimension(208, 75));
        panelBorder21.setMinimumSize(new java.awt.Dimension(208, 75));
        panelBorder21.setPreferredSize(new java.awt.Dimension(100, 50));

        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Seleccionar");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.setPreferredSize(new java.awt.Dimension(208, 51));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder21Layout = new javax.swing.GroupLayout(panelBorder21);
        panelBorder21.setLayout(panelBorder21Layout);
        panelBorder21Layout.setHorizontalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBorder21Layout.setVerticalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel52.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Tiempo de Alquiler");

        jLabel53.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Dia:");

        jLabel54.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Horas:");

        spHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spHoras.setMaximumSize(new java.awt.Dimension(200, 32));
        spHoras.setMinimumSize(new java.awt.Dimension(200, 32));
        spHoras.setPreferredSize(new java.awt.Dimension(200, 32));

        spDias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spDias.setMaximumSize(new java.awt.Dimension(200, 32));
        spDias.setMinimumSize(new java.awt.Dimension(200, 32));
        spDias.setPreferredSize(new java.awt.Dimension(200, 32));

        jLabel55.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Fecha y hora de entrega");

        FechaNacimiento.setDateFormatString("dd/MM/yyyy");
        FechaNacimiento.setMaxSelectableDate(new java.util.Date(253370790087000L));
        FechaNacimiento.setMaximumSize(new java.awt.Dimension(200, 32));
        FechaNacimiento.setMinimumSize(new java.awt.Dimension(200, 32));
        FechaNacimiento.setPreferredSize(new java.awt.Dimension(200, 32));

        jLabel56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Fecha:");

        jLabel57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("hora:");

        btnSeleccionarHora.setEditable(false);
        btnSeleccionarHora.setText("Seleccionar");
        btnSeleccionarHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarHora.setFocusable(false);
        btnSeleccionarHora.setMaximumSize(new java.awt.Dimension(200, 32));
        btnSeleccionarHora.setMinimumSize(new java.awt.Dimension(200, 32));
        btnSeleccionarHora.setPreferredSize(new java.awt.Dimension(200, 32));
        btnSeleccionarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeleccionarHoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(6, 6, 6)
                        .addComponent(panelBorder21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79)
                                .addComponent(btnSeleccionarHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(6, 6, 6))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel58)
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(panelBorder21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(2, 0));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setBackground(new java.awt.Color(255, 51, 51));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 51, 51));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Información");

        jLabel60.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Cliente:");

        jLabel61.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("José Ernesto Serrano Sánchez");

        jLabel62.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Toyota Hilux");

        jLabel63.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("Vehículos:");

        jLabel64.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("20$");

        jLabel65.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Costo Total:");

        jLabel67.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("30/10/2023");

        jLabel68.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("Fecha de Devolución:");

        jLabel69.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setText("Blanco");

        jLabel70.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setText("Color:");

        jLabel71.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("10:00 AM");

        jLabel72.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText("Hora de Devolución:");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*Click en \"Finalizar\" para Confirmar*");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69))
                .addGap(38, 38, 38)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64))
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67))
                .addGap(42, 42, 42)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71))
                .addGap(29, 29, 29)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 495, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        jPanel10.add(jPanel12);

        jPanel14.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new java.awt.GridLayout(0, 2));

        panelBorder20.setBackground(new java.awt.Color(255, 51, 51));
        panelBorder20.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder20.setMaximumSize(new java.awt.Dimension(208, 75));
        panelBorder20.setMinimumSize(new java.awt.Dimension(208, 75));
        panelBorder20.setPreferredSize(new java.awt.Dimension(100, 50));

        btnRegresar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.setPreferredSize(new java.awt.Dimension(208, 51));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder20Layout = new javax.swing.GroupLayout(panelBorder20);
        panelBorder20.setLayout(panelBorder20Layout);
        panelBorder20Layout.setHorizontalGroup(
            panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelBorder20Layout.setVerticalGroup(
            panelBorder20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder20Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelBorder20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(panelBorder20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        jPanel14.add(jPanel15);

        panelBorder19.setBackground(new java.awt.Color(255, 51, 51));
        panelBorder19.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder19.setMaximumSize(new java.awt.Dimension(208, 75));
        panelBorder19.setMinimumSize(new java.awt.Dimension(208, 75));
        panelBorder19.setPreferredSize(new java.awt.Dimension(100, 50));

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Finalizar");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(208, 51));

        javax.swing.GroupLayout panelBorder19Layout = new javax.swing.GroupLayout(panelBorder19);
        panelBorder19.setLayout(panelBorder19Layout);
        panelBorder19Layout.setHorizontalGroup(
            panelBorder19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelBorder19Layout.setVerticalGroup(
            panelBorder19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder19Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(panelBorder19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelBorder19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel16);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registrar Reserva");

        javax.swing.GroupLayout panelBorder16Layout = new javax.swing.GroupLayout(panelBorder16);
        panelBorder16.setLayout(panelBorder16Layout);
        panelBorder16Layout.setHorizontalGroup(
            panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder16Layout.setVerticalGroup(
            panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder16Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(panelBorder16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder16Layout.createSequentialGroup()
                    .addGap(0, 458, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout Vista_RegistroRentas2Layout = new javax.swing.GroupLayout(Vista_RegistroRentas2);
        Vista_RegistroRentas2.setLayout(Vista_RegistroRentas2Layout);
        Vista_RegistroRentas2Layout.setHorizontalGroup(
            Vista_RegistroRentas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Vista_RegistroRentas2Layout.setVerticalGroup(
            Vista_RegistroRentas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_RegistroRentas2Layout.createSequentialGroup()
                .addComponent(panelBorder16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Contenedor.add(Vista_RegistroRentas2, "card5");

        Vista_Reservas.setBackground(new java.awt.Color(229, 229, 229));
        Vista_Reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vista_ReservasMouseClicked(evt);
            }
        });

        ContenedorRegistroClientes2.setBackground(new java.awt.Color(255, 255, 255));

        lblSubtittleClientes7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtittleClientes7.setForeground(new java.awt.Color(127, 127, 127));
        lblSubtittleClientes7.setText("Registro de Reservas");

        sTable3.setBackground(new java.awt.Color(255, 255, 255));
        sTable3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Tel", "N. Licencia", "Fecha de Registro"
            }
        ));
        table3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                table3FocusLost(evt);
            }
        });
        sTable3.setViewportView(table3);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 80, 1, 80));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        panelBorder17.setBackground(new java.awt.Color(223, 223, 223));
        panelBorder17.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder17.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAgregarCliente2.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregarCliente2.setBorder(null);
        btnAgregarCliente2.setBorderPainted(false);
        btnAgregarCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente2.setFocusPainted(false);
        btnAgregarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder17Layout = new javax.swing.GroupLayout(panelBorder17);
        panelBorder17.setLayout(panelBorder17Layout);
        panelBorder17Layout.setHorizontalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarCliente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelBorder17Layout.setVerticalGroup(
            panelBorder17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder17Layout.createSequentialGroup()
                .addComponent(btnAgregarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        jPanel17.add(panelBorder17, gridBagConstraints);

        panelBorder18.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder18.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder18.setPreferredSize(new java.awt.Dimension(80, 80));

        btnActualizarCliente2.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizarCliente2.setBorder(null);
        btnActualizarCliente2.setBorderPainted(false);
        btnActualizarCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente2.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder18Layout = new javax.swing.GroupLayout(panelBorder18);
        panelBorder18.setLayout(panelBorder18Layout);
        panelBorder18Layout.setHorizontalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder18Layout.setVerticalGroup(
            panelBorder18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        jPanel17.add(panelBorder18, gridBagConstraints);

        panelBorder22.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder22.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder22.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEditarCliente2.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarCliente2.setBorder(null);
        btnEditarCliente2.setBorderPainted(false);
        btnEditarCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente2.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder22Layout = new javax.swing.GroupLayout(panelBorder22);
        panelBorder22.setLayout(panelBorder22Layout);
        panelBorder22Layout.setHorizontalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder22Layout.setVerticalGroup(
            panelBorder22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 27, 0, 27);
        jPanel17.add(panelBorder22, gridBagConstraints);

        panelBorder23.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder23.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder23.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEliminarCliente2.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminarCliente2.setBorder(null);
        btnEliminarCliente2.setBorderPainted(false);
        btnEliminarCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente2.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder23Layout = new javax.swing.GroupLayout(panelBorder23);
        panelBorder23.setLayout(panelBorder23Layout);
        panelBorder23Layout.setHorizontalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder23Layout.setVerticalGroup(
            panelBorder23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 28);
        jPanel17.add(panelBorder23, gridBagConstraints);

        javax.swing.GroupLayout ContenedorRegistroClientes2Layout = new javax.swing.GroupLayout(ContenedorRegistroClientes2);
        ContenedorRegistroClientes2.setLayout(ContenedorRegistroClientes2Layout);
        ContenedorRegistroClientes2Layout.setHorizontalGroup(
            ContenedorRegistroClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sTable3)
            .addGroup(ContenedorRegistroClientes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorRegistroClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(ContenedorRegistroClientes2Layout.createSequentialGroup()
                        .addComponent(lblSubtittleClientes7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenedorRegistroClientes2Layout.setVerticalGroup(
            ContenedorRegistroClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorRegistroClientes2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSubtittleClientes7)
                .addGap(18, 18, 18)
                .addComponent(sTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        BuscarClientes2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        txtBuscarCliente2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtBuscarCliente2.setForeground(new java.awt.Color(127, 127, 127));
        txtBuscarCliente2.setText("Buscar...");
        txtBuscarCliente2.setBorder(null);
        txtBuscarCliente2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCliente2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCliente2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout BuscarClientes2Layout = new javax.swing.GroupLayout(BuscarClientes2);
        BuscarClientes2.setLayout(BuscarClientes2Layout);
        BuscarClientes2Layout.setHorizontalGroup(
            BuscarClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscarClientes2Layout.setVerticalGroup(
            BuscarClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtBuscarCliente2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponibilidad....", "Activo", "Inactivo" }));
        jComboBox3.setBorder(null);
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox3.setOpaque(true);

        javax.swing.GroupLayout Disponibilidad2Layout = new javax.swing.GroupLayout(Disponibilidad2);
        Disponibilidad2.setLayout(Disponibilidad2Layout);
        Disponibilidad2Layout.setHorizontalGroup(
            Disponibilidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Disponibilidad2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Disponibilidad2Layout.setVerticalGroup(
            Disponibilidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Vista_ReservasLayout = new javax.swing.GroupLayout(Vista_Reservas);
        Vista_Reservas.setLayout(Vista_ReservasLayout);
        Vista_ReservasLayout.setHorizontalGroup(
            Vista_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_ReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vista_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista_ReservasLayout.createSequentialGroup()
                        .addComponent(BuscarClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disponibilidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContenedorRegistroClientes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        Vista_ReservasLayout.setVerticalGroup(
            Vista_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_ReservasLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(Vista_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarClientes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Disponibilidad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ContenedorRegistroClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        Contenedor.add(Vista_Reservas, "card3");

        Vista_Usuarios.setBackground(new java.awt.Color(229, 229, 229));
        Vista_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vista_UsuariosMouseClicked(evt);
            }
        });

        ContenedorRegistroClientes3.setBackground(new java.awt.Color(255, 255, 255));

        lblSubtittleClientes8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtittleClientes8.setForeground(new java.awt.Color(127, 127, 127));
        lblSubtittleClientes8.setText("Registro de Usuarios");

        sTable4.setBackground(new java.awt.Color(255, 255, 255));
        sTable4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Tel", "N. Licencia", "Fecha de Registro"
            }
        ));
        table4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                table4FocusLost(evt);
            }
        });
        sTable4.setViewportView(table4);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 80, 1, 80));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        panelBorder24.setBackground(new java.awt.Color(223, 223, 223));
        panelBorder24.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder24.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAgregarCliente3.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregarCliente3.setBorder(null);
        btnAgregarCliente3.setBorderPainted(false);
        btnAgregarCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente3.setFocusPainted(false);
        btnAgregarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliente3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder24Layout = new javax.swing.GroupLayout(panelBorder24);
        panelBorder24.setLayout(panelBorder24Layout);
        panelBorder24Layout.setHorizontalGroup(
            panelBorder24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelBorder24Layout.setVerticalGroup(
            panelBorder24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder24Layout.createSequentialGroup()
                .addComponent(btnAgregarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        jPanel18.add(panelBorder24, gridBagConstraints);

        panelBorder25.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder25.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder25.setPreferredSize(new java.awt.Dimension(80, 80));

        btnActualizarCliente3.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizarCliente3.setBorder(null);
        btnActualizarCliente3.setBorderPainted(false);
        btnActualizarCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente3.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder25Layout = new javax.swing.GroupLayout(panelBorder25);
        panelBorder25.setLayout(panelBorder25Layout);
        panelBorder25Layout.setHorizontalGroup(
            panelBorder25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder25Layout.setVerticalGroup(
            panelBorder25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        jPanel18.add(panelBorder25, gridBagConstraints);

        panelBorder26.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder26.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder26.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEditarCliente3.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarCliente3.setBorder(null);
        btnEditarCliente3.setBorderPainted(false);
        btnEditarCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente3.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder26Layout = new javax.swing.GroupLayout(panelBorder26);
        panelBorder26.setLayout(panelBorder26Layout);
        panelBorder26Layout.setHorizontalGroup(
            panelBorder26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder26Layout.setVerticalGroup(
            panelBorder26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 27, 0, 27);
        jPanel18.add(panelBorder26, gridBagConstraints);

        panelBorder27.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder27.setMaximumSize(new java.awt.Dimension(80, 80));
        panelBorder27.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEliminarCliente3.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminarCliente3.setBorder(null);
        btnEliminarCliente3.setBorderPainted(false);
        btnEliminarCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente3.setFocusPainted(false);

        javax.swing.GroupLayout panelBorder27Layout = new javax.swing.GroupLayout(panelBorder27);
        panelBorder27.setLayout(panelBorder27Layout);
        panelBorder27Layout.setHorizontalGroup(
            panelBorder27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder27Layout.setVerticalGroup(
            panelBorder27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 28);
        jPanel18.add(panelBorder27, gridBagConstraints);

        javax.swing.GroupLayout ContenedorRegistroClientes3Layout = new javax.swing.GroupLayout(ContenedorRegistroClientes3);
        ContenedorRegistroClientes3.setLayout(ContenedorRegistroClientes3Layout);
        ContenedorRegistroClientes3Layout.setHorizontalGroup(
            ContenedorRegistroClientes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sTable4)
            .addGroup(ContenedorRegistroClientes3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorRegistroClientes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(ContenedorRegistroClientes3Layout.createSequentialGroup()
                        .addComponent(lblSubtittleClientes8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenedorRegistroClientes3Layout.setVerticalGroup(
            ContenedorRegistroClientes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorRegistroClientes3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSubtittleClientes8)
                .addGap(18, 18, 18)
                .addComponent(sTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        BuscarClientes3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        txtBuscarCliente3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtBuscarCliente3.setForeground(new java.awt.Color(127, 127, 127));
        txtBuscarCliente3.setText("Buscar...");
        txtBuscarCliente3.setBorder(null);
        txtBuscarCliente3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCliente3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCliente3FocusLost(evt);
            }
        });

        javax.swing.GroupLayout BuscarClientes3Layout = new javax.swing.GroupLayout(BuscarClientes3);
        BuscarClientes3.setLayout(BuscarClientes3Layout);
        BuscarClientes3Layout.setHorizontalGroup(
            BuscarClientes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscarClientes3Layout.setVerticalGroup(
            BuscarClientes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarClientes3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtBuscarCliente3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponibilidad....", "Activo", "Inactivo" }));
        jComboBox4.setBorder(null);
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox4.setOpaque(true);

        javax.swing.GroupLayout Disponibilidad3Layout = new javax.swing.GroupLayout(Disponibilidad3);
        Disponibilidad3.setLayout(Disponibilidad3Layout);
        Disponibilidad3Layout.setHorizontalGroup(
            Disponibilidad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Disponibilidad3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Disponibilidad3Layout.setVerticalGroup(
            Disponibilidad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Vista_UsuariosLayout = new javax.swing.GroupLayout(Vista_Usuarios);
        Vista_Usuarios.setLayout(Vista_UsuariosLayout);
        Vista_UsuariosLayout.setHorizontalGroup(
            Vista_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vista_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista_UsuariosLayout.createSequentialGroup()
                        .addComponent(BuscarClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disponibilidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContenedorRegistroClientes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        Vista_UsuariosLayout.setVerticalGroup(
            Vista_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_UsuariosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(Vista_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarClientes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Disponibilidad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ContenedorRegistroClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        Contenedor.add(Vista_Usuarios, "card3");

        javax.swing.GroupLayout ContenedorPrincipalLayout = new javax.swing.GroupLayout(ContenedorPrincipal);
        ContenedorPrincipal.setLayout(ContenedorPrincipalLayout);
        ContenedorPrincipalLayout.setHorizontalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ContenedorPrincipalLayout.setVerticalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVista_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVista_ClientesActionPerformed
        // TODO add your handling code here:
        pasar.hiden_panel(Vista_Inicio, Vista_Catalogo, Vista_RegistroRentas1, Vista_RegistroRentas2,
                Vista_Reservas, Vista_Usuarios);
        lbl_Title.setText("Registro de Clientes");
        Vista_Clientes.setVisible(true);
    }//GEN-LAST:event_btnVista_ClientesActionPerformed

    private void btnVista_CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVista_CatalogoActionPerformed
        // TODO add your handling code here:
        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_RegistroRentas1, Vista_RegistroRentas2,
                Vista_Reservas, Vista_Usuarios);
        lbl_Title.setText("Catálogo");
        Vista_Catalogo.setVisible(true);

    }//GEN-LAST:event_btnVista_CatalogoActionPerformed

    private void btnVista_RentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVista_RentarActionPerformed

        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_Catalogo, Vista_RegistroRentas2,
            Vista_Reservas, Vista_Usuarios);
        lbl_Title.setText("Reservar");
        Vista_RegistroRentas1.setVisible(true);

    }//GEN-LAST:event_btnVista_RentarActionPerformed

    private void btnVista_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVista_ReservasActionPerformed
        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_Catalogo
        , Vista_RegistroRentas1, Vista_RegistroRentas2, Vista_Usuarios);
        lbl_Title.setText("Reservas");
        Vista_Reservas.setVisible(true);

    }//GEN-LAST:event_btnVista_ReservasActionPerformed

    private void btnVista_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVista_UsuariosActionPerformed
        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_Catalogo
        , Vista_RegistroRentas1, Vista_RegistroRentas2, Vista_Reservas);
        lbl_Title.setText("Usuarios");
        Vista_Usuarios.setVisible(true);
    }//GEN-LAST:event_btnVista_UsuariosActionPerformed

    private void btnVista_ClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_ClientesMouseEntered

        btnVista_Clientes.setBackground(Color.white);
        btnVista_Clientes.setForeground(Color.red);
    }//GEN-LAST:event_btnVista_ClientesMouseEntered

    private void btnVista_CatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_CatalogoMouseEntered
        // TODO add your handling code here:
        btnVista_Catalogo.setBackground(Color.white);
        btnVista_Catalogo.setForeground(Color.red);
    }//GEN-LAST:event_btnVista_CatalogoMouseEntered

    private void btnVista_RentarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_RentarMouseEntered
        // TODO add your handling code here:
        btnVista_Rentar.setBackground(Color.white);
        btnVista_Rentar.setForeground(Color.red);
    }//GEN-LAST:event_btnVista_RentarMouseEntered

    private void btnVista_ReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_ReservasMouseEntered
        // TODO add your handling code here:
        btnVista_Reservas.setBackground(Color.white);
        btnVista_Reservas.setForeground(Color.red);
    }//GEN-LAST:event_btnVista_ReservasMouseEntered

    private void btnVista_UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_UsuariosMouseEntered
        // TODO add your handling code here:
        btnVista_Usuarios.setBackground(Color.white);
        btnVista_Usuarios.setForeground(Color.red);
    }//GEN-LAST:event_btnVista_UsuariosMouseEntered

    private void btnVista_ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_ClientesMouseExited
        // TODO add your handling code here:
        btnVista_Clientes.setBackground(Color.decode("#FF3333"));
        btnVista_Clientes.setForeground(Color.white);
    }//GEN-LAST:event_btnVista_ClientesMouseExited

    private void btnVista_CatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_CatalogoMouseExited
        // TODO add your handling code here:
        btnVista_Catalogo.setBackground(Color.decode("#FF3333"));
        btnVista_Catalogo.setForeground(Color.white);
    }//GEN-LAST:event_btnVista_CatalogoMouseExited

    private void btnVista_RentarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_RentarMouseExited
        // TODO add your handling code here:
        btnVista_Rentar.setBackground(Color.decode("#FF3333"));
        btnVista_Rentar.setForeground(Color.white);
    }//GEN-LAST:event_btnVista_RentarMouseExited

    private void btnVista_ReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_ReservasMouseExited
        // TODO add your handling code here:
        btnVista_Reservas.setBackground(Color.decode("#FF3333"));
        btnVista_Reservas.setForeground(Color.white);
    }//GEN-LAST:event_btnVista_ReservasMouseExited

    private void btnVista_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVista_UsuariosMouseExited
        // TODO add your handling code here:
        btnVista_Usuarios.setBackground(Color.decode("#FF3333"));
        btnVista_Usuarios.setForeground(Color.white);
    }//GEN-LAST:event_btnVista_UsuariosMouseExited

    private void txtBuscarClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarClienteFocusGained
        // TODO add your handling code here:
        txtBuscarCliente.setText("");
    }//GEN-LAST:event_txtBuscarClienteFocusGained

    private void txtBuscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarClienteFocusLost
        // TODO add your handling code here:
        txtBuscarCliente.setText("Buscar...");
    }//GEN-LAST:event_txtBuscarClienteFocusLost

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        new ValidacionesClientesCampos().setVisible(true);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void Vista_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vista_ClientesMouseClicked
        // TODO add your handling code here:
        table1.clearSelection();
    }//GEN-LAST:event_Vista_ClientesMouseClicked

    private void table1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table1FocusLost
        // TODO add your handling code here:
        table1.clearSelection();
    }//GEN-LAST:event_table1FocusLost

    private void table2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_table2FocusLost

    private void btnAgregarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente1ActionPerformed
        // TODO add your handling code here:
        
        new ValidacionesReservasCampos().setVisible(true);
    }//GEN-LAST:event_btnAgregarCliente1ActionPerformed

    private void txtBuscarCliente1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente1FocusGained

    private void txtBuscarCliente1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente1FocusLost

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentResized

    private void btnCatalogoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogoReservarActionPerformed

    private void btnContinuarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarReservaActionPerformed
        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_Catalogo, Vista_RegistroRentas1,
   Vista_Reservas, Vista_Usuarios);
        lbl_Title.setText("Reservar");
        Vista_RegistroRentas2.setVisible(true);
    }//GEN-LAST:event_btnContinuarReservaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        pasar.hiden_panel(Vista_Inicio, Vista_Clientes, Vista_Catalogo, Vista_RegistroRentas2,
        Vista_Reservas, Vista_Usuarios);
        lbl_Title.setText("Reservar");
        Vista_RegistroRentas1.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnSeleccionarHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarHoraMouseClicked
        // TODO add your handling code here:
        time.showPopup(this, 500, 150);
    }//GEN-LAST:event_btnSeleccionarHoraMouseClicked

    private void table3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_table3FocusLost

    private void btnAgregarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCliente2ActionPerformed

    private void txtBuscarCliente2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente2FocusGained

    private void txtBuscarCliente2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente2FocusLost

    private void Vista_ReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vista_ReservasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista_ReservasMouseClicked

    private void table4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_table4FocusLost

    private void btnAgregarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCliente3ActionPerformed

    private void txtBuscarCliente3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente3FocusGained

    private void txtBuscarCliente3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCliente3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliente3FocusLost

    private void Vista_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vista_UsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista_UsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.PanelBorder BuscarClientes;
    private componentes.PanelBorder BuscarClientes1;
    private componentes.PanelBorder BuscarClientes2;
    private componentes.PanelBorder BuscarClientes3;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel ContenedorPrincipal;
    private componentes.PanelBorder ContenedorRegistroClientes;
    private componentes.PanelBorder ContenedorRegistroClientes1;
    private componentes.PanelBorder ContenedorRegistroClientes2;
    private componentes.PanelBorder ContenedorRegistroClientes3;
    private javax.swing.JPanel Disponibilidad;
    private javax.swing.JPanel Disponibilidad1;
    private javax.swing.JPanel Disponibilidad2;
    private javax.swing.JPanel Disponibilidad3;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Titulo;
    private javax.swing.JPanel Vista_Catalogo;
    private javax.swing.JPanel Vista_Clientes;
    private javax.swing.JPanel Vista_Inicio;
    private javax.swing.JPanel Vista_RegistroRentas1;
    private javax.swing.JPanel Vista_RegistroRentas2;
    private javax.swing.JPanel Vista_Reservas;
    private javax.swing.JPanel Vista_Usuarios;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarCliente1;
    private javax.swing.JButton btnActualizarCliente2;
    private javax.swing.JButton btnActualizarCliente3;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCliente1;
    private javax.swing.JButton btnAgregarCliente2;
    private javax.swing.JButton btnAgregarCliente3;
    private javax.swing.JButton btnCatalogoReservar;
    private javax.swing.JButton btnContinuarReserva;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarCliente1;
    private javax.swing.JButton btnEditarCliente2;
    private javax.swing.JButton btnEditarCliente3;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCliente1;
    private javax.swing.JButton btnEliminarCliente2;
    private javax.swing.JButton btnEliminarCliente3;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JPanel btnMenu1;
    private javax.swing.JPanel btnMenu2;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JTextField btnSeleccionarHora;
    private javax.swing.JButton btnVista_Catalogo;
    private javax.swing.JButton btnVista_Clientes;
    private javax.swing.JButton btnVista_Rentar;
    private javax.swing.JButton btnVista_Reservas;
    private javax.swing.JButton btnVista_Usuarios;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblSubtittleClientes;
    private javax.swing.JLabel lblSubtittleClientes1;
    private javax.swing.JLabel lblSubtittleClientes2;
    private javax.swing.JLabel lblSubtittleClientes3;
    private javax.swing.JLabel lblSubtittleClientes4;
    private javax.swing.JLabel lblSubtittleClientes5;
    private javax.swing.JLabel lblSubtittleClientes6;
    private javax.swing.JLabel lblSubtittleClientes7;
    private javax.swing.JLabel lblSubtittleClientes8;
    private javax.swing.JLabel lbl_Title;
    private componentes.PanelBorder panelBorder1;
    private componentes.PanelBorder panelBorder10;
    private componentes.PanelBorder panelBorder11;
    private componentes.PanelBorder panelBorder12;
    private componentes.PanelBorder panelBorder13;
    private componentes.PanelBorder panelBorder14;
    private componentes.PanelBorder panelBorder15;
    private componentes.PanelBorder panelBorder16;
    private componentes.PanelBorder panelBorder17;
    private componentes.PanelBorder panelBorder18;
    private componentes.PanelBorder panelBorder19;
    private componentes.PanelBorder panelBorder2;
    private componentes.PanelBorder panelBorder20;
    private componentes.PanelBorder panelBorder21;
    private componentes.PanelBorder panelBorder22;
    private componentes.PanelBorder panelBorder23;
    private componentes.PanelBorder panelBorder24;
    private componentes.PanelBorder panelBorder25;
    private componentes.PanelBorder panelBorder26;
    private componentes.PanelBorder panelBorder27;
    private componentes.PanelBorder panelBorder3;
    private componentes.PanelBorder panelBorder4;
    private componentes.PanelBorder panelBorder5;
    private componentes.PanelBorder panelBorder6;
    private componentes.PanelBorder panelBorder7;
    private componentes.PanelBorder panelBorder8;
    private componentes.PanelBorder panelBorder9;
    private javax.swing.JScrollPane sTable1;
    private javax.swing.JScrollPane sTable2;
    private javax.swing.JScrollPane sTable3;
    private javax.swing.JScrollPane sTable4;
    private javax.swing.JSpinner spDias;
    private javax.swing.JSpinner spHoras;
    private componentes.Table table1;
    private componentes.Table table2;
    private componentes.Table table3;
    private componentes.Table table4;
    private com.raven.swing.TimePicker time;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarCliente1;
    private javax.swing.JTextField txtBuscarCliente2;
    private javax.swing.JTextField txtBuscarCliente3;
    // End of variables declaration//GEN-END:variables

    private void init() {
        sTable1.setVerticalScrollBar(new ScrollBar());
        sTable1.setHorizontalScrollBar(new ScrollBar());
    }
}
