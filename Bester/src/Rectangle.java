
public class Rectangle implements Betterable<Rectangle> {
    private final float weight;
    private final float height;

    public Rectangle(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean isBetterThan(Rectangle rectangle) {
        if(rectangle == null) return true;
        return this.area() > rectangle.area();
    }

    public float area() {
        return weight * height;
    }
}
