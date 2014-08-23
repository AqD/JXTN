// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Ellipse}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class EllipseBuilder<Z extends Ellipse, B extends EllipseBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasCenterX;
    protected double valCenterX;

    protected boolean hasCenterY;
    protected double valCenterY;

    protected boolean hasRadiusX;
    protected double valRadiusX;

    protected boolean hasRadiusY;
    protected double valRadiusY;

    protected boolean boundCenterX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvCenterX;

    protected boolean boundCenterY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvCenterY;

    protected boolean boundRadiusX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRadiusX;

    protected boolean boundRadiusY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRadiusY;
    public void applyTo(Ellipse instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasCenterX)
            instance.setCenterX(this.valCenterX);
        if (this.hasCenterY)
            instance.setCenterY(this.valCenterY);
        if (this.hasRadiusX)
            instance.setRadiusX(this.valRadiusX);
        if (this.hasRadiusY)
            instance.setRadiusY(this.valRadiusY);
        if (this.boundCenterX)
            instance.centerXProperty().bind(this.obsrvCenterX);
        if (this.boundCenterY)
            instance.centerYProperty().bind(this.obsrvCenterY);
        if (this.boundRadiusX)
            instance.radiusXProperty().bind(this.obsrvRadiusX);
        if (this.boundRadiusY)
            instance.radiusYProperty().bind(this.obsrvRadiusY);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B centerX(double value)
    {
        this.hasCenterX = true;
        this.valCenterX = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B centerY(double value)
    {
        this.hasCenterY = true;
        this.valCenterY = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B radiusX(double value)
    {
        this.hasRadiusX = true;
        this.valRadiusX = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B radiusY(double value)
    {
        this.hasRadiusY = true;
        this.valRadiusY = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindCenterX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundCenterX = true;
        this.obsrvCenterX = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindCenterY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundCenterY = true;
        this.obsrvCenterY = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindRadiusX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRadiusX = true;
        this.obsrvRadiusX = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindRadiusY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRadiusY = true;
        this.obsrvRadiusY = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Ellipse build()
    {
        Ellipse instance = new Ellipse();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
