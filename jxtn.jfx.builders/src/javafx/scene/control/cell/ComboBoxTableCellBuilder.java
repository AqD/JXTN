// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ComboBoxTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ComboBoxTableCell})
 * @param <B> 建構器本身的型態(需繼承{@link ComboBoxTableCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends ComboBoxTableCell<S, T>, B extends ComboBoxTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TableCellBuilder<S, T, Z, B>
{

    private boolean hasComboBoxEditable;
    private boolean valComboBoxEditable;

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasItems;
    private java.util.Collection<T> valItems;

    private boolean boundComboBoxEditable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvComboBoxEditable;

    private boolean boundConverter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

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
     * 設定屬性{@link ComboBoxTableCell#setComboBoxEditable(boolean)}
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
     * 設定屬性{@link ComboBoxTableCell#setConverter(javafx.util.StringConverter)}
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
     * 設定集合屬性{@link ComboBoxTableCell#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link ComboBoxTableCell#getItems}的內容
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
     * 設定屬性{@link ComboBoxTableCell#comboBoxEditableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindComboBoxEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundComboBoxEditable = true;
        this.obsrvComboBoxEditable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxTableCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundConverter = true;
        this.obsrvConverter = source;
        return (B) this;
    }

    /**
     * 建構{@link ComboBoxTableCell}物件
     *
     * @return 新的{@link ComboBoxTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ComboBoxTableCell<S, T> build()
    {
        ComboBoxTableCell<S, T> instance = new ComboBoxTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
