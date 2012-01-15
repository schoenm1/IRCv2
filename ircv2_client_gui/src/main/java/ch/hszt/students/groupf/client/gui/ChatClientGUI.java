/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChatClientGUI.java
 *
 * Created on 27.10.2011, 11:58:27
 */
package ch.hszt.students.groupf.client.gui;

import java.awt.event.KeyEvent;
import java.net.InetAddress;

import ch.hszt.students.groupf.client.controller.ClientController;
import ch.hszt.students.groupf.client.controller.UserInterfaceIfc;

/**
 * 
 * @author rest
 */
public class ChatClientGUI extends javax.swing.JFrame implements UserInterfaceIfc {

	private final ClientController _controller;

	/** Creates new form ChatClientGUI */
	public ChatClientGUI(ClientController inClientController) {
		_controller = inClientController;
		init();
		initComponents();
		setVisible(true);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		_jTxtAReceived = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		_jTxtAInput = new javax.swing.JTextArea();
		_jBtnSend = new javax.swing.JButton();
		_jLblConnLbl = new javax.swing.JLabel();
		_jLblConnStatus = new javax.swing.JLabel();
		_jMenuBar = new javax.swing.JMenuBar();
		_jMenuConn = new javax.swing.JMenu();
		_jMenuItemOpConn = new javax.swing.JMenuItem();
		_jMenuItemClCon = new javax.swing.JMenuItem();
		_jMenuHelp = new javax.swing.JMenu();
		_jMenuItemHlpCmd = new javax.swing.JMenuItem();
		_jMenuItemHlpAbout = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("IRCv2 Chat Client");

		_jTxtAReceived.setColumns(20);
		_jTxtAReceived.setEditable(false);
		_jTxtAReceived.setLineWrap(true);
		_jTxtAReceived.setRows(5);
		jScrollPane1.setViewportView(_jTxtAReceived);

		_jTxtAInput.setColumns(20);
		_jTxtAInput.setLineWrap(true);
		_jTxtAInput.setRows(5);
		_jTxtAInput.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				onKeyPressed(evt);
			}
		});
		jScrollPane2.setViewportView(_jTxtAInput);

		_jBtnSend.setText("Send");
		_jBtnSend.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				onSendActionPerformed(evt);
			}
		});

		_jLblConnLbl.setText("Connection Status:");

		_jLblConnStatus.setText("Not connected");

		_jMenuConn.setText("Connection");

		_jMenuItemOpConn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y,
				java.awt.event.InputEvent.CTRL_MASK));
		_jMenuItemOpConn.setText("Open Connection");
		_jMenuItemOpConn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				onOpenConnection(evt);
			}
		});
		_jMenuConn.add(_jMenuItemOpConn);

		_jMenuItemClCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X,
				java.awt.event.InputEvent.CTRL_MASK));
		_jMenuItemClCon.setText("Close Connection");
		_jMenuItemClCon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				onCloseConnection(evt);
			}
		});
		_jMenuConn.add(_jMenuItemClCon);

		_jMenuBar.add(_jMenuConn);

		_jMenuHelp.setText("Help");

		_jMenuItemHlpCmd.setText("Commands");
		_jMenuHelp.add(_jMenuItemHlpCmd);

		_jMenuItemHlpAbout.setText("About");
		_jMenuHelp.add(_jMenuItemHlpAbout);

		_jMenuBar.add(_jMenuHelp);

		setJMenuBar(_jMenuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 612,
												Short.MAX_VALUE)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612,
												Short.MAX_VALUE)
										.addGroup(
												layout.createSequentialGroup()
														.addComponent(_jLblConnLbl)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(_jLblConnStatus)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																337, Short.MAX_VALUE)
														.addComponent(_jBtnSend,
																javax.swing.GroupLayout.PREFERRED_SIZE, 79,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(_jLblConnLbl).addComponent(_jLblConnStatus))
										.addComponent(_jBtnSend))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void onKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_onKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			if (evt.isControlDown()) {
				_jTxtAInput.append("\n");
			} else {
				sendMsg();

			}
		}
	}// GEN-LAST:event_onKeyPressed

	private void onSendActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_onSendActionPerformed
		sendMsg();
	}// GEN-LAST:event_onSendActionPerformed

	private void sendMsg() {
		_controller.send(_jTxtAInput.getText());
		_jTxtAInput.setText("");

	}

	private void onOpenConnection(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_onOpenConnection
		ChatClientConnGUI clientConnGUI = new ChatClientConnGUI(this, true);
		clientConnGUI.setVisible(true);
		String username = clientConnGUI.getUserName();
		InetAddress serverAddress = clientConnGUI.getServerAddress();
		int serverPort = clientConnGUI.getServerPort();
		if (serverAddress != null) {
			_controller.connect(serverAddress, serverPort, username);
		}
	}// GEN-LAST:event_onOpenConnection

	private void onCloseConnection(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_onCloseConnection
		// TODO add your handling code here:
	}// GEN-LAST:event_onCloseConnection

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void init() {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton _jBtnSend;
	private javax.swing.JLabel _jLblConnLbl;
	private javax.swing.JLabel _jLblConnStatus;
	private javax.swing.JMenuBar _jMenuBar;
	private javax.swing.JMenu _jMenuConn;
	private javax.swing.JMenu _jMenuHelp;
	private javax.swing.JMenuItem _jMenuItemClCon;
	private javax.swing.JMenuItem _jMenuItemHlpAbout;
	private javax.swing.JMenuItem _jMenuItemHlpCmd;
	private javax.swing.JMenuItem _jMenuItemOpConn;
	private javax.swing.JTextArea _jTxtAInput;
	private javax.swing.JTextArea _jTxtAReceived;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;

	// End of variables declaration//GEN-END:variables

	public void onReceivedMsg(String inMessage) {
		_jTxtAReceived.append(inMessage + System.getProperty("line.separator"));

	}

	public void onDisconnected(Exception inEx) {
		// TODO Auto-generated method stub

	}

	public void displayConnStatus(String connectionStatus) {
		// TODO Auto-generated method stub

	}
}