// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ComboBoxBase}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ComboBoxBase})
 * @param <B> 建構器本身的型態(需繼承{@link ComboBoxBaseBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxBaseBuilder<T extends java.lang.Object, Z extends ComboBoxBase<T>, B extends ComboBoxBaseBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    private boolean hasEditable;
    private boolean valEditable;

    private boolean hasOnAction;
    private javafx.event.EventHandler<javafx.event.ActionEvent> valOnAction;

    private boolean hasOnHidden;
    private javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    private boolean hasOnHiding;
    private javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    private boolean hasOnShowing;
    private javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    private boolean hasOnShown;
    private javafx.event.EventHandler<javafx.event.Event> valOnShown;

    private boolean hasPromptText;
    private java.lang.String valPromptText;

    private boolean hasValue;
    private T valValue;

    private boolean boundOnAction;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> obsrvOnAction;

    private boolean boundOnHidden;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHidden;

    private boolean boundOnHiding;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHiding;

    private boolean boundOnShowing;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShowing;

    private boolean boundOnShown;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShown;

    private boolean boundPromptText;
    private javafx.beans.value.ObservableValue<? extends String> obsrvPromptText;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEditable)
            instance.setEditable(this.valEditable);
        if (this.hasOnAction)
            instance.setOnAction(this.valOnAction);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.hasPromptText)
            instance.setPromptText(this.valPromptText);
        if (this.hasValue)
            instance.setValue(this.valValue);
        if (this.boundOnAction)
            instance.onActionProperty().bind(this.obsrvOnAction);
        if (this.boundOnHidden)
            instance.onHiddenProperty().bind(this.obsrvOnHidden);
        if (this.boundOnHiding)
            instance.onHidingProperty().bind(this.obsrvOnHiding);
        if (this.boundOnShowing)
            instance.onShowingProperty().bind(this.obsrvOnShowing);
        if (this.boundOnShown)
            instance.onShownProperty().bind(this.obsrvOnShown);
        if (this.boundPromptText)
            instance.promptTextProperty().bind(this.obsrvPromptText);
    }

    /**
     * 設定屬性{@link ComboBoxBase#setEditable(boolean)}
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
     * 設定屬性{@link ComboBoxBase#setOnAction(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onAction(javafx.event.EventHandler<javafx.event.ActionEvent> value)
    {
        this.hasOnAction = true;
        this.valOnAction = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#setOnHidden(javafx.event.EventHandler)}
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
     * 設定屬性{@link ComboBoxBase#setOnHiding(javafx.event.EventHandler)}
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
     * 設定屬性{@link ComboBoxBase#setOnShowing(javafx.event.EventHandler)}
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
     * 設定屬性{@link ComboBoxBase#setOnShown(javafx.event.EventHandler)}
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
     * 設定屬性{@link ComboBoxBase#setPromptText(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B promptText(java.lang.String value)
    {
        this.hasPromptText = true;
        this.valPromptText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#setValue(T)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B value(T value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#onActionProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnAction(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOnAction = true;
        this.obsrvOnAction = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#onHiddenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOnHidden = true;
        this.obsrvOnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#onHidingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOnHiding = true;
        this.obsrvOnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#onShowingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOnShowing = true;
        this.obsrvOnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#onShownProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOnShown = true;
        this.obsrvOnShown = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ComboBoxBase#promptTextProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPromptText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundPromptText = true;
        this.obsrvPromptText = source;
        return (B) this;
    }
}
