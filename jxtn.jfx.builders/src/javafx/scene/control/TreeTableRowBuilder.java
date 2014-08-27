// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeTableRow}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeTableRowBuilder<T extends java.lang.Object, Z extends TreeTableRow<T>, B extends TreeTableRowBuilder<T, Z, B>>
        extends javafx.scene.control.IndexedCellBuilder<T, Z, B>
{

    protected boolean hasDisclosureNode;
    protected javafx.scene.Node valDisclosureNode;

    protected boolean boundDisclosureNode;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvDisclosureNode;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasDisclosureNode)
            instance.setDisclosureNode(this.valDisclosureNode);
        if (this.boundDisclosureNode)
            instance.disclosureNodeProperty().bind(this.obsrvDisclosureNode);
    }

    /**
     * 設定屬性{@link TreeTableRow#setDisclosureNode(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B disclosureNode(javafx.scene.Node value)
    {
        this.hasDisclosureNode = true;
        this.valDisclosureNode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableRow#disclosureNodeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindDisclosureNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundDisclosureNode = true;
        this.obsrvDisclosureNode = source;
        return (B) this;
    }

    /**
     * 建構{@link TreeTableRow}物件
     *
     * @return 新的{@link TreeTableRow}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeTableRow<T> build()
    {
        TreeTableRow<T> instance = new TreeTableRow<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
