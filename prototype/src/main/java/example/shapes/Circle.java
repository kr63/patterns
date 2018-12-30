package example.shapes;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Circle  extends Shape{
    public int radius;

    private Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
