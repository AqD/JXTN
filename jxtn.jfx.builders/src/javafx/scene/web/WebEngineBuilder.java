// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.web;

/**
 * {@link WebEngine}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link WebEngine})
 * @param <B> 建構器本身的型態(需繼承{@link WebEngineBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class WebEngineBuilder<Z extends WebEngine, B extends WebEngineBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasConfirmHandler;
    private javafx.util.Callback<java.lang.String, java.lang.Boolean> valConfirmHandler;

    private boolean hasCreatePopupHandler;
    private javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine> valCreatePopupHandler;

    private boolean hasJavaScriptEnabled;
    private boolean valJavaScriptEnabled;

    private boolean hasOnAlert;
    private javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>> valOnAlert;

    private boolean hasOnError;
    private javafx.event.EventHandler<javafx.scene.web.WebErrorEvent> valOnError;

    private boolean hasOnResized;
    private javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>> valOnResized;

    private boolean hasOnStatusChanged;
    private javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>> valOnStatusChanged;

    private boolean hasOnVisibilityChanged;
    private javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>> valOnVisibilityChanged;

    private boolean hasPromptHandler;
    private javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String> valPromptHandler;

    private boolean hasUserAgent;
    private java.lang.String valUserAgent;

    private boolean hasUserDataDirectory;
    private java.io.File valUserDataDirectory;

    private boolean hasUserStyleSheetLocation;
    private java.lang.String valUserStyleSheetLocation;

    private boolean bound1ConfirmHandler;
    private boolean bound2ConfirmHandler;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.String, java.lang.Boolean>> obsrv1ConfirmHandler;
    private javafx.beans.property.Property<javafx.util.Callback<java.lang.String, java.lang.Boolean>> obsrv2ConfirmHandler;

    private boolean bound1CreatePopupHandler;
    private boolean bound2CreatePopupHandler;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>> obsrv1CreatePopupHandler;
    private javafx.beans.property.Property<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>> obsrv2CreatePopupHandler;

    private boolean bound1JavaScriptEnabled;
    private boolean bound2JavaScriptEnabled;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1JavaScriptEnabled;
    private javafx.beans.property.Property<Boolean> obsrv2JavaScriptEnabled;

    private boolean bound1OnAlert;
    private boolean bound2OnAlert;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> obsrv1OnAlert;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> obsrv2OnAlert;

    private boolean bound1OnError;
    private boolean bound2OnError;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>> obsrv1OnError;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>> obsrv2OnError;

    private boolean bound1OnResized;
    private boolean bound2OnResized;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>> obsrv1OnResized;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>> obsrv2OnResized;

    private boolean bound1OnStatusChanged;
    private boolean bound2OnStatusChanged;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> obsrv1OnStatusChanged;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> obsrv2OnStatusChanged;

    private boolean bound1OnVisibilityChanged;
    private boolean bound2OnVisibilityChanged;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>>> obsrv1OnVisibilityChanged;
    private javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>>> obsrv2OnVisibilityChanged;

    private boolean bound1PromptHandler;
    private boolean bound2PromptHandler;
    private javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String>> obsrv1PromptHandler;
    private javafx.beans.property.Property<javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String>> obsrv2PromptHandler;

    private boolean bound1UserAgent;
    private boolean bound2UserAgent;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1UserAgent;
    private javafx.beans.property.Property<String> obsrv2UserAgent;

    private boolean bound1UserDataDirectory;
    private boolean bound2UserDataDirectory;
    private javafx.beans.value.ObservableValue<? extends java.io.File> obsrv1UserDataDirectory;
    private javafx.beans.property.Property<java.io.File> obsrv2UserDataDirectory;

    private boolean bound1UserStyleSheetLocation;
    private boolean bound2UserStyleSheetLocation;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1UserStyleSheetLocation;
    private javafx.beans.property.Property<String> obsrv2UserStyleSheetLocation;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasConfirmHandler)
            instance.setConfirmHandler(this.valConfirmHandler);
        if (this.hasCreatePopupHandler)
            instance.setCreatePopupHandler(this.valCreatePopupHandler);
        if (this.hasJavaScriptEnabled)
            instance.setJavaScriptEnabled(this.valJavaScriptEnabled);
        if (this.hasOnAlert)
            instance.setOnAlert(this.valOnAlert);
        if (this.hasOnError)
            instance.setOnError(this.valOnError);
        if (this.hasOnResized)
            instance.setOnResized(this.valOnResized);
        if (this.hasOnStatusChanged)
            instance.setOnStatusChanged(this.valOnStatusChanged);
        if (this.hasOnVisibilityChanged)
            instance.setOnVisibilityChanged(this.valOnVisibilityChanged);
        if (this.hasPromptHandler)
            instance.setPromptHandler(this.valPromptHandler);
        if (this.hasUserAgent)
            instance.setUserAgent(this.valUserAgent);
        if (this.hasUserDataDirectory)
            instance.setUserDataDirectory(this.valUserDataDirectory);
        if (this.hasUserStyleSheetLocation)
            instance.setUserStyleSheetLocation(this.valUserStyleSheetLocation);
        if (this.bound1ConfirmHandler)
            instance.confirmHandlerProperty().bind(this.obsrv1ConfirmHandler);
        if (this.bound2ConfirmHandler)
            instance.confirmHandlerProperty().bindBidirectional(this.obsrv2ConfirmHandler);
        if (this.bound1CreatePopupHandler)
            instance.createPopupHandlerProperty().bind(this.obsrv1CreatePopupHandler);
        if (this.bound2CreatePopupHandler)
            instance.createPopupHandlerProperty().bindBidirectional(this.obsrv2CreatePopupHandler);
        if (this.bound1JavaScriptEnabled)
            instance.javaScriptEnabledProperty().bind(this.obsrv1JavaScriptEnabled);
        if (this.bound2JavaScriptEnabled)
            instance.javaScriptEnabledProperty().bindBidirectional(this.obsrv2JavaScriptEnabled);
        if (this.bound1OnAlert)
            instance.onAlertProperty().bind(this.obsrv1OnAlert);
        if (this.bound2OnAlert)
            instance.onAlertProperty().bindBidirectional(this.obsrv2OnAlert);
        if (this.bound1OnError)
            instance.onErrorProperty().bind(this.obsrv1OnError);
        if (this.bound2OnError)
            instance.onErrorProperty().bindBidirectional(this.obsrv2OnError);
        if (this.bound1OnResized)
            instance.onResizedProperty().bind(this.obsrv1OnResized);
        if (this.bound2OnResized)
            instance.onResizedProperty().bindBidirectional(this.obsrv2OnResized);
        if (this.bound1OnStatusChanged)
            instance.onStatusChangedProperty().bind(this.obsrv1OnStatusChanged);
        if (this.bound2OnStatusChanged)
            instance.onStatusChangedProperty().bindBidirectional(this.obsrv2OnStatusChanged);
        if (this.bound1OnVisibilityChanged)
            instance.onVisibilityChangedProperty().bind(this.obsrv1OnVisibilityChanged);
        if (this.bound2OnVisibilityChanged)
            instance.onVisibilityChangedProperty().bindBidirectional(this.obsrv2OnVisibilityChanged);
        if (this.bound1PromptHandler)
            instance.promptHandlerProperty().bind(this.obsrv1PromptHandler);
        if (this.bound2PromptHandler)
            instance.promptHandlerProperty().bindBidirectional(this.obsrv2PromptHandler);
        if (this.bound1UserAgent)
            instance.userAgentProperty().bind(this.obsrv1UserAgent);
        if (this.bound2UserAgent)
            instance.userAgentProperty().bindBidirectional(this.obsrv2UserAgent);
        if (this.bound1UserDataDirectory)
            instance.userDataDirectoryProperty().bind(this.obsrv1UserDataDirectory);
        if (this.bound2UserDataDirectory)
            instance.userDataDirectoryProperty().bindBidirectional(this.obsrv2UserDataDirectory);
        if (this.bound1UserStyleSheetLocation)
            instance.userStyleSheetLocationProperty().bind(this.obsrv1UserStyleSheetLocation);
        if (this.bound2UserStyleSheetLocation)
            instance.userStyleSheetLocationProperty().bindBidirectional(this.obsrv2UserStyleSheetLocation);
    }

    /**
     * 設定屬性{@link WebEngine#setConfirmHandler(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B confirmHandler(javafx.util.Callback<java.lang.String, java.lang.Boolean> value)
    {
        this.hasConfirmHandler = true;
        this.valConfirmHandler = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setCreatePopupHandler(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B createPopupHandler(javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine> value)
    {
        this.hasCreatePopupHandler = true;
        this.valCreatePopupHandler = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setJavaScriptEnabled(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B javaScriptEnabled(boolean value)
    {
        this.hasJavaScriptEnabled = true;
        this.valJavaScriptEnabled = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setOnAlert(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onAlert(javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>> value)
    {
        this.hasOnAlert = true;
        this.valOnAlert = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setOnError(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onError(javafx.event.EventHandler<javafx.scene.web.WebErrorEvent> value)
    {
        this.hasOnError = true;
        this.valOnError = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setOnResized(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onResized(javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>> value)
    {
        this.hasOnResized = true;
        this.valOnResized = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setOnStatusChanged(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onStatusChanged(javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>> value)
    {
        this.hasOnStatusChanged = true;
        this.valOnStatusChanged = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setOnVisibilityChanged(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onVisibilityChanged(javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>> value)
    {
        this.hasOnVisibilityChanged = true;
        this.valOnVisibilityChanged = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setPromptHandler(javafx.util.Callback)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B promptHandler(javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String> value)
    {
        this.hasPromptHandler = true;
        this.valPromptHandler = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setUserAgent(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userAgent(java.lang.String value)
    {
        this.hasUserAgent = true;
        this.valUserAgent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setUserDataDirectory(java.io.File)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userDataDirectory(java.io.File value)
    {
        this.hasUserDataDirectory = true;
        this.valUserDataDirectory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#setUserStyleSheetLocation(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userStyleSheetLocation(java.lang.String value)
    {
        this.hasUserStyleSheetLocation = true;
        this.valUserStyleSheetLocation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#confirmHandlerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindConfirmHandler(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<java.lang.String, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ConfirmHandler = true;
        this.obsrv1ConfirmHandler = source;
        this.bound2ConfirmHandler = false;
        this.obsrv2ConfirmHandler = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#confirmHandlerProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalConfirmHandler(javafx.beans.property.Property<javafx.util.Callback<java.lang.String, java.lang.Boolean>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ConfirmHandler = false;
        this.obsrv1ConfirmHandler = null;
        this.bound2ConfirmHandler = true;
        this.obsrv2ConfirmHandler = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#createPopupHandlerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindCreatePopupHandler(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CreatePopupHandler = true;
        this.obsrv1CreatePopupHandler = source;
        this.bound2CreatePopupHandler = false;
        this.obsrv2CreatePopupHandler = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#createPopupHandlerProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalCreatePopupHandler(javafx.beans.property.Property<javafx.util.Callback<javafx.scene.web.PopupFeatures, javafx.scene.web.WebEngine>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1CreatePopupHandler = false;
        this.obsrv1CreatePopupHandler = null;
        this.bound2CreatePopupHandler = true;
        this.obsrv2CreatePopupHandler = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#javaScriptEnabledProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindJavaScriptEnabled(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1JavaScriptEnabled = true;
        this.obsrv1JavaScriptEnabled = source;
        this.bound2JavaScriptEnabled = false;
        this.obsrv2JavaScriptEnabled = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#javaScriptEnabledProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalJavaScriptEnabled(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1JavaScriptEnabled = false;
        this.obsrv1JavaScriptEnabled = null;
        this.bound2JavaScriptEnabled = true;
        this.obsrv2JavaScriptEnabled = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onAlertProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnAlert(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAlert = true;
        this.obsrv1OnAlert = source;
        this.bound2OnAlert = false;
        this.obsrv2OnAlert = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onAlertProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnAlert(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAlert = false;
        this.obsrv1OnAlert = null;
        this.bound2OnAlert = true;
        this.obsrv2OnAlert = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onErrorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnError(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnError = true;
        this.obsrv1OnError = source;
        this.bound2OnError = false;
        this.obsrv2OnError = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onErrorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnError(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebErrorEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnError = false;
        this.obsrv1OnError = null;
        this.bound2OnError = true;
        this.obsrv2OnError = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onResizedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnResized(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnResized = true;
        this.obsrv1OnResized = source;
        this.bound2OnResized = false;
        this.obsrv2OnResized = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onResizedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnResized(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<javafx.geometry.Rectangle2D>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnResized = false;
        this.obsrv1OnResized = null;
        this.bound2OnResized = true;
        this.obsrv2OnResized = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onStatusChangedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnStatusChanged(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnStatusChanged = true;
        this.obsrv1OnStatusChanged = source;
        this.bound2OnStatusChanged = false;
        this.obsrv2OnStatusChanged = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onStatusChangedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnStatusChanged(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.String>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnStatusChanged = false;
        this.obsrv1OnStatusChanged = null;
        this.bound2OnStatusChanged = true;
        this.obsrv2OnStatusChanged = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onVisibilityChangedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnVisibilityChanged(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnVisibilityChanged = true;
        this.obsrv1OnVisibilityChanged = source;
        this.bound2OnVisibilityChanged = false;
        this.obsrv2OnVisibilityChanged = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#onVisibilityChangedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnVisibilityChanged(javafx.beans.property.Property<javafx.event.EventHandler<javafx.scene.web.WebEvent<java.lang.Boolean>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnVisibilityChanged = false;
        this.obsrv1OnVisibilityChanged = null;
        this.bound2OnVisibilityChanged = true;
        this.obsrv2OnVisibilityChanged = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#promptHandlerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPromptHandler(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PromptHandler = true;
        this.obsrv1PromptHandler = source;
        this.bound2PromptHandler = false;
        this.obsrv2PromptHandler = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#promptHandlerProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalPromptHandler(javafx.beans.property.Property<javafx.util.Callback<javafx.scene.web.PromptData, java.lang.String>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1PromptHandler = false;
        this.obsrv1PromptHandler = null;
        this.bound2PromptHandler = true;
        this.obsrv2PromptHandler = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userAgentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUserAgent(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserAgent = true;
        this.obsrv1UserAgent = source;
        this.bound2UserAgent = false;
        this.obsrv2UserAgent = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userAgentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUserAgent(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserAgent = false;
        this.obsrv1UserAgent = null;
        this.bound2UserAgent = true;
        this.obsrv2UserAgent = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userDataDirectoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUserDataDirectory(javafx.beans.value.ObservableValue<? extends java.io.File> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserDataDirectory = true;
        this.obsrv1UserDataDirectory = source;
        this.bound2UserDataDirectory = false;
        this.obsrv2UserDataDirectory = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userDataDirectoryProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUserDataDirectory(javafx.beans.property.Property<java.io.File> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserDataDirectory = false;
        this.obsrv1UserDataDirectory = null;
        this.bound2UserDataDirectory = true;
        this.obsrv2UserDataDirectory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userStyleSheetLocationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUserStyleSheetLocation(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserStyleSheetLocation = true;
        this.obsrv1UserStyleSheetLocation = source;
        this.bound2UserStyleSheetLocation = false;
        this.obsrv2UserStyleSheetLocation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link WebEngine#userStyleSheetLocationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUserStyleSheetLocation(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1UserStyleSheetLocation = false;
        this.obsrv1UserStyleSheetLocation = null;
        this.bound2UserStyleSheetLocation = true;
        this.obsrv2UserStyleSheetLocation = source;
        return (B) this;
    }

    /**
     * 建構{@link WebEngine}物件
     *
     * @return 新的{@link WebEngine}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public WebEngine build()
    {
        WebEngine instance = new WebEngine();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
