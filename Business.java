class Business extends Seat {
    protected Business(){

    }
    public Business(String seatNumber, boolean availability, Flight flight, double price) {
        super(seatNumber, availability, flight, "Business", price);
    }
}
