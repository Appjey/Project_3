package Example_4;

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    @Override
    public void moveUP() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}

class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveUP() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
public interface Movable {
    public void moveUP();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}