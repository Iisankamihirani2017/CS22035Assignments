package A2;

public class accountant extends employee {

    void generateTicketsIssued(station inStation)
    {
        System.out.println("Station "+inStation.stationName+" has issued "+inStation.inCount+" tickets");
    }

    void generateTicketsArrived(station outStation)
    {
        System.out.println("Station "+outStation.stationName+" has "+outStation.outCount+" departures");
    }

    void totalTripsPerCommuter(user inUser)
    {
        System.out.println(inUser.name+" has had "+inUser.tickets.length+" trips");
    }

    void incomeRailway(railway inRailway)
    {
        System.out.println("Income generated by the A2.railway "+(inRailway.totalIncomeTrips-inRailway.expenses));
    }
}