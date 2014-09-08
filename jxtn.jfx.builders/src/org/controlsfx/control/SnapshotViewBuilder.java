// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link SnapshotView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SnapshotView})
 * @param <B> 建構器本身的型態(需繼承{@link SnapshotViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SnapshotViewBuilder<Z extends SnapshotView, B extends SnapshotViewBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasFixedSelectionRatio;
    private double valFixedSelectionRatio;

    private boolean hasNode;
    private javafx.scene.Node valNode;

    private boolean hasSelection;
    private javafx.geometry.Rectangle2D valSelection;

    private boolean hasSelectionActive;
    private boolean valSelectionActive;

    private boolean hasSelectionActivityExplicitlyManaged;
    private boolean valSelectionActivityExplicitlyManaged;

    private boolean hasSelectionRatioFixed;
    private boolean valSelectionRatioFixed;

    private boolean bound1Node;
    private boolean bound2Node;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Node;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Node;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFixedSelectionRatio)
            instance.setFixedSelectionRatio(this.valFixedSelectionRatio);
        if (this.hasNode)
            instance.setNode(this.valNode);
        if (this.hasSelection)
            instance.setSelection(this.valSelection);
        if (this.hasSelectionActive)
            instance.setSelectionActive(this.valSelectionActive);
        if (this.hasSelectionActivityExplicitlyManaged)
            instance.setSelectionActivityExplicitlyManaged(this.valSelectionActivityExplicitlyManaged);
        if (this.hasSelectionRatioFixed)
            instance.setSelectionRatioFixed(this.valSelectionRatioFixed);
        if (this.bound1Node)
            instance.nodeProperty().bind(this.obsrv1Node);
        if (this.bound2Node)
            instance.nodeProperty().bindBidirectional(this.obsrv2Node);
    }

    /**
     * 設定屬性{@link SnapshotView#setFixedSelectionRatio(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixedSelectionRatio(double value)
    {
        this.hasFixedSelectionRatio = true;
        this.valFixedSelectionRatio = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setNode(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B node(javafx.scene.Node value)
    {
        this.hasNode = true;
        this.valNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelection(javafx.geometry.Rectangle2D)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selection(javafx.geometry.Rectangle2D value)
    {
        this.hasSelection = true;
        this.valSelection = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionActive(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionActive(boolean value)
    {
        this.hasSelectionActive = true;
        this.valSelectionActive = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionActivityExplicitlyManaged(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionActivityExplicitlyManaged(boolean value)
    {
        this.hasSelectionActivityExplicitlyManaged = true;
        this.valSelectionActivityExplicitlyManaged = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#setSelectionRatioFixed(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionRatioFixed(boolean value)
    {
        this.hasSelectionRatioFixed = true;
        this.valSelectionRatioFixed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#nodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Node = true;
        this.obsrv1Node = source;
        this.bound2Node = false;
        this.obsrv2Node = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SnapshotView#nodeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalNode(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Node = false;
        this.obsrv1Node = null;
        this.bound2Node = true;
        this.obsrv2Node = source;
        return (B) this;
    }

    /**
     * 建構{@link SnapshotView}物件
     *
     * @return 新的{@link SnapshotView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SnapshotView build()
    {
        SnapshotView instance = new SnapshotView();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
