// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link NotificationPane}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link NotificationPane})
 * @param <B> 建構器本身的型態(需繼承{@link NotificationPaneMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class NotificationPaneMaker<Z extends NotificationPane, B extends NotificationPaneMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements NotificationPaneMakerExt<Z, B>
{

    private boolean hasActions;
    private java.util.Collection<org.controlsfx.control.action.Action> valActions;

    private boolean hasCloseButtonVisible;
    private boolean valCloseButtonVisible;

    private boolean hasContent;
    private javafx.scene.Node valContent;

    private boolean hasGraphic;
    private javafx.scene.Node valGraphic;

    private boolean hasOnHidden;
    private javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    private boolean hasOnHiding;
    private javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    private boolean hasOnShowing;
    private javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    private boolean hasOnShown;
    private javafx.event.EventHandler<javafx.event.Event> valOnShown;

    private boolean hasShowFromTop;
    private boolean valShowFromTop;

    private boolean hasText;
    private java.lang.String valText;

    private boolean bound1CloseButtonVisible;
    private boolean bound2CloseButtonVisible;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1CloseButtonVisible;
    private javafx.beans.property.Property<Boolean> obsrv2CloseButtonVisible;

    private boolean bound1Content;
    private boolean bound2Content;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Content;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Content;

    private boolean bound1Graphic;
    private boolean bound2Graphic;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrv1Graphic;
    private javafx.beans.property.Property<javafx.scene.Node> obsrv2Graphic;

    private boolean bound1OnHidden;
    private boolean bound2OnHidden;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnHidden;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnHidden;

    private boolean bound1OnHiding;
    private boolean bound2OnHiding;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnHiding;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnHiding;

    private boolean bound1OnShowing;
    private boolean bound2OnShowing;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnShowing;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnShowing;

    private boolean bound1OnShown;
    private boolean bound2OnShown;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrv1OnShown;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> obsrv2OnShown;

    private boolean bound1ShowFromTop;
    private boolean bound2ShowFromTop;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1ShowFromTop;
    private javafx.beans.property.Property<Boolean> obsrv2ShowFromTop;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasActions)
            instance.getActions().addAll(this.valActions);
        if (this.hasCloseButtonVisible)
            instance.setCloseButtonVisible(this.valCloseButtonVisible);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.hasShowFromTop)
            instance.setShowFromTop(this.valShowFromTop);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.bound1CloseButtonVisible)
            instance.closeButtonVisibleProperty().bind(this.obsrv1CloseButtonVisible);
        if (this.bound2CloseButtonVisible)
            instance.closeButtonVisibleProperty().bindBidirectional(this.obsrv2CloseButtonVisible);
        if (this.bound1Content)
            instance.contentProperty().bind(this.obsrv1Content);
        if (this.bound2Content)
            instance.contentProperty().bindBidirectional(this.obsrv2Content);
        if (this.bound1Graphic)
            instance.graphicProperty().bind(this.obsrv1Graphic);
        if (this.bound2Graphic)
            instance.graphicProperty().bindBidirectional(this.obsrv2Graphic);
        if (this.bound1OnHidden)
            instance.onHiddenProperty().bind(this.obsrv1OnHidden);
        if (this.bound2OnHidden)
            instance.onHiddenProperty().bindBidirectional(this.obsrv2OnHidden);
        if (this.bound1OnHiding)
            instance.onHidingProperty().bind(this.obsrv1OnHiding);
        if (this.bound2OnHiding)
            instance.onHidingProperty().bindBidirectional(this.obsrv2OnHiding);
        if (this.bound1OnShowing)
            instance.onShowingProperty().bind(this.obsrv1OnShowing);
        if (this.bound2OnShowing)
            instance.onShowingProperty().bindBidirectional(this.obsrv2OnShowing);
        if (this.bound1OnShown)
            instance.onShownProperty().bind(this.obsrv1OnShown);
        if (this.bound2OnShown)
            instance.onShownProperty().bindBidirectional(this.obsrv2OnShown);
        if (this.bound1ShowFromTop)
            instance.showFromTopProperty().bind(this.obsrv1ShowFromTop);
        if (this.bound2ShowFromTop)
            instance.showFromTopProperty().bindBidirectional(this.obsrv2ShowFromTop);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
    }

    /**
     * 設定集合屬性{@link NotificationPane#getActions}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B actions(java.util.Collection<? extends org.controlsfx.control.action.Action> value)
    {
        this.hasActions = true;
        this.valActions = (java.util.Collection<org.controlsfx.control.action.Action>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link NotificationPane#getActions}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B actions(org.controlsfx.control.action.Action... value)
    {
        this.hasActions = true;
        this.valActions = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link NotificationPane#getActions}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B actionsAdd(java.util.Collection<? extends org.controlsfx.control.action.Action> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasActions = true;
        if (this.valActions == null)
            this.valActions = new java.util.ArrayList<>(value.size());
        this.valActions.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link NotificationPane#getActions}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B actionsAdd(org.controlsfx.control.action.Action... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasActions = true;
        if (this.valActions == null)
            this.valActions = new java.util.ArrayList<>(value.length);
        this.valActions.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link NotificationPane#getActions}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B actionsAddNonNull(java.util.Collection<? extends org.controlsfx.control.action.Action> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasActions = true;
        if (this.valActions == null)
            this.valActions = new java.util.ArrayList<>(value.size());
        for (org.controlsfx.control.action.Action i : value)
            if (i != null)
                this.valActions.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link NotificationPane#getActions}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B actionsAddNonNull(org.controlsfx.control.action.Action... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasActions = true;
        if (this.valActions == null)
            this.valActions = new java.util.ArrayList<>(value.length);
        for (org.controlsfx.control.action.Action i : value)
            if (i != null)
                this.valActions.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setCloseButtonVisible(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B closeButtonVisible(boolean value)
    {
        this.hasCloseButtonVisible = true;
        this.valCloseButtonVisible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setContent(javafx.scene.Node)}。
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
     * 設定屬性{@link NotificationPane#setGraphic(javafx.scene.Node)}。
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
     * 設定屬性{@link NotificationPane#setOnHidden(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnHiding(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnShowing(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setOnShown(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setShowFromTop(boolean)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B showFromTop(boolean value)
    {
        this.hasShowFromTop = true;
        this.valShowFromTop = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#setText(java.lang.String)}。
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
     * 設定屬性{@link NotificationPane#closeButtonVisibleProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCloseButtonVisible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CloseButtonVisible = true;
        this.obsrv1CloseButtonVisible = source;
        this.bound2CloseButtonVisible = false;
        this.obsrv2CloseButtonVisible = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#closeButtonVisibleProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCloseButtonVisible(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CloseButtonVisible = false;
        this.obsrv1CloseButtonVisible = null;
        this.bound2CloseButtonVisible = true;
        this.obsrv2CloseButtonVisible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#contentProperty}的連結。
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
     * 設定屬性{@link NotificationPane#contentProperty}的雙向連結。
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
     * 設定屬性{@link NotificationPane#graphicProperty}的連結。
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
     * 設定屬性{@link NotificationPane#graphicProperty}的雙向連結。
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
     * 設定屬性{@link NotificationPane#onHiddenProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHidden = true;
        this.obsrv1OnHidden = source;
        this.bound2OnHidden = false;
        this.obsrv2OnHidden = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onHiddenProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnHidden(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHidden = false;
        this.obsrv1OnHidden = null;
        this.bound2OnHidden = true;
        this.obsrv2OnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onHidingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHiding = true;
        this.obsrv1OnHiding = source;
        this.bound2OnHiding = false;
        this.obsrv2OnHiding = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onHidingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnHiding(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnHiding = false;
        this.obsrv1OnHiding = null;
        this.bound2OnHiding = true;
        this.obsrv2OnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShowingProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShowing = true;
        this.obsrv1OnShowing = source;
        this.bound2OnShowing = false;
        this.obsrv2OnShowing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShowingProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnShowing(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShowing = false;
        this.obsrv1OnShowing = null;
        this.bound2OnShowing = true;
        this.obsrv2OnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShownProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShown = true;
        this.obsrv1OnShown = source;
        this.bound2OnShown = false;
        this.obsrv2OnShown = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#onShownProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnShown(javafx.beans.property.Property<javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnShown = false;
        this.obsrv1OnShown = null;
        this.bound2OnShown = true;
        this.obsrv2OnShown = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#showFromTopProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindShowFromTop(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowFromTop = true;
        this.obsrv1ShowFromTop = source;
        this.bound2ShowFromTop = false;
        this.obsrv2ShowFromTop = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#showFromTopProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalShowFromTop(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ShowFromTop = false;
        this.obsrv1ShowFromTop = null;
        this.bound2ShowFromTop = true;
        this.obsrv2ShowFromTop = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link NotificationPane#textProperty}的連結。
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
     * 設定屬性{@link NotificationPane#textProperty}的雙向連結。
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
     * 建構{@link NotificationPane}物件。
     *
     * @return 新的{@link NotificationPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public NotificationPane build()
    {
        NotificationPane instance = new NotificationPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link NotificationPane}物件。
     *
     * @return 新的{@link NotificationPane}物件實體
     */
    @SuppressWarnings("unchecked")
    public NotificationPane build(javafx.scene.Node arg0)
    {
        NotificationPane instance = new NotificationPane(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
