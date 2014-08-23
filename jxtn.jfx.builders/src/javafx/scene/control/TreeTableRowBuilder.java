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
    private boolean applied;

    protected boolean hasDisclosureNode;
    protected javafx.scene.Node valDisclosureNode;

    protected boolean boundDisclosureNode;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvDisclosureNode;
    public void applyTo(TreeTableRow<T> instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasDisclosureNode)
            instance.setDisclosureNode(this.valDisclosureNode);
        if (this.boundDisclosureNode)
            instance.disclosureNodeProperty().bind(this.obsrvDisclosureNode);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B disclosureNode(javafx.scene.Node value)
    {
        this.hasDisclosureNode = true;
        this.valDisclosureNode = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDisclosureNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundDisclosureNode = true;
        this.obsrvDisclosureNode = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TreeTableRow<T> build()
    {
        TreeTableRow<T> instance = new TreeTableRow<T>();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
