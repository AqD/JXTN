// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link CheckBoxListCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link CheckBoxListCell})
 * @param <B> 建構器本身的型態(需繼承{@link CheckBoxListCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckBoxListCellBuilder<T extends java.lang.Object, Z extends CheckBoxListCell<T>, B extends CheckBoxListCellBuilder<T, Z, B>>
        extends javafx.scene.control.ListCellBuilder<T, Z, B>
{

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasSelectedStateCallback;
    private javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>> valSelectedStateCallback;

    private boolean bound1Converter;
    private boolean bound2Converter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrv1Converter;
    private javafx.beans.property.Property<javafx.util.StringConverter<T>> obsrv2Converter;

    private boolean bound1SelectedStateCallback;
    private boolean bound2SelectedStateCallback;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrv1SelectedStateCallback;
    private javafx.beans.property.Property<javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrv2SelectedStateCallback;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasSelectedStateCallback)
            instance.setSelectedStateCallback(this.valSelectedStateCallback);
        if (this.bound1Converter)
            instance.converterProperty().bind(this.obsrv1Converter);
        if (this.bound2Converter)
            instance.converterProperty().bindBidirectional(this.obsrv2Converter);
        if (this.bound1SelectedStateCallback)
            instance.selectedStateCallbackProperty().bind(this.obsrv1SelectedStateCallback);
        if (this.bound2SelectedStateCallback)
            instance.selectedStateCallbackProperty().bindBidirectional(this.obsrv2SelectedStateCallback);
    }

    /**
     * 設定屬性{@link CheckBoxListCell#setConverter(javafx.util.StringConverter)}
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
     * 設定屬性{@link CheckBoxListCell#setSelectedStateCallback(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedStateCallback(javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>> value)
    {
        this.hasSelectedStateCallback = true;
        this.valSelectedStateCallback = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxListCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Converter = true;
        this.obsrv1Converter = source;
        this.bound2Converter = false;
        this.obsrv2Converter = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxListCell#converterProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalConverter(javafx.beans.property.Property<javafx.util.StringConverter<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Converter = false;
        this.obsrv1Converter = null;
        this.bound2Converter = true;
        this.obsrv2Converter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxListCell#selectedStateCallbackProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectedStateCallback(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectedStateCallback = true;
        this.obsrv1SelectedStateCallback = source;
        this.bound2SelectedStateCallback = false;
        this.obsrv2SelectedStateCallback = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxListCell#selectedStateCallbackProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSelectedStateCallback(javafx.beans.property.Property<javafx.util.Callback<T, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1SelectedStateCallback = false;
        this.obsrv1SelectedStateCallback = null;
        this.bound2SelectedStateCallback = true;
        this.obsrv2SelectedStateCallback = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckBoxListCell}物件
     *
     * @return 新的{@link CheckBoxListCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckBoxListCell<T> build()
    {
        CheckBoxListCell<T> instance = new CheckBoxListCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
