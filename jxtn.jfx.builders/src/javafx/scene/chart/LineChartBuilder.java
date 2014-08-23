// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link LineChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LineChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends LineChart<X, Y>, B extends LineChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.XYChartBuilder<X, Y, Z, B>
{

    protected boolean hasCreateSymbols;
    protected boolean valCreateSymbols;

    protected boolean boundCreateSymbols;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvCreateSymbols;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCreateSymbols)
            instance.setCreateSymbols(this.valCreateSymbols);
        if (this.boundCreateSymbols)
            instance.createSymbolsProperty().bind(this.obsrvCreateSymbols);
    }

    /**
     * 設定屬性{@link LineChart#setCreateSymbols}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B createSymbols(boolean value)
    {
        this.hasCreateSymbols = true;
        this.valCreateSymbols = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link LineChart#createSymbolsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCreateSymbols(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundCreateSymbols = true;
        this.obsrvCreateSymbols = source;
        return (B) this;
    }

    /**
     * 建構{@link LineChart}物件
     *
     * @return 新的{@link LineChart}物件實體
     */
    @SuppressWarnings("unchecked")
    public LineChart<X, Y> build(javafx.scene.chart.Axis<X> arg0, javafx.scene.chart.Axis<Y> arg1)
    {
        LineChart<X, Y> instance = new LineChart<X, Y>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
