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
 * @param <Z> 要建構的物件型態(需繼承{@link SplitPane})
 * @param <B> 建構器本身的型態(需繼承{@link SplitPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SplitPaneBuilder<Z extends SplitPane, B extends SplitPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasDividerPositions;
    private double[] valDividerPositions;

    private boolean hasDividers;
    private java.util.Collection<javafx.scene.control.SplitPane.Divider> valDividers;

    private boolean hasItems;
    private java.util.Collection<javafx.scene.Node> valItems;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean boundOrientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
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
    }

    /**
     * 設定屬性{@link SplitPane#setDividerPositions(double[])}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B dividerPositions(double[] value)
    {
        this.hasDividerPositions = true;
        this.valDividerPositions = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SplitPane#getDividers}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B dividers(java.util.Collection<javafx.scene.control.SplitPane.Divider> value)
    {
        this.hasDividers = true;
        this.valDividers = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SplitPane#getDividers}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B dividers(javafx.scene.control.SplitPane.Divider... value)
    {
        this.hasDividers = true;
        this.valDividers = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SplitPane#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SplitPane#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(javafx.scene.Node... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link SplitPane#setOrientation(javafx.geometry.Orientation)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SplitPane#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    /**
     * 建構{@link SplitPane}物件
     *
     * @return 新的{@link SplitPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SplitPane build()
    {
        SplitPane instance = new SplitPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
