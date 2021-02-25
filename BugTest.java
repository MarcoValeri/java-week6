public class BugTest {

    public static void main(String[] args) {

        // Declare an obj 
        Bug bugsy = new Bug(10);
        bugsy.move();
        System.out.println(bugsy.getPosition());
        bugsy.turn();
        bugsy.move();
        System.out.println(bugsy.getPosition());
    }

}