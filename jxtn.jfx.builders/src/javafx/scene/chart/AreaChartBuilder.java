// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link AreaChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AreaChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends AreaChart<X, Y>, B extends AreaChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.XYChartBuilder<X, Y, Z, B>
{
    private boolean applied;

    protected boolean hasCreateSymbols;
    protected boolean valCreateSymbols;

    protected boolean boundCreateSymbols;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvCreateSymbols;
    public void applyTo(AreaChart<X, Y> instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasCreateSymbols)
            instance.setCreateSymbols(this.valCreateSymbols);
        if (this.boundCreateSymbols)
            instance.createSymbolsProperty().bind(this.obsrvCreateSymbols);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B createSymbols(boolean value)
    {
        this.hasCreateSymbols = true;
        this.valCreateSymbols = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindCreateSymbols(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundCreateSymbols = true;
        this.obsrvCreateSymbols = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public AreaChart<X, Y> build(javafx.scene.chart.Axis<X> arg0, javafx.scene.chart.Axis<Y> arg1)
    {
        AreaChart<X, Y> instance = new AreaChart<X, Y>(arg0, arg1);
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
