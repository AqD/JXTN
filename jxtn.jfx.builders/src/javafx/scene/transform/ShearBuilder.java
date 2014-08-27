// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.transform;

/**
 * {@link Shear}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ShearBuilder<Z extends Shear, B extends ShearBuilder<Z, B>>
        extends javafx.scene.transform.TransformBuilder<Z, B>
{

    protected boolean hasPivotX;
    protected double valPivotX;

    protected boolean hasPivotY;
    protected double valPivotY;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundPivotX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPivotX;

    protected boolean boundPivotY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPivotY;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasPivotX)
            instance.setPivotX(this.valPivotX);
        if (this.hasPivotY)
            instance.setPivotY(this.valPivotY);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundPivotX)
            instance.pivotXProperty().bind(this.obsrvPivotX);
        if (this.boundPivotY)
            instance.pivotYProperty().bind(this.obsrvPivotY);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
    }

    /**
     * 設定屬性{@link Shear#setPivotX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotX(double value)
    {
        this.hasPivotX = true;
        this.valPivotX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shear#setPivotY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pivotY(double value)
    {
        this.hasPivotY = true;
        this.valPivotY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shear#setX(double)}
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
     * 設定屬性{@link Shear#setY(double)}
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
     * 設定屬性{@link Shear#pivotXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPivotX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPivotX = true;
        this.obsrvPivotX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shear#pivotYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPivotY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPivotY = true;
        this.obsrvPivotY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shear#xProperty}的連結
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
     * 設定屬性{@link Shear#yProperty}的連結
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
     * 建構{@link Shear}物件
     *
     * @return 新的{@link Shear}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Shear build()
    {
        Shear instance = new Shear();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
