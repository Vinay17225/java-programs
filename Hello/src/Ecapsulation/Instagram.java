package Ecapsulation;

public class Instagram {
	String userName="Nitesh";
	private String pwd="kumar@123321";
	private String chats="Confidential";
	private boolean videocall=false;
	
	public String getpwd() {
		return pwd;
	}
	public String getchats() {
		return chats;
	}
	public boolean getvideocall() {
		return videocall;
	}
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
	public void setchats(String chats) {
		this.chats=chats;
	}
	public void setvideocall(boolean videocall) {
		this.videocall=videocall;
     

  }
	class InstagramDrive{
		public static void main(String[] args) {
			Instagram i=new Instagram();
			System.out.println("UserName = " +i.userName);
			System.out.println("Pwd = " +i.getpwd());
			System.out.println("Chats = " +i.getchats());
			System.out.println("videocall = "+ i.getvideocall());
			i.setpwd("123@214");
			i.setchats("Hi I am your classmate");
			i.setvideocall(true);
			System.out.println("update details");
			System.out.println(i.userName);
			System.out.println(i.getpwd());
			System.out.println(i.getchats());
			System.out.println(i.getvideocall());
			
			
		}
	}
}
