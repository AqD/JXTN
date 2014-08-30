// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link GridBase}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GridBase})
 * @param <B> 建構器本身的型態(需繼承{@link GridBaseBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridBaseBuilder<Z extends GridBase, B extends GridBaseBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasColumnHeaders;
    private java.util.Collection<java.lang.String> valColumnHeaders;

    private boolean hasLocked;
    private java.lang.Boolean valLocked;

    private boolean hasRowHeaders;
    private java.util.Collection<java.lang.String> valRowHeaders;

    private boolean hasRowHeightCallback;
    private javafx.util.Callback<java.lang.Integer, java.lang.Double> valRowHeightCallback;

    private boolean hasRows;
    private java.util.Collection<javafx.collections.ObservableList<org.controlsfx.control.spreadsheet.SpreadsheetCell>> valRows;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasColumnHeaders)
            instance.getColumnHeaders().setAll(this.valColumnHeaders);
        if (this.hasLocked)
            instance.setLocked(this.valLocked);
        if (this.hasRowHeaders)
            instance.getRowHeaders().setAll(this.valRowHeaders);
        if (this.hasRowHeightCallback)
            instance.setRowHeightCallback(this.valRowHeightCallback);
        if (this.hasRows)
            instance.setRows(this.valRows);
    }

    /**
     * 設定集合屬性{@link GridBase#getColumnHeaders}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B columnHeaders(java.util.Collection<java.lang.String> value)
    {
        this.hasColumnHeaders = true;
        this.valColumnHeaders = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link GridBase#getColumnHeaders}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B columnHeaders(java.lang.String... value)
    {
        this.hasColumnHeaders = true;
        this.valColumnHeaders = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link GridBase#setLocked(java.lang.Boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B locked(java.lang.Boolean value)
    {
        this.hasLocked = true;
        this.valLocked = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link GridBase#getRowHeaders}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B rowHeaders(java.util.Collection<java.lang.String> value)
    {
        this.hasRowHeaders = true;
        this.valRowHeaders = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link GridBase#getRowHeaders}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B rowHeaders(java.lang.String... value)
    {
        this.hasRowHeaders = true;
        this.valRowHeaders = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link GridBase#setRowHeightCallback(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowHeightCallback(javafx.util.Callback<java.lang.Integer, java.lang.Double> value)
    {
        this.hasRowHeightCallback = true;
        this.valRowHeightCallback = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link GridBase#setRows(java.util.Collection)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rows(java.util.Collection<javafx.collections.ObservableList<org.controlsfx.control.spreadsheet.SpreadsheetCell>> value)
    {
        this.hasRows = true;
        this.valRows = value;
        return (B) this;
    }

    /**
     * 建構{@link GridBase}物件
     *
     * @return 新的{@link GridBase}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GridBase build()
    {
        GridBase instance = new GridBase();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
