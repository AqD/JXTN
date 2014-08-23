// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeItem}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeItemBuilder<T extends java.lang.Object, Z extends TreeItem<T>, B extends TreeItemBuilder<T, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasChildren;
    protected java.util.Collection<javafx.scene.control.TreeItem<T>> valChildren;

    protected boolean hasExpanded;
    protected boolean valExpanded;

    protected boolean hasGraphic;
    protected javafx.scene.Node valGraphic;

    protected boolean hasValue;
    protected T valValue;

    protected boolean boundExpanded;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvExpanded;

    protected boolean boundGraphic;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvGraphic;

    protected boolean boundValue;
    protected javafx.beans.value.ObservableValue<? extends T> obsrvValue;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasChildren)
            instance.getChildren().setAll(this.valChildren);
        if (this.hasExpanded)
            instance.setExpanded(this.valExpanded);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasValue)
            instance.setValue(this.valValue);
        if (this.boundExpanded)
            instance.expandedProperty().bind(this.obsrvExpanded);
        if (this.boundGraphic)
            instance.graphicProperty().bind(this.obsrvGraphic);
        if (this.boundValue)
            instance.valueProperty().bind(this.obsrvValue);
    }

    /**
     * 設定集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B children(java.util.Collection<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasChildren = true;
        this.valChildren = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeItem#getChildren}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B children(javafx.scene.control.TreeItem<T>... value)
    {
        this.hasChildren = true;
        this.valChildren = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setExpanded}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B expanded(boolean value)
    {
        this.hasExpanded = true;
        this.valExpanded = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setGraphic}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node value)
    {
        this.hasGraphic = true;
        this.valGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#setValue}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B value(T value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#expandedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindExpanded(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundExpanded = true;
        this.obsrvExpanded = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#graphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundGraphic = true;
        this.obsrvGraphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeItem#valueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindValue(javafx.beans.value.ObservableValue<? extends T> source)
    {
        assert (source != null);
        this.boundValue = true;
        this.obsrvValue = source;
        return (B) this;
    }

    /**
     * 建構{@link TreeItem}物件
     *
     * @return 新的{@link TreeItem}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeItem<T> build()
    {
        TreeItem<T> instance = new TreeItem<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
