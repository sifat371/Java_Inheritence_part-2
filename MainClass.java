import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> appointments = new ArrayList<>();
        Onetime[] onetimes = new Onetime[2];
        onetimes[0] = new Onetime(29, 10, 2022, "Meet Mr. A");
        onetimes[1] = new Onetime(30, 10, 2022, "Meet Mr. B");

        for (int i = 0; i < onetimes.length; i++) {
            if (onetimes[i].occurOn(onetimes[i].getDay(),
                    onetimes[i].getMonth(),
                    onetimes[i].getYear()) == true) {
                appointments.add(onetimes[i].getName());
            }
        }
        Daily[] dailies = new Daily[2];
        dailies[0] = new Daily(29, 10, 2022, "Meet the Colleague ");
        dailies[1] = new Daily(29, 10, 2020, "Meet the boss");

        for (int i = 0; i < dailies.length; i++) {
            appointments.add(dailies[i].getName());
        }
        Monthly[] monthlies = new Monthly[2];
        monthlies[0] = new Monthly(29, 10, 2022, "Meet the Doctor");
        monthlies[1] = new Monthly(29, 10, 2022, "Meet the Project Manager");
        for (int i = 0; i < monthlies.length; i++) {
            if (monthlies[i].occurOn(monthlies[i].getDay(),
                    monthlies[i].getMonth(),
                    monthlies[i].getYear()) == true) {
                appointments.add(monthlies[i].getName());
            }
        }
        System.out.println("Todays Appointments Are ");
        for (String appointmentsValue : appointments) {
            System.out.println(appointmentsValue);
        }

    }

}
