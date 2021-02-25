public class Bug {
    private int initialPosition;
    private boolean direction;

    // Constructor
    public Bug(int initialPosition) {
        this.initialPosition = initialPosition;
        this.direction = true;
    }

    public void turn() {

        direction = direction ? false : true;

    }

    public void move() {
        
        if (direction) {
            initialPosition = initialPosition + 1;
        } else {
            initialPosition = initialPosition - 1;
        }

    }

    public int getPosition() {
        return initialPosition;
    }
}
