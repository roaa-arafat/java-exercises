package w6;

public class circle {

    private int rad;

    public circle() {
    }

    public circle(int rad) {
        this.rad = rad;
    }

    public double calcArea() {
        double area = rad * rad * Math.PI;
        return area;
    }

    public double calcround() {
        double round = 2 * rad * Math.PI;
        return round;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad > 0) {
            this.rad = rad;
        } else {
            System.out.println("Invalid input");
        }
    }

    @Override
    public String toString() {
        return "Circle { Rad = " + rad + " , Area = " + calcArea() + " , Round = " + calcround() + " } ";
    }

}
