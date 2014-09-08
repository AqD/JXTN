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
 * @param <Z> 要建構的物件型態(需繼承{@link Slider})
 * @param <B> 建構器本身的型態(需繼承{@link SliderBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SliderBuilder<Z extends Slider, B extends SliderBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasBlockIncrement;
    private double valBlockIncrement;

    private boolean hasLabelFormatter;
    private javafx.util.StringConverter<java.lang.Double> valLabelFormatter;

    private boolean hasMajorTickUnit;
    private double valMajorTickUnit;

    private boolean hasMax;
    private double valMax;

    private boolean hasMin;
    private double valMin;

    private boolean hasMinorTickCount;
    private int valMinorTickCount;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasShowTickLabels;
    private boolean valShowTickLabels;

    private boolean hasShowTickMarks;
    private boolean valShowTickMarks;

    private boolean hasSnapToTicks;
    private boolean valSnapToTicks;

    private boolean hasValue;
    private double valValue;

    private boolean hasValueChanging;
    private boolean valValueChanging;

    private boolean bound1BlockIncrement;
    private boolean bound2BlockIncrement;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1BlockIncrement;
    private javafx.beans.property.Property<Number> obsrv2BlockIncrement;

    private boolean bound1LabelFormatter;
    private boolean bound2LabelFormatter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Double>> obsrv1LabelFormatter;
    private javafx.beans.property.Property<javafx.util.StringConverter<java.lang.Double>> obsrv2LabelFormatter;

    private boolean bound1MajorTickUnit;
    private boolean bound2MajorTickUnit;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MajorTickUnit;
    private javafx.beans.property.Property<Number> obsrv2MajorTickUnit;

    private boolean bound1Max;
    private boolean bound2Max;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Max;
    private javafx.beans.property.Property<Number> obsrv2Max;

    private boolean bound1Min;
    private boolean bound2Min;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Min;
    private javafx.beans.property.Property<Number> obsrv2Min;

    private boolean bound1MinorTickCount;
    private boolean bound2MinorTickCount;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1MinorTickCount;
    private javafx.beans.property.Property<Number> obsrv2MinorTickCount;

    private boolean bound1Orientation;
    private boolean bound2Orientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrv1Orientation;
    private javafx.beans.property.Property<javafx.geometry.Orientation> obsrv2Orientation;

    private boolean bound1ShowTickLabels;
    private boolean bound2ShowTickLabels;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowTickLabels;
    private javafx.beans.property.Property<Boolean> obsrv2ShowTickLabels;

    private boolean bound1ShowTickMarks;
    private boolean bound2ShowTickMarks;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowTickMarks;
    private javafx.beans.property.Property<Boolean> obsrv2ShowTickMarks;

    private boolean bound1SnapToTicks;
    private boolean bound2SnapToTicks;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1SnapToTicks;
    private javafx.beans.property.Property<Boolean> obsrv2SnapToTicks;

    private boolean bound1ValueChanging;
    private boolean bound2ValueChanging;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ValueChanging;
    private javafx.beans.property.Property<Boolean> obsrv2ValueChanging;

    private boolean bound1Value;
    private boolean bound2Value;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Value;
    private javafx.beans.property.Property<Number> obsrv2Value;

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
        if (this.bound1BlockIncrement)
            instance.blockIncrementProperty().bind(this.obsrv1BlockIncrement);
        if (this.bound2BlockIncrement)
            instance.blockIncrementProperty().bindBidirectional(this.obsrv2BlockIncrement);
        if (this.bound1LabelFormatter)
            instance.labelFormatterProperty().bind(this.obsrv1LabelFormatter);
        if (this.bound2LabelFormatter)
            instance.labelFormatterProperty().bindBidirectional(this.obsrv2LabelFormatter);
        if (this.bound1MajorTickUnit)
            instance.majorTickUnitProperty().bind(this.obsrv1MajorTickUnit);
        if (this.bound2MajorTickUnit)
            instance.majorTickUnitProperty().bindBidirectional(this.obsrv2MajorTickUnit);
        if (this.bound1Max)
            instance.maxProperty().bind(this.obsrv1Max);
        if (this.bound2Max)
            instance.maxProperty().bindBidirectional(this.obsrv2Max);
        if (this.bound1Min)
            instance.minProperty().bind(this.obsrv1Min);
        if (this.bound2Min)
            instance.minProperty().bindBidirectional(this.obsrv2Min);
        if (this.bound1MinorTickCount)
            instance.minorTickCountProperty().bind(this.obsrv1MinorTickCount);
        if (this.bound2MinorTickCount)
            instance.minorTickCountProperty().bindBidirectional(this.obsrv2MinorTickCount);
        if (this.bound1Orientation)
            instance.orientationProperty().bind(this.obsrv1Orientation);
        if (this.bound2Orientation)
            instance.orientationProperty().bindBidirectional(this.obsrv2Orientation);
        if (this.bound1ShowTickLabels)
            instance.showTickLabelsProperty().bind(this.obsrv1ShowTickLabels);
        if (this.bound2ShowTickLabels)
            instance.showTickLabelsProperty().bindBidirectional(this.obsrv2ShowTickLabels);
        if (this.bound1ShowTickMarks)
            instance.showTickMarksProperty().bind(this.obsrv1ShowTickMarks);
        if (this.bound2ShowTickMarks)
            instance.showTickMarksProperty().bindBidirectional(this.obsrv2ShowTickMarks);
        if (this.bound1SnapToTicks)
            instance.snapToTicksProperty().bind(this.obsrv1SnapToTicks);
        if (this.bound2SnapToTicks)
            instance.snapToTicksProperty().bindBidirectional(this.obsrv2SnapToTicks);
        if (this.bound1ValueChanging)
            instance.valueChangingProperty().bind(this.obsrv1ValueChanging);
        if (this.bound2ValueChanging)
            instance.valueChangingProperty().bindBidirectional(this.obsrv2ValueChanging);
        if (this.bound1Value)
            instance.valueProperty().bind(this.obsrv1Value);
        if (this.bound2Value)
            instance.valueProperty().bindBidirectional(this.obsrv2Value);
    }

    /**
     * 設定屬性{@link Slider#setBlockIncrement(double)}
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
     * 設定屬性{@link Slider#setLabelFormatter(javafx.util.StringConverter)}
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
     * 設定屬性{@link Slider#setMajorTickUnit(double)}
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
     * 設定屬性{@link Slider#setMax(double)}
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
     * 設定屬性{@link Slider#setMin(double)}
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
     * 設定屬性{@link Slider#setMinorTickCount(int)}
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
     * 設定屬性{@link Slider#setOrientation(javafx.geometry.Orientation)}
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
     * 設定屬性{@link Slider#setShowTickLabels(boolean)}
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
     * 設定屬性{@link Slider#setShowTickMarks(boolean)}
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
     * 設定屬性{@link Slider#setSnapToTicks(boolean)}
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
     * 設定屬性{@link Slider#setValue(double)}
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
     * 設定屬性{@link Slider#setValueChanging(boolean)}
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
    public final B bindBlockIncrement(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlockIncrement = true;
        this.obsrv1BlockIncrement = source;
        this.bound2BlockIncrement = false;
        this.obsrv2BlockIncrement = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#blockIncrementProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBlockIncrement(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BlockIncrement = false;
        this.obsrv1BlockIncrement = null;
        this.bound2BlockIncrement = true;
        this.obsrv2BlockIncrement = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#labelFormatterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLabelFormatter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<java.lang.Double>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFormatter = true;
        this.obsrv1LabelFormatter = source;
        this.bound2LabelFormatter = false;
        this.obsrv2LabelFormatter = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#labelFormatterProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLabelFormatter(javafx.beans.property.Property<javafx.util.StringConverter<java.lang.Double>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LabelFormatter = false;
        this.obsrv1LabelFormatter = null;
        this.bound2LabelFormatter = true;
        this.obsrv2LabelFormatter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#majorTickUnitProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMajorTickUnit(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MajorTickUnit = true;
        this.obsrv1MajorTickUnit = source;
        this.bound2MajorTickUnit = false;
        this.obsrv2MajorTickUnit = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#majorTickUnitProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMajorTickUnit(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MajorTickUnit = false;
        this.obsrv1MajorTickUnit = null;
        this.bound2MajorTickUnit = true;
        this.obsrv2MajorTickUnit = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#maxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMax(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = true;
        this.obsrv1Max = source;
        this.bound2Max = false;
        this.obsrv2Max = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#maxProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMax(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Max = false;
        this.obsrv1Max = null;
        this.bound2Max = true;
        this.obsrv2Max = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMin(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Min = true;
        this.obsrv1Min = source;
        this.bound2Min = false;
        this.obsrv2Min = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMin(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Min = false;
        this.obsrv1Min = null;
        this.bound2Min = true;
        this.obsrv2Min = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minorTickCountProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMinorTickCount(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinorTickCount = true;
        this.obsrv1MinorTickCount = source;
        this.bound2MinorTickCount = false;
        this.obsrv2MinorTickCount = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#minorTickCountProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalMinorTickCount(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1MinorTickCount = false;
        this.obsrv1MinorTickCount = null;
        this.bound2MinorTickCount = true;
        this.obsrv2MinorTickCount = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = true;
        this.obsrv1Orientation = source;
        this.bound2Orientation = false;
        this.obsrv2Orientation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#orientationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOrientation(javafx.beans.property.Property<javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Orientation = false;
        this.obsrv1Orientation = null;
        this.bound2Orientation = true;
        this.obsrv2Orientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickLabelsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowTickLabels(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickLabels = true;
        this.obsrv1ShowTickLabels = source;
        this.bound2ShowTickLabels = false;
        this.obsrv2ShowTickLabels = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickLabelsProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowTickLabels(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickLabels = false;
        this.obsrv1ShowTickLabels = null;
        this.bound2ShowTickLabels = true;
        this.obsrv2ShowTickLabels = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickMarksProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowTickMarks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickMarks = true;
        this.obsrv1ShowTickMarks = source;
        this.bound2ShowTickMarks = false;
        this.obsrv2ShowTickMarks = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#showTickMarksProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowTickMarks(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowTickMarks = false;
        this.obsrv1ShowTickMarks = null;
        this.bound2ShowTickMarks = true;
        this.obsrv2ShowTickMarks = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#snapToTicksProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSnapToTicks(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SnapToTicks = true;
        this.obsrv1SnapToTicks = source;
        this.bound2SnapToTicks = false;
        this.obsrv2SnapToTicks = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#snapToTicksProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSnapToTicks(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SnapToTicks = false;
        this.obsrv1SnapToTicks = null;
        this.bound2SnapToTicks = true;
        this.obsrv2SnapToTicks = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueChangingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindValueChanging(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ValueChanging = true;
        this.obsrv1ValueChanging = source;
        this.bound2ValueChanging = false;
        this.obsrv2ValueChanging = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueChangingProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalValueChanging(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ValueChanging = false;
        this.obsrv1ValueChanging = null;
        this.bound2ValueChanging = true;
        this.obsrv2ValueChanging = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindValue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Value = true;
        this.obsrv1Value = source;
        this.bound2Value = false;
        this.obsrv2Value = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Slider#valueProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalValue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Value = false;
        this.obsrv1Value = null;
        this.bound2Value = true;
        this.obsrv2Value = source;
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
