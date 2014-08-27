// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link PieChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PieChartBuilder<Z extends PieChart, B extends PieChartBuilder<Z, B>>
        extends javafx.scene.chart.ChartBuilder<Z, B>
{

    protected boolean hasClockwise;
    protected boolean valClockwise;

    protected boolean hasData;
    protected javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data> valData;

    protected boolean hasLabelLineLength;
    protected double valLabelLineLength;

    protected boolean hasLabelsVisible;
    protected boolean valLabelsVisible;

    protected boolean hasStartAngle;
    protected double valStartAngle;

    protected boolean boundClockwise;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvClockwise;

    protected boolean boundData;
    protected javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>> obsrvData;

    protected boolean boundLabelLineLength;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvLabelLineLength;

    protected boolean boundLabelsVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvLabelsVisible;

    protected boolean boundStartAngle;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvStartAngle;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasClockwise)
            instance.setClockwise(this.valClockwise);
        if (this.hasData)
            instance.setData(this.valData);
        if (this.hasLabelLineLength)
            instance.setLabelLineLength(this.valLabelLineLength);
        if (this.hasLabelsVisible)
            instance.setLabelsVisible(this.valLabelsVisible);
        if (this.hasStartAngle)
            instance.setStartAngle(this.valStartAngle);
        if (this.boundClockwise)
            instance.clockwiseProperty().bind(this.obsrvClockwise);
        if (this.boundData)
            instance.dataProperty().bind(this.obsrvData);
        if (this.boundLabelLineLength)
            instance.labelLineLengthProperty().bind(this.obsrvLabelLineLength);
        if (this.boundLabelsVisible)
            instance.labelsVisibleProperty().bind(this.obsrvLabelsVisible);
        if (this.boundStartAngle)
            instance.startAngleProperty().bind(this.obsrvStartAngle);
    }

    /**
     * 設定屬性{@link PieChart#setClockwise(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B clockwise(boolean value)
    {
        this.hasClockwise = true;
        this.valClockwise = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#setData(javafx.collections.ObservableList)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B data(javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data> value)
    {
        this.hasData = true;
        this.valData = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#setLabelLineLength(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B labelLineLength(double value)
    {
        this.hasLabelLineLength = true;
        this.valLabelLineLength = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#setLabelsVisible(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B labelsVisible(boolean value)
    {
        this.hasLabelsVisible = true;
        this.valLabelsVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#setStartAngle(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startAngle(double value)
    {
        this.hasStartAngle = true;
        this.valStartAngle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#clockwiseProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindClockwise(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundClockwise = true;
        this.obsrvClockwise = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#dataProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindData(javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<javafx.scene.chart.PieChart.Data>> source)
    {
        assert (source != null);
        this.boundData = true;
        this.obsrvData = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#labelLineLengthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLabelLineLength(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundLabelLineLength = true;
        this.obsrvLabelLineLength = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#labelsVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLabelsVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundLabelsVisible = true;
        this.obsrvLabelsVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PieChart#startAngleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStartAngle(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundStartAngle = true;
        this.obsrvStartAngle = source;
        return (B) this;
    }

    /**
     * 建構{@link PieChart}物件
     *
     * @return 新的{@link PieChart}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PieChart build()
    {
        PieChart instance = new PieChart();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
