// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Circle}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Circle})
 * @param <B> 建構器本身的型態(需繼承{@link CircleBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CircleBuilder<Z extends Circle, B extends CircleBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    private boolean hasCenterX;
    private double valCenterX;

    private boolean hasCenterY;
    private double valCenterY;

    private boolean hasRadius;
    private double valRadius;

    private boolean boundCenterX;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvCenterX;

    private boolean boundCenterY;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvCenterY;

    private boolean boundRadius;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvRadius;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCenterX)
            instance.setCenterX(this.valCenterX);
        if (this.hasCenterY)
            instance.setCenterY(this.valCenterY);
        if (this.hasRadius)
            instance.setRadius(this.valRadius);
        if (this.boundCenterX)
            instance.centerXProperty().bind(this.obsrvCenterX);
        if (this.boundCenterY)
            instance.centerYProperty().bind(this.obsrvCenterY);
        if (this.boundRadius)
            instance.radiusProperty().bind(this.obsrvRadius);
    }

    /**
     * 設定屬性{@link Circle#setCenterX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B centerX(double value)
    {
        this.hasCenterX = true;
        this.valCenterX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#setCenterY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B centerY(double value)
    {
        this.hasCenterY = true;
        this.valCenterY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#setRadius(double)}
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
     * 設定屬性{@link Circle#centerXProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCenterX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundCenterX = true;
        this.obsrvCenterX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#centerYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCenterY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundCenterY = true;
        this.obsrvCenterY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#radiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRadius(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundRadius = true;
        this.obsrvRadius = source;
        return (B) this;
    }

    /**
     * 建構{@link Circle}物件
     *
     * @return 新的{@link Circle}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Circle build()
    {
        Circle instance = new Circle();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
