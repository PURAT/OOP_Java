
public abstract class ScalableFigure extends Figure {
    private int size;

    public ScalableFigure(int x, int y, int size) {
        super(x, y);
        this. size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
