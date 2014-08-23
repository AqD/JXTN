// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link CheckBoxTreeCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckBoxTreeCellBuilder<T extends java.lang.Object, Z extends CheckBoxTreeCell<T>, B extends CheckBoxTreeCellBuilder<T, Z, B>>
        extends javafx.scene.control.TreeCellBuilder<T, Z, B>
{

    protected boolean hasConverter;
    protected javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> valConverter;

    protected boolean hasSelectedStateCallback;
    protected javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<java.lang.Boolean>> valSelectedStateCallback;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>> obsrvConverter;

    protected boolean boundSelectedStateCallback;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<java.lang.Boolean>>> obsrvSelectedStateCallback;

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
     * 設定屬性{@link CheckBoxTreeCell#setConverter}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<javafx.scene.control.TreeItem<T>> value)
    {
        this.hasConverter = true;
        this.valConverter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeCell#setSelectedStateCallback}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedStateCallback(javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<java.lang.Boolean>> value)
    {
        this.hasSelectedStateCallback = true;
        this.valSelectedStateCallback = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeCell#converterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<javafx.scene.control.TreeItem<T>>> source)
    {
        assert (source != null);
        this.boundConverter = true;
        this.obsrvConverter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckBoxTreeCell#selectedStateCallbackProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSelectedStateCallback(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.beans.value.ObservableValue<java.lang.Boolean>>> source)
    {
        assert (source != null);
        this.boundSelectedStateCallback = true;
        this.obsrvSelectedStateCallback = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckBoxTreeCell}物件
     *
     * @return 新的{@link CheckBoxTreeCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckBoxTreeCell<T> build()
    {
        CheckBoxTreeCell<T> instance = new CheckBoxTreeCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
