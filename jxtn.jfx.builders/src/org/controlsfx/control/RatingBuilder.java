// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link Rating}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RatingBuilder<Z extends Rating, B extends RatingBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasMax;
    protected int valMax;

    protected boolean hasOrientation;
    protected javafx.geometry.Orientation valOrientation;

    protected boolean hasPartialRating;
    protected boolean valPartialRating;

    protected boolean hasRating;
    protected double valRating;

    protected boolean hasUpdateOnHover;
    protected boolean valUpdateOnHover;

    protected boolean boundMax;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvMax;

    protected boolean boundOrientation;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    protected boolean boundPartialRating;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvPartialRating;

    protected boolean boundRating;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRating;

    protected boolean boundUpdateOnHover;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvUpdateOnHover;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasMax)
            instance.setMax(this.valMax);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasPartialRating)
            instance.setPartialRating(this.valPartialRating);
        if (this.hasRating)
            instance.setRating(this.valRating);
        if (this.hasUpdateOnHover)
            instance.setUpdateOnHover(this.valUpdateOnHover);
        if (this.boundMax)
            instance.maxProperty().bind(this.obsrvMax);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        if (this.boundPartialRating)
            instance.partialRatingProperty().bind(this.obsrvPartialRating);
        if (this.boundRating)
            instance.ratingProperty().bind(this.obsrvRating);
        if (this.boundUpdateOnHover)
            instance.updateOnHoverProperty().bind(this.obsrvUpdateOnHover);
    }

    /**
     * 設定屬性{@link Rating#setMax}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B max(int value)
    {
        this.hasMax = true;
        this.valMax = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setOrientation}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setPartialRating}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B partialRating(boolean value)
    {
        this.hasPartialRating = true;
        this.valPartialRating = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setRating}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rating(double value)
    {
        this.hasRating = true;
        this.valRating = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#setUpdateOnHover}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B updateOnHover(boolean value)
    {
        this.hasUpdateOnHover = true;
        this.valUpdateOnHover = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#maxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMax(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        assert (source != null);
        this.boundMax = true;
        this.obsrvMax = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        assert (source != null);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#partialRatingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPartialRating(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundPartialRating = true;
        this.obsrvPartialRating = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#ratingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRating(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRating = true;
        this.obsrvRating = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Rating#updateOnHoverProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindUpdateOnHover(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundUpdateOnHover = true;
        this.obsrvUpdateOnHover = source;
        return (B) this;
    }

    /**
     * 建構{@link Rating}物件
     *
     * @return 新的{@link Rating}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Rating build()
    {
        Rating instance = new Rating();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
