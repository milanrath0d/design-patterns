package structural.bridge;

import java.util.Scanner;

public class BridgeDemo {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String messageType=sn.next();
		String message=sn.next();
		
		if(messageType.equalsIgnoreCase("long")){
			Message longMessage=new LongMessage(new Email());
			longMessage.sendMessage(message);
		}
		else{
			Message shortMessage=new LongMessage(new SMS());
			shortMessage.sendMessage(message);
		}

	}

}
