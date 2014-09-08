// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link BoxBlur}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link BoxBlur})
 * @param <B> 建構器本身的型態(需繼承{@link BoxBlurBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BoxBlurBuilder<Z extends BoxBlur, B extends BoxBlurBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    private boolean hasHeight;
    private double valHeight;

    private boolean hasInput;
    private javafx.scene.effect.Effect valInput;

    private boolean hasIterations;
    private int valIterations;

    private boolean hasWidth;
    private double valWidth;

    private boolean bound1Height;
    private boolean bound2Height;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Height;
    private javafx.beans.property.Property<Number> obsrv2Height;

    private boolean bound1Input;
    private boolean bound2Input;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1Input;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2Input;

    private boolean bound1Iterations;
    private boolean bound2Iterations;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Iterations;
    private javafx.beans.property.Property<Number> obsrv2Iterations;

    private boolean bound1Width;
    private boolean bound2Width;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Width;
    private javafx.beans.property.Property<Number> obsrv2Width;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasIterations)
            instance.setIterations(this.valIterations);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.bound1Height)
            instance.heightProperty().bind(this.obsrv1Height);
        if (this.bound2Height)
            instance.heightProperty().bindBidirectional(this.obsrv2Height);
        if (this.bound1Input)
            instance.inputProperty().bind(this.obsrv1Input);
        if (this.bound2Input)
            instance.inputProperty().bindBidirectional(this.obsrv2Input);
        if (this.bound1Iterations)
            instance.iterationsProperty().bind(this.obsrv1Iterations);
        if (this.bound2Iterations)
            instance.iterationsProperty().bindBidirectional(this.obsrv2Iterations);
        if (this.bound1Width)
            instance.widthProperty().bind(this.obsrv1Width);
        if (this.bound2Width)
            instance.widthProperty().bindBidirectional(this.obsrv2Width);
    }

    /**
     * 設定屬性{@link BoxBlur#setHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setInput(javafx.scene.effect.Effect)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect value)
    {
        this.hasInput = true;
        this.valInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setIterations(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B iterations(int value)
    {
        this.hasIterations = true;
        this.valIterations = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#setWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHeight(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = true;
        this.obsrv1Height = source;
        this.bound2Height = false;
        this.obsrv2Height = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#heightProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHeight(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Height = false;
        this.obsrv1Height = null;
        this.bound2Height = true;
        this.obsrv2Height = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Input = true;
        this.obsrv1Input = source;
        this.bound2Input = false;
        this.obsrv2Input = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#inputProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalInput(javafx.beans.property.Property<javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Input = false;
        this.obsrv1Input = null;
        this.bound2Input = true;
        this.obsrv2Input = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#iterationsProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindIterations(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Iterations = true;
        this.obsrv1Iterations = source;
        this.bound2Iterations = false;
        this.obsrv2Iterations = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#iterationsProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalIterations(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Iterations = false;
        this.obsrv1Iterations = null;
        this.bound2Iterations = true;
        this.obsrv2Iterations = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = true;
        this.obsrv1Width = source;
        this.bound2Width = false;
        this.obsrv2Width = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link BoxBlur#widthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Width = false;
        this.obsrv1Width = null;
        this.bound2Width = true;
        this.obsrv2Width = source;
        return (B) this;
    }

    /**
     * 建構{@link BoxBlur}物件
     *
     * @return 新的{@link BoxBlur}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public BoxBlur build()
    {
        BoxBlur instance = new BoxBlur();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
