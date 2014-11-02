// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.textfield;

/**
 * {@link AutoCompletionBinding}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.8.jar
 * @param <Z> 要建構的物件型態(需繼承{@link AutoCompletionBinding})
 * @param <B> 建構器本身的型態(需繼承{@link AutoCompletionBindingBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AutoCompletionBindingBuilder<T extends java.lang.Object, Z extends AutoCompletionBinding<T>, B extends AutoCompletionBindingBuilder<T, Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
        implements AutoCompletionBindingBuilderExt<T, Z, B>
{

    private boolean hasOnAutoCompleted;
    private javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>> valOnAutoCompleted;

    private boolean hasUserInput;
    private java.lang.String valUserInput;

    private boolean bound1OnAutoCompleted;
    private boolean bound2OnAutoCompleted;
    private javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>>> obsrv1OnAutoCompleted;
    private javafx.beans.property.Property<javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>>> obsrv2OnAutoCompleted;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasOnAutoCompleted)
            instance.setOnAutoCompleted(this.valOnAutoCompleted);
        if (this.hasUserInput)
            instance.setUserInput(this.valUserInput);
        if (this.bound1OnAutoCompleted)
            instance.onAutoCompletedProperty().bind(this.obsrv1OnAutoCompleted);
        if (this.bound2OnAutoCompleted)
            instance.onAutoCompletedProperty().bindBidirectional(this.obsrv2OnAutoCompleted);
    }

    /**
     * 設定屬性{@link AutoCompletionBinding#setOnAutoCompleted(javafx.event.EventHandler)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onAutoCompleted(javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>> value)
    {
        this.hasOnAutoCompleted = true;
        this.valOnAutoCompleted = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link AutoCompletionBinding#setUserInput(java.lang.String)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B userInput(java.lang.String value)
    {
        this.hasUserInput = true;
        this.valUserInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link AutoCompletionBinding#onAutoCompletedProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOnAutoCompleted(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAutoCompleted = true;
        this.obsrv1OnAutoCompleted = source;
        this.bound2OnAutoCompleted = false;
        this.obsrv2OnAutoCompleted = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link AutoCompletionBinding#onAutoCompletedProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalOnAutoCompleted(javafx.beans.property.Property<javafx.event.EventHandler<org.controlsfx.control.textfield.AutoCompletionBinding.AutoCompletionEvent<T>>> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1OnAutoCompleted = false;
        this.obsrv1OnAutoCompleted = null;
        this.bound2OnAutoCompleted = true;
        this.obsrv2OnAutoCompleted = source;
        return (B) this;
    }
}
