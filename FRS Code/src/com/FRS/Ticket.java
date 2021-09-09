package com.FRS;

public abstract class  Ticket {
    protected String pnr;
    protected String from;
    protected String to;
    Flight flight;
    String Date;
    String depature;
    String arrival;
    String seatNo;
    float price;
    boolean cancelled=false;
    Passenger psg;

    public Ticket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail, String fn, String an,
                  String t, String f, String d,String dep, String arr, String pnr,String st, float p) {
        this.psg = new Passenger(adstreet, adcity, adstate, cname, cphone, cemail);
        this.flight = new Flight(fn, an);
        this.to = t;
        this.from = f;
        this.depature = dep;
        this.arrival = arr;
        this.Date = d;
        this.seatNo = st;
        this.pnr = pnr;
        this.price = p;
        flight.incrementBookingCounter();
    }

    public abstract String getTDetails();
    public abstract String getTicketDetails();
    public abstract String getDuration();
    public abstract String checkedStatus();
    public abstract void cancel();




/*
    public String checkedStatus()
        {
        if(cancelled== false)
        {
            return "Ticket Booked...";
        }
        else
        {
            return "Ticket Cancelled";
        }
    }

    public void cancel()
    {
        cancelled=true;
        Flight.bcnt=Flight.bcnt--;
        flight.bookedSeats=Flight.bcnt;
    }

    public String getTDetails()
    {
        return "PNR:"+this.pnr+" To:"+this.to+" From"+this.from+" SeatNo: "+this.seatNo+" Date:"+this.Date+" Depature Time: "+this.depature+
                " Arrival Time:"+arrival+" Price:"+this.price;
    }

    public String getTicketDetails()
    {
        return " "+psg.getId()+"\n"+psg.getContactDetails()+"\n"+psg.getAddressDetails()+"\n"+flight.getFlightDetails()+"\n"+
                this.getTDetails()+"\n";
    }

    public void getDuration()
    {
        int i= Integer.parseInt(depature);
        int j= Integer.parseInt(arrival);
       // System.out.println(i+" "+j);
        //int k=j-i;
        int k;
        float l=0.0f;
        if(j>i)
        {
            k=j-i;
            l=(float) k/100.0f;
        }
        else if(j<i)
        {
            k=i-j;
             l=(float) k/100.0f;
            l=l+24.0f;
        }
        //float l=(float) k/100.0f;
        System.out.println("Duration: "+l+"hrs");
    }

 */
}


