public class MothTest {
    
    public static void main(String[] args) {

        Moth mothOne = new Moth(0, 0);
        mothOne.lightPoint(10, 20);
        mothOne.getX();
        mothOne.getY();
        mothOne.getPosition();

        System.out.println("Next step\n");
        mothOne.lightPoint(10, 20);
        mothOne.getX();
        mothOne.getY();
        mothOne.getPosition();

        System.out.println("Next step\n");
        mothOne.lightPoint(10, 20);
        mothOne.getX();
        mothOne.getY();
        mothOne.getPosition();
    }

}
