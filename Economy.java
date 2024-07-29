class Economy extends Seat {
    protected Economy(){

    }
    protected Economy(String seatNumber, boolean availability, Flight flight, double price) {
        super(seatNumber, availability, flight, "Economy", price);
    }
}
