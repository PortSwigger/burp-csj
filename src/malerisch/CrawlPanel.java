package malerisch;

import burp.IBurpExtenderCallbacks;
import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class CrawlPanel extends javax.swing.JPanel {

    private IBurpExtenderCallbacks callbacks;
    private CrawljaxConfigurationBuilder builder;
    private CrawljaxRunner crawljax;

    public CrawlPanel(final IBurpExtenderCallbacks callbacks) {
        initComponents(callbacks);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(final IBurpExtenderCallbacks callbacks) {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        systemproxy = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        burpcookie = new javax.swing.JCheckBox();
        clickonce = new javax.swing.JCheckBox();
        insertrandom = new javax.swing.JCheckBox();
        crawlhiddenanchors = new javax.swing.JCheckBox();
        crawlframes = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        Instance = new javax.swing.JComboBox();
        Browser = new javax.swing.JComboBox();
        manualproxy = new javax.swing.JRadioButton();
        HostProxy = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chromelocation = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ielocation = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        phatomjslocation = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        PortProxy = new javax.swing.JTextField();
        waitafterreloadurl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        waitafterevent = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        maxdepth = new javax.swing.JTextField();
        maxstates = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        elA = new javax.swing.JRadioButton();
        elBUTTON = new javax.swing.JRadioButton();
        elTD = new javax.swing.JRadioButton();
        elSPAN = new javax.swing.JRadioButton();
        elDIV = new javax.swing.JRadioButton();
        elFORM = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        maxruntime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        remoteurl = new javax.swing.JTextPane();
        elINPUT = new javax.swing.JRadioButton();
        elOPTION = new javax.swing.JRadioButton();
        elIMG = new javax.swing.JRadioButton();
        elLINK = new javax.swing.JRadioButton();
        elP = new javax.swing.JRadioButton();
        elSELECT = new javax.swing.JRadioButton();
        elXHR = new javax.swing.JRadioButton();
        elREFRESH = new javax.swing.JRadioButton();
        elMETA = new javax.swing.JRadioButton();
        elRELATIVE = new javax.swing.JRadioButton();
        elNON = new javax.swing.JRadioButton();
        elRADIO = new javax.swing.JRadioButton();
        elTR = new javax.swing.JRadioButton();
        elOL = new javax.swing.JRadioButton();
        elLI = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        elSELF = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        eTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        noplugins = new javax.swing.JRadioButton();
        overviewplugin = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        outputpath = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        buttonGroup1.add(systemproxy);
        systemproxy.setSelected(true);
        systemproxy.setText("Use System Proxy Settings");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Generic Settings");

        jLabel2.setText("Browser");

        jLabel3.setText("Instances");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("Proxy Type");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Advanced Options");

        burpcookie.setSelected(true);
        burpcookie.setText("Use Burp CookieJar");

        clickonce.setSelected(true);
        clickonce.setText("Click Once");

        insertrandom.setSelected(true);
        insertrandom.setText("Insert Random Input On Forms");

        crawlhiddenanchors.setText("Crawl Hidden Anchors");

        crawlframes.setText("Crawl Frames");
        crawlframes.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Configured Browsers");

        Instance.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));

        Browser.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Firefox", "Remote", "Chrome", "IE", "PhantomJS"}));

        buttonGroup1.add(manualproxy);
        manualproxy.setText("Use Manual Proxy");

        HostProxy.setText("localhost");

        jLabel8.setText("Remote");

        jLabel9.setText("Chrome");

        chromelocation.setText("Path to chromedriver.exe");

        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("IE");

        ielocation.setText("Path to IEDriverServer.exe");

        jButton4.setText("Choose File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("PhantomJS");

        phatomjslocation.setText("Path to phantomjs.exe");

        jButton5.setText("Choose File");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        PortProxy.setText("8080");

        waitafterreloadurl.setText("500");

        jLabel6.setText("Wait After Reload URL");

        jLabel12.setText("Wait After Event");

        waitafterevent.setText("500");

        jLabel13.setText("Maximum Depth");

        maxdepth.setText("2");

        maxstates.setText("0");

        jLabel14.setText("Maximum States");

        elA.setSelected(true);
        elA.setText("A");

        elBUTTON.setSelected(true);
        elBUTTON.setText("BUTTON");

        elTD.setText("TD");

        elSPAN.setText("SPAN");

        elDIV.setText("DIV");

        elFORM.setText("FORM");

        jLabel15.setText("Max Runtime (mins)");

        maxruntime.setText("60");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        remoteurl.setText("http://server:port/");
        jScrollPane1.setViewportView(remoteurl);

        elINPUT.setText("INPUT");

        elOPTION.setText("OPTION");

        elIMG.setText("IMG");

        elLINK.setText("LINK");

        elP.setText("P");

        elSELECT.setText("SELECT");

        elXHR.setText("XHR");

        elREFRESH.setText("REFRESH");

        elMETA.setText("META");

        elRELATIVE.setText("RELATIVE");

        elNON.setText("NON");

        elRADIO.setText("RADIO");

        elTR.setText("TR");

        elOL.setText("OL");

        elLI.setText("LI");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("Crawl Elements");

        elSELF.setText("SELF");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        eTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"exit"},
                    {"signout"},
                    {"signoff"},
                    {"logoff"},
                    {"logout"}
                },
                new String[]{
                    "Exclusion"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane3.setViewportView(eTable);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(noplugins);
        noplugins.setSelected(true);
        noplugins.setText("No Plugins");

        buttonGroup2.add(overviewplugin);
        overviewplugin.setText("Overview Plugin");

        jButton6.setText("Choose folder");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("Plugins");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(manualproxy)
                                        .addGap(18, 18, 18)
                                        .addComponent(HostProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PortProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(burpcookie)
                                                .addComponent(crawlhiddenanchors)
                                                .addComponent(crawlframes)
                                                .addComponent(clickonce)
                                                .addComponent(insertrandom))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(waitafterreloadurl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(maxruntime, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(maxstates, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(maxdepth, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(waitafterevent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))))
                                .addComponent(jLabel5)
                                .addComponent(jLabel16)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Browser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Instance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(systemproxy)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel11))
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(chromelocation)
                                                                                        .addComponent(ielocation)
                                                                                        .addComponent(phatomjslocation, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jButton2)
                                                                                        .addComponent(jButton4)
                                                                                        .addComponent(jButton5)))
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel7))
                                                                .addGap(188, 188, 188))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(elA)
                                                        .addComponent(elBUTTON)
                                                        .addComponent(elTD)
                                                        .addComponent(elSPAN)
                                                        .addComponent(elDIV)
                                                        .addComponent(elFORM)
                                                        .addComponent(elTR))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(elINPUT)
                                                        .addComponent(elOL)
                                                        .addComponent(elSELECT)
                                                        .addComponent(elP)
                                                        .addComponent(elLINK)
                                                        .addComponent(elIMG)
                                                        .addComponent(elOPTION))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(elLI)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(elXHR)
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(elSELF))
                                                                        .addComponent(elREFRESH)
                                                                        .addComponent(elMETA)
                                                                        .addComponent(elRELATIVE)
                                                                        .addComponent(elNON)
                                                                        .addComponent(elRADIO))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(noplugins)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(outputpath, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(overviewplugin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton6))
                                                                        .addComponent(jLabel17)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton1)
                                                                        .addComponent(jButton3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(Browser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(Instance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(systemproxy)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(manualproxy)
                                                .addComponent(HostProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PortProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(chromelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10)
                                                .addComponent(ielocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton4))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(phatomjslocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton5)
                                                .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(burpcookie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clickonce)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(insertrandom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crawlhiddenanchors)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(crawlframes))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(waitafterreloadurl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel12)
                                                .addComponent(waitafterevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13)
                                                .addComponent(maxdepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(maxstates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel15)
                                                .addComponent(maxruntime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(elA)
                                                .addComponent(elINPUT)
                                                .addComponent(elXHR)
                                                .addComponent(elSELF))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(elBUTTON)
                                                .addComponent(elOPTION)
                                                .addComponent(elREFRESH))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(elTD)
                                                        .addComponent(elIMG))
                                                .addComponent(elMETA))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(elSPAN)
                                                .addComponent(elLINK)
                                                .addComponent(elRELATIVE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(elDIV)
                                                .addComponent(elP)
                                                .addComponent(elNON))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(elFORM)
                                                        .addComponent(elSELECT))
                                                .addComponent(elRADIO))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(elTR)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(elOL)
                                                        .addComponent(elLI))))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(noplugins)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(overviewplugin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(outputpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton6))))
                        .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new javax.swing.JFileChooser();
        int returnVal = fc.showOpenDialog(CrawlPanel.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            ielocation.setText(file.getAbsolutePath());
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new javax.swing.JFileChooser();
        int returnVal = fc.showOpenDialog(CrawlPanel.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            chromelocation.setText(file.getAbsolutePath());
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new javax.swing.JFileChooser();
        int returnVal = fc.showOpenDialog(CrawlPanel.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            file.getAbsolutePath();
            phatomjslocation.setText(file.getAbsolutePath());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) eTable.getModel();
        model.addRow(new Object[]{""});
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) eTable.getModel();
        Integer rows = model.getRowCount();
        model.removeRow(rows);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new javax.swing.JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(CrawlPanel.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            file.getAbsolutePath();
            outputpath.setText(file.getAbsolutePath());
        }
    }

    // Variables declaration - do not modify
    public static javax.swing.JComboBox Browser;
    public static javax.swing.JTextField HostProxy;
    public static javax.swing.JComboBox Instance;
    public static javax.swing.JTextField PortProxy;
    public static javax.swing.JCheckBox burpcookie;
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JTextField chromelocation;
    public static javax.swing.JCheckBox clickonce;
    public static javax.swing.JCheckBox crawlframes;
    public static javax.swing.JCheckBox crawlhiddenanchors;
    public static javax.swing.JTable eTable;
    public static javax.swing.JRadioButton elA;
    public static javax.swing.JRadioButton elBUTTON;
    public static javax.swing.JRadioButton elDIV;
    public static javax.swing.JRadioButton elFORM;
    public static javax.swing.JRadioButton elIMG;
    public static javax.swing.JRadioButton elINPUT;
    public static javax.swing.JRadioButton elLI;
    public static javax.swing.JRadioButton elLINK;
    public static javax.swing.JRadioButton elMETA;
    public static javax.swing.JRadioButton elNON;
    public static javax.swing.JRadioButton elOL;
    public static javax.swing.JRadioButton elOPTION;
    public static javax.swing.JRadioButton elP;
    public static javax.swing.JRadioButton elRADIO;
    public static javax.swing.JRadioButton elREFRESH;
    public static javax.swing.JRadioButton elRELATIVE;
    public static javax.swing.JRadioButton elSELECT;
    public static javax.swing.JRadioButton elSELF;
    public static javax.swing.JRadioButton elSPAN;
    public static javax.swing.JRadioButton elTD;
    public static javax.swing.JRadioButton elTR;
    public static javax.swing.JRadioButton elXHR;
    public static javax.swing.JTextField ielocation;
    public static javax.swing.JCheckBox insertrandom;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JRadioButton manualproxy;
    public static javax.swing.JTextField maxdepth;
    public static javax.swing.JTextField maxruntime;
    public static javax.swing.JTextField maxstates;
    public static javax.swing.JRadioButton noplugins;
    public static javax.swing.JTextField outputpath;
    public static javax.swing.JRadioButton overviewplugin;
    public static javax.swing.JTextField phatomjslocation;
    public static javax.swing.JTextPane remoteurl;
    public static javax.swing.JRadioButton systemproxy;
    public static javax.swing.JTextField waitafterevent;
    public static javax.swing.JTextField waitafterreloadurl;
}
