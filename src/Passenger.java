import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;


class Passenger {
    private String name;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private List<Reservation> reservations;

    public Passenger(String name, String passportNumber, String email, String phoneNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Flight flight, Seat seat) {
        if (!seat.isAvailable()) {
            throw new IllegalArgumentException("Seat is not available.");
        }
        String reservationNumber = generateRandomString(8);
        Reservation reservation = new Reservation(reservationNumber, flight, seat, this, LocalDateTime.now());
        reservations.add(reservation);
        return reservation;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}