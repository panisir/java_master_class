package e_oop_part_one.e_exercises.a_point_in_twod;

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        // x - 0, y - 0 from start point
        return Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(int x2, int y2){
        return Math.sqrt( Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
    }

    public double distance(Point p2){
        return Math.sqrt( Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
    }

}
