// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link ValueAxis}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ValueAxisBuilder<T extends java.lang.Number, Z extends ValueAxis<T>, B extends ValueAxisBuilder<T, Z, B>>
        extends javafx.scene.chart.AxisBuilder<T, Z, B>
{

    protected boolean hasLowerBound;
    protected double valLowerBound;

    protected boolean hasMinorTickCount;
    protected int valMinorTickCount;

    protected boolean hasMinorTickLength;
    protected double valMinorTickLength;

    protected boolean hasMinorTickVisible;
    protected boolean valMinorTickVisible;

    protected boolean hasTickLabelFormatter;
    protected javafx.util.StringConverter<T> valTickLabelFormatter;

    protected boolean hasUpperBound;
    protected double valUpperBound;

    protected boolean boundLowerBound;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvLowerBound;

    protected boolean boundMinorTickCount;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvMinorTickCount;

    protected boolean boundMinorTickLength;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMinorTickLength;

    protected boolean boundMinorTickVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvMinorTickVisible;

    protected boolean boundTickLabelFormatter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvTickLabelFormatter;

    protected boolean boundUpperBound;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvUpperBound;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLowerBound)
            instance.setLowerBound(this.valLowerBound);
        if (this.hasMinorTickCount)
            instance.setMinorTickCount(this.valMinorTickCount);
        if (this.hasMinorTickLength)
            instance.setMinorTickLength(this.valMinorTickLength);
        if (this.hasMinorTickVisible)
            instance.setMinorTickVisible(this.valMinorTickVisible);
        if (this.hasTickLabelFormatter)
            instance.setTickLabelFormatter(this.valTickLabelFormatter);
        if (this.hasUpperBound)
            instance.setUpperBound(this.valUpperBound);
        if (this.boundLowerBound)
            instance.lowerBoundProperty().bind(this.obsrvLowerBound);
        if (this.boundMinorTickCount)
            instance.minorTickCountProperty().bind(this.obsrvMinorTickCount);
        if (this.boundMinorTickLength)
            instance.minorTickLengthProperty().bind(this.obsrvMinorTickLength);
        if (this.boundMinorTickVisible)
            instance.minorTickVisibleProperty().bind(this.obsrvMinorTickVisible);
        if (this.boundTickLabelFormatter)
            instance.tickLabelFormatterProperty().bind(this.obsrvTickLabelFormatter);
        if (this.boundUpperBound)
            instance.upperBoundProperty().bind(this.obsrvUpperBound);
    }

    /**
     * 設定屬性{@link ValueAxis#setLowerBound(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lowerBound(double value)
    {
        this.hasLowerBound = true;
        this.valLowerBound = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#setMinorTickCount(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minorTickCount(int value)
    {
        this.hasMinorTickCount = true;
        this.valMinorTickCount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#setMinorTickLength(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minorTickLength(double value)
    {
        this.hasMinorTickLength = true;
        this.valMinorTickLength = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#setMinorTickVisible(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B minorTickVisible(boolean value)
    {
        this.hasMinorTickVisible = true;
        this.valMinorTickVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#setTickLabelFormatter(javafx.util.StringConverter)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tickLabelFormatter(javafx.util.StringConverter<T> value)
    {
        this.hasTickLabelFormatter = true;
        this.valTickLabelFormatter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#setUpperBound(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B upperBound(double value)
    {
        this.hasUpperBound = true;
        this.valUpperBound = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#lowerBoundProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLowerBound(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundLowerBound = true;
        this.obsrvLowerBound = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#minorTickCountProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMinorTickCount(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        assert (source != null);
        this.boundMinorTickCount = true;
        this.obsrvMinorTickCount = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#minorTickLengthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMinorTickLength(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMinorTickLength = true;
        this.obsrvMinorTickLength = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#minorTickVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMinorTickVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundMinorTickVisible = true;
        this.obsrvMinorTickVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#tickLabelFormatterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTickLabelFormatter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        assert (source != null);
        this.boundTickLabelFormatter = true;
        this.obsrvTickLabelFormatter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ValueAxis#upperBoundProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindUpperBound(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundUpperBound = true;
        this.obsrvUpperBound = source;
        return (B) this;
    }
}
