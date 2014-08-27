// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ComboBoxTreeCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxTreeCellBuilder<T extends java.lang.Object, Z extends ComboBoxTreeCell<T>, B extends ComboBoxTreeCellBuilder<T, Z, B>>
        extends javafx.scene.control.TreeCellBuilder<T, Z, B>
{

    protected boolean hasComboBoxEditable;
    protected boolean valComboBoxEditable;

    protected boolean hasConverter;
    protected javafx.util.StringConverter<T> valConverter;

    protected boolean hasItems;
    protected java.util.Collection<T> valItems;

    protected boolean boundComboBoxEditable;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvComboBoxEditable;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasComboBoxEditable)
            instance.setComboBoxEditable(this.valComboBoxEditable);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.boundComboBoxEditable)
            instance.comboBoxEditableProperty().bind(this.obsrvComboBoxEditable);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
    }

    /**
     * 設定屬性{@link ComboBoxTreeCell#setComboBoxEditable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B comboBoxEditable(boolean value)
    {
        this.hasComboBoxEditable = true;
        this.valComboBoxEditable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTreeCell#setConverter(javafx.util.StringConverter)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<T> value)
    {
        this.hasConverter = true;
        this.valConverter = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ComboBoxTreeCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ComboBoxTreeCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(T... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTreeCell#comboBoxEditableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindComboBoxEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundComboBoxEditable = true;
        this.obsrvComboBoxEditable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTreeCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        assert (source != null);
        this.boundConverter = true;
        this.obsrvConverter = source;
        return (B) this;
    }

    /**
     * 建構{@link ComboBoxTreeCell}物件
     *
     * @return 新的{@link ComboBoxTreeCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ComboBoxTreeCell<T> build()
    {
        ComboBoxTreeCell<T> instance = new ComboBoxTreeCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
