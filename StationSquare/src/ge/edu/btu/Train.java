package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {

    public List <Passenger> passengerList = new ArrayList<>();

    public void addPassanger(Passenger passenger){
        if(passenger.haveTicket()){
            passengerList.add(passenger);
        }
    }

    public List<Passenger> getPassengerList(){
        return passengerList;
    }

}
