// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link Picker}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Picker})
 * @param <B> 建構器本身的型態(需繼承{@link PickerMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PickerMaker<Z extends Picker, B extends PickerMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements PickerMakerExt<Z, B>
{

    private boolean hasStyleClass;
    private java.util.Collection<java.lang.String> valStyleClass;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasStyleClass)
            instance.getStyleClass().addAll(this.valStyleClass);
    }

    /**
     * 設定集合屬性{@link Picker#getStyleClass}的內容。
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
     * 設定集合屬性{@link Picker#getStyleClass}的內容。
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
     * 增加集合屬性{@link Picker#getStyleClass}的內容。
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
     * 增加集合屬性{@link Picker#getStyleClass}的內容。
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
     * 增加集合屬性{@link Picker#getStyleClass}的內容，排除null項目。
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
     * 增加集合屬性{@link Picker#getStyleClass}的內容，排除null項目。
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
     * 建構{@link Picker}物件。
     *
     * @return 新的{@link Picker}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Picker build()
    {
        Picker instance = new Picker();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Picker}物件。
     *
     * @return 新的{@link Picker}物件實體
     */
    @SuppressWarnings("unchecked")
    public Picker build(java.lang.String[] arg0)
    {
        Picker instance = new Picker(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Picker}物件。
     *
     * @return 新的{@link Picker}物件實體
     */
    @SuppressWarnings("unchecked")
    public Picker build(java.util.Collection<java.lang.String> arg0)
    {
        Picker instance = new Picker(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
