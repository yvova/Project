package problem;

import javax.media.opengl.GL2;

public class Circle {
    public Point center;
    public double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public void render(GL2 gl){
        Figures.myRenderCircle(gl, center, radius);
    }
}
