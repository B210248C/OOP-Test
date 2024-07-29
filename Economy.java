class Economy extends Seat {
    protected Economy(){

    }
    public Economy(String seatNumber, boolean availability, Flight flight, double price) {
        super(seatNumber, availability, flight, "Economy", price);
    }
}
