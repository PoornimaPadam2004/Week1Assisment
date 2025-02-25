package ThreadOne;

public class Manager extends Thread{
	private ConferenceRoomBookingJob job;
    private String managerName;
    
    public Manager(ConferenceRoomBookingJob job, String name) {
        this.job = job;
        this.managerName = name;
    }
    
    @Override
    public void run() {
        job.bookRoom(managerName);
    }

}
