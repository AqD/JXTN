// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.web;

/**
 * {@link PromptData}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PromptDataBuilder<Z extends PromptData, B extends PromptDataBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link PromptData}物件
     *
     * @return 新的{@link PromptData}物件實體
     */
    @SuppressWarnings("unchecked")
    public PromptData build(java.lang.String arg0, java.lang.String arg1)
    {
        PromptData instance = new PromptData(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
