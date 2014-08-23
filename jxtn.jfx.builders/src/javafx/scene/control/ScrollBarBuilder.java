// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ScrollBar}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ScrollBarBuilder<Z extends ScrollBar, B extends ScrollBarBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasBlockIncrement;
    protected double valBlockIncrement;

    protected boolean hasMax;
    protected double valMax;

    protected boolean hasMin;
    protected double valMin;

    protected boolean hasOrientation;
    protected javafx.geometry.Orientation valOrientation;

    protected boolean hasUnitIncrement;
    protected double valUnitIncrement;

    protected boolean hasValue;
    protected double valValue;

    protected boolean hasVisibleAmount;
    protected double valVisibleAmount;

    protected boolean boundBlockIncrement;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvBlockIncrement;

    protected boolean boundMax;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMax;

    protected boolean boundMin;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMin;

    protected boolean boundOrientation;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    protected boolean boundUnitIncrement;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvUnitIncrement;

    protected boolean boundValue;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvValue;

    protected boolean boundVisibleAmount;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvVisibleAmount;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBlockIncrement)
            instance.setBlockIncrement(this.valBlockIncrement);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasMin)
            instance.setMin(this.valMin);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasUnitIncrement)
            instance.setUnitIncrement(this.valUnitIncrement);
        if (this.hasValue)
            instance.setValue(this.valValue);
        if (this.hasVisibleAmount)
            instance.setVisibleAmount(this.valVisibleAmount);
        if (this.boundBlockIncrement)
            instance.blockIncrementProperty().bind(this.obsrvBlockIncrement);
        if (this.boundMax)
            instance.maxProperty().bind(this.obsrvMax);
        if (this.boundMin)
            instance.minProperty().bind(this.obsrvMin);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        if (this.boundUnitIncrement)
            instance.unitIncrementProperty().bind(this.obsrvUnitIncrement);
        if (this.boundValue)
            instance.valueProperty().bind(this.obsrvValue);
        if (this.boundVisibleAmount)
            instance.visibleAmountProperty().bind(this.obsrvVisibleAmount);
    }

    /**
     * 設定屬性{@link ScrollBar#setBlockIncrement}
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
     * 設定屬性{@link ScrollBar#setMax}
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
     * 設定屬性{@link ScrollBar#setMin}
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
     * 設定屬性{@link ScrollBar#setOrientation}
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
     * 設定屬性{@link ScrollBar#setUnitIncrement}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B unitIncrement(double value)
    {
        this.hasUnitIncrement = true;
        this.valUnitIncrement = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollBar#setValue}
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
     * 設定屬性{@link ScrollBar#setVisibleAmount}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visibleAmount(double value)
    {
        this.hasVisibleAmount = true;
        this.valVisibleAmount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollBar#blockIncrementProperty}的連結
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
     * 設定屬性{@link ScrollBar#maxProperty}的連結
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
     * 設定屬性{@link ScrollBar#minProperty}的連結
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
     * 設定屬性{@link ScrollBar#orientationProperty}的連結
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
     * 設定屬性{@link ScrollBar#unitIncrementProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindUnitIncrement(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundUnitIncrement = true;
        this.obsrvUnitIncrement = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ScrollBar#valueProperty}的連結
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
     * 設定屬性{@link ScrollBar#visibleAmountProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindVisibleAmount(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundVisibleAmount = true;
        this.obsrvVisibleAmount = source;
        return (B) this;
    }

    /**
     * 建構{@link ScrollBar}物件
     *
     * @return 新的{@link ScrollBar}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ScrollBar build()
    {
        ScrollBar instance = new ScrollBar();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
