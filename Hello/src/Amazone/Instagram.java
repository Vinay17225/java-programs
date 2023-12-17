package Amazone;

public class Instagram {
	String userName;
	private int pwd;
	private long phoneNo;
	private String chats;
	private String stories;
	
	Instagram(String userName,int pwd,long phoneNo,String chats,String stories){
		this.userName=userName;
		this.pwd=pwd;
		this.phoneNo=phoneNo;
		this.chats=chats;
		this.stories=stories;
	}
	public int getpwd() {
		return pwd;
	}
	public long getphoneNo(){
		return phoneNo;
	}
	public String getchats() {
		return chats;
	}
	public String getstories() {
		return stories;
	}
	public void setpwd(int pwd) {
		this.pwd=pwd;
	}
	public void setphoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void setchats(String chats) {
		this.chats=chats;
	}
	public void setstories(String chats) {
		this.stories=stories;
	}
}
