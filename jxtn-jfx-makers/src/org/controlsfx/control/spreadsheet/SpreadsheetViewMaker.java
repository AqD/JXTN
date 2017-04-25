// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetView}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetView})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetViewMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetViewMaker<Z extends SpreadsheetView, B extends SpreadsheetViewMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements SpreadsheetViewMakerExt<Z, B>
{

    private boolean hasColumns;
    private java.util.Collection<org.controlsfx.control.spreadsheet.SpreadsheetColumn> valColumns;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFixedColumns;
    private java.util.Collection<org.controlsfx.control.spreadsheet.SpreadsheetColumn> valFixedColumns;

    private boolean hasFixedRows;
    private java.util.Collection<java.lang.Integer> valFixedRows;

    private boolean hasFixingColumnsAllowed;
    private boolean valFixingColumnsAllowed;

    private boolean hasFixingRowsAllowed;
    private boolean valFixingRowsAllowed;

    private boolean hasGrid;
    private org.controlsfx.control.spreadsheet.Grid valGrid;

    private boolean hasHBarValue;
    private double valHBarValue;

    private boolean hasPlaceholder;
    private javafx.scene.Node valPlaceholder;

    private boolean hasRowHeaderWidth;
    private double valRowHeaderWidth;

    private boolean hasShowColumnHeader;
    private boolean valShowColumnHeader;

    private boolean hasShowRowHeader;
    private boolean valShowRowHeader;

    private boolean hasVBarValue;
    private double valVBarValue;

    private boolean bound1Editable;
    private boolean bound2Editable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Editable;
    private javafx.beans.property.Property<Boolean> obsrv2Editable;

    private boolean bound1Placeholder;
    private boolean bound2Placeholder;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Placeholder;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Placeholder;

    private boolean bound1RowHeaderWidth;
    private boolean bound2RowHeaderWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1RowHeaderWidth;
    private javafx.beans.property.Property<Number> obsrv2RowHeaderWidth;

    private boolean bound1ShowColumnHeader;
    private boolean bound2ShowColumnHeader;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowColumnHeader;
    private javafx.beans.property.Property<Boolean> obsrv2ShowColumnHeader;

    private boolean bound1ShowRowHeader;
    private boolean bound2ShowRowHeader;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowRowHeader;
    private javafx.beans.property.Property<Boolean> obsrv2ShowRowHeader;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasColumns)
            instance.getColumns().addAll(this.valColumns);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasFixedColumns)
            instance.getFixedColumns().addAll(this.valFixedColumns);
        if (this.hasFixedRows)
            instance.getFixedRows().addAll(this.valFixedRows);
        if (this.hasFixingColumnsAllowed)
            instance.setFixingColumnsAllowed(this.valFixingColumnsAllowed);
        if (this.hasFixingRowsAllowed)
            instance.setFixingRowsAllowed(this.valFixingRowsAllowed);
        if (this.hasGrid)
            instance.setGrid(this.valGrid);
        if (this.hasHBarValue)
            instance.setHBarValue(this.valHBarValue);
        if (this.hasPlaceholder)
            instance.setPlaceholder(this.valPlaceholder);
        if (this.hasRowHeaderWidth)
            instance.setRowHeaderWidth(this.valRowHeaderWidth);
        if (this.hasShowColumnHeader)
            instance.setShowColumnHeader(this.valShowColumnHeader);
        if (this.hasShowRowHeader)
            instance.setShowRowHeader(this.valShowRowHeader);
        if (this.hasVBarValue)
            instance.setVBarValue(this.valVBarValue);
        if (this.bound1Editable)
            instance.editableProperty().bind(this.obsrv1Editable);
        if (this.bound2Editable)
            instance.editableProperty().bindBidirectional(this.obsrv2Editable);
        if (this.bound1Placeholder)
            instance.placeholderProperty().bind(this.obsrv1Placeholder);
        if (this.bound2Placeholder)
            instance.placeholderProperty().bindBidirectional(this.obsrv2Placeholder);
        if (this.bound1RowHeaderWidth)
            instance.rowHeaderWidthProperty().bind(this.obsrv1RowHeaderWidth);
        if (this.bound2RowHeaderWidth)
            instance.rowHeaderWidthProperty().bindBidirectional(this.obsrv2RowHeaderWidth);
        if (this.bound1ShowColumnHeader)
            instance.showColumnHeaderProperty().bind(this.obsrv1ShowColumnHeader);
        if (this.bound2ShowColumnHeader)
            instance.showColumnHeaderProperty().bindBidirectional(this.obsrv2ShowColumnHeader);
        if (this.bound1ShowRowHeader)
            instance.showRowHeaderProperty().bind(this.obsrv1ShowRowHeader);
        if (this.bound2ShowRowHeader)
            instance.showRowHeaderProperty().bindBidirectional(this.obsrv2ShowRowHeader);
    }

    /**
     * 設定集合屬性{@link SpreadsheetView#getColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B columns(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        this.hasColumns = true;
        this.valColumns = (java.util.Collection<org.controlsfx.control.spreadsheet.SpreadsheetColumn>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SpreadsheetView#getColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columns(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        this.hasColumns = true;
        this.valColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columnsAdd(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumns = true;
        if (this.valColumns == null)
            this.valColumns = new java.util.ArrayList<>(value.size());
        this.valColumns.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnsAdd(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumns = true;
        if (this.valColumns == null)
            this.valColumns = new java.util.ArrayList<>(value.length);
        this.valColumns.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getColumns}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columnsAddNonNull(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumns = true;
        if (this.valColumns == null)
            this.valColumns = new java.util.ArrayList<>(value.size());
        for (org.controlsfx.control.spreadsheet.SpreadsheetColumn i : value)
            if (i != null)
                this.valColumns.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getColumns}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnsAddNonNull(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasColumns = true;
        if (this.valColumns == null)
            this.valColumns = new java.util.ArrayList<>(value.length);
        for (org.controlsfx.control.spreadsheet.SpreadsheetColumn i : value)
            if (i != null)
                this.valColumns.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setEditable(boolean)}。
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
     * 設定集合屬性{@link SpreadsheetView#getFixedColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B fixedColumns(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        this.hasFixedColumns = true;
        this.valFixedColumns = (java.util.Collection<org.controlsfx.control.spreadsheet.SpreadsheetColumn>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SpreadsheetView#getFixedColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedColumns(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        this.hasFixedColumns = true;
        this.valFixedColumns = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B fixedColumnsAdd(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedColumns = true;
        if (this.valFixedColumns == null)
            this.valFixedColumns = new java.util.ArrayList<>(value.size());
        this.valFixedColumns.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedColumns}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedColumnsAdd(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedColumns = true;
        if (this.valFixedColumns == null)
            this.valFixedColumns = new java.util.ArrayList<>(value.length);
        this.valFixedColumns.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedColumns}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B fixedColumnsAddNonNull(java.util.Collection<? extends org.controlsfx.control.spreadsheet.SpreadsheetColumn> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedColumns = true;
        if (this.valFixedColumns == null)
            this.valFixedColumns = new java.util.ArrayList<>(value.size());
        for (org.controlsfx.control.spreadsheet.SpreadsheetColumn i : value)
            if (i != null)
                this.valFixedColumns.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedColumns}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedColumnsAddNonNull(org.controlsfx.control.spreadsheet.SpreadsheetColumn... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedColumns = true;
        if (this.valFixedColumns == null)
            this.valFixedColumns = new java.util.ArrayList<>(value.length);
        for (org.controlsfx.control.spreadsheet.SpreadsheetColumn i : value)
            if (i != null)
                this.valFixedColumns.add(i);
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SpreadsheetView#getFixedRows}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B fixedRows(java.util.Collection<? extends java.lang.Integer> value)
    {
        this.hasFixedRows = true;
        this.valFixedRows = (java.util.Collection<java.lang.Integer>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link SpreadsheetView#getFixedRows}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedRows(java.lang.Integer... value)
    {
        this.hasFixedRows = true;
        this.valFixedRows = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedRows}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B fixedRowsAdd(java.util.Collection<? extends java.lang.Integer> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedRows = true;
        if (this.valFixedRows == null)
            this.valFixedRows = new java.util.ArrayList<>(value.size());
        this.valFixedRows.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedRows}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedRowsAdd(java.lang.Integer... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedRows = true;
        if (this.valFixedRows == null)
            this.valFixedRows = new java.util.ArrayList<>(value.length);
        this.valFixedRows.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedRows}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B fixedRowsAddNonNull(java.util.Collection<? extends java.lang.Integer> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedRows = true;
        if (this.valFixedRows == null)
            this.valFixedRows = new java.util.ArrayList<>(value.size());
        for (java.lang.Integer i : value)
            if (i != null)
                this.valFixedRows.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link SpreadsheetView#getFixedRows}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B fixedRowsAddNonNull(java.lang.Integer... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasFixedRows = true;
        if (this.valFixedRows == null)
            this.valFixedRows = new java.util.ArrayList<>(value.length);
        for (java.lang.Integer i : value)
            if (i != null)
                this.valFixedRows.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setFixingColumnsAllowed(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixingColumnsAllowed(boolean value)
    {
        this.hasFixingColumnsAllowed = true;
        this.valFixingColumnsAllowed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setFixingRowsAllowed(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixingRowsAllowed(boolean value)
    {
        this.hasFixingRowsAllowed = true;
        this.valFixingRowsAllowed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setGrid(org.controlsfx.control.spreadsheet.Grid)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B grid(org.controlsfx.control.spreadsheet.Grid value)
    {
        this.hasGrid = true;
        this.valGrid = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setHBarValue(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hBarValue(double value)
    {
        this.hasHBarValue = true;
        this.valHBarValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setPlaceholder(javafx.scene.Node)}。
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
     * 設定屬性{@link SpreadsheetView#setRowHeaderWidth(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowHeaderWidth(double value)
    {
        this.hasRowHeaderWidth = true;
        this.valRowHeaderWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setShowColumnHeader(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showColumnHeader(boolean value)
    {
        this.hasShowColumnHeader = true;
        this.valShowColumnHeader = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setShowRowHeader(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showRowHeader(boolean value)
    {
        this.hasShowRowHeader = true;
        this.valShowRowHeader = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#setVBarValue(double)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vBarValue(double value)
    {
        this.hasVBarValue = true;
        this.valVBarValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#editableProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindEditable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Editable = true;
        this.obsrv1Editable = source;
        this.bound2Editable = false;
        this.obsrv2Editable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#editableProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalEditable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Editable = false;
        this.obsrv1Editable = null;
        this.bound2Editable = true;
        this.obsrv2Editable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#placeholderProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPlaceholder(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Placeholder = true;
        this.obsrv1Placeholder = source;
        this.bound2Placeholder = false;
        this.obsrv2Placeholder = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#placeholderProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPlaceholder(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Placeholder = false;
        this.obsrv1Placeholder = null;
        this.bound2Placeholder = true;
        this.obsrv2Placeholder = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#rowHeaderWidthProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRowHeaderWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RowHeaderWidth = true;
        this.obsrv1RowHeaderWidth = source;
        this.bound2RowHeaderWidth = false;
        this.obsrv2RowHeaderWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#rowHeaderWidthProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalRowHeaderWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1RowHeaderWidth = false;
        this.obsrv1RowHeaderWidth = null;
        this.bound2RowHeaderWidth = true;
        this.obsrv2RowHeaderWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#showColumnHeaderProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowColumnHeader(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowColumnHeader = true;
        this.obsrv1ShowColumnHeader = source;
        this.bound2ShowColumnHeader = false;
        this.obsrv2ShowColumnHeader = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#showColumnHeaderProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowColumnHeader(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowColumnHeader = false;
        this.obsrv1ShowColumnHeader = null;
        this.bound2ShowColumnHeader = true;
        this.obsrv2ShowColumnHeader = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#showRowHeaderProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowRowHeader(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowRowHeader = true;
        this.obsrv1ShowRowHeader = source;
        this.bound2ShowRowHeader = false;
        this.obsrv2ShowRowHeader = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetView#showRowHeaderProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowRowHeader(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowRowHeader = false;
        this.obsrv1ShowRowHeader = null;
        this.bound2ShowRowHeader = true;
        this.obsrv2ShowRowHeader = source;
        return (B) this;
    }

    /**
     * 建構{@link SpreadsheetView}物件。
     *
     * @return 新的{@link SpreadsheetView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SpreadsheetView build()
    {
        SpreadsheetView instance = new SpreadsheetView();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpreadsheetView}物件。
     *
     * @return 新的{@link SpreadsheetView}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetView build(org.controlsfx.control.spreadsheet.Grid arg0)
    {
        SpreadsheetView instance = new SpreadsheetView(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
