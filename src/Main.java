import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Create a flight with LocalDateTime for departure and arrival
        LocalDateTime departureTime = LocalDateTime.of(2024, 7, 29, 14, 30);  // Example departure time
        LocalDateTime arrivalTime = LocalDateTime.of(2024, 7, 29, 16, 15);  // Example arrival time

        Flight flight = new Flight("AA123", "Senai I. A.", "Kuching I. A.", departureTime, arrivalTime);

        // Create seats and add them to the flight
        Seat seat1 = new Seat("1A", "Economy", 100.0);
        Seat seat2 = new Seat("1B", "Economy", 100.0);
        Seat seat3 = new Seat("2A", "Business", 200.0);
        Seat seat4 = new Seat("2B", "Business", 200.0);
        flight.addSeat(seat1);
        flight.addSeat(seat2);
        flight.addSeat(seat3);
        flight.addSeat(seat4);

        // Create a passenger
        Passenger passenger = new Passenger("Ka Ying", "kaying1234", "kychan@gmail.com", "01110951809");

        // Create a reservation for the passenger on seat3 of the flight
        Reservation reservation = passenger.createReservation(flight, seat3);

        // Create a DateTimeFormatter to format LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Display reservation details
        System.out.println("Reservation Number: " + reservation.getReservationNumber());
        System.out.println("Passenger Name: " + reservation.getPassenger().getName());
        System.out.println("Flight Number: " + reservation.getFlight().getFlightNumber());
        System.out.println("Seat Number: " + reservation.getSeat().getSeatNumber());
        System.out.println("Seat Class: " + reservation.getSeat().getSeatClass());
        System.out.println("Departure Airport: " + reservation.getFlight().getDepartureAirport());
        System.out.println("Arrival Airport: " + reservation.getFlight().getArrivalAirport());
        System.out.println("Departure Time: " + reservation.getFlight().getDepartureTime().format(formatter));
        System.out.println("Arrival Time: " + reservation.getFlight().getArrivalTime().format(formatter));
        System.out.println("Reservation Date: " + reservation.getReservationDate().format(formatter));

        // Optionally display flight duration
        flight.displayFlightDuration();
    }
}
