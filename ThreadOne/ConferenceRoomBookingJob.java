package ThreadOne;

public class ConferenceRoomBookingJob {
private boolean isRoomAvailable = true;
    
    public synchronized void bookRoom(String managerName) {
        if (isRoomAvailable) {
            System.out.println(managerName + " is booking the conference room.");
            isRoomAvailable = false;
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(managerName + " has completed the meeting.");
            isRoomAvailable = true;
        } else {
            System.out.println(managerName + " found the room occupied. Waiting...");
        }
    }


}
