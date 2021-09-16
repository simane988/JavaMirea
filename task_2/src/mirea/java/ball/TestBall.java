package mirea.java.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();

        b1.setXY(1.4d, 3.2d);
        b1.setXYSpeed(5f, 10f);
        b1.move();

        System.out.println(b1.toString());
    }
}
