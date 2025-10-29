package com.myTicket;

import java.io.Serializable;
import java.util.Random;

public class Ticket implements Serializable
{
	private final int ticketID;
	private String boardingPoint;
	private String destinationPoint;
	private int distance;
	private int seatNo;
	private int ticketCost;
	private int bookedUserID;
	
	Random r = new Random();

	public Ticket(int distance,String boardingPoint, String destinationPoint, int seatNo) {
		
		this.ticketID = r.nextInt(1234567);
		this.distance = distance;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
		this.seatNo = seatNo;
		this.ticketCost = this.distance*2;
		this.bookedUserID = -1;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getTicketID() {
		return ticketID;
	}
	
	public void displayTicketDetails()
	{
		System.out.println("---------------TICKET DETAILS-------------------");
		System.out.println("Ticket ID is :"+ticketID);
		System.out.println("Ticket SeatNo is :"+seatNo);
		System.out.println("Ticket Cost is "+ticketCost);
		System.out.println("Boarding Point is "+boardingPoint);
		System.out.println("Destination Point is "+destinationPoint);
		System.out.println("Seat Number is "+seatNo);
		System.out.println("---------------------------------------------------------");
	}

	// We are Dealing Or Working With the Collection So We have to Override to String Method...
	@Override
	public String toString() {
		return "Ticket ticketID=" + ticketID + "\n ticketCost=" + ticketCost + "\n boardingPoint=" + boardingPoint
				+ "\n destinationPoint=" + destinationPoint + "\n distance=" + distance + "\n seatNo=" + seatNo + "\n--------------------------------------------------";
	}
	
	
}
