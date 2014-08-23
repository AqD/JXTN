// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link XYChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class XYChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends XYChart<X, Y>, B extends XYChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.ChartBuilder<Z, B>
{

    protected boolean hasAlternativeColumnFillVisible;
    protected boolean valAlternativeColumnFillVisible;

    protected boolean hasAlternativeRowFillVisible;
    protected boolean valAlternativeRowFillVisible;

    protected boolean hasData;
    protected javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>> valData;

    protected boolean hasHorizontalGridLinesVisible;
    protected boolean valHorizontalGridLinesVisible;

    protected boolean hasHorizontalZeroLineVisible;
    protected boolean valHorizontalZeroLineVisible;

    protected boolean hasVerticalGridLinesVisible;
    protected boolean valVerticalGridLinesVisible;

    protected boolean hasVerticalZeroLineVisible;
    protected boolean valVerticalZeroLineVisible;

    protected boolean boundAlternativeColumnFillVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAlternativeColumnFillVisible;

    protected boolean boundAlternativeRowFillVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAlternativeRowFillVisible;

    protected boolean boundData;
    protected javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>> obsrvData;

    protected boolean boundHorizontalGridLinesVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvHorizontalGridLinesVisible;

    protected boolean boundHorizontalZeroLineVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvHorizontalZeroLineVisible;

    protected boolean boundVerticalGridLinesVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvVerticalGridLinesVisible;

    protected boolean boundVerticalZeroLineVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvVerticalZeroLineVisible;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlternativeColumnFillVisible)
            instance.setAlternativeColumnFillVisible(this.valAlternativeColumnFillVisible);
        if (this.hasAlternativeRowFillVisible)
            instance.setAlternativeRowFillVisible(this.valAlternativeRowFillVisible);
        if (this.hasData)
            instance.setData(this.valData);
        if (this.hasHorizontalGridLinesVisible)
            instance.setHorizontalGridLinesVisible(this.valHorizontalGridLinesVisible);
        if (this.hasHorizontalZeroLineVisible)
            instance.setHorizontalZeroLineVisible(this.valHorizontalZeroLineVisible);
        if (this.hasVerticalGridLinesVisible)
            instance.setVerticalGridLinesVisible(this.valVerticalGridLinesVisible);
        if (this.hasVerticalZeroLineVisible)
            instance.setVerticalZeroLineVisible(this.valVerticalZeroLineVisible);
        if (this.boundAlternativeColumnFillVisible)
            instance.alternativeColumnFillVisibleProperty().bind(this.obsrvAlternativeColumnFillVisible);
        if (this.boundAlternativeRowFillVisible)
            instance.alternativeRowFillVisibleProperty().bind(this.obsrvAlternativeRowFillVisible);
        if (this.boundData)
            instance.dataProperty().bind(this.obsrvData);
        if (this.boundHorizontalGridLinesVisible)
            instance.horizontalGridLinesVisibleProperty().bind(this.obsrvHorizontalGridLinesVisible);
        if (this.boundHorizontalZeroLineVisible)
            instance.horizontalZeroLineVisibleProperty().bind(this.obsrvHorizontalZeroLineVisible);
        if (this.boundVerticalGridLinesVisible)
            instance.verticalGridLinesVisibleProperty().bind(this.obsrvVerticalGridLinesVisible);
        if (this.boundVerticalZeroLineVisible)
            instance.verticalZeroLineVisibleProperty().bind(this.obsrvVerticalZeroLineVisible);
    }

    /**
     * 設定屬性{@link XYChart#setAlternativeColumnFillVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alternativeColumnFillVisible(boolean value)
    {
        this.hasAlternativeColumnFillVisible = true;
        this.valAlternativeColumnFillVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setAlternativeRowFillVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alternativeRowFillVisible(boolean value)
    {
        this.hasAlternativeRowFillVisible = true;
        this.valAlternativeRowFillVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setData}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B data(javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>> value)
    {
        this.hasData = true;
        this.valData = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setHorizontalGridLinesVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B horizontalGridLinesVisible(boolean value)
    {
        this.hasHorizontalGridLinesVisible = true;
        this.valHorizontalGridLinesVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setHorizontalZeroLineVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B horizontalZeroLineVisible(boolean value)
    {
        this.hasHorizontalZeroLineVisible = true;
        this.valHorizontalZeroLineVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setVerticalGridLinesVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalGridLinesVisible(boolean value)
    {
        this.hasVerticalGridLinesVisible = true;
        this.valVerticalGridLinesVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#setVerticalZeroLineVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalZeroLineVisible(boolean value)
    {
        this.hasVerticalZeroLineVisible = true;
        this.valVerticalZeroLineVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#alternativeColumnFillVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAlternativeColumnFillVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAlternativeColumnFillVisible = true;
        this.obsrvAlternativeColumnFillVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#alternativeRowFillVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAlternativeRowFillVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAlternativeRowFillVisible = true;
        this.obsrvAlternativeRowFillVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#dataProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindData(javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<javafx.scene.chart.XYChart.Series<X, Y>>> source)
    {
        assert (source != null);
        this.boundData = true;
        this.obsrvData = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#horizontalGridLinesVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHorizontalGridLinesVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundHorizontalGridLinesVisible = true;
        this.obsrvHorizontalGridLinesVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#horizontalZeroLineVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHorizontalZeroLineVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundHorizontalZeroLineVisible = true;
        this.obsrvHorizontalZeroLineVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#verticalGridLinesVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindVerticalGridLinesVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundVerticalGridLinesVisible = true;
        this.obsrvVerticalGridLinesVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link XYChart#verticalZeroLineVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindVerticalZeroLineVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundVerticalZeroLineVisible = true;
        this.obsrvVerticalZeroLineVisible = source;
        return (B) this;
    }
}
