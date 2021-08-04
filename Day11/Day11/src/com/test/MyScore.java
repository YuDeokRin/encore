package com.test;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import com.myscore.*;

public class MyScore extends Frame {

  private Label lbl_name;  // java.awt.label
  private Label lbl_kor;	
  private Label lbl_eng;
  private Label lbl_math;
  

  private TextField txt_name;	//java.awt.TextField
  private TextField txt_kor;
  private TextField txt_eng;
  private TextField txt_math;

  private Button btok;			//java.awt.Button
  private TextArea tar_res;

  private Score score; //  
  

  public MyScore() {
    super("This MyScore Frame");
    btok = new Button("OK");
    lbl_name = new Label("�̸�");
    lbl_kor = new Label("����");
    lbl_eng = new Label("����");
    lbl_math = new Label("����");
    txt_name = new TextField();
    txt_kor = new TextField();
    txt_eng = new TextField();
    txt_math = new TextField();
    tar_res = new TextArea();
    
    score = new Score();
  }

  public void gui_main() {
    lbl_name.setBounds(100, 100, 100, 50);
    lbl_kor.setBounds(100, 150, 100, 50);
    lbl_eng.setBounds(100, 200, 100, 50);
    lbl_math.setBounds(100, 250, 100, 50);
    txt_name.setBounds(250, 100, 200, 50);
    txt_kor.setBounds(250, 150, 200, 50);
    txt_eng.setBounds(250, 200, 200, 50);
    txt_math.setBounds(250, 250, 200, 50);
    btok.setBounds(500, 200, 50, 30);
    tar_res.setBounds(20, 300, 550, 300);
    btok.addActionListener(new M_Event());
    addWindowListener(new M_Event());

    add(btok);
    add(lbl_name);
    add(lbl_kor);
    add(lbl_eng);
    add(lbl_math);
    add(txt_name);
    add(txt_kor);
    add(txt_eng);
    add(txt_math);
    add(tar_res);

    setLayout(null);
    setSize(new Dimension(600, 600));
    setFont(new Font("����", Font.BOLD, 20));
    setVisible(true);
  }
  class M_Event extends WindowAdapter implements ActionListener {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	score.setName(txt_name.getText());
	    		// "100" - 100 <value> 100 </value> <<- ���ʿ� �ڱ⸦ �ٸ��ִ� �±׻���  value�������´ٴ¶� parse
	    	int mat = Integer.parseInt(txt_math.getText()); // ���� ������ �ٲ��ְڴ� ��� �ǹ� 
	    	score.setMat(mat);
	    	score.setKor( Integer.parseInt( txt_kor.getText() ) );
	    	score.setEng( Integer.parseInt( txt_eng.getText() ) );
	    	
	    	
	    	tar_res.append(score.toString());
	    	tar_res.
	    }

	    @Override
	    public void windowClosing(WindowEvent e) {
	      System.exit(0);
	    }
	  }
  public static void main(String[] args) {
    new MyScore().gui_main();
  }
}
