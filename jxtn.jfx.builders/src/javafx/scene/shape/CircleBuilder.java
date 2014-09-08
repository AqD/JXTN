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

    private boolean bound1CenterX;
    private boolean bound2CenterX;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1CenterX;
    private javafx.beans.property.Property<Number> obsrv2CenterX;

    private boolean bound1CenterY;
    private boolean bound2CenterY;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1CenterY;
    private javafx.beans.property.Property<Number> obsrv2CenterY;

    private boolean bound1Radius;
    private boolean bound2Radius;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Radius;
    private javafx.beans.property.Property<Number> obsrv2Radius;

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
        if (this.bound1CenterX)
            instance.centerXProperty().bind(this.obsrv1CenterX);
        if (this.bound2CenterX)
            instance.centerXProperty().bindBidirectional(this.obsrv2CenterX);
        if (this.bound1CenterY)
            instance.centerYProperty().bind(this.obsrv1CenterY);
        if (this.bound2CenterY)
            instance.centerYProperty().bindBidirectional(this.obsrv2CenterY);
        if (this.bound1Radius)
            instance.radiusProperty().bind(this.obsrv1Radius);
        if (this.bound2Radius)
            instance.radiusProperty().bindBidirectional(this.obsrv2Radius);
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
    public final B bindCenterX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CenterX = true;
        this.obsrv1CenterX = source;
        this.bound2CenterX = false;
        this.obsrv2CenterX = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#centerXProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCenterX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CenterX = false;
        this.obsrv1CenterX = null;
        this.bound2CenterX = true;
        this.obsrv2CenterX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#centerYProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCenterY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CenterY = true;
        this.obsrv1CenterY = source;
        this.bound2CenterY = false;
        this.obsrv2CenterY = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#centerYProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCenterY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CenterY = false;
        this.obsrv1CenterY = null;
        this.bound2CenterY = true;
        this.obsrv2CenterY = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#radiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRadius(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Radius = true;
        this.obsrv1Radius = source;
        this.bound2Radius = false;
        this.obsrv2Radius = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Circle#radiusProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRadius(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Radius = false;
        this.obsrv1Radius = null;
        this.bound2Radius = true;
        this.obsrv2Radius = source;
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
