// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link TextFieldTreeTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextFieldTreeTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends TextFieldTreeTableCell<S, T>, B extends TextFieldTreeTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TreeTableCellBuilder<S, T, Z, B>
{
    private boolean applied;

    protected boolean hasConverter;
    protected javafx.util.StringConverter<T> valConverter;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;
    public void applyTo(TextFieldTreeTableCell<S, T> instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<T> value)
    {
        this.hasConverter = true;
        this.valConverter = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindConverter(javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> source)
    {
        assert (source != null);
        this.boundConverter = true;
        this.obsrvConverter = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TextFieldTreeTableCell<S, T> build()
    {
        TextFieldTreeTableCell<S, T> instance = new TextFieldTreeTableCell<S, T>();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
