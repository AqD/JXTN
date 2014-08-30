// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Path}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Path})
 * @param <B> 建構器本身的型態(需繼承{@link PathBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PathBuilder<Z extends Path, B extends PathBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    private boolean hasElements;
    private java.util.Collection<javafx.scene.shape.PathElement> valElements;

    private boolean hasFillRule;
    private javafx.scene.shape.FillRule valFillRule;

    private boolean boundFillRule;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.shape.FillRule> obsrvFillRule;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasElements)
            instance.getElements().setAll(this.valElements);
        if (this.hasFillRule)
            instance.setFillRule(this.valFillRule);
        if (this.boundFillRule)
            instance.fillRuleProperty().bind(this.obsrvFillRule);
    }

    /**
     * 設定集合屬性{@link Path#getElements}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B elements(java.util.Collection<javafx.scene.shape.PathElement> value)
    {
        this.hasElements = true;
        this.valElements = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Path#getElements}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B elements(javafx.scene.shape.PathElement... value)
    {
        this.hasElements = true;
        this.valElements = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link Path#setFillRule(javafx.scene.shape.FillRule)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fillRule(javafx.scene.shape.FillRule value)
    {
        this.hasFillRule = true;
        this.valFillRule = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Path#fillRuleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFillRule(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.FillRule> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundFillRule = true;
        this.obsrvFillRule = source;
        return (B) this;
    }

    /**
     * 建構{@link Path}物件
     *
     * @return 新的{@link Path}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Path build()
    {
        Path instance = new Path();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
