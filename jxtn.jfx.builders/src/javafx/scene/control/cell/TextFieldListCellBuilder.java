// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link TextFieldListCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TextFieldListCell})
 * @param <B> 建構器本身的型態(需繼承{@link TextFieldListCellBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextFieldListCellBuilder<T extends java.lang.Object, Z extends TextFieldListCell<T>, B extends TextFieldListCellBuilder<T, Z, B>>
        extends javafx.scene.control.ListCellBuilder<T, Z, B>
{

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean boundConverter;
    private javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
    }

    /**
     * 設定屬性{@link TextFieldListCell#setConverter(javafx.util.StringConverter)}
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
     * 設定屬性{@link TextFieldListCell#converterProperty}的連結
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
     * 建構{@link TextFieldListCell}物件
     *
     * @return 新的{@link TextFieldListCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TextFieldListCell<T> build()
    {
        TextFieldListCell<T> instance = new TextFieldListCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
