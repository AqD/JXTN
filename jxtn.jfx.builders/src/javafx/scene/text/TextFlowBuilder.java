// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.text;

/**
 * {@link TextFlow}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link TextFlow})
 * @param <B> 建構器本身的型態(需繼承{@link TextFlowBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextFlowBuilder<Z extends TextFlow, B extends TextFlowBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
{

    private boolean hasLineSpacing;
    private double valLineSpacing;

    private boolean hasTextAlignment;
    private javafx.scene.text.TextAlignment valTextAlignment;

    private boolean bound1LineSpacing;
    private boolean bound2LineSpacing;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1LineSpacing;
    private javafx.beans.property.Property<Number> obsrv2LineSpacing;

    private boolean bound1TextAlignment;
    private boolean bound2TextAlignment;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> obsrv1TextAlignment;
    private javafx.beans.property.Property<javafx.scene.text.TextAlignment> obsrv2TextAlignment;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLineSpacing)
            instance.setLineSpacing(this.valLineSpacing);
        if (this.hasTextAlignment)
            instance.setTextAlignment(this.valTextAlignment);
        if (this.bound1LineSpacing)
            instance.lineSpacingProperty().bind(this.obsrv1LineSpacing);
        if (this.bound2LineSpacing)
            instance.lineSpacingProperty().bindBidirectional(this.obsrv2LineSpacing);
        if (this.bound1TextAlignment)
            instance.textAlignmentProperty().bind(this.obsrv1TextAlignment);
        if (this.bound2TextAlignment)
            instance.textAlignmentProperty().bindBidirectional(this.obsrv2TextAlignment);
    }

    /**
     * 設定屬性{@link TextFlow#setLineSpacing(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lineSpacing(double value)
    {
        this.hasLineSpacing = true;
        this.valLineSpacing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextFlow#setTextAlignment(javafx.scene.text.TextAlignment)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B textAlignment(javafx.scene.text.TextAlignment value)
    {
        this.hasTextAlignment = true;
        this.valTextAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextFlow#lineSpacingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLineSpacing(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LineSpacing = true;
        this.obsrv1LineSpacing = source;
        this.bound2LineSpacing = false;
        this.obsrv2LineSpacing = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextFlow#lineSpacingProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLineSpacing(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LineSpacing = false;
        this.obsrv1LineSpacing = null;
        this.bound2LineSpacing = true;
        this.obsrv2LineSpacing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextFlow#textAlignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTextAlignment(javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TextAlignment = true;
        this.obsrv1TextAlignment = source;
        this.bound2TextAlignment = false;
        this.obsrv2TextAlignment = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link TextFlow#textAlignmentProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTextAlignment(javafx.beans.property.Property<javafx.scene.text.TextAlignment> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TextAlignment = false;
        this.obsrv1TextAlignment = null;
        this.bound2TextAlignment = true;
        this.obsrv2TextAlignment = source;
        return (B) this;
    }

    /**
     * 建構{@link TextFlow}物件
     *
     * @return 新的{@link TextFlow}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TextFlow build()
    {
        TextFlow instance = new TextFlow();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
