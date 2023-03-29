public class PresentationRoom extends Room{

    public PresentationRoom(int roomNumber, int studentCapicity) {
        super(roomNumber,studentCapicity);
        if(roomNumber > 10){
            studentCapicity = 50;
        }
        else{
            studentCapicity = 75;
        }
    }
}
