// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.web;

/**
 * {@link WebHistory}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link WebHistory})
 * @param <B> 建構器本身的型態(需繼承{@link WebHistoryBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class WebHistoryBuilder<Z extends WebHistory, B extends WebHistoryBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasEntries;
    private java.util.Collection<javafx.scene.web.WebHistory.Entry> valEntries;

    private boolean hasMaxSize;
    private int valMaxSize;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEntries)
            instance.getEntries().setAll(this.valEntries);
        if (this.hasMaxSize)
            instance.setMaxSize(this.valMaxSize);
    }

    /**
     * 設定集合屬性{@link WebHistory#getEntries}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B entries(java.util.Collection<javafx.scene.web.WebHistory.Entry> value)
    {
        this.hasEntries = true;
        this.valEntries = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link WebHistory#getEntries}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B entries(javafx.scene.web.WebHistory.Entry... value)
    {
        this.hasEntries = true;
        this.valEntries = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link WebHistory#setMaxSize(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B maxSize(int value)
    {
        this.hasMaxSize = true;
        this.valMaxSize = value;
        return (B) this;
    }
}
