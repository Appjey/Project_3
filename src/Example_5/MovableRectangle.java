package Example_5;

public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2)
    {
    }

    public void moveUp() {}

    @Override
    public void moveUP() {}
    public void moveDown() {}
    public void moveLeft() {}
    public void moveRight() {}
}