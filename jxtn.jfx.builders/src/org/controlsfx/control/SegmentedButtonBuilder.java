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

    protected boolean hasButtons;
    protected java.util.Collection<javafx.scene.control.ToggleButton> valButtons;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasButtons)
            instance.getButtons().setAll(this.valButtons);
    }

    /**
     * 設定集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttons(java.util.Collection<javafx.scene.control.ToggleButton> value)
    {
        this.hasButtons = true;
        this.valButtons = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SegmentedButton#getButtons}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B buttons(javafx.scene.control.ToggleButton... value)
    {
        this.hasButtons = true;
        this.valButtons = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 建構{@link SegmentedButton}物件
     *
     * @return 新的{@link SegmentedButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SegmentedButton build()
    {
        SegmentedButton instance = new SegmentedButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
