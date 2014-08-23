// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link MotionBlur}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MotionBlurBuilder<Z extends MotionBlur, B extends MotionBlurBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    protected boolean hasAngle;
    protected double valAngle;

    protected boolean hasInput;
    protected javafx.scene.effect.Effect valInput;

    protected boolean hasRadius;
    protected double valRadius;

    protected boolean boundAngle;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvAngle;

    protected boolean boundInput;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrvInput;

    protected boolean boundRadius;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvRadius;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAngle)
            instance.setAngle(this.valAngle);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasRadius)
            instance.setRadius(this.valRadius);
        if (this.boundAngle)
            instance.angleProperty().bind(this.obsrvAngle);
        if (this.boundInput)
            instance.inputProperty().bind(this.obsrvInput);
        if (this.boundRadius)
            instance.radiusProperty().bind(this.obsrvRadius);
    }

    /**
     * 設定屬性{@link MotionBlur#setAngle}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B angle(double value)
    {
        this.hasAngle = true;
        this.valAngle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MotionBlur#setInput}
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
     * 設定屬性{@link MotionBlur#setRadius}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B radius(double value)
    {
        this.hasRadius = true;
        this.valRadius = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MotionBlur#angleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAngle(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundAngle = true;
        this.obsrvAngle = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MotionBlur#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        assert (source != null);
        this.boundInput = true;
        this.obsrvInput = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MotionBlur#radiusProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRadius(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundRadius = true;
        this.obsrvRadius = source;
        return (B) this;
    }

    /**
     * 建構{@link MotionBlur}物件
     *
     * @return 新的{@link MotionBlur}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MotionBlur build()
    {
        MotionBlur instance = new MotionBlur();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
