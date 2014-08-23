// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link PropertySheet}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PropertySheetBuilder<Z extends PropertySheet, B extends PropertySheetBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasItems;
    protected java.util.Collection<org.controlsfx.control.PropertySheet.Item> valItems;

    protected boolean hasMode;
    protected org.controlsfx.control.PropertySheet.Mode valMode;

    protected boolean hasModeSwitcherVisible;
    protected boolean valModeSwitcherVisible;

    protected boolean hasPropertyEditorFactory;
    protected javafx.util.Callback<org.controlsfx.control.PropertySheet.Item, org.controlsfx.property.editor.PropertyEditor<?>> valPropertyEditorFactory;

    protected boolean hasSearchBoxVisible;
    protected boolean valSearchBoxVisible;

    protected boolean hasTitleFilter;
    protected java.lang.String valTitleFilter;

    protected boolean boundMode;
    protected javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PropertySheet.Mode> obsrvMode;

    protected boolean boundModeSwitcherVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvModeSwitcherVisible;

    protected boolean boundSearchBoxVisible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSearchBoxVisible;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.hasMode)
            instance.setMode(this.valMode);
        if (this.hasModeSwitcherVisible)
            instance.setModeSwitcherVisible(this.valModeSwitcherVisible);
        if (this.hasPropertyEditorFactory)
            instance.setPropertyEditorFactory(this.valPropertyEditorFactory);
        if (this.hasSearchBoxVisible)
            instance.setSearchBoxVisible(this.valSearchBoxVisible);
        if (this.hasTitleFilter)
            instance.setTitleFilter(this.valTitleFilter);
        if (this.boundMode)
            instance.modeProperty().bind(this.obsrvMode);
        if (this.boundModeSwitcherVisible)
            instance.modeSwitcherVisibleProperty().bind(this.obsrvModeSwitcherVisible);
        if (this.boundSearchBoxVisible)
            instance.searchBoxVisibleProperty().bind(this.obsrvSearchBoxVisible);
    }

    /**
     * 設定集合屬性{@link PropertySheet#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(java.util.Collection<org.controlsfx.control.PropertySheet.Item> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link PropertySheet#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(org.controlsfx.control.PropertySheet.Item... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setMode}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mode(org.controlsfx.control.PropertySheet.Mode value)
    {
        this.hasMode = true;
        this.valMode = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setModeSwitcherVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B modeSwitcherVisible(boolean value)
    {
        this.hasModeSwitcherVisible = true;
        this.valModeSwitcherVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setPropertyEditorFactory}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B propertyEditorFactory(javafx.util.Callback<org.controlsfx.control.PropertySheet.Item, org.controlsfx.property.editor.PropertyEditor<?>> value)
    {
        this.hasPropertyEditorFactory = true;
        this.valPropertyEditorFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setSearchBoxVisible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B searchBoxVisible(boolean value)
    {
        this.hasSearchBoxVisible = true;
        this.valSearchBoxVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#setTitleFilter}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B titleFilter(java.lang.String value)
    {
        this.hasTitleFilter = true;
        this.valTitleFilter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMode(javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PropertySheet.Mode> source)
    {
        assert (source != null);
        this.boundMode = true;
        this.obsrvMode = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#modeSwitcherVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindModeSwitcherVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundModeSwitcherVisible = true;
        this.obsrvModeSwitcherVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PropertySheet#searchBoxVisibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSearchBoxVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSearchBoxVisible = true;
        this.obsrvSearchBoxVisible = source;
        return (B) this;
    }

    /**
     * 建構{@link PropertySheet}物件
     *
     * @return 新的{@link PropertySheet}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PropertySheet build()
    {
        PropertySheet instance = new PropertySheet();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
