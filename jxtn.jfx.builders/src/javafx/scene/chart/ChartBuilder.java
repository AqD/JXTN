// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link Chart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Chart})
 * @param <B> 建構器本身的型態(需繼承{@link ChartBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ChartBuilder<Z extends Chart, B extends ChartBuilder<Z, B>>
        extends javafx.scene.layout.RegionBuilder<Z, B>
{

    private boolean hasAnimated;
    private boolean valAnimated;

    private boolean hasLegendSide;
    private javafx.geometry.Side valLegendSide;

    private boolean hasLegendVisible;
    private boolean valLegendVisible;

    private boolean hasTitle;
    private java.lang.String valTitle;

    private boolean hasTitleSide;
    private javafx.geometry.Side valTitleSide;

    private boolean boundAnimated;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvAnimated;

    private boolean boundLegendSide;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvLegendSide;

    private boolean boundLegendVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvLegendVisible;

    private boolean boundTitle;
    private javafx.beans.value.ObservableValue<? extends String> obsrvTitle;

    private boolean boundTitleSide;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvTitleSide;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAnimated)
            instance.setAnimated(this.valAnimated);
        if (this.hasLegendSide)
            instance.setLegendSide(this.valLegendSide);
        if (this.hasLegendVisible)
            instance.setLegendVisible(this.valLegendVisible);
        if (this.hasTitle)
            instance.setTitle(this.valTitle);
        if (this.hasTitleSide)
            instance.setTitleSide(this.valTitleSide);
        if (this.boundAnimated)
            instance.animatedProperty().bind(this.obsrvAnimated);
        if (this.boundLegendSide)
            instance.legendSideProperty().bind(this.obsrvLegendSide);
        if (this.boundLegendVisible)
            instance.legendVisibleProperty().bind(this.obsrvLegendVisible);
        if (this.boundTitle)
            instance.titleProperty().bind(this.obsrvTitle);
        if (this.boundTitleSide)
            instance.titleSideProperty().bind(this.obsrvTitleSide);
    }

    /**
     * 設定屬性{@link Chart#setAnimated(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B animated(boolean value)
    {
        this.hasAnimated = true;
        this.valAnimated = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#setLegendSide(javafx.geometry.Side)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B legendSide(javafx.geometry.Side value)
    {
        this.hasLegendSide = true;
        this.valLegendSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#setLegendVisible(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B legendVisible(boolean value)
    {
        this.hasLegendVisible = true;
        this.valLegendVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#setTitle(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B title(java.lang.String value)
    {
        this.hasTitle = true;
        this.valTitle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#setTitleSide(javafx.geometry.Side)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B titleSide(javafx.geometry.Side value)
    {
        this.hasTitleSide = true;
        this.valTitleSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#animatedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAnimated(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundAnimated = true;
        this.obsrvAnimated = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#legendSideProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLegendSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundLegendSide = true;
        this.obsrvLegendSide = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#legendVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLegendVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundLegendVisible = true;
        this.obsrvLegendVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#titleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTitle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundTitle = true;
        this.obsrvTitle = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Chart#titleSideProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTitleSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundTitleSide = true;
        this.obsrvTitleSide = source;
        return (B) this;
    }
}
