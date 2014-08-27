// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link StackedBarChart}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StackedBarChartBuilder<X extends java.lang.Object, Y extends java.lang.Object, Z extends StackedBarChart<X, Y>, B extends StackedBarChartBuilder<X, Y, Z, B>>
        extends javafx.scene.chart.XYChartBuilder<X, Y, Z, B>
{

    protected boolean hasCategoryGap;
    protected double valCategoryGap;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCategoryGap)
            instance.setCategoryGap(this.valCategoryGap);
    }

    /**
     * 設定屬性{@link StackedBarChart#setCategoryGap(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B categoryGap(double value)
    {
        this.hasCategoryGap = true;
        this.valCategoryGap = value;
        return (B) this;
    }

    /**
     * 建構{@link StackedBarChart}物件
     *
     * @return 新的{@link StackedBarChart}物件實體
     */
    @SuppressWarnings("unchecked")
    public StackedBarChart<X, Y> build(javafx.scene.chart.Axis<X> arg0, javafx.scene.chart.Axis<Y> arg1)
    {
        StackedBarChart<X, Y> instance = new StackedBarChart<X, Y>(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
