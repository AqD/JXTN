// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link ScatterChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ScatterChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends ScatterChart<X, Y>, B extends ScatterChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.XYChartBuilder<X, Y, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ScatterChart}物件
     *
     * @return 新的{@link ScatterChart}物件實體
     */
    @SuppressWarnings("unchecked")
    public ScatterChart<X, Y> build(javafx.scene.chart.Axis<X> arg0, javafx.scene.chart.Axis<Y> arg1)
    {
        ScatterChart<X, Y> instance = new ScatterChart<X, Y>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
