// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link MasterDetailPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MasterDetailPaneBuilder<Z extends MasterDetailPane, B extends MasterDetailPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasAnimated;
    protected boolean valAnimated;

    protected boolean hasDetailNode;
    protected javafx.scene.Node valDetailNode;

    protected boolean hasDetailSide;
    protected javafx.geometry.Side valDetailSide;

    protected boolean hasDividerPosition;
    protected double valDividerPosition;

    protected boolean hasMasterNode;
    protected javafx.scene.Node valMasterNode;

    protected boolean hasShowDetailNode;
    protected boolean valShowDetailNode;

    protected boolean boundAnimated;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAnimated;

    protected boolean boundDetailNode;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvDetailNode;

    protected boolean boundDetailSide;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvDetailSide;

    protected boolean boundDividerPosition;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvDividerPosition;

    protected boolean boundMasterNode;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvMasterNode;

    protected boolean boundShowDetailNode;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowDetailNode;
    public void applyTo(MasterDetailPane instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasAnimated)
            instance.setAnimated(this.valAnimated);
        if (this.hasDetailNode)
            instance.setDetailNode(this.valDetailNode);
        if (this.hasDetailSide)
            instance.setDetailSide(this.valDetailSide);
        if (this.hasDividerPosition)
            instance.setDividerPosition(this.valDividerPosition);
        if (this.hasMasterNode)
            instance.setMasterNode(this.valMasterNode);
        if (this.hasShowDetailNode)
            instance.setShowDetailNode(this.valShowDetailNode);
        if (this.boundAnimated)
            instance.animatedProperty().bind(this.obsrvAnimated);
        if (this.boundDetailNode)
            instance.detailNodeProperty().bind(this.obsrvDetailNode);
        if (this.boundDetailSide)
            instance.detailSideProperty().bind(this.obsrvDetailSide);
        if (this.boundDividerPosition)
            instance.dividerPositionProperty().bind(this.obsrvDividerPosition);
        if (this.boundMasterNode)
            instance.masterNodeProperty().bind(this.obsrvMasterNode);
        if (this.boundShowDetailNode)
            instance.showDetailNodeProperty().bind(this.obsrvShowDetailNode);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B animated(boolean value)
    {
        this.hasAnimated = true;
        this.valAnimated = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B detailNode(javafx.scene.Node value)
    {
        this.hasDetailNode = true;
        this.valDetailNode = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B detailSide(javafx.geometry.Side value)
    {
        this.hasDetailSide = true;
        this.valDetailSide = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B dividerPosition(double value)
    {
        this.hasDividerPosition = true;
        this.valDividerPosition = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B masterNode(javafx.scene.Node value)
    {
        this.hasMasterNode = true;
        this.valMasterNode = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B showDetailNode(boolean value)
    {
        this.hasShowDetailNode = true;
        this.valShowDetailNode = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindAnimated(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAnimated = true;
        this.obsrvAnimated = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDetailNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundDetailNode = true;
        this.obsrvDetailNode = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDetailSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        assert (source != null);
        this.boundDetailSide = true;
        this.obsrvDetailSide = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDividerPosition(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundDividerPosition = true;
        this.obsrvDividerPosition = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindMasterNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundMasterNode = true;
        this.obsrvMasterNode = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindShowDetailNode(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundShowDetailNode = true;
        this.obsrvShowDetailNode = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MasterDetailPane build()
    {
        MasterDetailPane instance = new MasterDetailPane();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
