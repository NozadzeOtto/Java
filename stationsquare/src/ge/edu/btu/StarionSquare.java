package ge.edu.btu;

public class StarionSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("Gio", false);
        Passenger otto = new Passenger("Otto", true);
        Passenger nuca = new Passenger("nuca", true);

        Train train = new Train();

        train.addPassenger(gio);
        train.addPassenger(otto);
        train.addPassenger(nuca);

        for(Passenger passenger:train.getPassengerList())
            System.out.println(passenger.getName());

    }
}