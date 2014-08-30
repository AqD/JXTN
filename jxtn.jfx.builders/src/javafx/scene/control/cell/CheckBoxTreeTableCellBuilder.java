// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link CheckBoxTreeTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CheckBoxTreeTableCell})
 * @param <B> 建構器本身的型態(需繼承{@link CheckBoxTreeTableCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckBoxTreeTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends CheckBoxTreeTableCell<S, T>, B extends CheckBoxTreeTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TreeTableCellBuilder<S, T, Z, B>
{

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasSelectedStateCallback;
    private javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> valSelectedStateCallback;

    private boolean boundConverter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

    private boolean boundSelectedStateCallback;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrvSelectedStateCallback;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasSelectedStateCallback)
            instance.setSelectedStateCallback(this.valSelectedStateCallback);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
        if (this.boundSelectedStateCallback)
            instance.selectedStateCallbackProperty().bind(this.obsrvSelectedStateCallback);
    }

    /**
     * 設定屬性{@link CheckBoxTreeTableCell#setConverter(javafx.util.StringConverter)}
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
     * 設定屬性{@link CheckBoxTreeTableCell#setSelectedStateCallback(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedStateCallback(javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>> value)
    {
        this.hasSelectedStateCallback = true;
        this.valSelectedStateCallback = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeTableCell#converterProperty}的連結
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
     * 設定屬性{@link CheckBoxTreeTableCell#selectedStateCallbackProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectedStateCallback(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.Integer, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSelectedStateCallback = true;
        this.obsrvSelectedStateCallback = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckBoxTreeTableCell}物件
     *
     * @return 新的{@link CheckBoxTreeTableCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckBoxTreeTableCell<S, T> build()
    {
        CheckBoxTreeTableCell<S, T> instance = new CheckBoxTreeTableCell<S, T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
