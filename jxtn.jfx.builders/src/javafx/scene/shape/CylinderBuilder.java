// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Cylinder}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CylinderBuilder<Z extends Cylinder, B extends CylinderBuilder<Z, B>>
        extends javafx.scene.shape.Shape3DBuilder<Z, B>
{

    protected boolean hasHeight;
    protected double valHeight;

    protected boolean hasRadius;
    protected double valRadius;

    protected boolean boundHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvHeight;

    protected boolean boundRadius;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRadius;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasRadius)
            instance.setRadius(this.valRadius);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundRadius)
            instance.radiusProperty().bind(this.obsrvRadius);
    }

    /**
     * 設定屬性{@link Cylinder#setHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cylinder#setRadius}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B radius(double value)
    {
        this.hasRadius = true;
        this.valRadius = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cylinder#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundHeight = true;
        this.obsrvHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cylinder#radiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRadius(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRadius = true;
        this.obsrvRadius = source;
        return (B) this;
    }

    /**
     * 建構{@link Cylinder}物件
     *
     * @return 新的{@link Cylinder}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Cylinder build()
    {
        Cylinder instance = new Cylinder();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
