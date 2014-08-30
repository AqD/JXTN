// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.stage;

/**
 * {@link DirectoryChooser}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link DirectoryChooser})
 * @param <B> 建構器本身的型態(需繼承{@link DirectoryChooserBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class DirectoryChooserBuilder<Z extends DirectoryChooser, B extends DirectoryChooserBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasInitialDirectory;
    private java.io.File valInitialDirectory;

    private boolean hasTitle;
    private java.lang.String valTitle;

    private boolean boundInitialDirectory;
    private javafx.beans.value.ObservableValue<? extends java.io.File> obsrvInitialDirectory;

    private boolean boundTitle;
    private javafx.beans.value.ObservableValue<? extends String> obsrvTitle;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasInitialDirectory)
            instance.setInitialDirectory(this.valInitialDirectory);
        if (this.hasTitle)
            instance.setTitle(this.valTitle);
        if (this.boundInitialDirectory)
            instance.initialDirectoryProperty().bind(this.obsrvInitialDirectory);
        if (this.boundTitle)
            instance.titleProperty().bind(this.obsrvTitle);
    }

    /**
     * 設定屬性{@link DirectoryChooser#setInitialDirectory(java.io.File)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B initialDirectory(java.io.File value)
    {
        this.hasInitialDirectory = true;
        this.valInitialDirectory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link DirectoryChooser#setTitle(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B title(java.lang.String value)
    {
        this.hasTitle = true;
        this.valTitle = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link DirectoryChooser#initialDirectoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindInitialDirectory(javafx.beans.value.ObservableValue<? extends java.io.File> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundInitialDirectory = true;
        this.obsrvInitialDirectory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link DirectoryChooser#titleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindTitle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundTitle = true;
        this.obsrvTitle = source;
        return (B) this;
    }

    /**
     * 建構{@link DirectoryChooser}物件
     *
     * @return 新的{@link DirectoryChooser}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public DirectoryChooser build()
    {
        DirectoryChooser instance = new DirectoryChooser();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
