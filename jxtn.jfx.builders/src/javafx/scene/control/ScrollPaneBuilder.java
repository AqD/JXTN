// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ScrollPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ScrollPane})
 * @param <B> 建構器本身的型態(需繼承{@link ScrollPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ScrollPaneBuilder<Z extends ScrollPane, B extends ScrollPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasContent;
    private javafx.scene.Node valContent;

    private boolean hasFitToHeight;
    private boolean valFitToHeight;

    private boolean hasFitToWidth;
    private boolean valFitToWidth;

    private boolean hasHbarPolicy;
    private javafx.scene.control.ScrollPane.ScrollBarPolicy valHbarPolicy;

    private boolean hasHmax;
    private double valHmax;

    private boolean hasHmin;
    private double valHmin;

    private boolean hasHvalue;
    private double valHvalue;

    private boolean hasPannable;
    private boolean valPannable;

    private boolean hasPrefViewportHeight;
    private double valPrefViewportHeight;

    private boolean hasPrefViewportWidth;
    private double valPrefViewportWidth;

    private boolean hasVbarPolicy;
    private javafx.scene.control.ScrollPane.ScrollBarPolicy valVbarPolicy;

    private boolean hasViewportBounds;
    private javafx.geometry.Bounds valViewportBounds;

    private boolean hasVmax;
    private double valVmax;

    private boolean hasVmin;
    private double valVmin;

    private boolean hasVvalue;
    private double valVvalue;

    private boolean bound1Content;
    private boolean bound2Content;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Content;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Content;

    private boolean bound1FitToHeight;
    private boolean bound2FitToHeight;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1FitToHeight;
    private javafx.beans.property.Property<Boolean> obsrv2FitToHeight;

    private boolean bound1FitToWidth;
    private boolean bound2FitToWidth;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1FitToWidth;
    private javafx.beans.property.Property<Boolean> obsrv2FitToWidth;

    private boolean bound1HbarPolicy;
    private boolean bound2HbarPolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.ScrollPane.ScrollBarPolicy> obsrv1HbarPolicy;
    private javafx.beans.property.Property<javafx.scene.control.ScrollPane.ScrollBarPolicy> obsrv2HbarPolicy;

    private boolean bound1Hmax;
    private boolean bound2Hmax;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Hmax;
    private javafx.beans.property.Property<Number> obsrv2Hmax;

    private boolean bound1Hmin;
    private boolean bound2Hmin;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Hmin;
    private javafx.beans.property.Property<Number> obsrv2Hmin;

    private boolean bound1Hvalue;
    private boolean bound2Hvalue;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Hvalue;
    private javafx.beans.property.Property<Number> obsrv2Hvalue;

    private boolean bound1Pannable;
    private boolean bound2Pannable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Pannable;
    private javafx.beans.property.Property<Boolean> obsrv2Pannable;

    private boolean bound1PrefViewportHeight;
    private boolean bound2PrefViewportHeight;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefViewportHeight;
    private javafx.beans.property.Property<Number> obsrv2PrefViewportHeight;

    private boolean bound1PrefViewportWidth;
    private boolean bound2PrefViewportWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1PrefViewportWidth;
    private javafx.beans.property.Property<Number> obsrv2PrefViewportWidth;

    private boolean bound1VbarPolicy;
    private boolean bound2VbarPolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.ScrollPane.ScrollBarPolicy> obsrv1VbarPolicy;
    private javafx.beans.property.Property<javafx.scene.control.ScrollPane.ScrollBarPolicy> obsrv2VbarPolicy;

    private boolean bound1ViewportBounds;
    private boolean bound2ViewportBounds;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Bounds> obsrv1ViewportBounds;
    private javafx.beans.property.Property<javafx.geometry.Bounds> obsrv2ViewportBounds;

    private boolean bound1Vmax;
    private boolean bound2Vmax;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Vmax;
    private javafx.beans.property.Property<Number> obsrv2Vmax;

    private boolean bound1Vmin;
    private boolean bound2Vmin;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Vmin;
    private javafx.beans.property.Property<Number> obsrv2Vmin;

    private boolean bound1Vvalue;
    private boolean bound2Vvalue;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Vvalue;
    private javafx.beans.property.Property<Number> obsrv2Vvalue;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasFitToHeight)
            instance.setFitToHeight(this.valFitToHeight);
        if (this.hasFitToWidth)
            instance.setFitToWidth(this.valFitToWidth);
        if (this.hasHbarPolicy)
            instance.setHbarPolicy(this.valHbarPolicy);
        if (this.hasHmax)
            instance.setHmax(this.valHmax);
        if (this.hasHmin)
            instance.setHmin(this.valHmin);
        if (this.hasHvalue)
            instance.setHvalue(this.valHvalue);
        if (this.hasPannable)
            instance.setPannable(this.valPannable);
        if (this.hasPrefViewportHeight)
            instance.setPrefViewportHeight(this.valPrefViewportHeight);
        if (this.hasPrefViewportWidth)
            instance.setPrefViewportWidth(this.valPrefViewportWidth);
        if (this.hasVbarPolicy)
            instance.setVbarPolicy(this.valVbarPolicy);
        if (this.hasViewportBounds)
            instance.setViewportBounds(this.valViewportBounds);
        if (this.hasVmax)
            instance.setVmax(this.valVmax);
        if (this.hasVmin)
            instance.setVmin(this.valVmin);
        if (this.hasVvalue)
            instance.setVvalue(this.valVvalue);
        if (this.bound1Content)
            instance.contentProperty().bind(this.obsrv1Content);
        if (this.bound2Content)
            instance.contentProperty().bindBidirectional(this.obsrv2Content);
        if (this.bound1FitToHeight)
            instance.fitToHeightProperty().bind(this.obsrv1FitToHeight);
        if (this.bound2FitToHeight)
            instance.fitToHeightProperty().bindBidirectional(this.obsrv2FitToHeight);
        if (this.bound1FitToWidth)
            instance.fitToWidthProperty().bind(this.obsrv1FitToWidth);
        if (this.bound2FitToWidth)
            instance.fitToWidthProperty().bindBidirectional(this.obsrv2FitToWidth);
        if (this.bound1HbarPolicy)
            instance.hbarPolicyProperty().bind(this.obsrv1HbarPolicy);
        if (this.bound2HbarPolicy)
            instance.hbarPolicyProperty().bindBidirectional(this.obsrv2HbarPolicy);
        if (this.bound1Hmax)
            instance.hmaxProperty().bind(this.obsrv1Hmax);
        if (this.bound2Hmax)
            instance.hmaxProperty().bindBidirectional(this.obsrv2Hmax);
        if (this.bound1Hmin)
            instance.hminProperty().bind(this.obsrv1Hmin);
        if (this.bound2Hmin)
            instance.hminProperty().bindBidirectional(this.obsrv2Hmin);
        if (this.bound1Hvalue)
            instance.hvalueProperty().bind(this.obsrv1Hvalue);
        if (this.bound2Hvalue)
            instance.hvalueProperty().bindBidirectional(this.obsrv2Hvalue);
        if (this.bound1Pannable)
            instance.pannableProperty().bind(this.obsrv1Pannable);
        if (this.bound2Pannable)
            instance.pannableProperty().bindBidirectional(this.obsrv2Pannable);
        if (this.bound1PrefViewportHeight)
            instance.prefViewportHeightProperty().bind(this.obsrv1PrefViewportHeight);
        if (this.bound2PrefViewportHeight)
            instance.prefViewportHeightProperty().bindBidirectional(this.obsrv2PrefViewportHeight);
        if (this.bound1PrefViewportWidth)
            instance.prefViewportWidthProperty().bind(this.obsrv1PrefViewportWidth);
        if (this.bound2PrefViewportWidth)
            instance.prefViewportWidthProperty().bindBidirectional(this.obsrv2PrefViewportWidth);
        if (this.bound1VbarPolicy)
            instance.vbarPolicyProperty().bind(this.obsrv1VbarPolicy);
        if (this.bound2VbarPolicy)
            instance.vbarPolicyProperty().bindBidirectional(this.obsrv2VbarPolicy);
        if (this.bound1ViewportBounds)
            instance.viewportBoundsProperty().bind(this.obsrv1ViewportBounds);
        if (this.bound2ViewportBounds)
            instance.viewportBoundsProperty().bindBidirectional(this.obsrv2ViewportBounds);
        if (this.bound1Vmax)
            instance.vmaxProperty().bind(this.obsrv1Vmax);
        if (this.bound2Vmax)
            instance.vmaxProperty().bindBidirectional(this.obsrv2Vmax);
        if (this.bound1Vmin)
            instance.vminProperty().bind(this.obsrv1Vmin);
        if (this.bound2Vmin)
            instance.vminProperty().bindBidirectional(this.obsrv2Vmin);
        if (this.bound1Vvalue)
            instance.vvalueProperty().bind(this.obsrv1Vvalue);
        if (this.bound2Vvalue)
            instance.vvalueProperty().bindBidirectional(this.obsrv2Vvalue);
    }

    /**
     * 設定屬性{@link ScrollPane#setContent(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B content(javafx.scene.Node value)
    {
        this.hasContent = true;
        this.valContent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setFitToHeight(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitToHeight(boolean value)
    {
        this.hasFitToHeight = true;
        this.valFitToHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setFitToWidth(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitToWidth(boolean value)
    {
        this.hasFitToWidth = true;
        this.valFitToWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy value)
    {
        this.hasHbarPolicy = true;
        this.valHbarPolicy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setHmax(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hmax(double value)
    {
        this.hasHmax = true;
        this.valHmax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setHmin(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hmin(double value)
    {
        this.hasHmin = true;
        this.valHmin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setHvalue(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hvalue(double value)
    {
        this.hasHvalue = true;
        this.valHvalue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setPannable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B pannable(boolean value)
    {
        this.hasPannable = true;
        this.valPannable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setPrefViewportHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefViewportHeight(double value)
    {
        this.hasPrefViewportHeight = true;
        this.valPrefViewportHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setPrefViewportWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefViewportWidth(double value)
    {
        this.hasPrefViewportWidth = true;
        this.valPrefViewportWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy value)
    {
        this.hasVbarPolicy = true;
        this.valVbarPolicy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setViewportBounds(javafx.geometry.Bounds)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B viewportBounds(javafx.geometry.Bounds value)
    {
        this.hasViewportBounds = true;
        this.valViewportBounds = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setVmax(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vmax(double value)
    {
        this.hasVmax = true;
        this.valVmax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setVmin(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vmin(double value)
    {
        this.hasVmin = true;
        this.valVmin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#setVvalue(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vvalue(double value)
    {
        this.hasVvalue = true;
        this.valVvalue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#contentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContent(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Content = true;
        this.obsrv1Content = source;
        this.bound2Content = false;
        this.obsrv2Content = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#contentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContent(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Content = false;
        this.obsrv1Content = null;
        this.bound2Content = true;
        this.obsrv2Content = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#fitToHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFitToHeight(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitToHeight = true;
        this.obsrv1FitToHeight = source;
        this.bound2FitToHeight = false;
        this.obsrv2FitToHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#fitToHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFitToHeight(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitToHeight = false;
        this.obsrv1FitToHeight = null;
        this.bound2FitToHeight = true;
        this.obsrv2FitToHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#fitToWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFitToWidth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitToWidth = true;
        this.obsrv1FitToWidth = source;
        this.bound2FitToWidth = false;
        this.obsrv2FitToWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#fitToWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFitToWidth(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FitToWidth = false;
        this.obsrv1FitToWidth = null;
        this.bound2FitToWidth = true;
        this.obsrv2FitToWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hbarPolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHbarPolicy(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ScrollPane.ScrollBarPolicy> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HbarPolicy = true;
        this.obsrv1HbarPolicy = source;
        this.bound2HbarPolicy = false;
        this.obsrv2HbarPolicy = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hbarPolicyProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHbarPolicy(javafx.beans.property.Property<javafx.scene.control.ScrollPane.ScrollBarPolicy> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1HbarPolicy = false;
        this.obsrv1HbarPolicy = null;
        this.bound2HbarPolicy = true;
        this.obsrv2HbarPolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hmaxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHmax(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hmax = true;
        this.obsrv1Hmax = source;
        this.bound2Hmax = false;
        this.obsrv2Hmax = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hmaxProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHmax(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hmax = false;
        this.obsrv1Hmax = null;
        this.bound2Hmax = true;
        this.obsrv2Hmax = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hminProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHmin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hmin = true;
        this.obsrv1Hmin = source;
        this.bound2Hmin = false;
        this.obsrv2Hmin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hminProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHmin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hmin = false;
        this.obsrv1Hmin = null;
        this.bound2Hmin = true;
        this.obsrv2Hmin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hvalueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHvalue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hvalue = true;
        this.obsrv1Hvalue = source;
        this.bound2Hvalue = false;
        this.obsrv2Hvalue = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#hvalueProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHvalue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hvalue = false;
        this.obsrv1Hvalue = null;
        this.bound2Hvalue = true;
        this.obsrv2Hvalue = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#pannableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPannable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Pannable = true;
        this.obsrv1Pannable = source;
        this.bound2Pannable = false;
        this.obsrv2Pannable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#pannableProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPannable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Pannable = false;
        this.obsrv1Pannable = null;
        this.bound2Pannable = true;
        this.obsrv2Pannable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#prefViewportHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefViewportHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefViewportHeight = true;
        this.obsrv1PrefViewportHeight = source;
        this.bound2PrefViewportHeight = false;
        this.obsrv2PrefViewportHeight = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#prefViewportHeightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefViewportHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefViewportHeight = false;
        this.obsrv1PrefViewportHeight = null;
        this.bound2PrefViewportHeight = true;
        this.obsrv2PrefViewportHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#prefViewportWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefViewportWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefViewportWidth = true;
        this.obsrv1PrefViewportWidth = source;
        this.bound2PrefViewportWidth = false;
        this.obsrv2PrefViewportWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#prefViewportWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPrefViewportWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PrefViewportWidth = false;
        this.obsrv1PrefViewportWidth = null;
        this.bound2PrefViewportWidth = true;
        this.obsrv2PrefViewportWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vbarPolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVbarPolicy(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ScrollPane.ScrollBarPolicy> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VbarPolicy = true;
        this.obsrv1VbarPolicy = source;
        this.bound2VbarPolicy = false;
        this.obsrv2VbarPolicy = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vbarPolicyProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVbarPolicy(javafx.beans.property.Property<javafx.scene.control.ScrollPane.ScrollBarPolicy> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1VbarPolicy = false;
        this.obsrv1VbarPolicy = null;
        this.bound2VbarPolicy = true;
        this.obsrv2VbarPolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#viewportBoundsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindViewportBounds(javafx.beans.value.ObservableValue<? extends javafx.geometry.Bounds> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ViewportBounds = true;
        this.obsrv1ViewportBounds = source;
        this.bound2ViewportBounds = false;
        this.obsrv2ViewportBounds = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#viewportBoundsProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalViewportBounds(javafx.beans.property.Property<javafx.geometry.Bounds> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ViewportBounds = false;
        this.obsrv1ViewportBounds = null;
        this.bound2ViewportBounds = true;
        this.obsrv2ViewportBounds = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vmaxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVmax(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vmax = true;
        this.obsrv1Vmax = source;
        this.bound2Vmax = false;
        this.obsrv2Vmax = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vmaxProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVmax(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vmax = false;
        this.obsrv1Vmax = null;
        this.bound2Vmax = true;
        this.obsrv2Vmax = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vminProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVmin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vmin = true;
        this.obsrv1Vmin = source;
        this.bound2Vmin = false;
        this.obsrv2Vmin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vminProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVmin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vmin = false;
        this.obsrv1Vmin = null;
        this.bound2Vmin = true;
        this.obsrv2Vmin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vvalueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVvalue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vvalue = true;
        this.obsrv1Vvalue = source;
        this.bound2Vvalue = false;
        this.obsrv2Vvalue = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollPane#vvalueProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVvalue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Vvalue = false;
        this.obsrv1Vvalue = null;
        this.bound2Vvalue = true;
        this.obsrv2Vvalue = source;
        return (B) this;
    }

    /**
     * 建構{@link ScrollPane}物件
     *
     * @return 新的{@link ScrollPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ScrollPane build()
    {
        ScrollPane instance = new ScrollPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
