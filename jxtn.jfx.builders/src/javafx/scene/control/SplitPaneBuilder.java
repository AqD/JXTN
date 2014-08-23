// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link SplitPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SplitPaneBuilder<Z extends SplitPane, B extends SplitPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasDividerPositions;
    protected double[] valDividerPositions;

    protected boolean hasDividers;
    protected java.util.Collection<javafx.scene.control.SplitPane.Divider> valDividers;

    protected boolean hasItems;
    protected java.util.Collection<javafx.scene.Node> valItems;

    protected boolean hasOrientation;
    protected javafx.geometry.Orientation valOrientation;

    protected boolean boundOrientation;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;
    public void applyTo(SplitPane instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasDividerPositions)
            instance.setDividerPositions(this.valDividerPositions);
        if (this.hasDividers)
            instance.getDividers().setAll(this.valDividers);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B dividerPositions(double[] value)
    {
        this.hasDividerPositions = true;
        this.valDividerPositions = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B dividers(java.util.Collection<javafx.scene.control.SplitPane.Divider> value)
    {
        this.hasDividers = true;
        this.valDividers = value;
        return (B) this;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B dividers(javafx.scene.control.SplitPane.Divider... value)
    {
        this.hasDividers = true;
        this.valDividers = java.util.Arrays.asList(value);
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B items(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(javafx.scene.Node... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        assert (source != null);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SplitPane build()
    {
        SplitPane instance = new SplitPane();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
