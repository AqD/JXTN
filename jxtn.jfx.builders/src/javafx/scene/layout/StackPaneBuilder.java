// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link StackPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StackPaneBuilder<Z extends StackPane, B extends StackPaneBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
{

    protected boolean hasAlignment;
    protected javafx.geometry.Pos valAlignment;

    protected boolean boundAlignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrvAlignment;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.boundAlignment)
            instance.alignmentProperty().bind(this.obsrvAlignment);
    }

    /**
     * 設定屬性{@link StackPane#setAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link StackPane#alignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        assert (source != null);
        this.boundAlignment = true;
        this.obsrvAlignment = source;
        return (B) this;
    }

    /**
     * 建構{@link StackPane}物件
     *
     * @return 新的{@link StackPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public StackPane build()
    {
        StackPane instance = new StackPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
