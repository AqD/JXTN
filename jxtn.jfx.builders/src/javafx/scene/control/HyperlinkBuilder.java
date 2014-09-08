// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Hyperlink}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Hyperlink})
 * @param <B> 建構器本身的型態(需繼承{@link HyperlinkBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class HyperlinkBuilder<Z extends Hyperlink, B extends HyperlinkBuilder<Z, B>>
        extends javafx.scene.control.ButtonBaseBuilder<Z, B>
{

    private boolean hasVisited;
    private boolean valVisited;

    private boolean bound1Visited;
    private boolean bound2Visited;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1Visited;
    private javafx.beans.property.Property<Boolean> obsrv2Visited;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasVisited)
            instance.setVisited(this.valVisited);
        if (this.bound1Visited)
            instance.visitedProperty().bind(this.obsrv1Visited);
        if (this.bound2Visited)
            instance.visitedProperty().bindBidirectional(this.obsrv2Visited);
    }

    /**
     * 設定屬性{@link Hyperlink#setVisited(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B visited(boolean value)
    {
        this.hasVisited = true;
        this.valVisited = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Hyperlink#visitedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVisited(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Visited = true;
        this.obsrv1Visited = source;
        this.bound2Visited = false;
        this.obsrv2Visited = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Hyperlink#visitedProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalVisited(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Visited = false;
        this.obsrv1Visited = null;
        this.bound2Visited = true;
        this.obsrv2Visited = source;
        return (B) this;
    }

    /**
     * 建構{@link Hyperlink}物件
     *
     * @return 新的{@link Hyperlink}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Hyperlink build()
    {
        Hyperlink instance = new Hyperlink();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
