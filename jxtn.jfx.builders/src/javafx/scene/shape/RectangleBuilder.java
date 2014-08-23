// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Rectangle}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RectangleBuilder<Z extends Rectangle, B extends RectangleBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    protected boolean hasArcHeight;
    protected double valArcHeight;

    protected boolean hasArcWidth;
    protected double valArcWidth;

    protected boolean hasHeight;
    protected double valHeight;

    protected boolean hasWidth;
    protected double valWidth;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundArcHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvArcHeight;

    protected boolean boundArcWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvArcWidth;

    protected boolean boundHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvHeight;

    protected boolean boundWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvWidth;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasArcHeight)
            instance.setArcHeight(this.valArcHeight);
        if (this.hasArcWidth)
            instance.setArcWidth(this.valArcWidth);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundArcHeight)
            instance.arcHeightProperty().bind(this.obsrvArcHeight);
        if (this.boundArcWidth)
            instance.arcWidthProperty().bind(this.obsrvArcWidth);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundWidth)
            instance.widthProperty().bind(this.obsrvWidth);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
    }

    /**
     * 設定屬性{@link Rectangle#setArcHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B arcHeight(double value)
    {
        this.hasArcHeight = true;
        this.valArcHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#setArcWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B arcWidth(double value)
    {
        this.hasArcWidth = true;
        this.valArcWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#setHeight}
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
     * 設定屬性{@link Rectangle#setWidth}
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
     * 設定屬性{@link Rectangle#setX}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#setY}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#arcHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindArcHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundArcHeight = true;
        this.obsrvArcHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#arcWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindArcWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundArcWidth = true;
        this.obsrvArcWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#heightProperty}的連結
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
     * 設定屬性{@link Rectangle#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundWidth = true;
        this.obsrvWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#xProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundX = true;
        this.obsrvX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rectangle#yProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundY = true;
        this.obsrvY = source;
        return (B) this;
    }

    /**
     * 建構{@link Rectangle}物件
     *
     * @return 新的{@link Rectangle}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Rectangle build()
    {
        Rectangle instance = new Rectangle();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
