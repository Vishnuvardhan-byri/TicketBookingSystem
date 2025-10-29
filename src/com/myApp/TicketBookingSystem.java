package com.myApp;

import java.util.ArrayList;
import java.util.Iterator;

import com.myTicket.Ticket;
import com.myUser.User;

public class TicketBookingSystem {
	
	private ArrayList <User> users = new ArrayList <User> ();
	private ArrayList <Ticket> tickets = new ArrayList <Ticket> ();
	
	// 1. Add Users
	public void addUser(User u)
	{
		users.add(u);
		System.out.println(u.getUserName()+" Account is Created SuccessFully....");
	}
	
	// 2.Show All Users Information
	public void showUsers()
	{
		if(users.isEmpty())
			System.out.println("There are No users in our Collection Or database to show..");
		else
		{
			for(User u :users)
			{
				u.displayUserDetails();
			}
		}
	}
	
	// 3.GetUser Information By UserID
	public User getUserInformationByID(int userId)
	{
		if(users.isEmpty())
			System.out.println("There are no users to get the User Details by UserID...");
		else
		{
			for(User u:users)
			{
				if(u.getUserId() == userId)
				{
					return u;  // returns Complete User Info based on UserID
				}
			}
		}
		return null;
	}
	
	// 4.Book Ticket by passing userId and Ticket Object
	public void bookTicket(int userId, Ticket t)
	{
		if(users.isEmpty())
			System.out.println("No users to book a ticket");
		else
		{
			User u = getUserInformationByID(userId);
			if(u.getUserId() == userId)
			{
				tickets.add(t);
				System.out.println(u.getUserName()+" booked ticket Successfully...");
				System.out.println("Ticket ID is "+t.getTicketID());
			}
		}
	}
	
	// 5.Get Ticket Details by TicketID
	public Ticket getTicketDetailsById(int ticketId)
	{
		if(tickets.isEmpty())
			System.out.println("No Tickets are Booked Yet To Get Ticket Details....");
		else
		{
			if(users.isEmpty())
				System.out.println("No Users are there to get ticket Details...");
			else
			{
				for(Ticket t : tickets)
				{
					if(t.getTicketID() == ticketId)
					{
						return t; // Returns Complete Ticket Details based On the TicketID
					}
				}
			}
		}
		return null;
	}

	// 6.Change Destination Point
	public void changeDestinationPoint(int userId, int ticketId, String newDestinationP)
	{
		if(tickets.isEmpty())
			System.out.println("No tickets are booked to change Destination Point");
		else
		{
			User u = getUserInformationByID(userId);
			if(u.getUserId() == userId)
			{
				/*for(Ticket t : tickets)
				{
					if(t.getTicketID() == ticketId)
					{
						t.setDestinationPoint(newDestinationP);
						System.out.println("Ticket ID With "+t.getTicketID()+" Destination Point Changed Succesfully to "+t.getDestinationPoint());
					}
				}*/
				Ticket t = getTicketDetailsById(ticketId);
				if(t.getTicketID() == ticketId)
				{
					t.setDestinationPoint(newDestinationP);
					System.out.println("Ticket ID With "+t.getTicketID()+" Destination Point Changed Succesfully to "+t.getDestinationPoint());
				}
			}
			else
				System.out.println("Invalid UserID Does not match with our database...");
		}
	}
	
	// 7.Cancel Ticket
	public void cancelTicket(int userId, int ticketId)
	{
		if(tickets.isEmpty())
			System.out.println("No tickets are booked yet to Cancel...");
		else
		{
			User u = getUserInformationByID(userId);
			if(u.getUserId() == userId)
			{
				Ticket t = getTicketDetailsById(ticketId);
				if(t.getTicketID() == ticketId)
				{
					Iterator <Ticket> itr = tickets.iterator();
					while(itr.hasNext())
					{
						itr.remove();
						System.out.println("Successfully Cancelled The Ticket with UserID ");
					}
				}
			}
			else
				System.out.println("Invalid UserID....");
		}
	}
	
	// 8.Cancel User Or Remove User
	public void removeUser(int userId)
	{
		if(users.isEmpty())
			System.out.println("There are No Users in database to Remove User Account");
		else
		{
			User u = getUserInformationByID(userId);
			if(u.getUserId() == userId)
			{
				Iterator <User> itr = users.iterator();
				while(itr.hasNext())
				{
					itr.remove();
					System.out.println("Successfully Removed The User Account...");
					break;
				}
			}
		}
	}
}
