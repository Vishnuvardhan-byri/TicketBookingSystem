package com.myApp;

import java.util.Scanner;

import com.myTicket.Ticket;
import com.myUser.User;

public class TicketMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TicketBookingSystem tbs = new TicketBookingSystem();
		
		boolean status = true;
		while(status)
		{
			System.out.println("Enter 1 to add Account \nEnter 2 to Show User Information \nEnter 3 to Show UserInfo by ID \n"
					+ "Enter 4 to Book Ticket \nEnter 5 to Show Ticket"+"Details by TicketID"
					+ " \nEnter 6 to change Boarding point \nEnter 7 to Cancel Ticket"
					+ " \nEnter 8 "+ "to remove Account \nEnter 9 to exit");
			System.out.println("----------------------------------------\nEnter your choice\n-----------------------------------------");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter UserID");
				int userId = sc.nextInt();
				System.out.println("Enter Username");
				String username = sc.next();
				System.out.println("Enter User Email");
				String mail = sc.next();
				System.out.println("Ente User Gender");
				char gender = sc.next().charAt(0);
				System.out.println("Enter user MobileNumber");
				long mobileNo = sc.nextLong();
				User u = new User(userId, username, mail, gender, mobileNo);
				tbs.addUser(u);
			}
			break;
			case 2:
			{
				tbs.showUsers();
			}
			break;
			case 3:
			{
				System.out.println("Enter UserId to Show User Info");
				int userId = sc.nextInt();
				User u =tbs.getUserInformationByID(userId);
				System.out.println(u);
			}
			break;
			case 4:
			{
				System.out.println("Enter UserID");
				int userId = sc.nextInt();
				User u = tbs.getUserInformationByID(userId);
				System.out.println("Enter distance");
				int distance = sc.nextInt();
				System.out.println("Enter Boarding Point");
				String bp = sc.next();
				System.out.println("Enter Destination Point");
				String dp = sc.next();
				System.out.println("Enter SeatNUmber");
				int seatNo = sc.nextInt();
				Ticket t = new Ticket(distance, bp, dp, seatNo);
				System.out.println("Your Ticket ID is "+t.getTicketID());
				tbs.bookTicket(userId, t);
			}
			break;
			case 5:
			{
				System.out.println("Enter TicketID to Show Ticket Info");
				int ticketId = sc.nextInt();
				tbs.getTicketDetailsById(ticketId);
			}
			break;
			case 6:
			{
				System.out.println("Enter UserId ");
				int userId = sc.nextInt();
				System.out.println("Enter TicketID");
				int ticketId = sc.nextInt();
				System.out.println("Enter new Destination Point");
				String newdp = sc.next();
				tbs.changeDestinationPoint(userId, ticketId, newdp);
			}
			break;
			case 7:
			{
				System.out.println("Enter UserId ");
				int userId = sc.nextInt();
				System.out.println("Enter TicketID to Cancel Ticket");
				int ticketId = sc.nextInt();
				tbs.cancelTicket(userId, ticketId);
			}
			break;
			case 8:
			{
				System.out.println("Enter UserId ");
				int userId = sc.nextInt();
				tbs.removeUser(userId);
			}
			break;
			case 9:
			{
				System.out.println("Thank You!!!");
				System.out.println("You are Exited From the Application...");
				status = false;
			}
			break;
			default:System.out.println("Please Enter valid Choice..!!!");
		}
	}
  }
}
