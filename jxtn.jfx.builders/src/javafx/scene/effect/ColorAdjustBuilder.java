// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link ColorAdjust}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ColorAdjust})
 * @param <B> 建構器本身的型態(需繼承{@link ColorAdjustBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColorAdjustBuilder<Z extends ColorAdjust, B extends ColorAdjustBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    private boolean hasBrightness;
    private double valBrightness;

    private boolean hasContrast;
    private double valContrast;

    private boolean hasHue;
    private double valHue;

    private boolean hasInput;
    private javafx.scene.effect.Effect valInput;

    private boolean hasSaturation;
    private double valSaturation;

    private boolean boundBrightness;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvBrightness;

    private boolean boundContrast;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvContrast;

    private boolean boundHue;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvHue;

    private boolean boundInput;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrvInput;

    private boolean boundSaturation;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvSaturation;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBrightness)
            instance.setBrightness(this.valBrightness);
        if (this.hasContrast)
            instance.setContrast(this.valContrast);
        if (this.hasHue)
            instance.setHue(this.valHue);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasSaturation)
            instance.setSaturation(this.valSaturation);
        if (this.boundBrightness)
            instance.brightnessProperty().bind(this.obsrvBrightness);
        if (this.boundContrast)
            instance.contrastProperty().bind(this.obsrvContrast);
        if (this.boundHue)
            instance.hueProperty().bind(this.obsrvHue);
        if (this.boundInput)
            instance.inputProperty().bind(this.obsrvInput);
        if (this.boundSaturation)
            instance.saturationProperty().bind(this.obsrvSaturation);
    }

    /**
     * 設定屬性{@link ColorAdjust#setBrightness(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B brightness(double value)
    {
        this.hasBrightness = true;
        this.valBrightness = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#setContrast(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B contrast(double value)
    {
        this.hasContrast = true;
        this.valContrast = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#setHue(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hue(double value)
    {
        this.hasHue = true;
        this.valHue = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#setInput(javafx.scene.effect.Effect)}
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
     * 設定屬性{@link ColorAdjust#setSaturation(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B saturation(double value)
    {
        this.hasSaturation = true;
        this.valSaturation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#brightnessProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBrightness(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundBrightness = true;
        this.obsrvBrightness = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#contrastProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContrast(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundContrast = true;
        this.obsrvContrast = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#hueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHue(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundHue = true;
        this.obsrvHue = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundInput = true;
        this.obsrvInput = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#saturationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSaturation(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSaturation = true;
        this.obsrvSaturation = source;
        return (B) this;
    }

    /**
     * 建構{@link ColorAdjust}物件
     *
     * @return 新的{@link ColorAdjust}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ColorAdjust build()
    {
        ColorAdjust instance = new ColorAdjust();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
