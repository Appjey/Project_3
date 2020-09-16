package Example_5;

class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2)
    {
    }

    public void moveUp() {}
    public void moveDown() {}
    public void moveLeft() {}
    public void moveRight() {}
}

class MovablePoint extends MovableRectangle implements Movable {
    public MovablePoint(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }
}

public interface Movable {
}