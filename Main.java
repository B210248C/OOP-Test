public class Main {
    public static void main(String[] args) {
        // Create a flight
        Flight flight = new Flight("AA101", "JFK", "LAX", "2024-08-01", "10:00 AM");

        // Create seats and add them to the flight
        Seat economySeat1 = new Economy("1A", true, flight, 150.00);
        Seat businessSeat1 = new Business("1B", true, flight, 450.00);
        flight.getSeats().add(economySeat1);
        flight.getSeats().add(businessSeat1);

        // Create a passenger
        Passenger passenger = new Passenger("Male", "Lim", "lim@gamil.com", "1234567890");

        System.out.println();

        // Check seat availability before reservation
        System.out.println("Seat availability before reservation:");
        for (Seat seat : flight.getSeats()) {
            String availabilityStatus = seat.isAvailable() ? "available" : "not available";
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ") seat is " + availabilityStatus + ".");
        }

        System.out.println();

        // Make a reservation
        String reservationMessage = passenger.createReservation(flight, economySeat1);
        System.out.println(reservationMessage);

        // Print reservation details
        Reservation reservation = passenger.getReservations().get(0); // Get the first reservation for the passenger
        System.out.println("Reservation ID: " + reservation.getReservationID());
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Flight: " + reservation.getFlight().getFlightNumber());
        System.out.println("Seat: " + reservation.getSeat().getSeatNumber());
        System.out.println("Seat Class: " + reservation.getSeat().getSeatClass());

        // Check seat availability after reservation
        System.out.println("\nSeat availability after reservation:");
        for (Seat seat : flight.getSeats()) {
            String availabilityStatus = seat.isAvailable() ? "available" : "not available";
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ") seat is " + availabilityStatus + ".");
        }

        // Attempt to make a reservation for the same seat (should fail)
        try {
            String duplicateReservationMessage = passenger.createReservation(flight, economySeat1);
        } catch (IllegalArgumentException e) {
            System.out.println("\nFailed to reserve seat: " + e.getMessage());
        }
    }
}
