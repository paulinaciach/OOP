package room;

public class AppRoom {

	public static void main(String[] args) {
		
		
		TV tv = new TV("SAMSUNG", "4HD", 55);
		Couch couch = new Couch("50x293x44", "grey");
		
		
		Room room = new Room(10,2,new TV("SAMSUNG TECHNOLGY","samsung 2.0",34),couch);
		
		room.roomSize();
		
		couch.getCouch();
		
		room.turnOnTV();
		
		

	}

}
