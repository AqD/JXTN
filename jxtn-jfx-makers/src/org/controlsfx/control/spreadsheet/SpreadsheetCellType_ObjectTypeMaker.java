// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.spreadsheet;

/**
 * {@link SpreadsheetCellType.ObjectType}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link SpreadsheetCellType.ObjectType})
 * @param <B> 建構器本身的型態(需繼承{@link SpreadsheetCellType.ObjectTypeMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SpreadsheetCellType_ObjectTypeMaker<Z extends SpreadsheetCellType.ObjectType, B extends SpreadsheetCellType_ObjectTypeMaker<Z, B>>
        extends org.controlsfx.control.spreadsheet.SpreadsheetCellTypeMaker<java.lang.Object, Z, B>
        implements SpreadsheetCellType_ObjectTypeMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link SpreadsheetCellType.ObjectType}物件。
     *
     * @return 新的{@link SpreadsheetCellType.ObjectType}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SpreadsheetCellType.ObjectType build()
    {
        SpreadsheetCellType.ObjectType instance = new SpreadsheetCellType.ObjectType();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link SpreadsheetCellType.ObjectType}物件。
     *
     * @return 新的{@link SpreadsheetCellType.ObjectType}物件實體
     */
    @SuppressWarnings("unchecked")
    public SpreadsheetCellType.ObjectType build(org.controlsfx.control.spreadsheet.StringConverterWithFormat<java.lang.Object> arg0)
    {
        SpreadsheetCellType.ObjectType instance = new SpreadsheetCellType.ObjectType(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
