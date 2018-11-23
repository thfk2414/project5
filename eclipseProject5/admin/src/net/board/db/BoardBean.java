package net.board.db;

import java.sql.Date;

public class BoardBean {
	private int BOARD_NUM;
	private String BOARD_NAME;
	private String BOARD_PASS;
	private String BOARD_SUBJECT;
	private String BOARD_CONTENT;
	private String BOARD_FILE;
	private int BOARD_RE_REF;
	private int BOARD_RE_LEV;
	private int BOARD_RE_SEQ;
	private int BOARD_READCOUNT;
	private Date BOARD_DATE;
	
	// ===============================회원가입
	private String MEMBER_ID;
	private String MEMBER_PW;
	private String MEMBER_PWC;
	private String  MEMBER_NAME;
	private String  MEMBER_NICK;
	private String  MEMBER_EMAIL;
	private String MEMBER_COM;
	private String  MEMBER_HOMEPAGE; 
	private String  MEMBER_TEL;
	private String  MEMBER_PHONE;
	private String  MEMBER_ADD;
	private String  MEMBER_ADD1;
	private String  MEMBER_MAIL;
	private String  MEMBER_SMS;
		
		
	
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_PW() {
		return MEMBER_PW;
	}
	public void setMEMBER_PW(String mEMBER_PW) {
		MEMBER_PW = mEMBER_PW;
	}
	public String getMEMBER_PWC() {
		return MEMBER_PWC;
	}
	public void setMEMBER_PWC(String mEMBER_PWC) {
		MEMBER_PWC = mEMBER_PWC;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_NICK() {
		return MEMBER_NICK;
	}
	public void setMEMBER_NICK(String mEMBER_NICK) {
		MEMBER_NICK = mEMBER_NICK;
	}
	public String getMEMBER_EMAIL() {
		return MEMBER_EMAIL;
	}
	public void setMEMBER_EMAIL(String mEMBER_EMAIL) {
		MEMBER_EMAIL = mEMBER_EMAIL;
	}
	public String getMEMBER_COM() {
		return MEMBER_COM;
	}
	public void setMEMBER_COM(String mEMBER_COM) {
		MEMBER_COM = mEMBER_COM;
	}
	public String getMEMBER_HOMEPAGE() {
		return MEMBER_HOMEPAGE;
	}
	public void setMEMBER_HOMEPAGE(String mEMBER_HOMEPAGE) {
		MEMBER_HOMEPAGE = mEMBER_HOMEPAGE;
	}
	public String getMEMBER_TEL() {
		return MEMBER_TEL;
	}
	public void setMEMBER_TEL(String mEMBER_TEL) {
		MEMBER_TEL = mEMBER_TEL;
	}
	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}
	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}
	public String getMEMBER_ADD() {
		return MEMBER_ADD;
	}
	public void setMEMBER_ADD(String mEMBER_ADD) {
		MEMBER_ADD = mEMBER_ADD;
	}
	public String getMEMBER_ADD1() {
		return MEMBER_ADD1;
	}
	public void setMEMBER_ADD1(String mEMBER_ADD1) {
		MEMBER_ADD1 = mEMBER_ADD1;
	}
	public String getMEMBER_MAIL() {
		return MEMBER_MAIL;
	}
	public void setMEMBER_MAIL(String mEMBER_MAIL) {
		MEMBER_MAIL = mEMBER_MAIL;
	}
	public String getMEMBER_SMS() {
		return MEMBER_SMS;
	}
	public void setMEMBER_SMS(String mEMBER_SMS) {
		MEMBER_SMS = mEMBER_SMS;
	}
	
	
	//=========================================
	public int getBOARD_NUM() {
		return BOARD_NUM;
	}
	public void setBOARD_NUM(int board_num) {
		BOARD_NUM = board_num;
	}
	public String getBOARD_NAME() {
		return BOARD_NAME;
	}
	public void setBOARD_NAME(String board_name) {
		BOARD_NAME = board_name;
	}
	public String getBOARD_PASS() {
		return BOARD_PASS;
	}
	public void setBOARD_PASS(String board_pass) {
		BOARD_PASS = board_pass;
	}
	public String getBOARD_SUBJECT() {
		return BOARD_SUBJECT;
	}
	public void setBOARD_SUBJECT(String board_subject) {
		BOARD_SUBJECT = board_subject;
	}
	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}
	public void setBOARD_CONTENT(String board_content) {
		BOARD_CONTENT = board_content;
	}
	public String getBOARD_FILE() {
		return BOARD_FILE;
	}
	public void setBOARD_FILE(String board_file) {
		BOARD_FILE = board_file;
	}
	public int getBOARD_RE_REF() {
		return BOARD_RE_REF;
	}
	public void setBOARD_RE_REF(int board_re_ref) {
		BOARD_RE_REF = board_re_ref;
	}
	public int getBOARD_RE_LEV() {
		return BOARD_RE_LEV;
	}
	public void setBOARD_RE_LEV(int board_re_lev) {
		BOARD_RE_LEV = board_re_lev;
	}
	public int getBOARD_RE_SEQ() {
		return BOARD_RE_SEQ;
	}
	public void setBOARD_RE_SEQ(int board_re_seq) {
		BOARD_RE_SEQ = board_re_seq;
	}
	public int getBOARD_READCOUNT() {
		return BOARD_READCOUNT;
	}
	public void setBOARD_READCOUNT(int board_readcount) {
		BOARD_READCOUNT = board_readcount;
	}
	public Date getBOARD_DATE() {
		return BOARD_DATE;
	}
	public void setBOARD_DATE(Date board_date) {
		BOARD_DATE = board_date;
	}
}