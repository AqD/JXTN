// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Slider}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SliderBuilder<Z extends Slider, B extends SliderBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasBlockIncrement;
    protected double valBlockIncrement;

    protected boolean hasLabelFormatter;
    protected javafx.util.StringConverter<java.lang.Double> valLabelFormatter;

    protected boolean hasMajorTickUnit;
    protected double valMajorTickUnit;

    protected boolean hasMax;
    protected double valMax;

    protected boolean hasMin;
    protected double valMin;

    protected boolean hasMinorTickCount;
    protected int valMinorTickCount;

    protected boolean hasOrientation;
    protected javafx.geometry.Orientation valOrientation;

    protected boolean hasShowTickLabels;
    protected boolean valShowTickLabels;

    protected boolean hasShowTickMarks;
    protected boolean valShowTickMarks;

    protected boolean hasSnapToTicks;
    protected boolean valSnapToTicks;

    protected boolean hasValue;
    protected double valValue;

    protected boolean hasValueChanging;
    protected boolean valValueChanging;

    protected boolean boundBlockIncrement;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvBlockIncrement;

    protected boolean boundLabelFormatter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Double>> obsrvLabelFormatter;

    protected boolean boundMajorTickUnit;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMajorTickUnit;

    protected boolean boundMax;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMax;

    protected boolean boundMin;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMin;

    protected boolean boundMinorTickCount;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvMinorTickCount;

    protected boolean boundOrientation;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    protected boolean boundShowTickLabels;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowTickLabels;

    protected boolean boundShowTickMarks;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowTickMarks;

    protected boolean boundSnapToTicks;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSnapToTicks;

    protected boolean boundValueChanging;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvValueChanging;

    protected boolean boundValue;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvValue;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBlockIncrement)
            instance.setBlockIncrement(this.valBlockIncrement);
        if (this.hasLabelFormatter)
            instance.setLabelFormatter(this.valLabelFormatter);
        if (this.hasMajorTickUnit)
            instance.setMajorTickUnit(this.valMajorTickUnit);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasMin)
            instance.setMin(this.valMin);
        if (this.hasMinorTickCount)
            instance.setMinorTickCount(this.valMinorTickCount);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasShowTickLabels)
            instance.setShowTickLabels(this.valShowTickLabels);
        if (this.hasShowTickMarks)
            instance.setShowTickMarks(this.valShowTickMarks);
        if (this.hasSnapToTicks)
            instance.setSnapToTicks(this.valSnapToTicks);
        if (this.hasValue)
            instance.setValue(this.valValue);
        if (this.hasValueChanging)
            instance.setValueChanging(this.valValueChanging);
        if (this.boundBlockIncrement)
            instance.blockIncrementProperty().bind(this.obsrvBlockIncrement);
        if (this.boundLabelFormatter)
            instance.labelFormatterProperty().bind(this.obsrvLabelFormatter);
        if (this.boundMajorTickUnit)
            instance.majorTickUnitProperty().bind(this.obsrvMajorTickUnit);
        if (this.boundMax)
            instance.maxProperty().bind(this.obsrvMax);
        if (this.boundMin)
            instance.minProperty().bind(this.obsrvMin);
        if (this.boundMinorTickCount)
            instance.minorTickCountProperty().bind(this.obsrvMinorTickCount);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        if (this.boundShowTickLabels)
            instance.showTickLabelsProperty().bind(this.obsrvShowTickLabels);
        if (this.boundShowTickMarks)
            instance.showTickMarksProperty().bind(this.obsrvShowTickMarks);
        if (this.boundSnapToTicks)
            instance.snapToTicksProperty().bind(this.obsrvSnapToTicks);
        if (this.boundValueChanging)
            instance.valueChangingProperty().bind(this.obsrvValueChanging);
        if (this.boundValue)
            instance.valueProperty().bind(this.obsrvValue);
    }

    /**
     * 設定屬性{@link Slider#setBlockIncrement}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B blockIncrement(double value)
    {
        this.hasBlockIncrement = true;
        this.valBlockIncrement = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setLabelFormatter}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B labelFormatter(javafx.util.StringConverter<java.lang.Double> value)
    {
        this.hasLabelFormatter = true;
        this.valLabelFormatter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setMajorTickUnit}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B majorTickUnit(double value)
    {
        this.hasMajorTickUnit = true;
        this.valMajorTickUnit = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setMax}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B max(double value)
    {
        this.hasMax = true;
        this.valMax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setMin}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B min(double value)
    {
        this.hasMin = true;
        this.valMin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setMinorTickCount}
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
     * 設定屬性{@link Slider#setOrientation}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setShowTickLabels}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showTickLabels(boolean value)
    {
        this.hasShowTickLabels = true;
        this.valShowTickLabels = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setShowTickMarks}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showTickMarks(boolean value)
    {
        this.hasShowTickMarks = true;
        this.valShowTickMarks = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setSnapToTicks}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B snapToTicks(boolean value)
    {
        this.hasSnapToTicks = true;
        this.valSnapToTicks = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setValue}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B value(double value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#setValueChanging}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B valueChanging(boolean value)
    {
        this.hasValueChanging = true;
        this.valValueChanging = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#blockIncrementProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindBlockIncrement(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundBlockIncrement = true;
        this.obsrvBlockIncrement = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#labelFormatterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLabelFormatter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Double>> source)
    {
        assert (source != null);
        this.boundLabelFormatter = true;
        this.obsrvLabelFormatter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#majorTickUnitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMajorTickUnit(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMajorTickUnit = true;
        this.obsrvMajorTickUnit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#maxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMax(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMax = true;
        this.obsrvMax = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMin(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMin = true;
        this.obsrvMin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minorTickCountProperty}的連結
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
     * 設定屬性{@link Slider#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        assert (source != null);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickLabelsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindShowTickLabels(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundShowTickLabels = true;
        this.obsrvShowTickLabels = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickMarksProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindShowTickMarks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundShowTickMarks = true;
        this.obsrvShowTickMarks = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#snapToTicksProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSnapToTicks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSnapToTicks = true;
        this.obsrvSnapToTicks = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueChangingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindValueChanging(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundValueChanging = true;
        this.obsrvValueChanging = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindValue(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundValue = true;
        this.obsrvValue = source;
        return (B) this;
    }

    /**
     * 建構{@link Slider}物件
     *
     * @return 新的{@link Slider}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Slider build()
    {
        Slider instance = new Slider();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
