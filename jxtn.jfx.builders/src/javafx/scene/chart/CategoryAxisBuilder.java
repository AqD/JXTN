// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.chart;

/**
 * {@link CategoryAxis}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CategoryAxisBuilder<Z extends CategoryAxis, B extends CategoryAxisBuilder<Z, B>>
        extends javafx.scene.chart.AxisBuilder<java.lang.String, Z, B>
{

    protected boolean hasCategories;
    protected javafx.collections.ObservableList<java.lang.String> valCategories;

    protected boolean hasEndMargin;
    protected double valEndMargin;

    protected boolean hasGapStartAndEnd;
    protected boolean valGapStartAndEnd;

    protected boolean hasStartMargin;
    protected double valStartMargin;

    protected boolean boundEndMargin;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvEndMargin;

    protected boolean boundGapStartAndEnd;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvGapStartAndEnd;

    protected boolean boundStartMargin;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvStartMargin;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCategories)
            instance.setCategories(this.valCategories);
        if (this.hasEndMargin)
            instance.setEndMargin(this.valEndMargin);
        if (this.hasGapStartAndEnd)
            instance.setGapStartAndEnd(this.valGapStartAndEnd);
        if (this.hasStartMargin)
            instance.setStartMargin(this.valStartMargin);
        if (this.boundEndMargin)
            instance.endMarginProperty().bind(this.obsrvEndMargin);
        if (this.boundGapStartAndEnd)
            instance.gapStartAndEndProperty().bind(this.obsrvGapStartAndEnd);
        if (this.boundStartMargin)
            instance.startMarginProperty().bind(this.obsrvStartMargin);
    }

    /**
     * 設定屬性{@link CategoryAxis#setCategories}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B categories(javafx.collections.ObservableList<java.lang.String> value)
    {
        this.hasCategories = true;
        this.valCategories = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setEndMargin}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B endMargin(double value)
    {
        this.hasEndMargin = true;
        this.valEndMargin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setGapStartAndEnd}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B gapStartAndEnd(boolean value)
    {
        this.hasGapStartAndEnd = true;
        this.valGapStartAndEnd = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#setStartMargin}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startMargin(double value)
    {
        this.hasStartMargin = true;
        this.valStartMargin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#endMarginProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindEndMargin(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundEndMargin = true;
        this.obsrvEndMargin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#gapStartAndEndProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindGapStartAndEnd(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundGapStartAndEnd = true;
        this.obsrvGapStartAndEnd = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CategoryAxis#startMarginProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindStartMargin(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundStartMargin = true;
        this.obsrvStartMargin = source;
        return (B) this;
    }

    /**
     * 建構{@link CategoryAxis}物件
     *
     * @return 新的{@link CategoryAxis}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CategoryAxis build()
    {
        CategoryAxis instance = new CategoryAxis();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
