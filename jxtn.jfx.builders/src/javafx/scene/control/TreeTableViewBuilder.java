// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeTableView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TreeTableView})
 * @param <B> 建構器本身的型態(需繼承{@link TreeTableViewBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeTableViewBuilder<S extends java.lang.Object, Z extends TreeTableView<S>, B extends TreeTableViewBuilder<S, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasColumnResizePolicy;
    private javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures, java.lang.Boolean> valColumnResizePolicy;

    private boolean hasColumns;
    private java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> valColumns;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFixedCellSize;
    private double valFixedCellSize;

    private boolean hasFocusModel;
    private javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S> valFocusModel;

    private boolean hasOnScrollTo;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<java.lang.Integer>> valOnScrollTo;

    private boolean hasOnScrollToColumn;
    private javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, ?>>> valOnScrollToColumn;

    private boolean hasOnSort;
    private javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>> valOnSort;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasRoot;
    private javafx.scene.control.TreeItem<S> valRoot;

    private boolean hasRowFactory;
    private javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>> valRowFactory;

    private boolean hasSelectionModel;
    private javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S> valSelectionModel;

    private boolean hasShowRoot;
    private boolean valShowRoot;

    private boolean hasSortMode;
    private javafx.scene.control.TreeSortMode valSortMode;

    private boolean hasSortOrder;
    private java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> valSortOrder;

    private boolean hasSortPolicy;
    private javafx.util.Callback<javafx.scene.control.TreeTableView<S>, java.lang.Boolean> valSortPolicy;

    private boolean hasTableMenuButtonVisible;
    private boolean valTableMenuButtonVisible;

    private boolean hasTreeColumn;
    private javafx.scene.control.TreeTableColumn<S, ?> valTreeColumn;

    private boolean hasVisibleLeafColumns;
    private java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> valVisibleLeafColumns;

    private boolean boundColumnResizePolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures, java.lang.Boolean>> obsrvColumnResizePolicy;

    private boolean boundEditable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvEditable;

    private boolean boundFixedCellSize;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvFixedCellSize;

    private boolean boundFocusModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>> obsrvFocusModel;

    private boolean boundPlaceholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvPlaceholder;

    private boolean boundRoot;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<S>> obsrvRoot;

    private boolean boundRowFactory;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>> obsrvRowFactory;

    private boolean boundSelectionModel;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>> obsrvSelectionModel;

    private boolean boundShowRoot;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvShowRoot;

    private boolean boundSortMode;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeSortMode> obsrvSortMode;

    private boolean boundSortPolicy;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView<S>, java.lang.Boolean>> obsrvSortPolicy;

    private boolean boundTableMenuButtonVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvTableMenuButtonVisible;

    private boolean boundTreeColumn;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableColumn<S, ?>> obsrvTreeColumn;

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
        if (this.hasOnScrollTo)
            instance.setOnScrollTo(this.valOnScrollTo);
        if (this.hasOnScrollToColumn)
            instance.setOnScrollToColumn(this.valOnScrollToColumn);
        if (this.hasOnSort)
            instance.setOnSort(this.valOnSort);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasRoot)
            instance.setRoot(this.valRoot);
        if (this.hasRowFactory)
            instance.setRowFactory(this.valRowFactory);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasShowRoot)
            instance.setShowRoot(this.valShowRoot);
        if (this.hasSortMode)
            instance.setSortMode(this.valSortMode);
        if (this.hasSortOrder)
            instance.getSortOrder().setAll(this.valSortOrder);
        if (this.hasSortPolicy)
            instance.setSortPolicy(this.valSortPolicy);
        if (this.hasTableMenuButtonVisible)
            instance.setTableMenuButtonVisible(this.valTableMenuButtonVisible);
        if (this.hasTreeColumn)
            instance.setTreeColumn(this.valTreeColumn);
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
        if (this.boundPlaceholder)
            instance.placeholderProperty().bind(this.obsrvPlaceholder);
        if (this.boundRoot)
            instance.rootProperty().bind(this.obsrvRoot);
        if (this.boundRowFactory)
            instance.rowFactoryProperty().bind(this.obsrvRowFactory);
        if (this.boundSelectionModel)
            instance.selectionModelProperty().bind(this.obsrvSelectionModel);
        if (this.boundShowRoot)
            instance.showRootProperty().bind(this.obsrvShowRoot);
        if (this.boundSortMode)
            instance.sortModeProperty().bind(this.obsrvSortMode);
        if (this.boundSortPolicy)
            instance.sortPolicyProperty().bind(this.obsrvSortPolicy);
        if (this.boundTableMenuButtonVisible)
            instance.tableMenuButtonVisibleProperty().bind(this.obsrvTableMenuButtonVisible);
        if (this.boundTreeColumn)
            instance.treeColumnProperty().bind(this.obsrvTreeColumn);
    }

    /**
     * 設定屬性{@link TreeTableView#setColumnResizePolicy(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B columnResizePolicy(javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures, java.lang.Boolean> value)
    {
        this.hasColumnResizePolicy = true;
        this.valColumnResizePolicy = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columns(java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> value)
    {
        this.hasColumns = true;
        this.valColumns = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columns(javafx.scene.control.TreeTableColumn<S, ?>... value)
    {
        this.hasColumns = true;
        this.valColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setEditable(boolean)}
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
     * 設定屬性{@link TreeTableView#setFixedCellSize(double)}
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
     * 設定屬性{@link TreeTableView#setFocusModel(javafx.scene.control.TreeTableView.TreeTableViewFocusModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B focusModel(javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S> value)
    {
        this.hasFocusModel = true;
        this.valFocusModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setOnScrollTo(javafx.event.EventHandler)}
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
     * 設定屬性{@link TreeTableView#setOnScrollToColumn(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onScrollToColumn(javafx.event.EventHandler<javafx.scene.control.ScrollToEvent<javafx.scene.control.TreeTableColumn<S, ?>>> value)
    {
        this.hasOnScrollToColumn = true;
        this.valOnScrollToColumn = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setOnSort(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onSort(javafx.event.EventHandler<javafx.scene.control.SortEvent<javafx.scene.control.TreeTableView<S>>> value)
    {
        this.hasOnSort = true;
        this.valOnSort = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setPlaceholder(javafx.scene.Node)}
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
     * 設定屬性{@link TreeTableView#setRoot(javafx.scene.control.TreeItem)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B root(javafx.scene.control.TreeItem<S> value)
    {
        this.hasRoot = true;
        this.valRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setRowFactory(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowFactory(javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>> value)
    {
        this.hasRowFactory = true;
        this.valRowFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setSelectionModel(javafx.scene.control.TreeTableView.TreeTableViewSelectionModel)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setShowRoot(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showRoot(boolean value)
    {
        this.hasShowRoot = true;
        this.valShowRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setSortMode(javafx.scene.control.TreeSortMode)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B sortMode(javafx.scene.control.TreeSortMode value)
    {
        this.hasSortMode = true;
        this.valSortMode = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getSortOrder}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B sortOrder(java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> value)
    {
        this.hasSortOrder = true;
        this.valSortOrder = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getSortOrder}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B sortOrder(javafx.scene.control.TreeTableColumn<S, ?>... value)
    {
        this.hasSortOrder = true;
        this.valSortOrder = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setSortPolicy(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B sortPolicy(javafx.util.Callback<javafx.scene.control.TreeTableView<S>, java.lang.Boolean> value)
    {
        this.hasSortPolicy = true;
        this.valSortPolicy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#setTableMenuButtonVisible(boolean)}
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
     * 設定屬性{@link TreeTableView#setTreeColumn(javafx.scene.control.TreeTableColumn)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B treeColumn(javafx.scene.control.TreeTableColumn<S, ?> value)
    {
        this.hasTreeColumn = true;
        this.valTreeColumn = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getVisibleLeafColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B visibleLeafColumns(java.util.Collection<javafx.scene.control.TreeTableColumn<S, ?>> value)
    {
        this.hasVisibleLeafColumns = true;
        this.valVisibleLeafColumns = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TreeTableView#getVisibleLeafColumns}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B visibleLeafColumns(javafx.scene.control.TreeTableColumn<S, ?>... value)
    {
        this.hasVisibleLeafColumns = true;
        this.valVisibleLeafColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#columnResizePolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindColumnResizePolicy(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView.ResizeFeatures, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundColumnResizePolicy = true;
        this.obsrvColumnResizePolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#editableProperty}的連結
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
     * 設定屬性{@link TreeTableView#fixedCellSizeProperty}的連結
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
     * 設定屬性{@link TreeTableView#focusModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFocusModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableView.TreeTableViewFocusModel<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundFocusModel = true;
        this.obsrvFocusModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#placeholderProperty}的連結
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
     * 設定屬性{@link TreeTableView#rootProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRoot(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundRoot = true;
        this.obsrvRoot = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#rowFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRowFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView<S>, javafx.scene.control.TreeTableRow<S>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundRowFactory = true;
        this.obsrvRowFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableView.TreeTableViewSelectionModel<S>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSelectionModel = true;
        this.obsrvSelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#showRootProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowRoot(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundShowRoot = true;
        this.obsrvShowRoot = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#sortModeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSortMode(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeSortMode> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSortMode = true;
        this.obsrvSortMode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#sortPolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSortPolicy(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeTableView<S>, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSortPolicy = true;
        this.obsrvSortPolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TreeTableView#tableMenuButtonVisibleProperty}的連結
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
     * 設定屬性{@link TreeTableView#treeColumnProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTreeColumn(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeTableColumn<S, ?>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundTreeColumn = true;
        this.obsrvTreeColumn = source;
        return (B) this;
    }

    /**
     * 建構{@link TreeTableView}物件
     *
     * @return 新的{@link TreeTableView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TreeTableView<S> build()
    {
        TreeTableView<S> instance = new TreeTableView<S>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
