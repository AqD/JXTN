// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link GridView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridViewBuilder<T extends java.lang.Object, Z extends GridView<T>, B extends GridViewBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasCellFactory;
    protected javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>> valCellFactory;

    protected boolean hasCellHeight;
    protected double valCellHeight;

    protected boolean hasCellWidth;
    protected double valCellWidth;

    protected boolean hasHorizontalCellSpacing;
    protected double valHorizontalCellSpacing;

    protected boolean hasItems;
    protected javafx.collections.ObservableList<T> valItems;

    protected boolean hasVerticalCellSpacing;
    protected double valVerticalCellSpacing;

    protected boolean boundCellFactory;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> obsrvCellFactory;

    protected boolean boundCellHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvCellHeight;

    protected boolean boundCellWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvCellWidth;

    protected boolean boundHorizontalCellSpacing;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvHorizontalCellSpacing;

    protected boolean boundItems;
    protected javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<T>> obsrvItems;

    protected boolean boundVerticalCellSpacing;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvVerticalCellSpacing;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCellFactory)
            instance.setCellFactory(this.valCellFactory);
        if (this.hasCellHeight)
            instance.setCellHeight(this.valCellHeight);
        if (this.hasCellWidth)
            instance.setCellWidth(this.valCellWidth);
        if (this.hasHorizontalCellSpacing)
            instance.setHorizontalCellSpacing(this.valHorizontalCellSpacing);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasVerticalCellSpacing)
            instance.setVerticalCellSpacing(this.valVerticalCellSpacing);
        if (this.boundCellFactory)
            instance.cellFactoryProperty().bind(this.obsrvCellFactory);
        if (this.boundCellHeight)
            instance.cellHeightProperty().bind(this.obsrvCellHeight);
        if (this.boundCellWidth)
            instance.cellWidthProperty().bind(this.obsrvCellWidth);
        if (this.boundHorizontalCellSpacing)
            instance.horizontalCellSpacingProperty().bind(this.obsrvHorizontalCellSpacing);
        if (this.boundItems)
            instance.itemsProperty().bind(this.obsrvItems);
        if (this.boundVerticalCellSpacing)
            instance.verticalCellSpacingProperty().bind(this.obsrvVerticalCellSpacing);
    }

    /**
     * 設定屬性{@link GridView#setCellFactory}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>> value)
    {
        this.hasCellFactory = true;
        this.valCellFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setCellHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellHeight(double value)
    {
        this.hasCellHeight = true;
        this.valCellHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setCellWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellWidth(double value)
    {
        this.hasCellWidth = true;
        this.valCellWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setHorizontalCellSpacing}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B horizontalCellSpacing(double value)
    {
        this.hasHorizontalCellSpacing = true;
        this.valHorizontalCellSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setItems}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(javafx.collections.ObservableList<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#setVerticalCellSpacing}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalCellSpacing(double value)
    {
        this.hasVerticalCellSpacing = true;
        this.valVerticalCellSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCellFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<org.controlsfx.control.GridView<T>, org.controlsfx.control.GridCell<T>>> source)
    {
        assert (source != null);
        this.boundCellFactory = true;
        this.obsrvCellFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCellHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundCellHeight = true;
        this.obsrvCellHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#cellWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCellWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundCellWidth = true;
        this.obsrvCellWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#horizontalCellSpacingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHorizontalCellSpacing(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundHorizontalCellSpacing = true;
        this.obsrvHorizontalCellSpacing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#itemsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindItems(javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<T>> source)
    {
        assert (source != null);
        this.boundItems = true;
        this.obsrvItems = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridView#verticalCellSpacingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindVerticalCellSpacing(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundVerticalCellSpacing = true;
        this.obsrvVerticalCellSpacing = source;
        return (B) this;
    }

    /**
     * 建構{@link GridView}物件
     *
     * @return 新的{@link GridView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GridView<T> build()
    {
        GridView<T> instance = new GridView<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
