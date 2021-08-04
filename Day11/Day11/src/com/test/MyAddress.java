package com.test;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.mycom.*;

public class MyAddress extends Frame {
//������� 
  private Label lbl_name;
  private Label lbl_addr;
  private Label lbl_phone;

  private TextField txt_name;
  private TextField txt_addr;
  private TextField txt_phone;

  private Button btok;
  private TextArea tar_res;
  
  
 //		�޴�
 // MenuComponet ������  Menu, MenuBar, MenuItem, MenuShortcut �̷��� 4������ innerŬ������ �����Ǿ� �ִ� . 
 // MenuItem ���� Menu�� �ø���  �޴��� �޴��ٿ� �ø���.  �׸��� add�� frame�� �ø���.
  
  MenuItem item_new[];  //1.MenuItem ����� �����.
  

  
  Menu m_file;		//2. Menu ����� �����. 
  Menu m_file02;
  
  
  
  MenuBar mb;	//3.�޴��� ����� �����. 
  

  // vluae object 
 private Address address; //1.Address ���� �Ѵ�.   
 				// private Address address = new Address (X)
  				// ���� : ������ ��ü�� ��ü�� ������ �� �޸𸮿� �����ؼ� �ø��� �����̴�.


//�⺻ ������ 
  public MyAddress() {
    super("This Address Frame"); 
////////////////menu
    
    //4.MenuItem�� ����
    item_new = new MenuItem[8];   
    item_new[0] = new MenuItem(String.format("%s, %15s", "���θ����(N)", "Ctrl+N")); 
    item_new[1] = new MenuItem(String.format("%s, %15s", "��â(W)",      "Ctrl+W")); 
    item_new[2] = new MenuItem(String.format("%s, %15s", "����(O)...", "Ctrl+O")); 
    item_new[3] = new MenuItem(String.format("%s, %15s", "����(W)", "Ctrl+W")); 
    item_new[4] = new MenuItem(String.format("%s, %15s", "�ٸ� �̸����� ����(A)...", "Ctrl+A")); 
    item_new[5] = new MenuItem(String.format("%s    ", "������ ����(U)...")); 
    item_new[6] = new MenuItem(String.format("%s, %15s", "�μ�(P)", "Ctrl+P")); 
    item_new[7] = new MenuItem(String.format("%s,   ", "������(X)")); 
    
    
    
    //5.Menu�� �����.
    m_file = new Menu("����(F)");
    m_file02 = new Menu("����(E)");
    
    
    mb = new MenuBar(); // �޴��� ��ü ���� �ؼ� mb�� �־���. 
    
    

    
    
    btok = new Button("OK");
    lbl_name = new Label("�̸�");
    lbl_addr = new Label("�ּ�");
    lbl_phone = new Label("��ȭ��ȣ");
  
    txt_name = new TextField();
    txt_addr = new TextField();
    txt_phone = new TextField();
    
    tar_res = new TextArea();
    address = new Address(); 	//2. ��ü�� �����Ѵ�. 
    							// �ɹ����� ������ ã�Ƽ� �� �� �־����� 
  }

  public void gui_main() {
  //////////////////�޴� 
	  m_file.add(item_new[0]); // m_file���ٰ� add�ؼ�  menuitem�� �ø���. 

	  mb.add(m_file); // menubar(mb)���ٰ�  add�ؼ�  m_file �ø���
	  mb.add(m_file02);
	  //	  mb.add(m_file2)
	   
	  setMenuBar(mb);
	  
	lbl_name.setBounds(100, 100, 100, 50);
    lbl_addr.setBounds(100, 150, 100, 50);
    lbl_phone.setBounds(100, 200, 100, 50);
    txt_name.setBounds(250, 100, 200, 50); 
    txt_addr.setBounds(250, 150, 200, 50);
    txt_phone.setBounds(250, 200, 200, 50);
    btok.setBounds(500, 200, 50, 30);
    tar_res.setBounds(20, 300, 550, 300);
    btok.addActionListener(new M_Event());
    addWindowListener(new M_Event()); 

    add(btok);
    add(lbl_name);
    add(lbl_addr);
    add(lbl_phone);
    add(txt_name);
    add(txt_addr);
    add(txt_phone);
    add(tar_res);

    setLayout(null);
    setSize(new Dimension(600, 600));
    setFont(new Font("����", Font.BOLD, 20));
    setVisible(true);
    
    
  }
  class M_Event extends WindowAdapter implements ActionListener {
	  
	  //��ư�� Ŭ������ �� �߻��ϴ� �̺�Ʈ �޼ҵ�
    @Override
    public void actionPerformed(ActionEvent e) {
//		1.��������
//    	String res = txt_name.getText() +  "," + txt_addr.getText() + "," + txt_phone.getText();
//    	tar_res.setText(res);
//    	tar_res.append(res);
    	
    	
//		2.Value Object = VO ��ü�� �����ؼ� �����ϴ� ���
    	address.setAddr(txt_name.getText());
    	address.setAddr(txt_addr.getText());
    	address.setAddr(txt_phone.getText());
    	
    	tar_res.append(address.toString()+ "\n"); //append�� String�� �޴´�. address ��ü�ּҹ����� �ȵȴ�. 
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
      System.exit(0); 
    }
  }
  public static void main(String[] args) {
    new MyAddress().gui_main();
  }
}
