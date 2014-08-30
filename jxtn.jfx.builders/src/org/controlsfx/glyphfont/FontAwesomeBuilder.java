// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.glyphfont;

/**
 * {@link FontAwesome}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link FontAwesome})
 * @param <B> 建構器本身的型態(需繼承{@link FontAwesomeBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FontAwesomeBuilder<Z extends FontAwesome, B extends FontAwesomeBuilder<Z, B>>
        extends org.controlsfx.glyphfont.GlyphFontBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link FontAwesome}物件
     *
     * @return 新的{@link FontAwesome}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public FontAwesome build()
    {
        FontAwesome instance = new FontAwesome();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
