// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link MenuButton}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MenuButton})
 * @param <B> 建構器本身的型態(需繼承{@link MenuButtonMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MenuButtonMaker<Z extends MenuButton, B extends MenuButtonMaker<Z, B>>
        extends javafx.scene.control.ButtonBaseMaker<Z, B>
        implements MenuButtonMakerExt<Z, B>
{

    private boolean hasItems;
    private java.util.Collection<javafx.scene.control.MenuItem> valItems;

    private boolean hasPopupSide;
    private javafx.geometry.Side valPopupSide;

    private boolean bound1PopupSide;
    private boolean bound2PopupSide;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrv1PopupSide;
    private javafx.beans.property.Property<javafx.geometry.Side> obsrv2PopupSide;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().addAll(this.valItems);
        if (this.hasPopupSide)
            instance.setPopupSide(this.valPopupSide);
        if (this.bound1PopupSide)
            instance.popupSideProperty().bind(this.obsrv1PopupSide);
        if (this.bound2PopupSide)
            instance.popupSideProperty().bindBidirectional(this.obsrv2PopupSide);
    }

    /**
     * 設定集合屬性{@link MenuButton#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B items(java.util.Collection<? extends javafx.scene.control.MenuItem> value)
    {
        this.hasItems = true;
        this.valItems = (java.util.Collection<javafx.scene.control.MenuItem>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link MenuButton#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(javafx.scene.control.MenuItem... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuButton#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAdd(java.util.Collection<? extends javafx.scene.control.MenuItem> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        this.valItems.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuButton#getItems}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAdd(javafx.scene.control.MenuItem... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        this.valItems.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuButton#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(java.util.Collection<? extends javafx.scene.control.MenuItem> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.size());
        for (javafx.scene.control.MenuItem i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link MenuButton#getItems}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B itemsAddNonNull(javafx.scene.control.MenuItem... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasItems = true;
        if (this.valItems == null)
            this.valItems = new java.util.ArrayList<>(value.length);
        for (javafx.scene.control.MenuItem i : value)
            if (i != null)
                this.valItems.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuButton#setPopupSide(javafx.geometry.Side)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B popupSide(javafx.geometry.Side value)
    {
        this.hasPopupSide = true;
        this.valPopupSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuButton#popupSideProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPopupSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PopupSide = true;
        this.obsrv1PopupSide = source;
        this.bound2PopupSide = false;
        this.obsrv2PopupSide = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link MenuButton#popupSideProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPopupSide(javafx.beans.property.Property<javafx.geometry.Side> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PopupSide = false;
        this.obsrv1PopupSide = null;
        this.bound2PopupSide = true;
        this.obsrv2PopupSide = source;
        return (B) this;
    }

    /**
     * 建構{@link MenuButton}物件。
     *
     * @return 新的{@link MenuButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MenuButton build()
    {
        MenuButton instance = new MenuButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link MenuButton}物件。
     *
     * @return 新的{@link MenuButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public MenuButton build(java.lang.String arg0)
    {
        MenuButton instance = new MenuButton(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link MenuButton}物件。
     *
     * @return 新的{@link MenuButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public MenuButton build(java.lang.String arg0, javafx.scene.Node arg1)
    {
        MenuButton instance = new MenuButton(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link MenuButton}物件。
     *
     * @return 新的{@link MenuButton}物件實體
     */
    @SuppressWarnings("unchecked")
    public MenuButton build(java.lang.String arg0, javafx.scene.Node arg1, javafx.scene.control.MenuItem[] arg2)
    {
        MenuButton instance = new MenuButton(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
