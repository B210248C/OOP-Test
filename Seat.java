public class Seat {
    private String seatNumber;
    private boolean availability;
    private Flight flight;
    private String seatClass; // "Economy" or "Business"
    private double price;

    protected Seat(){

    }

    protected Seat(String seatNumber, boolean availability, Flight flight, String seatClass, double price) {
        this.seatNumber = seatNumber;
        this.availability = availability;
        this.flight = flight;
        this.seatClass = seatClass;
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
