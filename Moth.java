public class Moth {
    private double initialX;
    private double initialY;
    private double currentXPoint;
    private double currentYPoint;
    private double endXPoint;
    private double endYPoint;

    
    // Constructor
    public Moth(double initialX, double initialY) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.currentXPoint = 0;
        this.currentYPoint = 0;
        this.endXPoint = 0;
        this.endYPoint = 0;
    }

    public void lightPoint(double X, double Y) {
        endXPoint = X;
        endYPoint = Y;
    }

    public double getX() {
        double nextX = (endXPoint - initialX) / 2;
        currentXPoint = currentXPoint + (nextX);
        return currentXPoint;
    }

    public double getY() {
        double nextY = (endYPoint - initialY) / 2;
        currentYPoint = currentYPoint + (nextY);
        return currentYPoint;
    }

    public void getPosition() {
        
        if (currentXPoint > endXPoint && currentYPoint > endYPoint) {
            System.out.println("The Moth has reached the light");
        } else {
            System.out.println("The light is on: ");
            System.out.println("X: " + endXPoint);
            System.out.println("Y: " + endYPoint + "\n");
            System.out.println("The moth is on:");
            System.out.println("X: " + currentXPoint);
            System.out.println("Y: " + currentYPoint  + "\n");
        }

    }


}
