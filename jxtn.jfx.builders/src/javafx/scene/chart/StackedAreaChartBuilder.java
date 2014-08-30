// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link StackedAreaChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link StackedAreaChart})
 * @param <B> 建構器本身的型態(需繼承{@link StackedAreaChartBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StackedAreaChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends StackedAreaChart<X, Y>, B extends StackedAreaChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.XYChartBuilder<X, Y, Z, B>
{

    private boolean hasCreateSymbols;
    private boolean valCreateSymbols;

    private boolean boundCreateSymbols;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvCreateSymbols;

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
     * 設定屬性{@link StackedAreaChart#setCreateSymbols(boolean)}
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
     * 設定屬性{@link StackedAreaChart#createSymbolsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCreateSymbols(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundCreateSymbols = true;
        this.obsrvCreateSymbols = source;
        return (B) this;
    }

    /**
     * 建構{@link StackedAreaChart}物件
     *
     * @return 新的{@link StackedAreaChart}物件實體
     */
    @SuppressWarnings("unchecked")
    public StackedAreaChart<X, Y> build(javafx.scene.chart.Axis<X> arg0, javafx.scene.chart.Axis<Y> arg1)
    {
        StackedAreaChart<X, Y> instance = new StackedAreaChart<X, Y>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
