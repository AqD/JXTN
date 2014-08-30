// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Box}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Box})
 * @param <B> 建構器本身的型態(需繼承{@link BoxBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BoxBuilder<Z extends Box, B extends BoxBuilder<Z, B>>
        extends javafx.scene.shape.Shape3DBuilder<Z, B>
{

    private boolean hasDepth;
    private double valDepth;

    private boolean hasHeight;
    private double valHeight;

    private boolean hasWidth;
    private double valWidth;

    private boolean boundDepth;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvDepth;

    private boolean boundHeight;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvHeight;

    private boolean boundWidth;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasDepth)
            instance.setDepth(this.valDepth);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.boundDepth)
            instance.depthProperty().bind(this.obsrvDepth);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundWidth)
            instance.widthProperty().bind(this.obsrvWidth);
    }

    /**
     * 設定屬性{@link Box#setDepth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B depth(double value)
    {
        this.hasDepth = true;
        this.valDepth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#setHeight(double)}
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
     * 設定屬性{@link Box#setWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#depthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDepth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundDepth = true;
        this.obsrvDepth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundHeight = true;
        this.obsrvHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Box#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundWidth = true;
        this.obsrvWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link Box}物件
     *
     * @return 新的{@link Box}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Box build()
    {
        Box instance = new Box();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
