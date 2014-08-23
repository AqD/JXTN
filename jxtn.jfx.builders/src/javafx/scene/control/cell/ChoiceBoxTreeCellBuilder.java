// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control.cell;

/**
 * {@link ChoiceBoxTreeCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ChoiceBoxTreeCellBuilder<T extends java.lang.Object, Z extends ChoiceBoxTreeCell<T>, B extends ChoiceBoxTreeCellBuilder<T, Z, B>>
        extends javafx.scene.control.TreeCellBuilder<T, Z, B>
{

    protected boolean hasConverter;
    protected javafx.util.StringConverter<T> valConverter;

    protected boolean hasItems;
    protected java.util.Collection<T> valItems;

    protected boolean boundConverter;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.StringConverter<T>> obsrvConverter;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.boundConverter)
            instance.converterProperty().bind(this.obsrvConverter);
    }

    /**
     * 設定屬性{@link ChoiceBoxTreeCell#setConverter}
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
     * 設定集合屬性{@link ChoiceBoxTreeCell#getItems}的內容
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
     * 設定集合屬性{@link ChoiceBoxTreeCell#getItems}的內容
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
     * 設定屬性{@link ChoiceBoxTreeCell#converterProperty}的連結
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
     * 建構{@link ChoiceBoxTreeCell}物件
     *
     * @return 新的{@link ChoiceBoxTreeCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ChoiceBoxTreeCell<T> build()
    {
        ChoiceBoxTreeCell<T> instance = new ChoiceBoxTreeCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
