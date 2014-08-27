// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link LineTo}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LineToBuilder<Z extends LineTo, B extends LineToBuilder<Z, B>>
        extends javafx.scene.shape.PathElementBuilder<Z, B>
{

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
    }

    /**
     * 設定屬性{@link LineTo#setX(double)}
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
     * 設定屬性{@link LineTo#setY(double)}
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
     * 設定屬性{@link LineTo#xProperty}的連結
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
     * 設定屬性{@link LineTo#yProperty}的連結
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
     * 建構{@link LineTo}物件
     *
     * @return 新的{@link LineTo}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public LineTo build()
    {
        LineTo instance = new LineTo();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
