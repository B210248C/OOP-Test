import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String sex;
    private String name;
    private String email;
    private String phone;
    private ArrayList<Reservation> reservations;

    protected Passenger(){

    }
    public Passenger(String sex, String name, String email, String phone) {
        this.sex = sex;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.reservations = new ArrayList<>();
    }

    public String createReservation(Flight flight, Seat seat) {
        if (!seat.isAvailable()) {
            throw new IllegalArgumentException(seat.getSeatNumber() + " (" + seat.getSeatClass() + ") seat is not available.");
        }
        String reservationID = generateRandomString(8);
        Reservation reservation = new Reservation(reservationID, this, seat, flight);
        this.reservations.add(reservation);
        seat.setAvailability(false);
        return "You have reserved this seat: " + seat.getSeatNumber();
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
