package com.FRS;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n\t\t\t\t\t\t\t\t\t......FLIGHT RESERVATION SYSTEM.......");
        System.out.println("\nFlight Information:::");

        Flight f = new Flight("IC8080","AIR INDIA");           // To get the details of Flight
        System.out.println(f.getFlightDetails());

        System.out.println("Customer Option for Regular Ticket:::");   // Booking Ticket for customer with regular option
        RegularTicket regular = new RegularTicket("MG Road", "MUMBAI", "MAHARASHTRA", "RAM", 20203014,
                "rk@gmail.com", "IC8086", "AIR INDIA", "BANG", "DEL", "10/10/21", "0900", "1420", "80AA78",
                "A10", 4500, "SNACKS");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(regular.getTicketDetails());
        System.out.println(regular.getDuration());
        System.out.println(regular.getSpecialServices());
        System.out.println(regular.checkedStatus());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Happy Flying");

        System.out.println("\n\n\n");

        System.out.println("Customer Option for Tourist Ticket:::\n");              //customer with optioned for Tourist Ticket
        TouristTicket tt = new TouristTicket("MG Road", "MUMBAI", "MAHARASHTRA", "RAM", 20203014,
                "rk@gmail.com", "IC8087", "AIR INDIA", "MUM", "BANG", "15/10/21", "1800", "0900", "609A78",
                "B21", 3500, "GRAND HYATT");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(tt.getTicketDetails());
        System.out.println(tt.getDuration());
        System.out.println();
        tt.getTouristLocation();
        System.out.println();
        System.out.println(tt.checkedStatus());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Happy Flying\n");
        System.out.println(f.getFlightDetails());

        System.out.println("\n\n...Cancel Ticket...");     // Ticket Cancellation
        tt.cancel();
        System.out.println("\n\n"+tt.getTicketDetails());
        System.out.println(tt.checkedStatus());
        System.out.println("\n\n"+f.getFlightDetails());   // Printing Flight info after ticket cancelled

    }
}
















        //Passenger p = new Passenger();

        //Passenger psg=new Passenger("MG","UNR","MHT","Kali",123456,"abc@gmail.com");
        //System.out.println(psg.getId());
        //System.out.println(psg.getContactDetails());
        //System.out.println(psg.getAddressDetails());

        //Flight f = new Flight("IC2022","AIR INDIA");
        //f.incrementBookingCounter();
        //System.out.println(f.getFlightDetails());
        //System.out.println(f.checkAvailability());


        //Ticket tk =new Ticket("MG","UNR","MHT","Kali",123456,"abc@gmail.com",
               // "IC2022","AIR INDIA","MUM","BANG","10/10/21","1400","0900","A102022","A10",4500);
        //System.out.println(tk.getTicketDetails());
        //System.out.println("\n"+tk.checkedStatus());
        //tk.getDuration();
       // RegularTicket rt = new RegularTicket();
        //rt.updateSpecialServices(1);
        //System.out.println("Special Services:"+rt.getSpecialServices());
        //TouristTicket tt = new TouristTicket();
        //tt.setHotelAddress("Hotel Taj");
        //tt.setTouristLocation();
        //System.out.println("Hotel: "+tt.getHotelAddress());
        //tt.getTouristLocation();




