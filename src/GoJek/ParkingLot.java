package GoJek;

public interface ParkingLot {
	void createParkingLot(int N);
	void vacateSlot(int N);
	String status();
	String park(String registrationNum, String Color);
	int[] registrationNumbersByColor(String color);
	int[] slotNumbersByColor(String color);
	int slotNumberByRegistration(String registrationNum);
}
