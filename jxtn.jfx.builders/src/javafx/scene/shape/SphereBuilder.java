// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Sphere}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SphereBuilder<Z extends Sphere, B extends SphereBuilder<Z, B>>
        extends javafx.scene.shape.Shape3DBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasRadius;
    protected double valRadius;

    protected boolean boundRadius;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRadius;
    public void applyTo(Sphere instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasRadius)
            instance.setRadius(this.valRadius);
        if (this.boundRadius)
            instance.radiusProperty().bind(this.obsrvRadius);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B radius(double value)
    {
        this.hasRadius = true;
        this.valRadius = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindRadius(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRadius = true;
        this.obsrvRadius = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Sphere build()
    {
        Sphere instance = new Sphere();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
