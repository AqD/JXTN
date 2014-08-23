// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link Region}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RegionBuilder<Z extends Region, B extends RegionBuilder<Z, B>>
        extends javafx.scene.ParentBuilder<Z, B>
{

    protected boolean hasBackground;
    protected javafx.scene.layout.Background valBackground;

    protected boolean hasBorder;
    protected javafx.scene.layout.Border valBorder;

    protected boolean hasCacheShape;
    protected boolean valCacheShape;

    protected boolean hasCenterShape;
    protected boolean valCenterShape;

    protected boolean hasMaxHeight;
    protected double valMaxHeight;

    protected boolean hasMaxWidth;
    protected double valMaxWidth;

    protected boolean hasMinHeight;
    protected double valMinHeight;

    protected boolean hasMinWidth;
    protected double valMinWidth;

    protected boolean hasOpaqueInsets;
    protected javafx.geometry.Insets valOpaqueInsets;

    protected boolean hasPadding;
    protected javafx.geometry.Insets valPadding;

    protected boolean hasPrefHeight;
    protected double valPrefHeight;

    protected boolean hasPrefWidth;
    protected double valPrefWidth;

    protected boolean hasScaleShape;
    protected boolean valScaleShape;

    protected boolean hasShape;
    protected javafx.scene.shape.Shape valShape;

    protected boolean hasSnapToPixel;
    protected boolean valSnapToPixel;

    protected boolean boundBackground;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Background> obsrvBackground;

    protected boolean boundBorder;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Border> obsrvBorder;

    protected boolean boundCacheShape;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvCacheShape;

    protected boolean boundCenterShape;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvCenterShape;

    protected boolean boundMaxHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMaxHeight;

    protected boolean boundMaxWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMaxWidth;

    protected boolean boundMinHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMinHeight;

    protected boolean boundMinWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMinWidth;

    protected boolean boundOpaqueInsets;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Insets> obsrvOpaqueInsets;

    protected boolean boundPadding;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Insets> obsrvPadding;

    protected boolean boundPrefHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPrefHeight;

    protected boolean boundPrefWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPrefWidth;

    protected boolean boundScaleShape;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvScaleShape;

    protected boolean boundShape;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.Shape> obsrvShape;

    protected boolean boundSnapToPixel;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSnapToPixel;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBackground)
            instance.setBackground(this.valBackground);
        if (this.hasBorder)
            instance.setBorder(this.valBorder);
        if (this.hasCacheShape)
            instance.setCacheShape(this.valCacheShape);
        if (this.hasCenterShape)
            instance.setCenterShape(this.valCenterShape);
        if (this.hasMaxHeight)
            instance.setMaxHeight(this.valMaxHeight);
        if (this.hasMaxWidth)
            instance.setMaxWidth(this.valMaxWidth);
        if (this.hasMinHeight)
            instance.setMinHeight(this.valMinHeight);
        if (this.hasMinWidth)
            instance.setMinWidth(this.valMinWidth);
        if (this.hasOpaqueInsets)
            instance.setOpaqueInsets(this.valOpaqueInsets);
        if (this.hasPadding)
            instance.setPadding(this.valPadding);
        if (this.hasPrefHeight)
            instance.setPrefHeight(this.valPrefHeight);
        if (this.hasPrefWidth)
            instance.setPrefWidth(this.valPrefWidth);
        if (this.hasScaleShape)
            instance.setScaleShape(this.valScaleShape);
        if (this.hasShape)
            instance.setShape(this.valShape);
        if (this.hasSnapToPixel)
            instance.setSnapToPixel(this.valSnapToPixel);
        if (this.boundBackground)
            instance.backgroundProperty().bind(this.obsrvBackground);
        if (this.boundBorder)
            instance.borderProperty().bind(this.obsrvBorder);
        if (this.boundCacheShape)
            instance.cacheShapeProperty().bind(this.obsrvCacheShape);
        if (this.boundCenterShape)
            instance.centerShapeProperty().bind(this.obsrvCenterShape);
        if (this.boundMaxHeight)
            instance.maxHeightProperty().bind(this.obsrvMaxHeight);
        if (this.boundMaxWidth)
            instance.maxWidthProperty().bind(this.obsrvMaxWidth);
        if (this.boundMinHeight)
            instance.minHeightProperty().bind(this.obsrvMinHeight);
        if (this.boundMinWidth)
            instance.minWidthProperty().bind(this.obsrvMinWidth);
        if (this.boundOpaqueInsets)
            instance.opaqueInsetsProperty().bind(this.obsrvOpaqueInsets);
        if (this.boundPadding)
            instance.paddingProperty().bind(this.obsrvPadding);
        if (this.boundPrefHeight)
            instance.prefHeightProperty().bind(this.obsrvPrefHeight);
        if (this.boundPrefWidth)
            instance.prefWidthProperty().bind(this.obsrvPrefWidth);
        if (this.boundScaleShape)
            instance.scaleShapeProperty().bind(this.obsrvScaleShape);
        if (this.boundShape)
            instance.shapeProperty().bind(this.obsrvShape);
        if (this.boundSnapToPixel)
            instance.snapToPixelProperty().bind(this.obsrvSnapToPixel);
    }

    /**
     * 設定屬性{@link Region#setBackground}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B background(javafx.scene.layout.Background value)
    {
        this.hasBackground = true;
        this.valBackground = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setBorder}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B border(javafx.scene.layout.Border value)
    {
        this.hasBorder = true;
        this.valBorder = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setCacheShape}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cacheShape(boolean value)
    {
        this.hasCacheShape = true;
        this.valCacheShape = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setCenterShape}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B centerShape(boolean value)
    {
        this.hasCenterShape = true;
        this.valCenterShape = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setMaxHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxHeight(double value)
    {
        this.hasMaxHeight = true;
        this.valMaxHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setMaxWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxWidth(double value)
    {
        this.hasMaxWidth = true;
        this.valMaxWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setMinHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minHeight(double value)
    {
        this.hasMinHeight = true;
        this.valMinHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setMinWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minWidth(double value)
    {
        this.hasMinWidth = true;
        this.valMinWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setOpaqueInsets}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B opaqueInsets(javafx.geometry.Insets value)
    {
        this.hasOpaqueInsets = true;
        this.valOpaqueInsets = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setPadding}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B padding(javafx.geometry.Insets value)
    {
        this.hasPadding = true;
        this.valPadding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setPrefHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefHeight(double value)
    {
        this.hasPrefHeight = true;
        this.valPrefHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setPrefWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefWidth(double value)
    {
        this.hasPrefWidth = true;
        this.valPrefWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setScaleShape}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B scaleShape(boolean value)
    {
        this.hasScaleShape = true;
        this.valScaleShape = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setShape}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B shape(javafx.scene.shape.Shape value)
    {
        this.hasShape = true;
        this.valShape = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#setSnapToPixel}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B snapToPixel(boolean value)
    {
        this.hasSnapToPixel = true;
        this.valSnapToPixel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#backgroundProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindBackground(javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Background> source)
    {
        assert (source != null);
        this.boundBackground = true;
        this.obsrvBackground = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#borderProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindBorder(javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Border> source)
    {
        assert (source != null);
        this.boundBorder = true;
        this.obsrvBorder = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#cacheShapeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCacheShape(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundCacheShape = true;
        this.obsrvCacheShape = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#centerShapeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCenterShape(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundCenterShape = true;
        this.obsrvCenterShape = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#maxHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMaxHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMaxHeight = true;
        this.obsrvMaxHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#maxWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMaxWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMaxWidth = true;
        this.obsrvMaxWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#minHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMinHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMinHeight = true;
        this.obsrvMinHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#minWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMinWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMinWidth = true;
        this.obsrvMinWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#opaqueInsetsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOpaqueInsets(javafx.beans.value.ObservableValue<? extends javafx.geometry.Insets> source)
    {
        assert (source != null);
        this.boundOpaqueInsets = true;
        this.obsrvOpaqueInsets = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#paddingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPadding(javafx.beans.value.ObservableValue<? extends javafx.geometry.Insets> source)
    {
        assert (source != null);
        this.boundPadding = true;
        this.obsrvPadding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#prefHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPrefHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPrefHeight = true;
        this.obsrvPrefHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#prefWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPrefWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPrefWidth = true;
        this.obsrvPrefWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#scaleShapeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindScaleShape(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundScaleShape = true;
        this.obsrvScaleShape = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#shapeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindShape(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.Shape> source)
    {
        assert (source != null);
        this.boundShape = true;
        this.obsrvShape = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Region#snapToPixelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSnapToPixel(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSnapToPixel = true;
        this.obsrvSnapToPixel = source;
        return (B) this;
    }

    /**
     * 建構{@link Region}物件
     *
     * @return 新的{@link Region}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Region build()
    {
        Region instance = new Region();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
