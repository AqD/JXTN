// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link CubicCurve}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CubicCurve})
 * @param <B> 建構器本身的型態(需繼承{@link CubicCurveBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CubicCurveBuilder<Z extends CubicCurve, B extends CubicCurveBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    private boolean hasControlX1;
    private double valControlX1;

    private boolean hasControlX2;
    private double valControlX2;

    private boolean hasControlY1;
    private double valControlY1;

    private boolean hasControlY2;
    private double valControlY2;

    private boolean hasEndX;
    private double valEndX;

    private boolean hasEndY;
    private double valEndY;

    private boolean hasStartX;
    private double valStartX;

    private boolean hasStartY;
    private double valStartY;

    private boolean boundControlX1;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvControlX1;

    private boolean boundControlX2;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvControlX2;

    private boolean boundControlY1;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvControlY1;

    private boolean boundControlY2;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvControlY2;

    private boolean boundEndX;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvEndX;

    private boolean boundEndY;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvEndY;

    private boolean boundStartX;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvStartX;

    private boolean boundStartY;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvStartY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasControlX1)
            instance.setControlX1(this.valControlX1);
        if (this.hasControlX2)
            instance.setControlX2(this.valControlX2);
        if (this.hasControlY1)
            instance.setControlY1(this.valControlY1);
        if (this.hasControlY2)
            instance.setControlY2(this.valControlY2);
        if (this.hasEndX)
            instance.setEndX(this.valEndX);
        if (this.hasEndY)
            instance.setEndY(this.valEndY);
        if (this.hasStartX)
            instance.setStartX(this.valStartX);
        if (this.hasStartY)
            instance.setStartY(this.valStartY);
        if (this.boundControlX1)
            instance.controlX1Property().bind(this.obsrvControlX1);
        if (this.boundControlX2)
            instance.controlX2Property().bind(this.obsrvControlX2);
        if (this.boundControlY1)
            instance.controlY1Property().bind(this.obsrvControlY1);
        if (this.boundControlY2)
            instance.controlY2Property().bind(this.obsrvControlY2);
        if (this.boundEndX)
            instance.endXProperty().bind(this.obsrvEndX);
        if (this.boundEndY)
            instance.endYProperty().bind(this.obsrvEndY);
        if (this.boundStartX)
            instance.startXProperty().bind(this.obsrvStartX);
        if (this.boundStartY)
            instance.startYProperty().bind(this.obsrvStartY);
    }

    /**
     * 設定屬性{@link CubicCurve#setControlX1(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlX1(double value)
    {
        this.hasControlX1 = true;
        this.valControlX1 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setControlX2(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlX2(double value)
    {
        this.hasControlX2 = true;
        this.valControlX2 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setControlY1(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlY1(double value)
    {
        this.hasControlY1 = true;
        this.valControlY1 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setControlY2(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B controlY2(double value)
    {
        this.hasControlY2 = true;
        this.valControlY2 = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setEndX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endX(double value)
    {
        this.hasEndX = true;
        this.valEndX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setEndY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endY(double value)
    {
        this.hasEndY = true;
        this.valEndY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setStartX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startX(double value)
    {
        this.hasStartX = true;
        this.valStartX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#setStartY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startY(double value)
    {
        this.hasStartY = true;
        this.valStartY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#controlX1Property}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlX1(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundControlX1 = true;
        this.obsrvControlX1 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#controlX2Property}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlX2(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundControlX2 = true;
        this.obsrvControlX2 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#controlY1Property}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlY1(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundControlY1 = true;
        this.obsrvControlY1 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#controlY2Property}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindControlY2(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundControlY2 = true;
        this.obsrvControlY2 = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#endXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEndX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundEndX = true;
        this.obsrvEndX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#endYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEndY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundEndY = true;
        this.obsrvEndY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#startXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStartX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundStartX = true;
        this.obsrvStartX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CubicCurve#startYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStartY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundStartY = true;
        this.obsrvStartY = source;
        return (B) this;
    }

    /**
     * 建構{@link CubicCurve}物件
     *
     * @return 新的{@link CubicCurve}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CubicCurve build()
    {
        CubicCurve instance = new CubicCurve();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
