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

    private boolean bound1Brightness;
    private boolean bound2Brightness;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Brightness;
    private javafx.beans.property.Property<Number> obsrv2Brightness;

    private boolean bound1Contrast;
    private boolean bound2Contrast;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Contrast;
    private javafx.beans.property.Property<Number> obsrv2Contrast;

    private boolean bound1Hue;
    private boolean bound2Hue;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Hue;
    private javafx.beans.property.Property<Number> obsrv2Hue;

    private boolean bound1Input;
    private boolean bound2Input;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrv1Input;
    private javafx.beans.property.Property<javafx.scene.effect.Effect> obsrv2Input;

    private boolean bound1Saturation;
    private boolean bound2Saturation;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Saturation;
    private javafx.beans.property.Property<Number> obsrv2Saturation;

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
        if (this.bound1Brightness)
            instance.brightnessProperty().bind(this.obsrv1Brightness);
        if (this.bound2Brightness)
            instance.brightnessProperty().bindBidirectional(this.obsrv2Brightness);
        if (this.bound1Contrast)
            instance.contrastProperty().bind(this.obsrv1Contrast);
        if (this.bound2Contrast)
            instance.contrastProperty().bindBidirectional(this.obsrv2Contrast);
        if (this.bound1Hue)
            instance.hueProperty().bind(this.obsrv1Hue);
        if (this.bound2Hue)
            instance.hueProperty().bindBidirectional(this.obsrv2Hue);
        if (this.bound1Input)
            instance.inputProperty().bind(this.obsrv1Input);
        if (this.bound2Input)
            instance.inputProperty().bindBidirectional(this.obsrv2Input);
        if (this.bound1Saturation)
            instance.saturationProperty().bind(this.obsrv1Saturation);
        if (this.bound2Saturation)
            instance.saturationProperty().bindBidirectional(this.obsrv2Saturation);
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
    public final B bindBrightness(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Brightness = true;
        this.obsrv1Brightness = source;
        this.bound2Brightness = false;
        this.obsrv2Brightness = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#brightnessProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBrightness(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Brightness = false;
        this.obsrv1Brightness = null;
        this.bound2Brightness = true;
        this.obsrv2Brightness = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#contrastProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindContrast(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Contrast = true;
        this.obsrv1Contrast = source;
        this.bound2Contrast = false;
        this.obsrv2Contrast = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#contrastProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalContrast(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Contrast = false;
        this.obsrv1Contrast = null;
        this.bound2Contrast = true;
        this.obsrv2Contrast = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#hueProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHue(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hue = true;
        this.obsrv1Hue = source;
        this.bound2Hue = false;
        this.obsrv2Hue = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#hueProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalHue(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Hue = false;
        this.obsrv1Hue = null;
        this.bound2Hue = true;
        this.obsrv2Hue = source;
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
        this.bound1Input = true;
        this.obsrv1Input = source;
        this.bound2Input = false;
        this.obsrv2Input = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#inputProperty}的雙向連結
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
     * 設定屬性{@link ColorAdjust#saturationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSaturation(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Saturation = true;
        this.obsrv1Saturation = source;
        this.bound2Saturation = false;
        this.obsrv2Saturation = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link ColorAdjust#saturationProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalSaturation(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Saturation = false;
        this.obsrv1Saturation = null;
        this.bound2Saturation = true;
        this.obsrv2Saturation = source;
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
