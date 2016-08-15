/*
 * BookQueryPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package cn.hncu.bookStore.book.ui;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cn.hncu.bookStore.book.business.ebi.BookEbi;
import cn.hncu.bookStore.book.business.factory.BookEbiFactory;
import cn.hncu.bookStore.book.vo.BookModel;
import cn.hncu.bookStore.book.vo.BookQueryModel;

/**
 * 
 * @author �º���
 *
 * @version 1.0
 */
public class BookQueryPanel extends javax.swing.JPanel {
	private JFrame mainFrame = null;

	/** Creates new form BookQueryPanel 
	 * @param mainFrame */
	public BookQueryPanel(JFrame mainFrame) {
		this.mainFrame = mainFrame;
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		tfdName = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		tfdUuid = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		btnQuery = new javax.swing.JButton();
		btnBack = new javax.swing.JButton();
		tfdInPrice = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		tfdSalePrice = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		tfdInPrice2 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		tfdSalePrice2 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();

		setMinimumSize(new java.awt.Dimension(800, 600));
		setLayout(null);

		jLabel1.setFont(new java.awt.Font("΢���ź�", 1, 48));
		jLabel1.setForeground(new java.awt.Color(204, 0, 0));
		jLabel1.setText("\u67e5\u627e\u56fe\u4e66");
		add(jLabel1);
		jLabel1.setBounds(280, 40, 230, 80);

		tfdName.setFont(new java.awt.Font("Dialog", 1, 18));
		tfdName.setAutoscrolls(false);
		add(tfdName);
		tfdName.setBounds(520, 190, 150, 30);

		jLabel3.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel3.setText("uuid:");
		add(jLabel3);
		jLabel3.setBounds(130, 190, 50, 30);

		tfdUuid.setFont(new java.awt.Font("Dialog", 1, 12));
		add(tfdUuid);
		tfdUuid.setBounds(200, 190, 150, 30);

		jLabel4.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel4.setText("\u56fe\u4e66\u540d\u79f0:");
		add(jLabel4);
		jLabel4.setBounds(420, 190, 90, 30);

		btnQuery.setFont(new java.awt.Font("Dialog", 1, 24));
		btnQuery.setForeground(new java.awt.Color(0, 204, 204));
		btnQuery.setText("\u67e5\u627e");
		btnQuery.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnQueryActionPerformed(evt);
			}
		});
		add(btnQuery);
		btnQuery.setBounds(140, 470, 120, 60);

		btnBack.setFont(new java.awt.Font("Dialog", 1, 24));
		btnBack.setForeground(new java.awt.Color(0, 204, 204));
		btnBack.setText("\u8fd4\u56de");
		btnBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBackActionPerformed(evt);
			}
		});
		add(btnBack);
		btnBack.setBounds(490, 470, 120, 60);

		tfdInPrice.setFont(new java.awt.Font("Dialog", 1, 18));
		tfdInPrice.setAutoscrolls(false);
		add(tfdInPrice);
		tfdInPrice.setBounds(200, 280, 150, 30);

		jLabel5.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel5.setText("\u8fdb\u8d27\u6700\u4f4e\u4ef7\u683c\uff1a");
		add(jLabel5);
		jLabel5.setBounds(60, 280, 130, 30);

		tfdSalePrice.setFont(new java.awt.Font("Dialog", 1, 18));
		tfdSalePrice.setAutoscrolls(false);
		add(tfdSalePrice);
		tfdSalePrice.setBounds(200, 370, 150, 30);

		jLabel6.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel6.setText("\u552e\u8d27\u6700\u4f4e\u4ef7\u683c\uff1a");
		add(jLabel6);
		jLabel6.setBounds(60, 370, 130, 30);

		tfdInPrice2.setFont(new java.awt.Font("Dialog", 1, 18));
		tfdInPrice2.setAutoscrolls(false);
		add(tfdInPrice2);
		tfdInPrice2.setBounds(520, 280, 150, 30);

		jLabel11.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel11.setText("\u8fdb\u8d27\u6700\u9ad8\u4ef7\u683c\uff1a");
		add(jLabel11);
		jLabel11.setBounds(380, 280, 130, 30);

		tfdSalePrice2.setFont(new java.awt.Font("Dialog", 1, 18));
		tfdSalePrice2.setAutoscrolls(false);
		add(tfdSalePrice2);
		tfdSalePrice2.setBounds(520, 370, 150, 30);

		jLabel12.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel12.setText("\u552e\u8d27\u6700\u9ad8\u4ef7\u683c\uff1a");
		add(jLabel12);
		jLabel12.setBounds(380, 370, 130, 30);
	}// </editor-fold>
	//GEN-END:initComponents

	protected void btnQueryActionPerformed(ActionEvent evt) {
		//1�ռ�����
		String uuid = tfdUuid.getText();
		String name = tfdName.getText();
		double inPrice = 0;
		double inPrice2 = 0;
		double salePrice = 0;
		double salePrice2 = 0;

		if (tfdInPrice.getText() != null
				&& tfdInPrice.getText().trim().length() > 0) {
			try {
				inPrice = Double.parseDouble(tfdInPrice.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(mainFrame, "��ͽ��������ʽ����!");
				return;
			}
		}

		if (tfdInPrice2.getText() != null
				&& tfdInPrice2.getText().trim().length() > 0) {
			try {
				inPrice2 = Double.parseDouble(tfdInPrice2.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(mainFrame, "��߽��������ʽ����!");
				return;
			}
		}

		if (tfdSalePrice.getText() != null
				&& tfdSalePrice.getText().trim().length() > 0) {
			try {
				salePrice = Double.parseDouble(tfdSalePrice.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(mainFrame, "��ͽ��������ʽ����!");
				return;
			}
		}

		if (tfdSalePrice2.getText() != null
				&& tfdSalePrice2.getText().trim().length() > 0) {
			try {
				salePrice2 = Double.parseDouble(tfdSalePrice2.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(mainFrame, "��ͽ��������ʽ����!");
				return;
			}
		}
		//2��֯����
		BookQueryModel bqm = new BookQueryModel();
		bqm.setUuid(uuid);
		bqm.setName(name);
		bqm.setInPrice(inPrice);
		bqm.setInPrice2(inPrice2);
		bqm.setSalePrice(salePrice);
		bqm.setSalePrice2(salePrice2);

		//3�����߼���
		BookEbi ebi = BookEbiFactory.getBookEbi();
		List<BookModel> results = ebi.getbyCondition(bqm);

		//4���ݵ��÷��ؽ������ͬҳ��
		mainFrame.setContentPane(new BookListPanel(mainFrame, results));
		mainFrame.validate();

	}

	private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
		back();
	}

	private void back() {
		mainFrame.setContentPane(new BookListPanel(mainFrame));
		mainFrame.validate();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnBack;
	private javax.swing.JButton btnQuery;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JTextField tfdInPrice;
	private javax.swing.JTextField tfdInPrice2;
	private javax.swing.JTextField tfdName;
	private javax.swing.JTextField tfdSalePrice;
	private javax.swing.JTextField tfdSalePrice2;
	private javax.swing.JTextField tfdUuid;
	// End of variables declaration//GEN-END:variables

}