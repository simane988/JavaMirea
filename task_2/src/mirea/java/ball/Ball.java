package mirea.java.ball;

public class Ball {
    private double x = 0.0f;
    private double xSpeed = 1f;
    private double y = 0.0f;
    private double ySpeed = 1f;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){}

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXYSpeed(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x + "," + y + ')';
    }
}
