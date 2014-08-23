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
    private boolean applied;
    public void applyTo(PromptData instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public PromptData build(java.lang.String arg0, java.lang.String arg1)
    {
        PromptData instance = new PromptData(arg0, arg1);
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
