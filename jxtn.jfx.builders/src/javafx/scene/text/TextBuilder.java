// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.text;

/**
 * {@link Text}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Text})
 * @param <B> 建構器本身的型態(需繼承{@link TextBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextBuilder<Z extends Text, B extends TextBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    private boolean hasBoundsType;
    private javafx.scene.text.TextBoundsType valBoundsType;

    private boolean hasFont;
    private javafx.scene.text.Font valFont;

    private boolean hasFontSmoothingType;
    private javafx.scene.text.FontSmoothingType valFontSmoothingType;

    private boolean hasLineSpacing;
    private double valLineSpacing;

    private boolean hasStrikethrough;
    private boolean valStrikethrough;

    private boolean hasText;
    private java.lang.String valText;

    private boolean hasTextAlignment;
    private javafx.scene.text.TextAlignment valTextAlignment;

    private boolean hasTextOrigin;
    private javafx.geometry.VPos valTextOrigin;

    private boolean hasUnderline;
    private boolean valUnderline;

    private boolean hasWrappingWidth;
    private double valWrappingWidth;

    private boolean hasX;
    private double valX;

    private boolean hasY;
    private double valY;

    private boolean bound1BoundsType;
    private boolean bound2BoundsType;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextBoundsType> obsrv1BoundsType;
    private javafx.beans.property.Property<javafx.scene.text.TextBoundsType> obsrv2BoundsType;

    private boolean bound1Font;
    private boolean bound2Font;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> obsrv1Font;
    private javafx.beans.property.Property<javafx.scene.text.Font> obsrv2Font;

    private boolean bound1FontSmoothingType;
    private boolean bound2FontSmoothingType;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.FontSmoothingType> obsrv1FontSmoothingType;
    private javafx.beans.property.Property<javafx.scene.text.FontSmoothingType> obsrv2FontSmoothingType;

    private boolean bound1LineSpacing;
    private boolean bound2LineSpacing;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1LineSpacing;
    private javafx.beans.property.Property<Number> obsrv2LineSpacing;

    private boolean bound1Strikethrough;
    private boolean bound2Strikethrough;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Strikethrough;
    private javafx.beans.property.Property<Boolean> obsrv2Strikethrough;

    private boolean bound1TextAlignment;
    private boolean bound2TextAlignment;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> obsrv1TextAlignment;
    private javafx.beans.property.Property<javafx.scene.text.TextAlignment> obsrv2TextAlignment;

    private boolean bound1TextOrigin;
    private boolean bound2TextOrigin;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> obsrv1TextOrigin;
    private javafx.beans.property.Property<javafx.geometry.VPos> obsrv2TextOrigin;

    private boolean bound1Text;
    private boolean bound2Text;
    private javafx.beans.value.ObservableValue<? extends String> obsrv1Text;
    private javafx.beans.property.Property<String> obsrv2Text;

    private boolean bound1Underline;
    private boolean bound2Underline;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Underline;
    private javafx.beans.property.Property<Boolean> obsrv2Underline;

    private boolean bound1WrappingWidth;
    private boolean bound2WrappingWidth;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1WrappingWidth;
    private javafx.beans.property.Property<Number> obsrv2WrappingWidth;

    private boolean bound1X;
    private boolean bound2X;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1X;
    private javafx.beans.property.Property<Number> obsrv2X;

    private boolean bound1Y;
    private boolean bound2Y;
    private javafx.beans.value.ObservableValue<? extends Number> obsrv1Y;
    private javafx.beans.property.Property<Number> obsrv2Y;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBoundsType)
            instance.setBoundsType(this.valBoundsType);
        if (this.hasFont)
            instance.setFont(this.valFont);
        if (this.hasFontSmoothingType)
            instance.setFontSmoothingType(this.valFontSmoothingType);
        if (this.hasLineSpacing)
            instance.setLineSpacing(this.valLineSpacing);
        if (this.hasStrikethrough)
            instance.setStrikethrough(this.valStrikethrough);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.hasTextAlignment)
            instance.setTextAlignment(this.valTextAlignment);
        if (this.hasTextOrigin)
            instance.setTextOrigin(this.valTextOrigin);
        if (this.hasUnderline)
            instance.setUnderline(this.valUnderline);
        if (this.hasWrappingWidth)
            instance.setWrappingWidth(this.valWrappingWidth);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.bound1BoundsType)
            instance.boundsTypeProperty().bind(this.obsrv1BoundsType);
        if (this.bound2BoundsType)
            instance.boundsTypeProperty().bindBidirectional(this.obsrv2BoundsType);
        if (this.bound1Font)
            instance.fontProperty().bind(this.obsrv1Font);
        if (this.bound2Font)
            instance.fontProperty().bindBidirectional(this.obsrv2Font);
        if (this.bound1FontSmoothingType)
            instance.fontSmoothingTypeProperty().bind(this.obsrv1FontSmoothingType);
        if (this.bound2FontSmoothingType)
            instance.fontSmoothingTypeProperty().bindBidirectional(this.obsrv2FontSmoothingType);
        if (this.bound1LineSpacing)
            instance.lineSpacingProperty().bind(this.obsrv1LineSpacing);
        if (this.bound2LineSpacing)
            instance.lineSpacingProperty().bindBidirectional(this.obsrv2LineSpacing);
        if (this.bound1Strikethrough)
            instance.strikethroughProperty().bind(this.obsrv1Strikethrough);
        if (this.bound2Strikethrough)
            instance.strikethroughProperty().bindBidirectional(this.obsrv2Strikethrough);
        if (this.bound1TextAlignment)
            instance.textAlignmentProperty().bind(this.obsrv1TextAlignment);
        if (this.bound2TextAlignment)
            instance.textAlignmentProperty().bindBidirectional(this.obsrv2TextAlignment);
        if (this.bound1TextOrigin)
            instance.textOriginProperty().bind(this.obsrv1TextOrigin);
        if (this.bound2TextOrigin)
            instance.textOriginProperty().bindBidirectional(this.obsrv2TextOrigin);
        if (this.bound1Text)
            instance.textProperty().bind(this.obsrv1Text);
        if (this.bound2Text)
            instance.textProperty().bindBidirectional(this.obsrv2Text);
        if (this.bound1Underline)
            instance.underlineProperty().bind(this.obsrv1Underline);
        if (this.bound2Underline)
            instance.underlineProperty().bindBidirectional(this.obsrv2Underline);
        if (this.bound1WrappingWidth)
            instance.wrappingWidthProperty().bind(this.obsrv1WrappingWidth);
        if (this.bound2WrappingWidth)
            instance.wrappingWidthProperty().bindBidirectional(this.obsrv2WrappingWidth);
        if (this.bound1X)
            instance.xProperty().bind(this.obsrv1X);
        if (this.bound2X)
            instance.xProperty().bindBidirectional(this.obsrv2X);
        if (this.bound1Y)
            instance.yProperty().bind(this.obsrv1Y);
        if (this.bound2Y)
            instance.yProperty().bindBidirectional(this.obsrv2Y);
    }

    /**
     * 設定屬性{@link Text#setBoundsType(javafx.scene.text.TextBoundsType)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B boundsType(javafx.scene.text.TextBoundsType value)
    {
        this.hasBoundsType = true;
        this.valBoundsType = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setFont(javafx.scene.text.Font)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B font(javafx.scene.text.Font value)
    {
        this.hasFont = true;
        this.valFont = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setFontSmoothingType(javafx.scene.text.FontSmoothingType)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fontSmoothingType(javafx.scene.text.FontSmoothingType value)
    {
        this.hasFontSmoothingType = true;
        this.valFontSmoothingType = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setLineSpacing(double)}
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
     * 設定屬性{@link Text#setStrikethrough(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B strikethrough(boolean value)
    {
        this.hasStrikethrough = true;
        this.valStrikethrough = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setText(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B text(java.lang.String value)
    {
        this.hasText = true;
        this.valText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setTextAlignment(javafx.scene.text.TextAlignment)}
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
     * 設定屬性{@link Text#setTextOrigin(javafx.geometry.VPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B textOrigin(javafx.geometry.VPos value)
    {
        this.hasTextOrigin = true;
        this.valTextOrigin = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setUnderline(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B underline(boolean value)
    {
        this.hasUnderline = true;
        this.valUnderline = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setWrappingWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B wrappingWidth(double value)
    {
        this.hasWrappingWidth = true;
        this.valWrappingWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#setY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#boundsTypeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBoundsType(javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextBoundsType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BoundsType = true;
        this.obsrv1BoundsType = source;
        this.bound2BoundsType = false;
        this.obsrv2BoundsType = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#boundsTypeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalBoundsType(javafx.beans.property.Property<javafx.scene.text.TextBoundsType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1BoundsType = false;
        this.obsrv1BoundsType = null;
        this.bound2BoundsType = true;
        this.obsrv2BoundsType = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#fontProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFont(javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Font = true;
        this.obsrv1Font = source;
        this.bound2Font = false;
        this.obsrv2Font = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#fontProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFont(javafx.beans.property.Property<javafx.scene.text.Font> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Font = false;
        this.obsrv1Font = null;
        this.bound2Font = true;
        this.obsrv2Font = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#fontSmoothingTypeProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFontSmoothingType(javafx.beans.value.ObservableValue<? extends javafx.scene.text.FontSmoothingType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FontSmoothingType = true;
        this.obsrv1FontSmoothingType = source;
        this.bound2FontSmoothingType = false;
        this.obsrv2FontSmoothingType = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#fontSmoothingTypeProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalFontSmoothingType(javafx.beans.property.Property<javafx.scene.text.FontSmoothingType> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1FontSmoothingType = false;
        this.obsrv1FontSmoothingType = null;
        this.bound2FontSmoothingType = true;
        this.obsrv2FontSmoothingType = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#lineSpacingProperty}的連結
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
     * 設定屬性{@link Text#lineSpacingProperty}的雙向連結
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
     * 設定屬性{@link Text#strikethroughProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindStrikethrough(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Strikethrough = true;
        this.obsrv1Strikethrough = source;
        this.bound2Strikethrough = false;
        this.obsrv2Strikethrough = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#strikethroughProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalStrikethrough(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Strikethrough = false;
        this.obsrv1Strikethrough = null;
        this.bound2Strikethrough = true;
        this.obsrv2Strikethrough = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#textAlignmentProperty}的連結
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
     * 設定屬性{@link Text#textAlignmentProperty}的雙向連結
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
     * 設定屬性{@link Text#textOriginProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTextOrigin(javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TextOrigin = true;
        this.obsrv1TextOrigin = source;
        this.bound2TextOrigin = false;
        this.obsrv2TextOrigin = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#textOriginProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalTextOrigin(javafx.beans.property.Property<javafx.geometry.VPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1TextOrigin = false;
        this.obsrv1TextOrigin = null;
        this.bound2TextOrigin = true;
        this.obsrv2TextOrigin = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#textProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = true;
        this.obsrv1Text = source;
        this.bound2Text = false;
        this.obsrv2Text = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#textProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalText(javafx.beans.property.Property<String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Text = false;
        this.obsrv1Text = null;
        this.bound2Text = true;
        this.obsrv2Text = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#underlineProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindUnderline(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Underline = true;
        this.obsrv1Underline = source;
        this.bound2Underline = false;
        this.obsrv2Underline = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#underlineProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalUnderline(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Underline = false;
        this.obsrv1Underline = null;
        this.bound2Underline = true;
        this.obsrv2Underline = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#wrappingWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWrappingWidth(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1WrappingWidth = true;
        this.obsrv1WrappingWidth = source;
        this.bound2WrappingWidth = false;
        this.obsrv2WrappingWidth = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#wrappingWidthProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalWrappingWidth(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1WrappingWidth = false;
        this.obsrv1WrappingWidth = null;
        this.bound2WrappingWidth = true;
        this.obsrv2WrappingWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#xProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindX(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = true;
        this.obsrv1X = source;
        this.bound2X = false;
        this.obsrv2X = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#xProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalX(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1X = false;
        this.obsrv1X = null;
        this.bound2X = true;
        this.obsrv2X = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#yProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindY(javafx.beans.value.ObservableValue<? extends Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = true;
        this.obsrv1Y = source;
        this.bound2Y = false;
        this.obsrv2Y = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Text#yProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalY(javafx.beans.property.Property<Number> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Y = false;
        this.obsrv1Y = null;
        this.bound2Y = true;
        this.obsrv2Y = source;
        return (B) this;
    }

    /**
     * 建構{@link Text}物件
     *
     * @return 新的{@link Text}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Text build()
    {
        Text instance = new Text();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
