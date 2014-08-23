// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link GridBase}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridBaseBuilder<Z extends GridBase, B extends GridBaseBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasColumnHeaders;
    protected java.util.Collection<java.lang.String> valColumnHeaders;

    protected boolean hasLocked;
    protected java.lang.Boolean valLocked;

    protected boolean hasRowHeaders;
    protected java.util.Collection<java.lang.String> valRowHeaders;

    protected boolean hasRowHeightCallback;
    protected javafx.util.Callback<java.lang.Integer, java.lang.Double> valRowHeightCallback;

    protected boolean hasRows;
    protected java.util.Collection<javafx.collections.ObservableList<org.controlsfx.control.spreadsheet.SpreadsheetCell>> valRows;

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
    public B columnHeaders(java.util.Collection<java.lang.String> value)
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
     * 設定屬性{@link GridBase#setLocked}
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
    public B rowHeaders(java.util.Collection<java.lang.String> value)
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
     * 設定屬性{@link GridBase#setRowHeightCallback}
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
     * 設定屬性{@link GridBase#setRows}
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
