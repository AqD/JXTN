// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.stage;

/**
 * {@link FileChooser}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link FileChooser})
 * @param <B> 建構器本身的型態(需繼承{@link FileChooserBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FileChooserBuilder<Z extends FileChooser, B extends FileChooserBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasExtensionFilters;
    private java.util.Collection<javafx.stage.FileChooser.ExtensionFilter> valExtensionFilters;

    private boolean hasInitialDirectory;
    private java.io.File valInitialDirectory;

    private boolean hasInitialFileName;
    private java.lang.String valInitialFileName;

    private boolean hasSelectedExtensionFilter;
    private javafx.stage.FileChooser.ExtensionFilter valSelectedExtensionFilter;

    private boolean hasTitle;
    private java.lang.String valTitle;

    private boolean boundInitialDirectory;
    private javafx.beans.value.ObservableValue<? extends java.io.File> obsrvInitialDirectory;

    private boolean boundInitialFileName;
    private javafx.beans.value.ObservableValue<? extends java.lang.String> obsrvInitialFileName;

    private boolean boundSelectedExtensionFilter;
    private javafx.beans.value.ObservableValue<? extends javafx.stage.FileChooser.ExtensionFilter> obsrvSelectedExtensionFilter;

    private boolean boundTitle;
    private javafx.beans.value.ObservableValue<? extends String> obsrvTitle;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasExtensionFilters)
            instance.getExtensionFilters().setAll(this.valExtensionFilters);
        if (this.hasInitialDirectory)
            instance.setInitialDirectory(this.valInitialDirectory);
        if (this.hasInitialFileName)
            instance.setInitialFileName(this.valInitialFileName);
        if (this.hasSelectedExtensionFilter)
            instance.setSelectedExtensionFilter(this.valSelectedExtensionFilter);
        if (this.hasTitle)
            instance.setTitle(this.valTitle);
        if (this.boundInitialDirectory)
            instance.initialDirectoryProperty().bind(this.obsrvInitialDirectory);
        if (this.boundInitialFileName)
            instance.initialFileNameProperty().bind(this.obsrvInitialFileName);
        if (this.boundSelectedExtensionFilter)
            instance.selectedExtensionFilterProperty().bind(this.obsrvSelectedExtensionFilter);
        if (this.boundTitle)
            instance.titleProperty().bind(this.obsrvTitle);
    }

    /**
     * 設定集合屬性{@link FileChooser#getExtensionFilters}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B extensionFilters(java.util.Collection<javafx.stage.FileChooser.ExtensionFilter> value)
    {
        this.hasExtensionFilters = true;
        this.valExtensionFilters = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link FileChooser#getExtensionFilters}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B extensionFilters(javafx.stage.FileChooser.ExtensionFilter... value)
    {
        this.hasExtensionFilters = true;
        this.valExtensionFilters = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link FileChooser#setInitialDirectory(java.io.File)}
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
     * 設定屬性{@link FileChooser#setInitialFileName(java.lang.String)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B initialFileName(java.lang.String value)
    {
        this.hasInitialFileName = true;
        this.valInitialFileName = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FileChooser#setSelectedExtensionFilter(javafx.stage.FileChooser.ExtensionFilter)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedExtensionFilter(javafx.stage.FileChooser.ExtensionFilter value)
    {
        this.hasSelectedExtensionFilter = true;
        this.valSelectedExtensionFilter = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FileChooser#setTitle(java.lang.String)}
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
     * 設定屬性{@link FileChooser#initialDirectoryProperty}的連結
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
     * 設定屬性{@link FileChooser#initialFileNameProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindInitialFileName(javafx.beans.value.ObservableValue<? extends java.lang.String> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundInitialFileName = true;
        this.obsrvInitialFileName = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FileChooser#selectedExtensionFilterProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindSelectedExtensionFilter(javafx.beans.value.ObservableValue<? extends javafx.stage.FileChooser.ExtensionFilter> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundSelectedExtensionFilter = true;
        this.obsrvSelectedExtensionFilter = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FileChooser#titleProperty}的連結
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
     * 建構{@link FileChooser}物件
     *
     * @return 新的{@link FileChooser}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public FileChooser build()
    {
        FileChooser instance = new FileChooser();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
