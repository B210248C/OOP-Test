class Business extends Seat {
    protected Business(){

    }
    protected Business(String seatNumber, boolean availability, Flight flight, double price) {
        super(seatNumber, availability, flight, "Business", price);
    }
}
