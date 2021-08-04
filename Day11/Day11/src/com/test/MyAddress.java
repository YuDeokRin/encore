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
//멤버변수 
  private Label lbl_name;
  private Label lbl_addr;
  private Label lbl_phone;

  private TextField txt_name;
  private TextField txt_addr;
  private TextField txt_phone;

  private Button btok;
  private TextArea tar_res;
  
  
 //		메뉴
 // MenuComponet 하위에  Menu, MenuBar, MenuItem, MenuShortcut 이렇게 4가지가 inner클래스로 구현되어 있다 . 
 // MenuItem 만들어서 Menu에 올리고  메뉴를 메뉴바에 올린다.  그리고 add로 frame에 올린다.
  
  MenuItem item_new[];  //1.MenuItem 멤버를 만든다.
  

  
  Menu m_file;		//2. Menu 멤버를 만든다. 
  Menu m_file02;
  
  
  
  MenuBar mb;	//3.메뉴바 멤버를 만든다. 
  

  // vluae object 
 private Address address; //1.Address 선언 한다.   
 				// private Address address = new Address (X)
  				// 이유 : 생성자 자체가 객체를 생성할 때 메모리에 생성해서 올리기 때문이다.


//기본 생성자 
  public MyAddress() {
    super("This Address Frame"); 
////////////////menu
    
    //4.MenuItem을 생성
    item_new = new MenuItem[8];   
    item_new[0] = new MenuItem(String.format("%s, %15s", "새로만들기(N)", "Ctrl+N")); 
    item_new[1] = new MenuItem(String.format("%s, %15s", "새창(W)",      "Ctrl+W")); 
    item_new[2] = new MenuItem(String.format("%s, %15s", "열기(O)...", "Ctrl+O")); 
    item_new[3] = new MenuItem(String.format("%s, %15s", "저장(W)", "Ctrl+W")); 
    item_new[4] = new MenuItem(String.format("%s, %15s", "다른 이름으로 저장(A)...", "Ctrl+A")); 
    item_new[5] = new MenuItem(String.format("%s    ", "페이지 설정(U)...")); 
    item_new[6] = new MenuItem(String.format("%s, %15s", "인쇄(P)", "Ctrl+P")); 
    item_new[7] = new MenuItem(String.format("%s,   ", "끝내기(X)")); 
    
    
    
    //5.Menu를 만든다.
    m_file = new Menu("파일(F)");
    m_file02 = new Menu("편집(E)");
    
    
    mb = new MenuBar(); // 메뉴바 객체 생성 해서 mb에 넣었다. 
    
    

    
    
    btok = new Button("OK");
    lbl_name = new Label("이름");
    lbl_addr = new Label("주소");
    lbl_phone = new Label("전화번호");
  
    txt_name = new TextField();
    txt_addr = new TextField();
    txt_phone = new TextField();
    
    tar_res = new TextArea();
    address = new Address(); 	//2. 객체를 생성한다. 
    							// 맴버변수 내용을 찾아서 갈 수 있어졌다 
  }

  public void gui_main() {
  //////////////////메뉴 
	  m_file.add(item_new[0]); // m_file에다가 add해서  menuitem을 올린다. 

	  mb.add(m_file); // menubar(mb)에다가  add해서  m_file 올린다
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
    setFont(new Font("굴림", Font.BOLD, 20));
    setVisible(true);
    
    
  }
  class M_Event extends WindowAdapter implements ActionListener {
	  
	  //버튼을 클릭했을 때 발생하는 이벤트 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
//		1.직접대입
//    	String res = txt_name.getText() +  "," + txt_addr.getText() + "," + txt_phone.getText();
//    	tar_res.setText(res);
//    	tar_res.append(res);
    	
    	
//		2.Value Object = VO 객체에 저장해서 연동하는 방법
    	address.setAddr(txt_name.getText());
    	address.setAddr(txt_addr.getText());
    	address.setAddr(txt_phone.getText());
    	
    	tar_res.append(address.toString()+ "\n"); //append는 String만 받는다. address 객체주소번지라서 안된다. 
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
