// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link Parent}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Parent})
 * @param <B> 建構器本身的型態(需繼承{@link ParentBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ParentBuilder<Z extends Parent, B extends ParentBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
{

    private boolean hasChildrenUnmodifiable;
    private java.util.Collection<javafx.scene.Node> valChildrenUnmodifiable;

    private boolean hasStylesheets;
    private java.util.Collection<java.lang.String> valStylesheets;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasChildrenUnmodifiable)
            instance.getChildrenUnmodifiable().setAll(this.valChildrenUnmodifiable);
        if (this.hasStylesheets)
            instance.getStylesheets().setAll(this.valStylesheets);
    }

    /**
     * 設定集合屬性{@link Parent#getChildrenUnmodifiable}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B childrenUnmodifiable(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasChildrenUnmodifiable = true;
        this.valChildrenUnmodifiable = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Parent#getChildrenUnmodifiable}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B childrenUnmodifiable(javafx.scene.Node... value)
    {
        this.hasChildrenUnmodifiable = true;
        this.valChildrenUnmodifiable = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Parent#getStylesheets}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B stylesheets(java.util.Collection<java.lang.String> value)
    {
        this.hasStylesheets = true;
        this.valStylesheets = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Parent#getStylesheets}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B stylesheets(java.lang.String... value)
    {
        this.hasStylesheets = true;
        this.valStylesheets = java.util.Arrays.asList(value);
        return (B) this;
    }
}
