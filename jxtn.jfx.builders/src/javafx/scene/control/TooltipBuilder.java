// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Tooltip}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TooltipBuilder<Z extends Tooltip, B extends TooltipBuilder<Z, B>>
        extends javafx.scene.control.PopupControlBuilder<Z, B>
{

    protected boolean hasContentDisplay;
    protected javafx.scene.control.ContentDisplay valContentDisplay;

    protected boolean hasFont;
    protected javafx.scene.text.Font valFont;

    protected boolean hasGraphic;
    protected javafx.scene.Node valGraphic;

    protected boolean hasGraphicTextGap;
    protected double valGraphicTextGap;

    protected boolean hasText;
    protected java.lang.String valText;

    protected boolean hasTextAlignment;
    protected javafx.scene.text.TextAlignment valTextAlignment;

    protected boolean hasTextOverrun;
    protected javafx.scene.control.OverrunStyle valTextOverrun;

    protected boolean hasWrapText;
    protected boolean valWrapText;

    protected boolean boundContentDisplay;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContentDisplay> obsrvContentDisplay;

    protected boolean boundFont;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> obsrvFont;

    protected boolean boundGraphic;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvGraphic;

    protected boolean boundGraphicTextGap;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvGraphicTextGap;

    protected boolean boundTextAlignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> obsrvTextAlignment;

    protected boolean boundTextOverrun;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.OverrunStyle> obsrvTextOverrun;

    protected boolean boundText;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvText;

    protected boolean boundWrapText;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvWrapText;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasContentDisplay)
            instance.setContentDisplay(this.valContentDisplay);
        if (this.hasFont)
            instance.setFont(this.valFont);
        if (this.hasGraphic)
            instance.setGraphic(this.valGraphic);
        if (this.hasGraphicTextGap)
            instance.setGraphicTextGap(this.valGraphicTextGap);
        if (this.hasText)
            instance.setText(this.valText);
        if (this.hasTextAlignment)
            instance.setTextAlignment(this.valTextAlignment);
        if (this.hasTextOverrun)
            instance.setTextOverrun(this.valTextOverrun);
        if (this.hasWrapText)
            instance.setWrapText(this.valWrapText);
        if (this.boundContentDisplay)
            instance.contentDisplayProperty().bind(this.obsrvContentDisplay);
        if (this.boundFont)
            instance.fontProperty().bind(this.obsrvFont);
        if (this.boundGraphic)
            instance.graphicProperty().bind(this.obsrvGraphic);
        if (this.boundGraphicTextGap)
            instance.graphicTextGapProperty().bind(this.obsrvGraphicTextGap);
        if (this.boundTextAlignment)
            instance.textAlignmentProperty().bind(this.obsrvTextAlignment);
        if (this.boundTextOverrun)
            instance.textOverrunProperty().bind(this.obsrvTextOverrun);
        if (this.boundText)
            instance.textProperty().bind(this.obsrvText);
        if (this.boundWrapText)
            instance.wrapTextProperty().bind(this.obsrvWrapText);
    }

    /**
     * 設定屬性{@link Tooltip#setContentDisplay}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B contentDisplay(javafx.scene.control.ContentDisplay value)
    {
        this.hasContentDisplay = true;
        this.valContentDisplay = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#setFont}
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
     * 設定屬性{@link Tooltip#setGraphic}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphic(javafx.scene.Node value)
    {
        this.hasGraphic = true;
        this.valGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#setGraphicTextGap}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B graphicTextGap(double value)
    {
        this.hasGraphicTextGap = true;
        this.valGraphicTextGap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#setText}
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
     * 設定屬性{@link Tooltip#setTextAlignment}
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
     * 設定屬性{@link Tooltip#setTextOverrun}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B textOverrun(javafx.scene.control.OverrunStyle value)
    {
        this.hasTextOverrun = true;
        this.valTextOverrun = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#setWrapText}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B wrapText(boolean value)
    {
        this.hasWrapText = true;
        this.valWrapText = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#contentDisplayProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindContentDisplay(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ContentDisplay> source)
    {
        assert (source != null);
        this.boundContentDisplay = true;
        this.obsrvContentDisplay = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#fontProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindFont(javafx.beans.value.ObservableValue<? extends javafx.scene.text.Font> source)
    {
        assert (source != null);
        this.boundFont = true;
        this.obsrvFont = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#graphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindGraphic(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundGraphic = true;
        this.obsrvGraphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#graphicTextGapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindGraphicTextGap(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundGraphicTextGap = true;
        this.obsrvGraphicTextGap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#textAlignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTextAlignment(javafx.beans.value.ObservableValue<? extends javafx.scene.text.TextAlignment> source)
    {
        assert (source != null);
        this.boundTextAlignment = true;
        this.obsrvTextAlignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#textOverrunProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTextOverrun(javafx.beans.value.ObservableValue<? extends javafx.scene.control.OverrunStyle> source)
    {
        assert (source != null);
        this.boundTextOverrun = true;
        this.obsrvTextOverrun = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#textProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindText(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundText = true;
        this.obsrvText = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Tooltip#wrapTextProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindWrapText(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundWrapText = true;
        this.obsrvWrapText = source;
        return (B) this;
    }

    /**
     * 建構{@link Tooltip}物件
     *
     * @return 新的{@link Tooltip}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Tooltip build()
    {
        Tooltip instance = new Tooltip();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
