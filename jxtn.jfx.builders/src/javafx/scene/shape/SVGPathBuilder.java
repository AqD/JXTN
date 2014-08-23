// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link SVGPath}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SVGPathBuilder<Z extends SVGPath, B extends SVGPathBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasContent;
    protected java.lang.String valContent;

    protected boolean hasFillRule;
    protected javafx.scene.shape.FillRule valFillRule;

    protected boolean boundContent;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvContent;

    protected boolean boundFillRule;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.FillRule> obsrvFillRule;
    public void applyTo(SVGPath instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasFillRule)
            instance.setFillRule(this.valFillRule);
        if (this.boundContent)
            instance.contentProperty().bind(this.obsrvContent);
        if (this.boundFillRule)
            instance.fillRuleProperty().bind(this.obsrvFillRule);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B content(java.lang.String value)
    {
        this.hasContent = true;
        this.valContent = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B fillRule(javafx.scene.shape.FillRule value)
    {
        this.hasFillRule = true;
        this.valFillRule = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindContent(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundContent = true;
        this.obsrvContent = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindFillRule(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.FillRule> source)
    {
        assert (source != null);
        this.boundFillRule = true;
        this.obsrvFillRule = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SVGPath build()
    {
        SVGPath instance = new SVGPath();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
