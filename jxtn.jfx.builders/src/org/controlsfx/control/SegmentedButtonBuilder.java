// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link SegmentedButton}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SegmentedButtonBuilder<Z extends SegmentedButton, B extends SegmentedButtonBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasButtons;
    protected java.util.Collection<javafx.scene.control.ToggleButton> valButtons;
    public void applyTo(SegmentedButton instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasButtons)
            instance.getButtons().setAll(this.valButtons);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B buttons(java.util.Collection<javafx.scene.control.ToggleButton> value)
    {
        this.hasButtons = true;
        this.valButtons = value;
        return (B) this;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttons(javafx.scene.control.ToggleButton... value)
    {
        this.hasButtons = true;
        this.valButtons = java.util.Arrays.asList(value);
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SegmentedButton build()
    {
        SegmentedButton instance = new SegmentedButton();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
