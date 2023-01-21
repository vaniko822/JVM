package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger vano = new Passenger("Vano", true);
        Passenger david = new Passenger("David", false);
        Passenger soso = new Passenger("Soso", true);

        Train train = new Train();


        train.addPassanger(vano);
        train.addPassanger(david);
        train.addPassanger(soso);

        for(Passenger passenger:train.getPassengerList()) {
            System.out.println(passenger.getName());
        }
    }

}
