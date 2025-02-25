package ThreadOne;

public class ConferenceRoomBookingSystem {
	public static void main(String[] args) {
        // Creating the shared Conference Room Booking Job
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();

        // Creating two Manager threads
        Manager manager1 = new Manager(bookingJob, "Manager 1");
        Manager manager2 = new Manager(bookingJob, "Manager 2");

        // Starting the threads
        manager1.start();
        manager2.start();
    }

}
