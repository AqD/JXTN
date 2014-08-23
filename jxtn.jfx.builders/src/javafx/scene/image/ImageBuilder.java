// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.image;

/**
 * {@link Image}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImageBuilder<Z extends Image, B extends ImageBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Image}物件
     *
     * @return 新的{@link Image}物件實體
     */
    @SuppressWarnings("unchecked")
    public Image build(java.io.InputStream arg0)
    {
        Image instance = new Image(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
