// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ComboBox}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ComboBox})
 * @param <B> 建構器本身的型態(需繼承{@link ComboBoxBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxBuilder<T extends java.lang.Object, Z extends ComboBox<T>, B extends ComboBoxBuilder<T, Z, B>>
        extends javafx.scene.control.ComboBoxBaseBuilder<T, Z, B>
{

    private boolean hasButtonCell;
    private javafx.scene.control.ListCell<T> valButtonCell;

    private boolean hasCellFactory;
    private javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> valCellFactory;

    private boolean hasConverter;
    private javafx.util.StringConverter<T> valConverter;

    private boolean hasItems;
    private javafx.collections.ObservableList<T> valItems;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasSelectionModel;
    private javafx.scene.control.SingleSelectionModel<T> valSelectionModel;

    private boolean hasVisibleRowCount;
    private int valVisibleRowCount;

    private boolean boundPlaceholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvPlaceholder;

    private boolean boundSelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<T>> obsrvSelectionModel;

    private boolean boundVisibleRowCount;
    private javafx.beans.value.ObservableValue<? extends Integer> obsrvVisibleRowCount;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasButtonCell)
            instance.setButtonCell(this.valButtonCell);
        if (this.hasCellFactory)
            instance.setCellFactory(this.valCellFactory);
        if (this.hasConverter)
            instance.setConverter(this.valConverter);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasVisibleRowCount)
            instance.setVisibleRowCount(this.valVisibleRowCount);
        if (this.boundPlaceholder)
            instance.placeholderProperty().bind(this.obsrvPlaceholder);
        if (this.boundSelectionModel)
            instance.selectionModelProperty().bind(this.obsrvSelectionModel);
        if (this.boundVisibleRowCount)
            instance.visibleRowCountProperty().bind(this.obsrvVisibleRowCount);
    }

    /**
     * 設定屬性{@link ComboBox#setButtonCell(javafx.scene.control.ListCell)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B buttonCell(javafx.scene.control.ListCell<T> value)
    {
        this.hasButtonCell = true;
        this.valButtonCell = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setCellFactory(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<javafx.scene.control.ListView<T>, javafx.scene.control.ListCell<T>> value)
    {
        this.hasCellFactory = true;
        this.valCellFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setConverter(javafx.util.StringConverter)}
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
     * 設定屬性{@link ComboBox#setItems(javafx.collections.ObservableList)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(javafx.collections.ObservableList<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setPlaceholder(javafx.scene.Node)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B placeholder(javafx.scene.Node value)
    {
        this.hasPlaceholder = true;
        this.valPlaceholder = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setSelectionModel(javafx.scene.control.SingleSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.SingleSelectionModel<T> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#setVisibleRowCount(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visibleRowCount(int value)
    {
        this.hasVisibleRowCount = true;
        this.valVisibleRowCount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#placeholderProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPlaceholder(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundPlaceholder = true;
        this.obsrvPlaceholder = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<T>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSelectionModel = true;
        this.obsrvSelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBox#visibleRowCountProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVisibleRowCount(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundVisibleRowCount = true;
        this.obsrvVisibleRowCount = source;
        return (B) this;
    }

    /**
     * 建構{@link ComboBox}物件
     *
     * @return 新的{@link ComboBox}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ComboBox<T> build()
    {
        ComboBox<T> instance = new ComboBox<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
