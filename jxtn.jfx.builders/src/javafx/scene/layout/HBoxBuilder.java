// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link HBox}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class HBoxBuilder<Z extends HBox, B extends HBoxBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasAlignment;
    protected javafx.geometry.Pos valAlignment;

    protected boolean hasFillHeight;
    protected boolean valFillHeight;

    protected boolean hasSpacing;
    protected double valSpacing;

    protected boolean boundAlignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrvAlignment;

    protected boolean boundFillHeight;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvFillHeight;

    protected boolean boundSpacing;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvSpacing;
    public void applyTo(HBox instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.hasFillHeight)
            instance.setFillHeight(this.valFillHeight);
        if (this.hasSpacing)
            instance.setSpacing(this.valSpacing);
        if (this.boundAlignment)
            instance.alignmentProperty().bind(this.obsrvAlignment);
        if (this.boundFillHeight)
            instance.fillHeightProperty().bind(this.obsrvFillHeight);
        if (this.boundSpacing)
            instance.spacingProperty().bind(this.obsrvSpacing);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B fillHeight(boolean value)
    {
        this.hasFillHeight = true;
        this.valFillHeight = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B spacing(double value)
    {
        this.hasSpacing = true;
        this.valSpacing = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        assert (source != null);
        this.boundAlignment = true;
        this.obsrvAlignment = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindFillHeight(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundFillHeight = true;
        this.obsrvFillHeight = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindSpacing(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundSpacing = true;
        this.obsrvSpacing = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HBox build()
    {
        HBox instance = new HBox();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
