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

    private boolean boundLineSpacing;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvLineSpacing;

    private boolean boundTextAlignment;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> obsrvTextAlignment;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasLineSpacing)
            instance.setLineSpacing(this.valLineSpacing);
        if (this.hasTextAlignment)
            instance.setTextAlignment(this.valTextAlignment);
        if (this.boundLineSpacing)
            instance.lineSpacingProperty().bind(this.obsrvLineSpacing);
        if (this.boundTextAlignment)
            instance.textAlignmentProperty().bind(this.obsrvTextAlignment);
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
    public final B bindLineSpacing(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundLineSpacing = true;
        this.obsrvLineSpacing = source;
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
        this.boundTextAlignment = true;
        this.obsrvTextAlignment = source;
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
