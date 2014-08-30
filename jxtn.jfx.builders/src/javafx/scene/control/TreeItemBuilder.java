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
 * @param <Z> 要建構的物件型態(需繼承{@link TreeItem})
 * @param <B> 建構器本身的型態(需繼承{@link TreeItemBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeItemBuilder<T extends java.lang.Object, Z extends TreeItem<T>, B extends TreeItemBuilder<T, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasChildren;
    private java.util.Collection<javafx.scene.control.TreeItem<T>> valChildren;

    private boolean hasExpanded;
    private boolean valExpanded;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasValue;
    private T valValue;

    private boolean boundExpanded;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvExpanded;

    private boolean boundGraphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvGraphic;

    private boolean boundValue;
    private javafx.beans.value.ObservableValue<? extends T> obsrvValue;

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
    public final B children(java.util.Collection<javafx.scene.control.TreeItem<T>> value)
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
     * 設定屬性{@link TreeItem#setExpanded(boolean)}
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
     * 設定屬性{@link TreeItem#setGraphic(javafx.scene.Node)}
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
     * 設定屬性{@link TreeItem#setValue(T)}
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
    public final B bindExpanded(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
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
    public final B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
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
    public final B bindValue(javafx.beans.value.ObservableValue<? extends T> source)
    {
        java.util.Objects.requireNonNull(source);
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
