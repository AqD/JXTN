// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Tab}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Tab})
 * @param <B> 建構器本身的型態(需繼承{@link TabMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TabMaker<Z extends Tab, B extends TabMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements TabMakerExt<Z, B>
{

    private boolean hasClosable;
    private boolean valClosable;

    private boolean hasContent;
    private javafx.scene.Node valContent;

    private boolean hasContextMenu;
    private javafx.scene.control.ContextMenu valContextMenu;

    private boolean hasDisable;
    private boolean valDisable;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasId;
    private java.lang.String valId;

    private boolean hasOnCloseRequest;
    private javafx.event.EventHandler<javafx.event.Event> valOnCloseRequest;

    private boolean hasOnClosed;
    private javafx.event.EventHandler<javafx.event.Event> valOnClosed;

    private boolean hasOnSelectionChanged;
    private javafx.event.EventHandler<javafx.event.Event> valOnSelectionChanged;

    private boolean hasStyle;
    private java.lang.String valStyle;

    private boolean hasStyleClass;
    private java.util.Collection<java.lang.String> valStyleClass;

    private boolean hasText;
    private java.lang.String valText;

    private boolean hasTooltip;
    private javafx.scene.control.Tooltip valTooltip;

    private boolean hasUserData;
    private java.lang.Object valUserData;

    private boolean bound1Closable;
    private boolean bound2Closable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Closable;
    private javafx.beans.property.Property<Boolean> obsrv2Closable;

    private boolean bound1Content;
    private boolean bound2Content;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Content;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Content;

    private boolean bound1ContextMenu;
    private boolean bound2ContextMenu;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContextMenu> obsrv1ContextMenu;
    private javafx.beans.property.Property<javafx.scene.control.ContextMenu> obsrv2ContextMenu;

    private boolean bound1Disable;
    private boolean bound2Disable;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Disable;
    private javafx.beans.property.Property<Boolean> obsrv2Disable;

    private boolean bound1Graphic;
    private boolean bound2Graphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Graphic;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Graphic;

    private boolean bound1Id;
    private boolean bound2Id;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Id;
    private javafx.beans.property.Property<String> obsrv2Id;

    private boolean bound1OnCloseRequest;
    private boolean bound2OnCloseRequest;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnCloseRequest;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnCloseRequest;

    private boolean bound1OnClosed;
    private boolean bound2OnClosed;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnClosed;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnClosed;

    private boolean bound1OnSelectionChanged;
    private boolean bound2OnSelectionChanged;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnSelectionChanged;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnSelectionChanged;

    private boolean bound1Style;
    private boolean bound2Style;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Style;
    private javafx.beans.property.Property<String> obsrv2Style;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    private boolean bound1Tooltip;
    private boolean bound2Tooltip;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.Tooltip> obsrv1Tooltip;
    private javafx.beans.property.Property<javafx.scene.control.Tooltip> obsrv2Tooltip;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasClosable)
            instance.setClosable(this.valClosable);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasContextMenu)
            instance.setContextMenu(this.valContextMenu);
        if (this.hasDisable)
            instance.setDisable(this.valDisable);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasId)
            instance.setId(this.valId);
        if (this.hasOnCloseRequest)
            instance.setOnCloseRequest(this.valOnCloseRequest);
        if (this.hasOnClosed)
            instance.setOnClosed(this.valOnClosed);
        if (this.hasOnSelectionChanged)
            instance.setOnSelectionChanged(this.valOnSelectionChanged);
        if (this.hasStyle)
            instance.setStyle(this.valStyle);
        if (this.hasStyleClass)
            instance.getStyleClass().addAll(this.valStyleClass);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.hasTooltip)
            instance.setTooltip(this.valTooltip);
        if (this.hasUserData)
            instance.setUserData(this.valUserData);
        if (this.bound1Closable)
            instance.closableProperty().bind(this.obsrv1Closable);
        if (this.bound2Closable)
            instance.closableProperty().bindBidirectional(this.obsrv2Closable);
        if (this.bound1Content)
            instance.contentProperty().bind(this.obsrv1Content);
        if (this.bound2Content)
            instance.contentProperty().bindBidirectional(this.obsrv2Content);
        if (this.bound1ContextMenu)
            instance.contextMenuProperty().bind(this.obsrv1ContextMenu);
        if (this.bound2ContextMenu)
            instance.contextMenuProperty().bindBidirectional(this.obsrv2ContextMenu);
        if (this.bound1Disable)
            instance.disableProperty().bind(this.obsrv1Disable);
        if (this.bound2Disable)
            instance.disableProperty().bindBidirectional(this.obsrv2Disable);
        if (this.bound1Graphic)
            instance.graphicProperty().bind(this.obsrv1Graphic);
        if (this.bound2Graphic)
            instance.graphicProperty().bindBidirectional(this.obsrv2Graphic);
        if (this.bound1Id)
            instance.idProperty().bind(this.obsrv1Id);
        if (this.bound2Id)
            instance.idProperty().bindBidirectional(this.obsrv2Id);
        if (this.bound1OnCloseRequest)
            instance.onCloseRequestProperty().bind(this.obsrv1OnCloseRequest);
        if (this.bound2OnCloseRequest)
            instance.onCloseRequestProperty().bindBidirectional(this.obsrv2OnCloseRequest);
        if (this.bound1OnClosed)
            instance.onClosedProperty().bind(this.obsrv1OnClosed);
        if (this.bound2OnClosed)
            instance.onClosedProperty().bindBidirectional(this.obsrv2OnClosed);
        if (this.bound1OnSelectionChanged)
            instance.onSelectionChangedProperty().bind(this.obsrv1OnSelectionChanged);
        if (this.bound2OnSelectionChanged)
            instance.onSelectionChangedProperty().bindBidirectional(this.obsrv2OnSelectionChanged);
        if (this.bound1Style)
            instance.styleProperty().bind(this.obsrv1Style);
        if (this.bound2Style)
            instance.styleProperty().bindBidirectional(this.obsrv2Style);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
        if (this.bound1Tooltip)
            instance.tooltipProperty().bind(this.obsrv1Tooltip);
        if (this.bound2Tooltip)
            instance.tooltipProperty().bindBidirectional(this.obsrv2Tooltip);
    }

    /**
     * 設定屬性{@link Tab#setClosable(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B closable(boolean value)
    {
        this.hasClosable = true;
        this.valClosable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setContent(javafx.scene.Node)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B content(javafx.scene.Node value)
    {
        this.hasContent = true;
        this.valContent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setContextMenu(javafx.scene.control.ContextMenu)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B contextMenu(javafx.scene.control.ContextMenu value)
    {
        this.hasContextMenu = true;
        this.valContextMenu = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setDisable(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B disable(boolean value)
    {
        this.hasDisable = true;
        this.valDisable = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setGraphic(javafx.scene.Node)}。
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
     * 設定屬性{@link Tab#setId(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B id(java.lang.String value)
    {
        this.hasId = true;
        this.valId = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setOnCloseRequest(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onCloseRequest(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnCloseRequest = true;
        this.valOnCloseRequest = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setOnClosed(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onClosed(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnClosed = true;
        this.valOnClosed = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setOnSelectionChanged(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onSelectionChanged(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnSelectionChanged = true;
        this.valOnSelectionChanged = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setStyle(java.lang.String)}。
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
     * 設定集合屬性{@link Tab#getStyleClass}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B styleClass(java.util.Collection<? extends java.lang.String> value)
    {
        this.hasStyleClass = true;
        this.valStyleClass = (java.util.Collection<java.lang.String>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Tab#getStyleClass}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B styleClass(java.lang.String... value)
    {
        this.hasStyleClass = true;
        this.valStyleClass = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Tab#getStyleClass}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B styleClassAdd(java.util.Collection<? extends java.lang.String> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.size());
        this.valStyleClass.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Tab#getStyleClass}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B styleClassAdd(java.lang.String... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.length);
        this.valStyleClass.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Tab#getStyleClass}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B styleClassAddNonNull(java.util.Collection<? extends java.lang.String> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.size());
        for (java.lang.String i : value)
            if (i != null)
                this.valStyleClass.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Tab#getStyleClass}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B styleClassAddNonNull(java.lang.String... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasStyleClass = true;
        if (this.valStyleClass == null)
            this.valStyleClass = new java.util.ArrayList<>(value.length);
        for (java.lang.String i : value)
            if (i != null)
                this.valStyleClass.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setText(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B text(java.lang.String value)
    {
        this.hasText = true;
        this.valText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setTooltip(javafx.scene.control.Tooltip)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tooltip(javafx.scene.control.Tooltip value)
    {
        this.hasTooltip = true;
        this.valTooltip = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#setUserData(java.lang.Object)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userData(java.lang.Object value)
    {
        this.hasUserData = true;
        this.valUserData = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#closableProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindClosable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Closable = true;
        this.obsrv1Closable = source;
        this.bound2Closable = false;
        this.obsrv2Closable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#closableProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalClosable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Closable = false;
        this.obsrv1Closable = null;
        this.bound2Closable = true;
        this.obsrv2Closable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#contentProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContent(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Content = true;
        this.obsrv1Content = source;
        this.bound2Content = false;
        this.obsrv2Content = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#contentProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContent(javafx.beans.property.Property<javafx.scene.Node> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Content = false;
        this.obsrv1Content = null;
        this.bound2Content = true;
        this.obsrv2Content = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#contextMenuProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContextMenu(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContextMenu> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContextMenu = true;
        this.obsrv1ContextMenu = source;
        this.bound2ContextMenu = false;
        this.obsrv2ContextMenu = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#contextMenuProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContextMenu(javafx.beans.property.Property<javafx.scene.control.ContextMenu> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ContextMenu = false;
        this.obsrv1ContextMenu = null;
        this.bound2ContextMenu = true;
        this.obsrv2ContextMenu = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#disableProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindDisable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Disable = true;
        this.obsrv1Disable = source;
        this.bound2Disable = false;
        this.obsrv2Disable = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#disableProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalDisable(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Disable = false;
        this.obsrv1Disable = null;
        this.bound2Disable = true;
        this.obsrv2Disable = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#graphicProperty}的連結。
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
     * 設定屬性{@link Tab#graphicProperty}的雙向連結。
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
     * 設定屬性{@link Tab#idProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindId(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Id = true;
        this.obsrv1Id = source;
        this.bound2Id = false;
        this.obsrv2Id = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#idProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalId(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Id = false;
        this.obsrv1Id = null;
        this.bound2Id = true;
        this.obsrv2Id = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onCloseRequestProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnCloseRequest(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnCloseRequest = true;
        this.obsrv1OnCloseRequest = source;
        this.bound2OnCloseRequest = false;
        this.obsrv2OnCloseRequest = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onCloseRequestProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnCloseRequest(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnCloseRequest = false;
        this.obsrv1OnCloseRequest = null;
        this.bound2OnCloseRequest = true;
        this.obsrv2OnCloseRequest = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onClosedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnClosed(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnClosed = true;
        this.obsrv1OnClosed = source;
        this.bound2OnClosed = false;
        this.obsrv2OnClosed = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onClosedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnClosed(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnClosed = false;
        this.obsrv1OnClosed = null;
        this.bound2OnClosed = true;
        this.obsrv2OnClosed = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onSelectionChangedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnSelectionChanged(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnSelectionChanged = true;
        this.obsrv1OnSelectionChanged = source;
        this.bound2OnSelectionChanged = false;
        this.obsrv2OnSelectionChanged = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#onSelectionChangedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnSelectionChanged(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnSelectionChanged = false;
        this.obsrv1OnSelectionChanged = null;
        this.bound2OnSelectionChanged = true;
        this.obsrv2OnSelectionChanged = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#styleProperty}的連結。
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
     * 設定屬性{@link Tab#styleProperty}的雙向連結。
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
     * 設定屬性{@link Tab#textProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = true;
        this.obsrv1Text = source;
        this.bound2Text = false;
        this.obsrv2Text = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#textProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalText(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = false;
        this.obsrv1Text = null;
        this.bound2Text = true;
        this.obsrv2Text = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#tooltipProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTooltip(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Tooltip> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Tooltip = true;
        this.obsrv1Tooltip = source;
        this.bound2Tooltip = false;
        this.obsrv2Tooltip = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tab#tooltipProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTooltip(javafx.beans.property.Property<javafx.scene.control.Tooltip> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Tooltip = false;
        this.obsrv1Tooltip = null;
        this.bound2Tooltip = true;
        this.obsrv2Tooltip = source;
        return (B) this;
    }

    /**
     * 建構{@link Tab}物件。
     *
     * @return 新的{@link Tab}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Tab build()
    {
        Tab instance = new Tab();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Tab}物件。
     *
     * @return 新的{@link Tab}物件實體
     */
    @SuppressWarnings("unchecked")
    public Tab build(java.lang.String arg0)
    {
        Tab instance = new Tab(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Tab}物件。
     *
     * @return 新的{@link Tab}物件實體
     */
    @SuppressWarnings("unchecked")
    public Tab build(java.lang.String arg0, javafx.scene.Node arg1)
    {
        Tab instance = new Tab(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
