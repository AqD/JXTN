// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Shape}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ShapeBuilder<Z extends Shape, B extends ShapeBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
{

    protected boolean hasFill;
    protected javafx.scene.paint.Paint valFill;

    protected boolean hasSmooth;
    protected boolean valSmooth;

    protected boolean hasStroke;
    protected javafx.scene.paint.Paint valStroke;

    protected boolean hasStrokeDashArray;
    protected java.util.Collection<java.lang.Double> valStrokeDashArray;

    protected boolean hasStrokeDashOffset;
    protected double valStrokeDashOffset;

    protected boolean hasStrokeLineCap;
    protected javafx.scene.shape.StrokeLineCap valStrokeLineCap;

    protected boolean hasStrokeLineJoin;
    protected javafx.scene.shape.StrokeLineJoin valStrokeLineJoin;

    protected boolean hasStrokeMiterLimit;
    protected double valStrokeMiterLimit;

    protected boolean hasStrokeType;
    protected javafx.scene.shape.StrokeType valStrokeType;

    protected boolean hasStrokeWidth;
    protected double valStrokeWidth;

    protected boolean boundFill;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> obsrvFill;

    protected boolean boundSmooth;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSmooth;

    protected boolean boundStrokeDashOffset;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvStrokeDashOffset;

    protected boolean boundStrokeLineCap;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeLineCap> obsrvStrokeLineCap;

    protected boolean boundStrokeLineJoin;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeLineJoin> obsrvStrokeLineJoin;

    protected boolean boundStrokeMiterLimit;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvStrokeMiterLimit;

    protected boolean boundStroke;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> obsrvStroke;

    protected boolean boundStrokeType;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeType> obsrvStrokeType;

    protected boolean boundStrokeWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvStrokeWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFill)
            instance.setFill(this.valFill);
        if (this.hasSmooth)
            instance.setSmooth(this.valSmooth);
        if (this.hasStroke)
            instance.setStroke(this.valStroke);
        if (this.hasStrokeDashArray)
            instance.getStrokeDashArray().setAll(this.valStrokeDashArray);
        if (this.hasStrokeDashOffset)
            instance.setStrokeDashOffset(this.valStrokeDashOffset);
        if (this.hasStrokeLineCap)
            instance.setStrokeLineCap(this.valStrokeLineCap);
        if (this.hasStrokeLineJoin)
            instance.setStrokeLineJoin(this.valStrokeLineJoin);
        if (this.hasStrokeMiterLimit)
            instance.setStrokeMiterLimit(this.valStrokeMiterLimit);
        if (this.hasStrokeType)
            instance.setStrokeType(this.valStrokeType);
        if (this.hasStrokeWidth)
            instance.setStrokeWidth(this.valStrokeWidth);
        if (this.boundFill)
            instance.fillProperty().bind(this.obsrvFill);
        if (this.boundSmooth)
            instance.smoothProperty().bind(this.obsrvSmooth);
        if (this.boundStrokeDashOffset)
            instance.strokeDashOffsetProperty().bind(this.obsrvStrokeDashOffset);
        if (this.boundStrokeLineCap)
            instance.strokeLineCapProperty().bind(this.obsrvStrokeLineCap);
        if (this.boundStrokeLineJoin)
            instance.strokeLineJoinProperty().bind(this.obsrvStrokeLineJoin);
        if (this.boundStrokeMiterLimit)
            instance.strokeMiterLimitProperty().bind(this.obsrvStrokeMiterLimit);
        if (this.boundStroke)
            instance.strokeProperty().bind(this.obsrvStroke);
        if (this.boundStrokeType)
            instance.strokeTypeProperty().bind(this.obsrvStrokeType);
        if (this.boundStrokeWidth)
            instance.strokeWidthProperty().bind(this.obsrvStrokeWidth);
    }

    /**
     * 設定屬性{@link Shape#setFill}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fill(javafx.scene.paint.Paint value)
    {
        this.hasFill = true;
        this.valFill = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setSmooth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B smooth(boolean value)
    {
        this.hasSmooth = true;
        this.valSmooth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStroke}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B stroke(javafx.scene.paint.Paint value)
    {
        this.hasStroke = true;
        this.valStroke = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Shape#getStrokeDashArray}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeDashArray(java.util.Collection<java.lang.Double> value)
    {
        this.hasStrokeDashArray = true;
        this.valStrokeDashArray = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Shape#getStrokeDashArray}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B strokeDashArray(java.lang.Double... value)
    {
        this.hasStrokeDashArray = true;
        this.valStrokeDashArray = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeDashOffset}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeDashOffset(double value)
    {
        this.hasStrokeDashOffset = true;
        this.valStrokeDashOffset = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeLineCap}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeLineCap(javafx.scene.shape.StrokeLineCap value)
    {
        this.hasStrokeLineCap = true;
        this.valStrokeLineCap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeLineJoin}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeLineJoin(javafx.scene.shape.StrokeLineJoin value)
    {
        this.hasStrokeLineJoin = true;
        this.valStrokeLineJoin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeMiterLimit}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeMiterLimit(double value)
    {
        this.hasStrokeMiterLimit = true;
        this.valStrokeMiterLimit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeType}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeType(javafx.scene.shape.StrokeType value)
    {
        this.hasStrokeType = true;
        this.valStrokeType = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#setStrokeWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strokeWidth(double value)
    {
        this.hasStrokeWidth = true;
        this.valStrokeWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#fillProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindFill(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> source)
    {
        assert (source != null);
        this.boundFill = true;
        this.obsrvFill = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#smoothProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSmooth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSmooth = true;
        this.obsrvSmooth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeDashOffsetProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeDashOffset(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundStrokeDashOffset = true;
        this.obsrvStrokeDashOffset = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeLineCapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeLineCap(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeLineCap> source)
    {
        assert (source != null);
        this.boundStrokeLineCap = true;
        this.obsrvStrokeLineCap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeLineJoinProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeLineJoin(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeLineJoin> source)
    {
        assert (source != null);
        this.boundStrokeLineJoin = true;
        this.obsrvStrokeLineJoin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeMiterLimitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeMiterLimit(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundStrokeMiterLimit = true;
        this.obsrvStrokeMiterLimit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStroke(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> source)
    {
        assert (source != null);
        this.boundStroke = true;
        this.obsrvStroke = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeTypeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeType(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.StrokeType> source)
    {
        assert (source != null);
        this.boundStrokeType = true;
        this.obsrvStrokeType = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Shape#strokeWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStrokeWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundStrokeWidth = true;
        this.obsrvStrokeWidth = source;
        return (B) this;
    }
}
