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
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TextBuilder<Z extends Text, B extends TextBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasBoundsType;
    protected javafx.scene.text.TextBoundsType valBoundsType;

    protected boolean hasFont;
    protected javafx.scene.text.Font valFont;

    protected boolean hasFontSmoothingType;
    protected javafx.scene.text.FontSmoothingType valFontSmoothingType;

    protected boolean hasLineSpacing;
    protected double valLineSpacing;

    protected boolean hasStrikethrough;
    protected boolean valStrikethrough;

    protected boolean hasText;
    protected java.lang.String valText;

    protected boolean hasTextAlignment;
    protected javafx.scene.text.TextAlignment valTextAlignment;

    protected boolean hasTextOrigin;
    protected javafx.geometry.VPos valTextOrigin;

    protected boolean hasUnderline;
    protected boolean valUnderline;

    protected boolean hasWrappingWidth;
    protected double valWrappingWidth;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundBoundsType;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextBoundsType> obsrvBoundsType;

    protected boolean boundFont;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> obsrvFont;

    protected boolean boundFontSmoothingType;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.FontSmoothingType> obsrvFontSmoothingType;

    protected boolean boundLineSpacing;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvLineSpacing;

    protected boolean boundStrikethrough;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvStrikethrough;

    protected boolean boundTextAlignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> obsrvTextAlignment;

    protected boolean boundTextOrigin;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> obsrvTextOrigin;

    protected boolean boundText;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvText;

    protected boolean boundUnderline;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvUnderline;

    protected boolean boundWrappingWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvWrappingWidth;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;
    public void applyTo(Text instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
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
        if (this.boundBoundsType)
            instance.boundsTypeProperty().bind(this.obsrvBoundsType);
        if (this.boundFont)
            instance.fontProperty().bind(this.obsrvFont);
        if (this.boundFontSmoothingType)
            instance.fontSmoothingTypeProperty().bind(this.obsrvFontSmoothingType);
        if (this.boundLineSpacing)
            instance.lineSpacingProperty().bind(this.obsrvLineSpacing);
        if (this.boundStrikethrough)
            instance.strikethroughProperty().bind(this.obsrvStrikethrough);
        if (this.boundTextAlignment)
            instance.textAlignmentProperty().bind(this.obsrvTextAlignment);
        if (this.boundTextOrigin)
            instance.textOriginProperty().bind(this.obsrvTextOrigin);
        if (this.boundText)
            instance.textProperty().bind(this.obsrvText);
        if (this.boundUnderline)
            instance.underlineProperty().bind(this.obsrvUnderline);
        if (this.boundWrappingWidth)
            instance.wrappingWidthProperty().bind(this.obsrvWrappingWidth);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B boundsType(javafx.scene.text.TextBoundsType value)
    {
        this.hasBoundsType = true;
        this.valBoundsType = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B font(javafx.scene.text.Font value)
    {
        this.hasFont = true;
        this.valFont = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B fontSmoothingType(javafx.scene.text.FontSmoothingType value)
    {
        this.hasFontSmoothingType = true;
        this.valFontSmoothingType = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B lineSpacing(double value)
    {
        this.hasLineSpacing = true;
        this.valLineSpacing = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B strikethrough(boolean value)
    {
        this.hasStrikethrough = true;
        this.valStrikethrough = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B text(java.lang.String value)
    {
        this.hasText = true;
        this.valText = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B textAlignment(javafx.scene.text.TextAlignment value)
    {
        this.hasTextAlignment = true;
        this.valTextAlignment = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B textOrigin(javafx.geometry.VPos value)
    {
        this.hasTextOrigin = true;
        this.valTextOrigin = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B underline(boolean value)
    {
        this.hasUnderline = true;
        this.valUnderline = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B wrappingWidth(double value)
    {
        this.hasWrappingWidth = true;
        this.valWrappingWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindBoundsType(javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextBoundsType> source)
    {
        assert (source != null);
        this.boundBoundsType = true;
        this.obsrvBoundsType = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindFont(javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> source)
    {
        assert (source != null);
        this.boundFont = true;
        this.obsrvFont = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindFontSmoothingType(javafx.beans.value.ObservableValue<? extends javafx.scene.text.FontSmoothingType> source)
    {
        assert (source != null);
        this.boundFontSmoothingType = true;
        this.obsrvFontSmoothingType = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindLineSpacing(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundLineSpacing = true;
        this.obsrvLineSpacing = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindStrikethrough(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundStrikethrough = true;
        this.obsrvStrikethrough = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindTextAlignment(javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> source)
    {
        assert (source != null);
        this.boundTextAlignment = true;
        this.obsrvTextAlignment = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindTextOrigin(javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> source)
    {
        assert (source != null);
        this.boundTextOrigin = true;
        this.obsrvTextOrigin = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundText = true;
        this.obsrvText = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindUnderline(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundUnderline = true;
        this.obsrvUnderline = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindWrappingWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundWrappingWidth = true;
        this.obsrvWrappingWidth = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundX = true;
        this.obsrvX = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundY = true;
        this.obsrvY = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Text build()
    {
        Text instance = new Text();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
