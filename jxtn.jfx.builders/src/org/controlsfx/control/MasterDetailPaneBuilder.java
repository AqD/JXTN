// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link MasterDetailPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MasterDetailPane})
 * @param <B> 建構器本身的型態(需繼承{@link MasterDetailPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MasterDetailPaneBuilder<Z extends MasterDetailPane, B extends MasterDetailPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasAnimated;
    private boolean valAnimated;

    private boolean hasDetailNode;
    private javafx.scene.Node valDetailNode;

    private boolean hasDetailSide;
    private javafx.geometry.Side valDetailSide;

    private boolean hasDividerPosition;
    private double valDividerPosition;

    private boolean hasMasterNode;
    private javafx.scene.Node valMasterNode;

    private boolean hasShowDetailNode;
    private boolean valShowDetailNode;

    private boolean boundAnimated;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvAnimated;

    private boolean boundDetailNode;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvDetailNode;

    private boolean boundDetailSide;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvDetailSide;

    private boolean boundDividerPosition;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvDividerPosition;

    private boolean boundMasterNode;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvMasterNode;

    private boolean boundShowDetailNode;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowDetailNode;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
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
    }

    /**
     * 設定屬性{@link MasterDetailPane#setAnimated(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B animated(boolean value)
    {
        this.hasAnimated = true;
        this.valAnimated = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#setDetailNode(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B detailNode(javafx.scene.Node value)
    {
        this.hasDetailNode = true;
        this.valDetailNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#setDetailSide(javafx.geometry.Side)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B detailSide(javafx.geometry.Side value)
    {
        this.hasDetailSide = true;
        this.valDetailSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#setDividerPosition(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B dividerPosition(double value)
    {
        this.hasDividerPosition = true;
        this.valDividerPosition = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#setMasterNode(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B masterNode(javafx.scene.Node value)
    {
        this.hasMasterNode = true;
        this.valMasterNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#setShowDetailNode(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showDetailNode(boolean value)
    {
        this.hasShowDetailNode = true;
        this.valShowDetailNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#animatedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAnimated(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundAnimated = true;
        this.obsrvAnimated = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#detailNodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDetailNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundDetailNode = true;
        this.obsrvDetailNode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#detailSideProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDetailSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundDetailSide = true;
        this.obsrvDetailSide = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#dividerPositionProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDividerPosition(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundDividerPosition = true;
        this.obsrvDividerPosition = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#masterNodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindMasterNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundMasterNode = true;
        this.obsrvMasterNode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MasterDetailPane#showDetailNodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowDetailNode(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundShowDetailNode = true;
        this.obsrvShowDetailNode = source;
        return (B) this;
    }

    /**
     * 建構{@link MasterDetailPane}物件
     *
     * @return 新的{@link MasterDetailPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MasterDetailPane build()
    {
        MasterDetailPane instance = new MasterDetailPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
