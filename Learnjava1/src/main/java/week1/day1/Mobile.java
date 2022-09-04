package week1.day1;

public class Mobile {
public void makecall() {
	String mobileModel="Samsung Galaxy Grand";
			float mobileWeight=162.25f;
	System.out.println("Yes, The user can make call");	
	System.out.println("My Mobile Model Is: Samsung Galaxy Grand");
	System.out.println("My Mobile Weight Is: 162.25grams");

}

public void sendMsg() {
	boolean FullCharged=true;
	int mobileCost=8999;
	System.out.println("The User can send messages");
	System.out.println("My Mobile Is able to Fully Charged");
	System.out.println("My Mobile Cost Is: 8,999rupees");
}
public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.makecall();
	obj.sendMsg();
}
}

