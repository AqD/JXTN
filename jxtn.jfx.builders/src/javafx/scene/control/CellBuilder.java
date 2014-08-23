// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Cell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CellBuilder<T extends java.lang.Object, Z extends Cell<T>, B extends CellBuilder<T, Z, B>>
        extends javafx.scene.control.LabeledBuilder<Z, B>
{

    protected boolean hasEditable;
    protected boolean valEditable;

    protected boolean hasItem;
    protected T valItem;

    protected boolean boundEditable;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvEditable;

    protected boolean boundItem;
    protected javafx.beans.value.ObservableValue<? extends T> obsrvItem;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasItem)
            instance.setItem(this.valItem);
        if (this.boundEditable)
            instance.editableProperty().bind(this.obsrvEditable);
        if (this.boundItem)
            instance.itemProperty().bind(this.obsrvItem);
    }

    /**
     * 設定屬性{@link Cell#setEditable}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B editable(boolean value)
    {
        this.hasEditable = true;
        this.valEditable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cell#setItem}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B item(T value)
    {
        this.hasItem = true;
        this.valItem = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cell#editableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundEditable = true;
        this.obsrvEditable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Cell#itemProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindItem(javafx.beans.value.ObservableValue<? extends T> source)
    {
        assert (source != null);
        this.boundItem = true;
        this.obsrvItem = source;
        return (B) this;
    }

    /**
     * 建構{@link Cell}物件
     *
     * @return 新的{@link Cell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Cell<T> build()
    {
        Cell<T> instance = new Cell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
