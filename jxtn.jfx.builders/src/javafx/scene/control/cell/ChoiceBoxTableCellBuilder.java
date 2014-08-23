// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ChoiceBoxTableCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ChoiceBoxTableCellBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends ChoiceBoxTableCell<S, T>, B extends ChoiceBoxTableCellBuilder<S, T, Z, B>>
        extends javafx.scene.control.TableCellBuilder<S, T, Z, B>
{
    private boolean applied;

    protected boolean hasConverter;
    protected javafx.util.StringConverter<T> valConverter;

    protected boolean hasItems;
    protected java.util.Collection<T> valItems;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;
    public void applyTo(ChoiceBoxTableCell<S, T> instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
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
    public B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(T... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
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
    public ChoiceBoxTableCell<S, T> build()
    {
        ChoiceBoxTableCell<S, T> instance = new ChoiceBoxTableCell<S, T>();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
