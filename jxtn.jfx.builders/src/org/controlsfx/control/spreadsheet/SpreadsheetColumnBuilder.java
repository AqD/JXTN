// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetColumn}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetColumnBuilder<Z extends SpreadsheetColumn, B extends SpreadsheetColumnBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasFixed;
    protected boolean valFixed;

    protected boolean hasPrefWidth;
    protected double valPrefWidth;

    protected boolean hasResizable;
    protected boolean valResizable;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFixed)
            instance.setFixed(this.valFixed);
        if (this.hasPrefWidth)
            instance.setPrefWidth(this.valPrefWidth);
        if (this.hasResizable)
            instance.setResizable(this.valResizable);
    }

    /**
     * 設定屬性{@link SpreadsheetColumn#setFixed(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fixed(boolean value)
    {
        this.hasFixed = true;
        this.valFixed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetColumn#setPrefWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefWidth(double value)
    {
        this.hasPrefWidth = true;
        this.valPrefWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetColumn#setResizable(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B resizable(boolean value)
    {
        this.hasResizable = true;
        this.valResizable = value;
        return (B) this;
    }
}
