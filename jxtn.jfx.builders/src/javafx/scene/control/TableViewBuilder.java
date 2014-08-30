// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TableView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TableView})
 * @param <B> 建構器本身的型態(需繼承{@link TableViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TableViewBuilder<S extends java.lang.Object, Z extends TableView<S>, B extends TableViewBuilder<S, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasColumnResizePolicy;
    private javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures, java.lang.Boolean> valColumnResizePolicy;

    private boolean hasColumns;
    private java.util.Collection<javafx.scene.control.TableColumn<S, ?>> valColumns;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFixedCellSize;
    private double valFixedCellSize;

    private boolean hasFocusModel;
    private javafx.scene.control.TableView.TableViewFocusModel<S> valFocusModel;

    private boolean hasItems;
    private javafx.collections.ObservableList<S> valItems;

    private boolean hasOnScrollTo;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> valOnScrollTo;

    private boolean hasOnScrollToColumn;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, ?>>> valOnScrollToColumn;

    private boolean hasOnSort;
    private javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>> valOnSort;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasRowFactory;
    private javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>> valRowFactory;

    private boolean hasSelectionModel;
    private javafx.scene.control.TableView.TableViewSelectionModel<S> valSelectionModel;

    private boolean hasSortOrder;
    private java.util.Collection<javafx.scene.control.TableColumn<S, ?>> valSortOrder;

    private boolean hasSortPolicy;
    private javafx.util.Callback<javafx.scene.control.TableView<S>, java.lang.Boolean> valSortPolicy;

    private boolean hasTableMenuButtonVisible;
    private boolean valTableMenuButtonVisible;

    private boolean hasVisibleLeafColumns;
    private java.util.Collection<javafx.scene.control.TableColumn<S, ?>> valVisibleLeafColumns;

    private boolean boundColumnResizePolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures, java.lang.Boolean>> obsrvColumnResizePolicy;

    private boolean boundEditable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvEditable;

    private boolean boundFixedCellSize;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvFixedCellSize;

    private boolean boundFocusModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TableView.TableViewFocusModel<S>> obsrvFocusModel;

    private boolean boundItems;
    private javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<S>> obsrvItems;

    private boolean boundPlaceholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvPlaceholder;

    private boolean boundRowFactory;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>> obsrvRowFactory;

    private boolean boundSelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TableView.TableViewSelectionModel<S>> obsrvSelectionModel;

    private boolean boundSortPolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView<S>, java.lang.Boolean>> obsrvSortPolicy;

    private boolean boundTableMenuButtonVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvTableMenuButtonVisible;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasColumnResizePolicy)
            instance.setColumnResizePolicy(this.valColumnResizePolicy);
        if (this.hasColumns)
            instance.getColumns().setAll(this.valColumns);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasFixedCellSize)
            instance.setFixedCellSize(this.valFixedCellSize);
        if (this.hasFocusModel)
            instance.setFocusModel(this.valFocusModel);
        if (this.hasItems)
            instance.setItems(this.valItems);
        if (this.hasOnScrollTo)
            instance.setOnScrollTo(this.valOnScrollTo);
        if (this.hasOnScrollToColumn)
            instance.setOnScrollToColumn(this.valOnScrollToColumn);
        if (this.hasOnSort)
            instance.setOnSort(this.valOnSort);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasRowFactory)
            instance.setRowFactory(this.valRowFactory);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasSortOrder)
            instance.getSortOrder().setAll(this.valSortOrder);
        if (this.hasSortPolicy)
            instance.setSortPolicy(this.valSortPolicy);
        if (this.hasTableMenuButtonVisible)
            instance.setTableMenuButtonVisible(this.valTableMenuButtonVisible);
        if (this.hasVisibleLeafColumns)
            instance.getVisibleLeafColumns().setAll(this.valVisibleLeafColumns);
        if (this.boundColumnResizePolicy)
            instance.columnResizePolicyProperty().bind(this.obsrvColumnResizePolicy);
        if (this.boundEditable)
            instance.editableProperty().bind(this.obsrvEditable);
        if (this.boundFixedCellSize)
            instance.fixedCellSizeProperty().bind(this.obsrvFixedCellSize);
        if (this.boundFocusModel)
            instance.focusModelProperty().bind(this.obsrvFocusModel);
        if (this.boundItems)
            instance.itemsProperty().bind(this.obsrvItems);
        if (this.boundPlaceholder)
            instance.placeholderProperty().bind(this.obsrvPlaceholder);
        if (this.boundRowFactory)
            instance.rowFactoryProperty().bind(this.obsrvRowFactory);
        if (this.boundSelectionModel)
            instance.selectionModelProperty().bind(this.obsrvSelectionModel);
        if (this.boundSortPolicy)
            instance.sortPolicyProperty().bind(this.obsrvSortPolicy);
        if (this.boundTableMenuButtonVisible)
            instance.tableMenuButtonVisibleProperty().bind(this.obsrvTableMenuButtonVisible);
    }

    /**
     * 設定屬性{@link TableView#setColumnResizePolicy(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B columnResizePolicy(javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures, java.lang.Boolean> value)
    {
        this.hasColumnResizePolicy = true;
        this.valColumnResizePolicy = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columns(java.util.Collection<javafx.scene.control.TableColumn<S, ?>> value)
    {
        this.hasColumns = true;
        this.valColumns = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columns(javafx.scene.control.TableColumn<S, ?>... value)
    {
        this.hasColumns = true;
        this.valColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setEditable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B editable(boolean value)
    {
        this.hasEditable = true;
        this.valEditable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setFixedCellSize(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixedCellSize(double value)
    {
        this.hasFixedCellSize = true;
        this.valFixedCellSize = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setFocusModel(javafx.scene.control.TableView.TableViewFocusModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B focusModel(javafx.scene.control.TableView.TableViewFocusModel<S> value)
    {
        this.hasFocusModel = true;
        this.valFocusModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setItems(javafx.collections.ObservableList)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(javafx.collections.ObservableList<S> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setOnScrollTo(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onScrollTo(javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> value)
    {
        this.hasOnScrollTo = true;
        this.valOnScrollTo = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setOnScrollToColumn(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onScrollToColumn(javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TableColumn<S, ?>>> value)
    {
        this.hasOnScrollToColumn = true;
        this.valOnScrollToColumn = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setOnSort(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onSort(javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TableView<S>>> value)
    {
        this.hasOnSort = true;
        this.valOnSort = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setPlaceholder(javafx.scene.Node)}
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
     * 設定屬性{@link TableView#setRowFactory(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowFactory(javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>> value)
    {
        this.hasRowFactory = true;
        this.valRowFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setSelectionModel(javafx.scene.control.TableView.TableViewSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.TableView.TableViewSelectionModel<S> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getSortOrder}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B sortOrder(java.util.Collection<javafx.scene.control.TableColumn<S, ?>> value)
    {
        this.hasSortOrder = true;
        this.valSortOrder = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getSortOrder}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B sortOrder(javafx.scene.control.TableColumn<S, ?>... value)
    {
        this.hasSortOrder = true;
        this.valSortOrder = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setSortPolicy(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B sortPolicy(javafx.util.Callback<javafx.scene.control.TableView<S>, java.lang.Boolean> value)
    {
        this.hasSortPolicy = true;
        this.valSortPolicy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#setTableMenuButtonVisible(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tableMenuButtonVisible(boolean value)
    {
        this.hasTableMenuButtonVisible = true;
        this.valTableMenuButtonVisible = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getVisibleLeafColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B visibleLeafColumns(java.util.Collection<javafx.scene.control.TableColumn<S, ?>> value)
    {
        this.hasVisibleLeafColumns = true;
        this.valVisibleLeafColumns = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TableView#getVisibleLeafColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B visibleLeafColumns(javafx.scene.control.TableColumn<S, ?>... value)
    {
        this.hasVisibleLeafColumns = true;
        this.valVisibleLeafColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#columnResizePolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindColumnResizePolicy(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView.ResizeFeatures, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundColumnResizePolicy = true;
        this.obsrvColumnResizePolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#editableProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundEditable = true;
        this.obsrvEditable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#fixedCellSizeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFixedCellSize(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundFixedCellSize = true;
        this.obsrvFixedCellSize = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#focusModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFocusModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TableView.TableViewFocusModel<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundFocusModel = true;
        this.obsrvFocusModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#itemsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindItems(javafx.beans.value.ObservableValue<? extends javafx.collections.ObservableList<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundItems = true;
        this.obsrvItems = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#placeholderProperty}的連結
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
     * 設定屬性{@link TableView#rowFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRowFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView<S>, javafx.scene.control.TableRow<S>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundRowFactory = true;
        this.obsrvRowFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TableView.TableViewSelectionModel<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSelectionModel = true;
        this.obsrvSelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#sortPolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSortPolicy(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TableView<S>, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSortPolicy = true;
        this.obsrvSortPolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TableView#tableMenuButtonVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTableMenuButtonVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundTableMenuButtonVisible = true;
        this.obsrvTableMenuButtonVisible = source;
        return (B) this;
    }

    /**
     * 建構{@link TableView}物件
     *
     * @return 新的{@link TableView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TableView<S> build()
    {
        TableView<S> instance = new TableView<S>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
