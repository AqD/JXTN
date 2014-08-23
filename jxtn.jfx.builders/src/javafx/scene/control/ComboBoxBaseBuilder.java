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
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ComboBoxBaseBuilder<T extends java.lang.Object, Z extends ComboBoxBase<T>, B extends ComboBoxBaseBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasEditable;
    protected boolean valEditable;

    protected boolean hasOnAction;
    protected javafx.event.EventHandler<javafx.event.ActionEvent> valOnAction;

    protected boolean hasOnHidden;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    protected boolean hasOnHiding;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    protected boolean hasOnShowing;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    protected boolean hasOnShown;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShown;

    protected boolean hasPromptText;
    protected java.lang.String valPromptText;

    protected boolean hasValue;
    protected T valValue;

    protected boolean boundOnAction;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> obsrvOnAction;

    protected boolean boundOnHidden;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHidden;

    protected boolean boundOnHiding;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHiding;

    protected boolean boundOnShowing;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShowing;

    protected boolean boundOnShown;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShown;

    protected boolean boundPromptText;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvPromptText;
    public void applyTo(ComboBoxBase<T> instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
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
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B editable(boolean value)
    {
        this.hasEditable = true;
        this.valEditable = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B onAction(javafx.event.EventHandler<javafx.event.ActionEvent> value)
    {
        this.hasOnAction = true;
        this.valOnAction = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B promptText(java.lang.String value)
    {
        this.hasPromptText = true;
        this.valPromptText = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B value(T value)
    {
        this.hasValue = true;
        this.valValue = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOnAction(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.ActionEvent>> source)
    {
        assert (source != null);
        this.boundOnAction = true;
        this.obsrvOnAction = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHidden = true;
        this.obsrvOnHidden = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHiding = true;
        this.obsrvOnHiding = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShowing = true;
        this.obsrvOnShowing = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShown = true;
        this.obsrvOnShown = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindPromptText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundPromptText = true;
        this.obsrvPromptText = source;
        return (B) this;
    }
}
