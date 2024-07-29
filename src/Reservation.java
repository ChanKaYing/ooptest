import java.time.LocalDateTime;

class Reservation {
    private String reservationNumber;
    private Flight flight;
    private Seat seat;
    private Passenger passenger;
    private LocalDateTime reservationDate;  // Changed to LocalDateTime

    public Reservation(String reservationNumber, Flight flight, Seat seat, Passenger passenger, LocalDateTime reservationDate) {
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
        this.reservationDate = reservationDate;  // Initialize with LocalDateTime
        seat.setAvailability(false);
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public LocalDateTime getReservationDate() {  // Changed to LocalDateTime
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {  // Changed to LocalDateTime
        this.reservationDate = reservationDate;
    }


}
