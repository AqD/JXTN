// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetCellBase}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetCellBase})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetCellBaseMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetCellBaseMaker<Z extends SpreadsheetCellBase, B extends SpreadsheetCellBaseMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements SpreadsheetCellBaseMakerExt<Z, B>
{

    private boolean hasColumnSpan;
    private int valColumnSpan;

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasFormat;
    private java.lang.String valFormat;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasItem;
    private java.lang.Object valItem;

    private boolean hasRowSpan;
    private int valRowSpan;

    private boolean hasStyle;
    private java.lang.String valStyle;

    private boolean hasTooltip;
    private java.lang.String valTooltip;

    private boolean hasWrapText;
    private boolean valWrapText;

    private boolean bound1Format;
    private boolean bound2Format;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Format;
    private javafx.beans.property.Property<String> obsrv2Format;

    private boolean bound1Graphic;
    private boolean bound2Graphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Graphic;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Graphic;

    private boolean bound1Item;
    private boolean bound2Item;
    private javafx.beans.value.ObservableValue<? extends java.lang.Object> obsrv1Item;
    private javafx.beans.property.Property<java.lang.Object> obsrv2Item;

    private boolean bound1Style;
    private boolean bound2Style;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Style;
    private javafx.beans.property.Property<String> obsrv2Style;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasColumnSpan)
            instance.setColumnSpan(this.valColumnSpan);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasFormat)
            instance.setFormat(this.valFormat);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasItem)
            instance.setItem(this.valItem);
        if (this.hasRowSpan)
            instance.setRowSpan(this.valRowSpan);
        if (this.hasStyle)
            instance.setStyle(this.valStyle);
        if (this.hasTooltip)
            instance.setTooltip(this.valTooltip);
        if (this.hasWrapText)
            instance.setWrapText(this.valWrapText);
        if (this.bound1Format)
            instance.formatProperty().bind(this.obsrv1Format);
        if (this.bound2Format)
            instance.formatProperty().bindBidirectional(this.obsrv2Format);
        if (this.bound1Graphic)
            instance.graphicProperty().bind(this.obsrv1Graphic);
        if (this.bound2Graphic)
            instance.graphicProperty().bindBidirectional(this.obsrv2Graphic);
        if (this.bound1Item)
            instance.itemProperty().bind(this.obsrv1Item);
        if (this.bound2Item)
            instance.itemProperty().bindBidirectional(this.obsrv2Item);
        if (this.bound1Style)
            instance.styleProperty().bind(this.obsrv1Style);
        if (this.bound2Style)
            instance.styleProperty().bindBidirectional(this.obsrv2Style);
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setColumnSpan(int)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B columnSpan(int value)
    {
        this.hasColumnSpan = true;
        this.valColumnSpan = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setEditable(boolean)}。
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
     * 設定屬性{@link SpreadsheetCellBase#setFormat(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B format(java.lang.String value)
    {
        this.hasFormat = true;
        this.valFormat = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setGraphic(javafx.scene.Node)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node value)
    {
        this.hasGraphic = true;
        this.valGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setItem(java.lang.Object)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B item(java.lang.Object value)
    {
        this.hasItem = true;
        this.valItem = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setRowSpan(int)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowSpan(int value)
    {
        this.hasRowSpan = true;
        this.valRowSpan = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setStyle(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B style(java.lang.String value)
    {
        this.hasStyle = true;
        this.valStyle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setTooltip(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tooltip(java.lang.String value)
    {
        this.hasTooltip = true;
        this.valTooltip = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#setWrapText(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B wrapText(boolean value)
    {
        this.hasWrapText = true;
        this.valWrapText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#formatProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFormat(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Format = true;
        this.obsrv1Format = source;
        this.bound2Format = false;
        this.obsrv2Format = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#formatProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFormat(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Format = false;
        this.obsrv1Format = null;
        this.bound2Format = true;
        this.obsrv2Format = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#graphicProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = true;
        this.obsrv1Graphic = source;
        this.bound2Graphic = false;
        this.obsrv2Graphic = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#graphicProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalGraphic(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Graphic = false;
        this.obsrv1Graphic = null;
        this.bound2Graphic = true;
        this.obsrv2Graphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#itemProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindItem(javafx.beans.value.ObservableValue<? extends java.lang.Object> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Item = true;
        this.obsrv1Item = source;
        this.bound2Item = false;
        this.obsrv2Item = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#itemProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalItem(javafx.beans.property.Property<java.lang.Object> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Item = false;
        this.obsrv1Item = null;
        this.bound2Item = true;
        this.obsrv2Item = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#styleProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStyle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Style = true;
        this.obsrv1Style = source;
        this.bound2Style = false;
        this.obsrv2Style = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link SpreadsheetCellBase#styleProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStyle(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Style = false;
        this.obsrv1Style = null;
        this.bound2Style = true;
        this.obsrv2Style = source;
        return (B) this;
    }

    /**
     * 建構{@link SpreadsheetCellBase}物件。
     *
     * @return 新的{@link SpreadsheetCellBase}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellBase build(int arg0, int arg1, int arg2, int arg3)
    {
        SpreadsheetCellBase instance = new SpreadsheetCellBase(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpreadsheetCellBase}物件。
     *
     * @return 新的{@link SpreadsheetCellBase}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellBase build(int arg0, int arg1, int arg2, int arg3, org.controlsfx.control.spreadsheet.SpreadsheetCellType<?> arg4)
    {
        SpreadsheetCellBase instance = new SpreadsheetCellBase(arg0, arg1, arg2, arg3, arg4);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
