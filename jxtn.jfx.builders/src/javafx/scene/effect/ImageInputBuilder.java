// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link ImageInput}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImageInputBuilder<Z extends ImageInput, B extends ImageInputBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasSource;
    protected javafx.scene.image.Image valSource;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundSource;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> obsrvSource;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;
    public void applyTo(ImageInput instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasSource)
            instance.setSource(this.valSource);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundSource)
            instance.sourceProperty().bind(this.obsrvSource);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B source(javafx.scene.image.Image value)
    {
        this.hasSource = true;
        this.valSource = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindSource(javafx.beans.value.ObservableValue<? extends javafx.scene.image.Image> source)
    {
        assert (source != null);
        this.boundSource = true;
        this.obsrvSource = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundX = true;
        this.obsrvX = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundY = true;
        this.obsrvY = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ImageInput build()
    {
        ImageInput instance = new ImageInput();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
